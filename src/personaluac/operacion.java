/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaluac;

/**
 *
 * @author Denilson
 */
public class operacion {
    
    private int resultado;

    public operacion() {
    }

    public operacion(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int suma(int valor){
        this.resultado = resultado+valor;
        return resultado;
    }
    
    public int resta(int valor){
        this.resultado = resultado-valor;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "operacion{" + "resultado=" + resultado + '}';
    }
    
    
    
}
