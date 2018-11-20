/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author alba
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimir(2, 3);
        imprimir(5, 6);
        imprimir(8, 9);
        imprimir(3, 83);
        imprimir(92, 12);
        int resultado = sumar (1, 2);
        System.out.println(concatenar("El resultado es", "" + resultado ));
        
        int resultado2 = sumar(sumar(1, 2), 7);
        System.out.println(concatenar("El resultado es", "" + resultado2 ));
        
        
        int resultado3 = sumar(sumar (2, 2), 7);
        boolean mayor = Comprobar(resultado3);
        if (Comprobar (resultado3))
            System.out.println("Es mayor");
        else 
            System.out.println ("no es mayor");
   //instancia     
        MisMetodos mismetodos  =new MisMetodos();
        mismetodos.Comprobar(resultado);
        mismetodos.imprimir(resultado, resultado2);
        
      }
    public static void imprimir (/*parametros*/ int n1, int n2){
        int resultado = n1 +n2;
        
        System.out.println("suma: " + resultado);
    }
    //El metodo se ejecuta y fregresa a un int 
      public static int sumar (int n1, int n2){
          //return termina el metodo y debe regresar una respueta del mismo tipo de metodo 
          return n1 + n2;
          
      }
      public static String concatenar (String cadena1, String cadena2){
          return cadena1.concat(" "). concat(cadena2);
      }
      public static boolean Comprobar (int n){
         return n > 10;
      
          
    }
    
}
