
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Aug 18 02:21:35 ECT 2022
//----------------------------------------------------

package analizadorsintactico;

import java_cup.runtime.Symbol;
import analizadorsintactico.Utilidades;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Aug 18 02:21:35 ECT 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\002\003" +
    "\000\002\006\003\000\002\006\003\000\002\011\003\000" +
    "\002\011\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\007\004\000\002\007\003\000\002\012" +
    "\012\000\002\013\004\000\002\014\010\000\002\015\012" +
    "\000\002\016\012" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\016\004\017\005\013\011\007\012\023\020" +
    "\022\022\004\001\002\000\016\006\ufff5\010\ufff5\013\ufff5" +
    "\014\ufff5\015\ufff5\021\ufff5\001\002\000\004\006\045\001" +
    "\002\000\004\002\ufffc\001\002\000\010\004\ufffb\005\ufffb" +
    "\022\ufffb\001\002\000\004\015\044\001\002\000\004\002" +
    "\001\001\002\000\004\002\ufffd\001\002\000\016\006\ufff7" +
    "\010\ufff7\013\ufff7\014\ufff7\015\ufff7\021\ufff7\001\002\000" +
    "\004\002\ufffe\001\002\000\004\002\uffff\001\002\000\004" +
    "\002\043\001\002\000\016\006\ufff6\010\ufff6\013\ufff6\014" +
    "\ufff6\015\ufff6\021\ufff6\001\002\000\010\004\017\005\013" +
    "\022\004\001\002\000\016\006\ufff3\010\ufff3\013\ufff3\014" +
    "\ufff3\015\ufff3\021\ufff3\001\002\000\014\004\017\005\013" +
    "\011\007\012\023\022\004\001\002\000\010\004\ufffa\005" +
    "\ufffa\022\ufffa\001\002\000\006\013\032\014\033\001\002" +
    "\000\004\021\026\001\002\000\004\006\027\001\002\000" +
    "\014\004\017\005\013\011\007\012\023\022\004\001\002" +
    "\000\004\015\031\001\002\000\004\002\ufff0\001\002\000" +
    "\014\004\ufff9\005\ufff9\011\ufff9\012\ufff9\022\ufff9\001\002" +
    "\000\014\004\ufff8\005\ufff8\011\ufff8\012\ufff8\022\ufff8\001" +
    "\002\000\014\004\017\005\013\011\007\012\023\022\004" +
    "\001\002\000\004\021\036\001\002\000\004\006\037\001" +
    "\002\000\014\004\017\005\013\011\007\012\023\022\004" +
    "\001\002\000\004\015\041\001\002\000\004\002\uffef\001" +
    "\002\000\016\006\ufff4\010\ufff4\013\ufff4\014\ufff4\015\ufff4" +
    "\021\ufff4\001\002\000\004\002\000\001\002\000\004\002" +
    "\ufff1\001\002\000\016\004\017\005\013\007\046\011\007" +
    "\012\023\022\004\001\002\000\014\004\017\005\013\011" +
    "\007\012\023\022\004\001\002\000\006\013\032\014\033" +
    "\001\002\000\014\004\017\005\013\011\007\012\023\022" +
    "\004\001\002\000\004\006\052\001\002\000\014\004\017" +
    "\005\013\011\007\012\023\022\004\001\002\000\004\015" +
    "\054\001\002\000\004\002\ufff2\001\002\000\006\013\032" +
    "\014\033\001\002\000\014\004\017\005\013\011\007\012" +
    "\023\022\004\001\002\000\004\010\060\001\002\000\004" +
    "\015\061\001\002\000\004\002\uffee\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\026\002\015\004\020\006\017\007\004\010" +
    "\007\012\010\013\014\014\013\015\011\016\005\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\041" +
    "\001\001\000\002\001\001\000\012\004\020\006\017\007" +
    "\023\010\024\001\001\000\002\001\001\000\004\011\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\004" +
    "\020\006\017\007\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\004" +
    "\020\006\017\007\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\020\006\017\007\037\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\004\020\006\017\007" +
    "\046\001\001\000\010\004\020\006\017\007\054\001\001" +
    "\000\004\011\047\001\001\000\010\004\020\006\017\007" +
    "\050\001\001\000\002\001\001\000\010\004\020\006\017" +
    "\007\052\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\055\001\001\000\010\004\020\006\017\007\056" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    public void syntax_error(Symbol s){
        this.s = s;
    }
    public Symbol getS(){
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // REGLA8 ::= BASEI POTENCIA INICIO_V BASEI OPERACION BASEI FIN_V DELIMITADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REGLA8",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // REGLA6_7 ::= INICIO_GRUPO BASEI OPERACION BASEI FIN_GRUPO POTENCIA BASEI DELIMITADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REGLA6_7",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // REGLA4 ::= INICIO_GRUPO BASEG FIN_GRUPO POTENCIA BASEI DELIMITADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REGLA4",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // REGLA2_3_9 ::= BASEG DELIMITADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REGLA2_3_9",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // REGLA1_5 ::= BASEI POTENCIA BASEI OPERACION BASEI POTENCIA BASEI DELIMITADOR 
            {
              Object RESULT =null;
		int base1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)).left;
		int base1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)).right;
		Object base1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)).value;
		int expo1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)).left;
		int expo1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)).right;
		Object expo1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).value;
		int base2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int base2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		Object base2 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int expo2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int expo2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object expo2 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		
        Utilidades.ResolverR1(base1,base2,expo1,expo2,tipo);
    
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REGLA1_5",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // BASEI ::= TIPO 
            {
              Object RESULT =null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= tipo;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BASEI",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // BASEI ::= SIGNO TIPO 
            {
              Object RESULT =null;
		int signoleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int signoright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object signo = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= new StringBuilder(signo.toString()+tipo.toString());

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BASEI",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPO ::= DECIMAL 
            {
              Object RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object decimal = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= Double.parseDouble(decimal.toString());

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPO ::= NUMERO 
            {
              Object RESULT =null;
		int numeroleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int numeroright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object numero = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= Integer.parseInt(numero.toString());

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPO ::= LETRA 
            {
              Object RESULT =null;
		int letraleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int letraright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object letra = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= letra;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OPERACION ::= DIVISION 
            {
              Object RESULT =null;
		int divisionleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int divisionright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object division = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= division;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // OPERACION ::= MULTIPLICACION 
            {
              Object RESULT =null;
		int multiplicacionleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int multiplicacionright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object multiplicacion = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= multiplicacion;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SIGNO ::= RESTA 
            {
              Object RESULT =null;
		int restaleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int restaright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object resta = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= resta;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SIGNO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SIGNO ::= SUMA 
            {
              Object RESULT =null;
		int sumaleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int sumaright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object suma = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
    RESULT= suma;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SIGNO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INICIO ::= REGLA8 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= REGLA6_7 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= REGLA4 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= REGLA2_3_9 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= REGLA1_5 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

