
import java.util.Scanner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import testauditoria.Calculadora;
import org.junit.Assert.*;

/**
 *
 * @author Miguel Angel Lara Hermosillo
 */
public class TestCalculator {

    
    Scanner sn = new Scanner(System.in);
    Calculadora cal = new Calculadora();
  /**  @Before
    public  void before() {
        System.out.println("Antes de la prueva");
    }

    @Test
    public void pruevaUno() {
        System.out.println("Este es prueva");
        //Aqui la suma
        
        int resultado = cal.suma(4, 54);
        Assert.assertEquals(58,resultado);
    }
    */
    @Test
    public void Prueva2(){
      
      boolean resultado = cal.Polindromo("ana oso ana");
    Assert.assertEquals(false, resultado);
      
}
     @Test
    public void Prueva3(){
       
      boolean resultado = cal.Polindromo("anita lava la tina");
      Assert.assertEquals(false, resultado);
}
    @Test
    public void Prueva4(){
    boolean resultado = cal.Polindromo("    Dabale Arroz a la zorra el abad");
Assert.assertEquals(false, resultado);
    
    }
   
    @Test
    // Numero primo
     public void Prueva5(){
    boolean resultado = cal.numeroPrimo(11);
Assert.assertEquals(true, resultado);
    
    }
       @Test
    // Numero primo
     public void Prueva6(){
    boolean resultado = cal.numeroPrimo(9);
Assert.assertEquals(false, resultado);
    
    }
       @Test
    // Numero primo
     public void Prueva7(){
    boolean resultado = cal.numeroPrimo(17);
Assert.assertEquals(true, resultado);
    
    }
       @Test
    // Numero primo
     public void Prueva8(){
    boolean resultado = cal.numeroPrimo(27);
Assert.assertEquals(false, resultado);
    
    }
       @Test
    // Numero primo
     public void Prueva9(){
    boolean resultado = cal.numeroPrimo(37);
Assert.assertEquals(true, resultado);
    
    }
}
