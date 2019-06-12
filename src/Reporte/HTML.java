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
import java.io.PrintWriter;
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
                System.out.println(arreglo.toString());
            }            
        }                                                                                                                                                                    
        try
        {
         FileWriter archivo = new FileWriter("C:/Users/libni/Desktop/ReporteToken.html");
         PrintWriter write = new PrintWriter(archivo);
         write.println("<html>");
         write.println("<head>");
         write.println("<title> LFP PRACTICA NO. 1  TABLA DE ERRORES</title>");
         write.println("</head>");
         write.println("<body>");
         write.println("<h1> Listado de Errores</h1>");
         write.println("<table border>");
         write.println("<tr>");
         write.println("<td><strong>No</strong></td>");
         write.println("<td><strong>Caracter</strong></td>");
         write.println("<td><strong>Fila</strong></td>");
         write.println("<td><strong>Columna</strong></td>");
         write.println("<td><strong>Descripcion</strong></td>");
         write.println("</tr>");
         write.println(Datos);
         write.println( "</table>");
         write.println("</body>");
         write.println( "</html>");
        archivo.close();
        Abrir();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void Abrir()
    {        
     try
     {
         File f = new File("C:/Users/libni/Desktop/ReporteToken.html");
         Desktop.getDesktop().open(f);
     }
     catch(IOException e)
     {
         e.printStackTrace();;
     }
     catch(IllegalArgumentException e)
     {
         JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
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
        try
        {
         FileWriter archivo = new FileWriter("C:/Users/libni/Desktop/ReporteError.html");
         PrintWriter write = new PrintWriter(archivo);
        write.println("<html>");
        write.println("<head>");
        write.println("<title> LFP PRACTICA NO. 1  TABLA DE ERRORES</title>");
        write.println("</head>");
        write.println("<body>");
        write.println("<h1> Listado de Errores</h1>");
        write.println("<table border>");
        write.println("<tr>");
        write.println("<td><strong>No</strong></td>");
        write.println("<td><strong>Caracter</strong></td>");
        write.println("<td><strong>Fila</strong></td>");
        write.println("<td><strong>Columna</strong></td>");
        write.println("<td><strong>Descripcion</strong></td>");
        write.println("</tr>");
        write.println(ListaB);
        write.println("</table>");
        write.println("</body>");
        write.println("</html>");
        archivo.close();
        EAbrir();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void EAbrir()
    {        
     try
     {
         File f = new File("C:/Users/libni/Desktop/ReporteError.html");
         Desktop.getDesktop().open(f);
     }
     catch(IOException e)
     {
         e.printStackTrace();;
     }
     catch(IllegalArgumentException e)
     {
         JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
     }
    }
}
