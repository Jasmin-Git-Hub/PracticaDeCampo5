/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaredad;

/**
 *
 * @author UCLAB827
 */
public class VerificarEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ValidarEdad validador = new ValidarEdad();
       
       try{
       validador.verificarEdad(16);
       } catch(IllegalArgumentException e){
           System.out.println("Excepción atrapada: " + e.getMessage());       
       }
       
       try{
        validador.verificarEdad(25);
       }  catch(IllegalArgumentException e){
           System.out.println("Excepción atrapada: " + e.getMessage());
       }
    }
    
}
