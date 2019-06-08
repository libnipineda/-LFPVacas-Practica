/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLexico;


import java.awt.List;
import javax.swing.JOptionPane;
import ListasPractica.ListaTkn;
import ListasPractica.ListaError;
/**
 *
 * @author libni
 */
public class Automata {
// List<ListaTkn> tabla = new List<ListaTkn>();
 int idtkn;
 int nutknen = 0;
 int idtkns = 8; // numero de tokens definidos (antiguo numero 12)
 int fila = 0;
 int columna = 0;
 String token = "";
 int numnodo=0;
 
 
 public void Lexico(String cadena)
 {
     int estado = 0;
     String concatenar = "";
     for(int i=0; i< cadena.length(); i++)
     {
         switch(estado)
         {
             case 0:
                 break;
                 
             case 1:
                 break;
                 
             case 2:
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
}
