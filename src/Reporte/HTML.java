/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import ListasPractica.ListaTkn;
import ListasPractica.ListaError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author libni
 */
public class HTML {    
    String listaA = "";
    String ListaB = "";
    
    
    public void ReporteToken(List<ListaTkn> arreglo)
    {
        if(arreglo.size() !=0)
        {
            for(int i=0; i < arreglo.size(); i++)
            {                                
                listaA = listaA + "<tr>"
                    + "<td><strong>" + arreglo.get(i).numero  + "</strong></td>"                    
                    + "<td><strong>" + arreglo.get(i).lexema + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).idtkn + "</strong></td>"
                    + "<td><strong>" + arreglo.get(i).tkn + "</strong></td>"
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
                ,"</tr>"
                ,listaA
                ,"</table>"
                ,"</body>"
                ,"</html> "
                };            
//            Path wiki = Paths.get("C:/Users/libni/Desktop/ReporteToken.html",texto);
//            Charset cs = Charset.forName(listaA);
            System.out.println(texto);
//        try {
//            Files.readAllLines(wiki);
//        } catch (IOException ex) {
//            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
//        }
           //Files.write("C:/Users/libni/Desktop/ReporteToken.html", texto);           
    }
    
    public void ReporteError(List<ListaError> datos)
    {
        
    }
}
