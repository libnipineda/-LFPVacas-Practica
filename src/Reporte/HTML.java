/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import ListasPractica.ListaTkn;
import ListasPractica.ListaError;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author libni
 */
public class HTML {    
    String Datos = "";
    String ListaB = "";
    
    
    public void ReporteToken(List<ListaTkn> arreglo)
    {
        if(arreglo.size() !=0)
        {
            for(int i=0; i < arreglo.size(); i++)
            {                                
                Datos = Datos + "<tr>"
                    + "<td><strong>" + arreglo.get(i).numero  + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).lexema + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).idtkn + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).tkn + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).fila + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).columna + "</strong></td>"                    
                    + "</tr>";
            }            
        }        
        String[] texto = { "<html>"
                    ,"<head>"
                ,"<title> LFP PRACTICA NO. 1  TABLA DE TOKEN´S</title>"
                ,"</head>"
                ,"<body>"
                ,"<h1> Listado de Tokens</h1>"
                ,"<table border>"
                ,"<tr>"
                ,"<td><strong>No</strong></td>"
                ,"<td><strong>Lexema</strong></td>"
                ,"<td><strong>ID_Token</strong></td>"
                ,"<td><strong>Token</strong></td>"
                ,"<td><strong>Fila</strong></td>"
                ,"<td><strong>Columna</strong></td>"
                ,"</tr>"
                ,Datos
                ,"</table>"
                ,"</body>"
                ,"</html> "
                };
           try
           {
               File archivo = new File("C:/Users/libni/Desktop/ReporteToken.html");
               if(!archivo.exists())
               {
                   archivo.createNewFile();
               }
               FileWriter fw = new FileWriter(archivo);
               Desktop.getDesktop().open(archivo);
               BufferedWriter bw = new BufferedWriter(fw);
               for(String item : texto)
               {
                bw.write(item.toString());                   
               }               
               bw.close();
               JOptionPane.showMessageDialog(null,"Archivo creado");
           }catch(Exception e)
           {               
               e.printStackTrace();
               JOptionPane.showMessageDialog(null,"No se pudo crear el archivo");
           }                 
    }
    
    public void ReporteError(List<ListaError> datos)
    {
        if(datos.size() != 0)
        {
            for(int i=0; i < datos.size(); i++)
            {
                ListaB = ListaB +"<tr>"
                    + "<td><strong>" + datos.get(i).Enumero + "</strong></td>"
                    + "<td><strong>" + datos.get(i).Elexema + "</strong></td>"                    
                    + "<td><strong>" + datos.get(i).Ecolumna + "</strong></td>"
                    + "<td><strong>" + datos.get(i).Etkn + "</strong></td>"
                    +"</tr>";
            }
        }
        String[] text = { "<html>"
                        ,"<head>"
                        ,"<title> LFP PRACTICA NO. 1  TABLA DE ERRORES</title>"
                        ,"</head>"
                        ,"<body>"
                        ,"<h1> Listado de Errores</h1>"
                        ,"<table border>"
                        ,"<tr>"
                        ,"<td><strong>No</strong></td>"
                        ,"<td><strong>Caracter</strong></td>"
                        ,"<td><strong>Fila</strong></td>"
                        ,"<td><strong>Columna</strong></td>"
                        ,"<td><strong>Descripcion</strong></td>"
                        ,"</tr>"
                        ,ListaB
                        ,"</table>"
                        ,"</body>"
                        ,"</html>"};        
        try
           {
               File archivo = new File("C:/Users/libni/Desktop/ReporteError.html");
               if(!archivo.exists())
               {
                   archivo.createNewFile();
               }
               FileWriter fw = new FileWriter(archivo);
               BufferedWriter bw = new BufferedWriter(fw);
               for(String item : text)
               {
                bw.write(item);
               }               
               bw.close();
               JOptionPane.showMessageDialog(null,"Archivo creado");
           }catch(Exception e)
           {               
               e.printStackTrace();
               JOptionPane.showMessageDialog(null,"No se pudo crear el archivo");
           }      
    }
}
