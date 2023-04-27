

package testauditoria;

import javax.swing.JOptionPane;


public class Calculadora {
    
    
    public int suma(int x , int y){
        return x+y;
    }
    public int resta(int x, int y){
        return x-y;
    }
    // metodo que dado un string me regrese tru, si es
    //si es palindormo o false si no lo es
   
    
    
    public  boolean Polindromo(String nombre){
       String cadena = nombre;
      String sinEspacios = cadena.replace("","");
       String textoMayusculas = sinEspacios.toUpperCase();
       boolean polindromo = false;
       String cadenainvertida ="";
       for (int i = 0; i < textoMayusculas.length(); i++) {
             cadenainvertida= cadenainvertida+cadena.charAt(cadena.length()-i-1);
     
           System.out.println("\n"+cadenainvertida);
       }
        if (textoMayusculas.equals(cadenainvertida)) {
              polindromo =  true;
        }
        
        return polindromo;
    }
    
    // metodo que determina si un numero es primo o no
    public boolean numeroPrimo (int numero){
      /**
       * un numero primo es aquel que solo es divisible entre 1
       * o asi mismo
       * por lo tanto, si sucecedeque el numero divisible por algun otro numer
       * entoneces no es primo
       */
        for (int i = 2; i <= Math.sqrt(numero); i++) { 
            if (numero %i==0) {
               // si el numero es divisible por otro numero , entonces no es primo
               // el math.sqrt  se utuliza para mejorar el rendimiento del algortmos
                // el lugar de comprobar todos los numeros desde 2 hasta la raiz cuadrada
                /**
                 * de numero
                 */
                return false;
            }
        }
        /**
         * si no encontron que sea divisible con entre 2 o 1 entonces es un primo
         */
        return true;
    }

}