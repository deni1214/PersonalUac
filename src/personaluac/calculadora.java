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
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      operacion calc = new operacion();
      calc.setResultado(0);
        System.out.println(calc.suma(10));
        System.out.println(calc.suma(5));
        System.out.println(calc.suma(15));
        System.out.println(calc.suma(10));
        
        operacion res = new operacion();
        res.setResultado(0);
        System.out.println(calc.suma(50));
        System.out.println(calc.suma(5));
        System.out.println(calc.suma(25));
        
        
    }
    
}
