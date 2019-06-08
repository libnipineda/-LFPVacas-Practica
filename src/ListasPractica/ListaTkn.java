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
 
    class Lista
    {
        public String numero = "";
        public String lexema = "";
        public String fila = "";
        public String columna = "";
        public String idtkn = "";
        public String tkn = "";

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public void setLexema(String lexema) {
            this.lexema = lexema;
        }

        public void setFila(String fila) {
            this.fila = fila;
        }

        public void setColumna(String columna) {
            this.columna = columna;
        }

        public void setIdtkn(String idtkn) {
            this.idtkn = idtkn;
        }

        public void setTkn(String tkn) {
            this.tkn = tkn;
        }

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
    }
}
