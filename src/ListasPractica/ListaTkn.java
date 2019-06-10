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

    public ListaTkn(String numero, String lexema, String fila, String columna, String idtkn, String tkn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListaTkn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    class Lista
    {

        public Lista(String num, String lexema, String fila, String columna, String idtkn, String tkn) {
            this.numero = num;
            this.lexema = lexema;
            this.fila = fila;
            this.columna = columna;
            this.idtkn = idtkn;
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
        public String numero = "";
        public String lexema = "";
        public String fila = "";
        public String columna = "";
        public String idtkn = "";
        public String tkn = "";
    }
}
