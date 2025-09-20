
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Controlador controller = new Controlador(new Scanner (System.in)); 
        try {
            controller.menu();
        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S:" + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Entrada no válida" + e.getMessage());
        }catch(Exception e){
            System.out.println("Error no controlado" + e.getMessage());
        }
    }
    
}
