/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLexico;

import java.util.List;
import javax.swing.JOptionPane;
import ListasPractica.ListaTkn;
import ListasPractica.ListaError;
import java.util.ArrayList;
import Reporte.HTML; 
import java.util.Iterator;
/**
 *
 * @author libni
 */
public class Automata {
 List<ListaTkn> tabla;
 List<ListaError> Etabla;
 int idtkn, nutknen = 0, idtkns=12, fila =0, columna=0;
 String token;
 String tokenerror =""; 
 
 
 public Automata()
 {
     this.tabla = new ArrayList<ListaTkn>();
     this.Etabla = new ArrayList<ListaError>();
 }
 
 public void Lexico(String cadena)
 {        
     int estado = 0;     
     String concatenar="";   
     char tab,salto,espacio,dosp,coma,llaveA,llaveC,ptocoma,comillas;
     tab= (char)9; salto =(char)10; espacio=(char)32;
     dosp = (char)58; ptocoma =(char)59; coma =(char)44; llaveA = (char)123; llaveC = (char)125; comillas = (char)34;
     
     for(int i=0; i< cadena.length(); i++)
     {
         switch(estado)
         {
             case 0:
                 if(cadena.equals(tab) || cadena.equals(salto) || cadena.equals(espacio))
                 {
                     estado =0; concatenar += cadena; fila++; columna++;
                 }
                 else if(Character.isLetter(cadena.charAt(i)))
                 {
                    concatenar += cadena;
                    estado = 1;
                 }
                 else if(Character.isDigit(cadena.charAt(i)))
                 {
                     concatenar += cadena;
                     estado=2;
                 }                 
                  if(cadena.equals(dosp) || cadena.equals(coma) || cadena.equals(llaveA) || cadena.equals(llaveC) || cadena.equals(ptocoma)) // Signos ':'|| ',' || '{' || '}' || ';'
                 {                     
                     concatenar += cadena;
                     estado = 3;
                 }
                 if(cadena.equals(comillas))
                 {
                     concatenar += cadena;
                     estado = 4;
                 }
                 else
                 {                       
                     tokenerror += cadena.charAt(i);                     
                     String errornum,errorlex,errorcol,errortkn,numidtkn;
                     errornum = ""+nutknen;
                     errorlex = tokenerror;
                     errorcol = "" + columna;
                     errortkn = "Valor desconocido.";
                     numidtkn = "" + idtkn;
                    addEToken(errornum,errorlex,errorcol,errortkn,numidtkn);
                    nutknen++; concatenar=""; tokenerror="";                     
                 }
                 break;
                 
             case 1:
                  if(Character.isLetter(cadena.charAt(i)))
                  {
                      concatenar += cadena;
                      estado = 1;
                  }
                  else
                  {
                      AnalizarTkn(concatenar); i--; estado = estado -1; estado=0;                      
                      String num,lex,f,col,numtkn,tkn;
                      num = "" +nutknen;
                      lex = "" +concatenar;
                      f = ""+fila;
                      col = ""+columna;
                      numtkn = ""+idtkn;
                      tkn = ""+token;
                      addToken(num,lex,f,col,numtkn,tkn);
                      nutknen++; concatenar = "";
                  }
                 break;
                 
             case 2:
                 if(Character.isDigit(cadena.charAt(i)))
                 {
                     concatenar += cadena;
                     estado = 2;
                 }
                 else
                 {
                     AnalizarTkn(concatenar); i--; estado = estado -1; estado=0;                     
                      String num,lex,f,col,numtkn,tkn;
                      num = "" +nutknen;
                      lex = "" +concatenar;
                      f = ""+fila;
                      col = ""+columna;
                      numtkn = "12";
                      tkn = "Numero";
                      addToken(num,lex,f,col,numtkn,tkn);
                      nutknen++; concatenar = "";
                 }
                 break;
                 
             case 3:
                      AnalizarTkn(concatenar); i--; estado = estado -1; estado=0;                      
                      String num,lex,f,col,numtkn,tkn;
                      num = "" +nutknen;
                      lex = "" +concatenar;
                      f = ""+fila;
                      col = ""+columna;
                      numtkn = ""+idtkn;
                      tkn = ""+token;
                      addToken(num,lex,f,col,numtkn,tkn);
                      nutknen++; concatenar = "";
                 break;
                 
             case 4:
                 concatenar += cadena;
                 estado = 5;
                 break;                 
             case 5:
                 if(cadena.equals(comillas))
                 {
                  concatenar += cadena;
                  estado = 6;   
                 }
                 else                     
                 {
                  concatenar += cadena;
                  estado = 5;    
                 }
                 break;
                 
             case 6:
                      AnalizarTkn(concatenar); i--; estado = estado -1; estado=0;                      
                      String num1,lex1,f1,col1,numtkn1,tkn1;
                      num1 = "" +nutknen;
                      lex1 = "" +concatenar;
                      f1 = ""+fila;
                      col1 = ""+columna;
                      numtkn1 = ""+idtkn;
                      tkn1 = ""+token;
                      addToken(num1,lex1,f1,col1,numtkn1,tkn1);
                      nutknen++; concatenar = "";
                 break;
         }
     }
     JOptionPane.showMessageDialog(null,"Su analisis se a hecho con exito.");     
 }
 
 public void AnalizarTkn(String tkn)
 {
     tkn.trim();
     switch(tkn)
     {
         case "pensum":
             token="Palabra Reservada."; idtkn =1;
             break;
         case ":":
             token="Signo dos puntos."; idtkn =2;
                 break;
         case "{":
             token="Signo Llave Apertura"; idtkn =3;
                 break;
         case "curso":
             token ="Palabra Reservada."; idtkn =4;
                 break;
         case "codigo":
             token ="Palabra Reservada."; idtkn =5;
                 break;
         case ";":
             token = "Signo dos puntos y coma."; idtkn=6;
                 break;
         case "nombre":
             token="Palabra Reservada."; idtkn=7;
                 break;
         case "creditos":
             token="Palabra Reservada."; idtkn=8;
                 break;
         case "prerrequisitos":
             token="Palabra Reservada."; idtkn=9;
                 break;
         case "}":
             token="Signo Llave de Cierre."; idtkn=10;
                 break;
         case ",":
             token="Signo de coma."; idtkn=11;
                 break;         
         default:
             token = "cadena"; idtkns++; idtkn = idtkns;
             break;
     }
 }
 
 public void addToken(String numero, String lexema, String fila, String columna, String idtkn, String tkn)
 {
    ListaTkn aux = new ListaTkn(numero,lexema,fila,columna,idtkn,tkn);     
    tabla.add(aux);
 }

 public void addEToken(String enumero, String elexema, String ecolumna, String etkn, String eidtkn)
 {
     ListaError aux = new ListaError(enumero,elexema,ecolumna,etkn,eidtkn);
     Etabla.add(aux);
 }
 
 public void Imprimir()
 {
     HTML reporte = new HTML();
     reporte.ReporteToken(tabla);     
 }
 
 public void Imprimir1()
 {
     HTML reporte = new HTML();
     reporte.ReporteError(Etabla);
 }
}