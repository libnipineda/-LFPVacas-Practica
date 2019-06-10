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
public class ListaError {
    
        public String Enumero = "";
        public String Elexema = "";
        public String Efila = "";
        public String Ecolumna = "";
        public String Etkn = "";
        public String Eidtkn = "";

        public ListaError(String Enumero, String Elexema, String Ecolumna, String Etkn, String Eidtkn) {
            this.Enumero = Enumero;
            this.Elexema = Elexema;
            this.Ecolumna = Ecolumna;
            this.Efila = Efila;
            this.Etkn = Etkn;
            this.Eidtkn = Eidtkn;
        }
       
        public String getEnumero() {
            return Enumero;
        }

        public String getElexema() {
            return Elexema;
        }

        public String getEfila() {
            return Efila;
        }

        public String getEcolumna() {
            return Ecolumna;
        }

        public String getEtkn() {
            return Etkn;
        }

        public String getEidtkn() {
            return Eidtkn;
        }    
}
