/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificaredad;

/**
 *
 * @author UCLAB827
 */
public class ValidarEdad {
    public void verificarEdad(int edad){
     if(edad<18){
       throw new IllegalArgumentException("La edad debe ser mayor a 18. ");
     }
        System.out.println("Edad valida: " + edad);
    }
}
