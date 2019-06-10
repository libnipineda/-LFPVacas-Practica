/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasPractica;

/**
 *
 * @author libni
 */
public class ListaTkn {
        public String numero = "";
        public String lexema = "";
        public String fila = "";
        public String columna = "";
        public String idtkn = "";
        public String tkn = "";

    public String getNumero() {
        return numero;
    }

    public String getLexema() {
        return lexema;
    }

    public String getFila() {
        return fila;
    }

    public String getColumna() {
        return columna;
    }

    public String getIdtkn() {
        return idtkn;
    }

    public String getTkn() {
        return tkn;
    }
    
        public ListaTkn(String num, String lexema, String fila, String columna, String idtkn, String tkn) {
            this.numero = num;
            this.lexema = lexema;
            this.fila = fila;
           this.columna = columna;
            this.idtkn = idtkn;
            this.tkn = tkn;
        }            
}