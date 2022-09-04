

package analizadorsintactico;
import java_cup.runtime.Symbol;

%%
%public
%class LexerCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char

L=[a-zA-Z]
D=[0-9]+
DC={D}"."{D}|"."{D}
espacio=[ ,\t,\r,\n]+

%{
private Symbol symbol (int type, Object value){
    return new Symbol(type, yyline, yycolumn, value);
    }
private Symbol symbol (int type){
    return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{espacio} {/*Ignore*/}
("//"(.)*) {/*Ignore*/}
{D}+ {PrintTablaSimbolos.addArrayList("NUMERO");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.NUMERO, yychar,yyline,yytext());
}

{L} {PrintTablaSimbolos.addArrayList("LETRA");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.LETRA, yychar,yyline,yytext());}


("^") {PrintTablaSimbolos.addArrayList("POTENCIA");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.POTENCIA, yychar, yyline,yytext());}

("(") {PrintTablaSimbolos.addArrayList("INICIO_V");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.INICIO_V, yychar, yyline,yytext());}


(")") {PrintTablaSimbolos.addArrayList("FIN_V");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.FIN_V, yychar, yyline,yytext());}

("+") {PrintTablaSimbolos.addArrayList("SUMA");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.SUMA, yychar, yyline,yytext());}

("-") {PrintTablaSimbolos.addArrayList("NEGATIVO");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.NEGATIVO, yychar, yyline,yytext());}

("*") {PrintTablaSimbolos.addArrayList("MULTIPLICACION");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.MULTIPLICACION, yychar,yyline,yytext());}


("/") {PrintTablaSimbolos.addArrayList("DIVISION");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.DIVISION, yychar,yyline,yytext());}

(";") {PrintTablaSimbolos.addArrayList("DELIMITADOR");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.DELIMITADOR, yychar,yyline,yytext());}


(":") {PrintTablaSimbolos.addArrayList("DPUNTOS");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.DPUNTOS, yychar,yyline,yytext());}


("=") {PrintTablaSimbolos.addArrayList("IGUAL");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.IGUAL, yychar,yyline,yytext());}

("#") {PrintTablaSimbolos.addArrayList("RAIZ");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.RAIZ, yychar,yyline,yytext());}

("[") {PrintTablaSimbolos.addArrayList("INICIO_GRUPO");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.INICIO_GRUPO, yychar,yyline,yytext());}

("]") {PrintTablaSimbolos.addArrayList("FIN_GRUPO");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.FIN_GRUPO, yychar,yyline,yytext());}

{DC}+ {PrintTablaSimbolos.addArrayList("DECIMAL");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.DECIMAL, yychar,yyline,yytext());}

. {PrintTablaSimbolos.addArrayList("ERROR");
      PrintTablaSimbolos.addArrayList1(yytext());
      PrintTablaSimbolos.addArrayList2(yyline + 1);
      PrintTablaSimbolos.addArrayList3(yycolumn  + 1);
return new Symbol (sym.ERROR,yychar,yyline,yytext());}
