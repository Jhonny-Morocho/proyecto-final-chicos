package Controler;

import Exeptions.ErrorException;

import Model.Token;


import java.util.ArrayList;


public class LexicalAnalyzer {
    private final ArrayList<String> errors;
    private final ArrayList<Token> tokens;

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    private int index;
    private int state;
    private StringBuilder lexeme;

    public static void main(String[] args) throws ErrorException {
        LexicalAnalyzer lA = new LexicalAnalyzer();
//        String source = new Scanner(System.in).nextLine();
        String source = "^ 9 89 9,5 + - -9 -99 / = ( ) a aa [ ] ; # *";
        lA.analyzer(source);
        System.out.println(source);
        System.out.println("-------- Corrida ---------");
        for (int i = 0; i < lA.getTokens().size(); i++) {
            System.out.println(lA.getTokens().get(i));
        }
        System.out.println("--- Errors ---");
        System.out.println(lA.getErrors().toString());

    }

    public LexicalAnalyzer() {
        this.errors = new ArrayList<>();
        this.tokens = new ArrayList<>();
        this.index = 0;
        this.state = 0;
        this.lexeme = new StringBuilder();
    }

    private void analyzer(String source) throws ErrorException {
        String textClean = clean(source);
        for (; index < textClean.length(); index++) {
            char letter = textClean.charAt(index);
            switch (state) {
                case 0:
                    if (letter == '^') {
                        averageState(1, letter);
                    } else if (Character.isDigit((letter))) {
                        averageState(2, letter);
                    } else if (letter == '+') {
                        averageState(6, letter);
                    } else if (letter == '-') {
                        averageState(7, letter);
                    } else if (letter == '/') {
                        averageState(11, letter);
                    } else if (letter == '=') {
                        averageState(12, letter);
                    } else if (letter == '(') {
                        averageState(13, letter);
                    } else if (letter == ')') {
                        averageState(14, letter);
                    } else if (Character.isLetter((letter))) {
                        averageState(15, letter);
                    } else if (letter == '[') {
                        averageState(17, letter);
                    } else if (letter == ']') {
                        averageState(18, letter);
                    } else if (letter == ';') {
                        averageState(19, letter);
                    } else if (letter == '#') {
                        averageState(20, letter);
                    } else if (letter == '*') {
                        averageState(21, letter);
                    } else {
                        error(new ErrorException("Error no se conoce el termino").getMessage());

                    }
                    break;

                case 1:
                    finalState("POTENCIA");
                    break;

                case 2:
                    if (Character.isDigit(letter)) {
                        averageState(2, letter);
                    } else if (letter == ' ') {
                        averageState(3, letter);
                    } else if (letter == ',') {
                        averageState(4, letter);
                    } else {
                        error(" q2");
                        throw new ErrorException("Error no se conoce el termino");
                    }
                    break;

                case 3:
                    finalState("NUMERO");
                    break;

                case 4:
                    if (Character.isDigit(letter)) {
                        averageState(4, letter);
                    } else if (letter == ' ') {
                        averageState(5, letter);
                    } else {
                        error(" q4");
                        throw new ErrorException("Error no se conoce el termino");
                    }
                    break;

                case 5:
                    finalState("DECIMAL");
                    break;

                case 6:
                    finalState("SUMA");
                    break;

                case 7:
                    if (Character.isDigit(letter)) {
                        averageState(8, letter);
                    } else if (letter == ' ') {
                        averageState(10, letter);
                    } else {
                        error(new ErrorException("Error no se conoce el termino").getMessage());
                    }
                    break;

                case 8:
                    if (Character.isDigit(letter)) {
                        averageState(8, letter);
                    } else if (letter == ' ') {
                        averageState(9, letter);
                    } else {
                        error(new ErrorException("Error no se conoce el termino").getMessage());
                    }
                    break;

                case 9:
                    finalState("NEGATIVO");
                    break;

                case 10:
                    finalState("RESTA");
                    break;

                case 11:
                    finalState("DIVISION");
                    break;

                case 12:
                    finalState("IGUAL");
                    break;

                case 13:
                    finalState("INICIO_V");
                    break;

                case 14:
                    finalState("FIN_V");
                    break;

                case 15:
                    if (Character.isLetter((letter))) {
                        averageState(15, letter);
                    } else if (letter == ' ') {
                        averageState(16, letter);
                    } else {
                        error(new ErrorException("Error no se conoce el termino").getMessage());
                    }
                    break;

                case 16:
                    finalState("LETRA");
                    break;

                case 17:
                    finalState("INICIO_GRUPO");
                    break;

                case 18:
                    finalState("FIN_GRUPO");
                    break;

                case 19:
                    finalState("DELIMITADOR");
                    break;

                case 20:
                    finalState("RAIZ");
                    break;

                case 21:
                    finalState("MULTIPLICACION");
                    break;

            }
        }

    }

    private void error(String x) {
        this.state = 0;
        this.errors.add(x);
    }

    private void averageState(int state, char letter) {
        this.state = state;
        this.lexeme.append(letter);
    }

    private void finalState(String type) {
        this.tokens.add(new Token(type, this.lexeme));
        this.lexeme = new StringBuilder();
        this.state = 0;
        this.index--;
    }

    public static String clean(String text) {
        StringBuilder textClean = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case '\r':
                case '\t':
                case '\n':
                case '\b':
                case '\f':
                    break;
                default:
                    textClean.append(letter);
            }
        }
        textClean.append(" ");
        return textClean.toString();
    }
}
