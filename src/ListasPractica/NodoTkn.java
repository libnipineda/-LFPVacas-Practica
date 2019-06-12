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
public class NodoTkn {
   String numero;
    String lexema;
    String fila;
    String columna;
    String idtkn;
    String tkn;
    NodoTkn siguiente;

    public NodoTkn() {
        this.numero = " ";
        this.lexema = " ";
        this.fila = " ";
        this.columna = " ";
        this.idtkn = " ";
        this.tkn = " ";
        this.siguiente = null;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getIdtkn() {
        return idtkn;
    }

    public void setIdtkn(String idtkn) {
        this.idtkn = idtkn;
    }

    public String getTkn() {
        return tkn;
    }

    public void setTkn(String tkn) {
        this.tkn = tkn;
    }

    public NodoTkn getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTkn siguiente) {
        this.siguiente = siguiente;
    } 
}
