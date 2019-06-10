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
/**
 *
 * @author libni
 */
public class Automata {
 List<ListaTkn> tabla;
 int idtkn, nutknen = 0, idtkns=11, fila =0, columna=0;
 String token;
 public Automata()
 {
     this.tabla = new ArrayList<ListaTkn>();
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
                     
                 }
                 break;
                 
             case 3:
                 break;
                 
             case 4:
                 break;
                 
             case 5:
                 break;
                 
             case 6:
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
 
}
