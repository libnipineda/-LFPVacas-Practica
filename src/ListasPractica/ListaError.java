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
        public String Ecolumna = "";
        public String Etkn = "";
        public String Eidtkn = "";              

    public ListaError() {
        
    }
    
    public ListaError(String Enumero, String Elexema, String Ecolumna, String Etkn, String Eidtkn) {
            this.Enumero = Enumero;
            this.Elexema = Elexema;
            this.Ecolumna = Ecolumna;            
            this.Etkn = Etkn;
            this.Eidtkn = Eidtkn;
        }          

    public String getEnumero() {
        return Enumero;
    }

    public void setEnumero(String Enumero) {
        this.Enumero = Enumero;
    }

    public String getElexema() {
        return Elexema;
    }

    public void setElexema(String Elexema) {
        this.Elexema = Elexema;
    }

    public String getEcolumna() {
        return Ecolumna;
    }

    public void setEcolumna(String Ecolumna) {
        this.Ecolumna = Ecolumna;
    }

    public String getEtkn() {
        return Etkn;
    }

    public void setEtkn(String Etkn) {
        this.Etkn = Etkn;
    }

    public String getEidtkn() {
        return Eidtkn;
    }

    public void setEidtkn(String Eidtkn) {
        this.Eidtkn = Eidtkn;
    }

    @Override
    public String toString() {
        return "ListaError{" + "Enumero=" + Enumero + ", Elexema=" + Elexema + ", Ecolumna=" + Ecolumna + ", Etkn=" + Etkn + ", Eidtkn=" + Eidtkn + '}';
    }
}