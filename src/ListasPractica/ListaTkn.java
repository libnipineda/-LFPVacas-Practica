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
        private NodoTkn inicio;
        
    public ListaTkn() {
        inicio=null;
    }
    
    public boolean esVacia(){
        return inicio==null;
    }
    
    public void agregarFinal(String num,String lex,String fil,String col, String idtk, String tk){
        NodoTkn nuevo = new NodoTkn();
        nuevo.setNumero(num);
        nuevo.setLexema(lex);
        nuevo.setFila(fil);
        nuevo.setColumna(col);
        nuevo.setIdtkn(idtk);
        nuevo.setTkn(tk);
        
        if (esVacia()) {
            inicio=nuevo;
        }else{
            NodoTkn aux = inicio;
            while (inicio.getSiguiente() !=null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void mostrar(){
        if (!esVacia()) {
            NodoTkn aux = inicio;
            int i=0;
            while(aux !=null){
                System.out.println(i+"- Lexema: "+aux.getLexema());
                aux=aux.getSiguiente();
                i++;
            }
        }
    }              
}