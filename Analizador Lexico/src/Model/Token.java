package Model;

public class Token {
    private final String type;
    private final StringBuilder lexeme;


    public Token(String type, StringBuilder lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tipo='" + type + '\'' +
                " lexema='" + lexeme + '\'' +
                '}';
    }
}
