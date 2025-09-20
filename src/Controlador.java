
import java.io.IOException;
import java.util.Scanner;


public class Controlador {
    //se establecen los métodos que al final se vinculan con la vista 
    //Scanner captura los datos de entrada 
    private final Scanner sc; //sc captura las líneas 
    public Controlador (Scanner sc){
        this.sc = sc; 
    }
    public void menu()throws IOException{
        int op; 
        do{
            //System va con mayúscula porque es una clase
            System.out.println("\n Menú de opciones:");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor ");
            System.out.println("3. Contador ");
            System.out.println("4. Banco ");
            System.out.println("5. Auto ");
            System.out.println("6. Libro ");
            System.out.println("7. División");
            System.out.println("8. División con entrada de usuario");
            System.out.println("9. Validar edad");
            System.out.println("10. Achivo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción:");
            try {
                op = Integer.parseInt(sc.nextLine()); //Todo lo que captura el Scanner es una cadena de texto y lo convertimos a entero con parse 
            } catch (NumberFormatException e) { //valida si una cadena puede ser convertida a un tipo número
                op= -1; 
            }
            switch (op) {
                case 1:
                    demoCalculadora(); 
                    break;
                case 2: 
                    this.demoConversor();
                    break;
                case 4:this.demoBanco();
                default:
                    throw new AssertionError();
            }
        }while(true && !false); 
    }
    private void demoCalculadora(){
        Calculadora c = new Calculadora(); //declaración, instanciación 
        System.out.println("Sumar 2 + 3 = " + c.sumar(2, 3));
        System.out.println("Sumar 1 + 2 + 3 = "+c.sumar(1, 2, 3));
        System.out.println("Sumar 2.3 + 5.9 = " + c.sumar(2.3, 5.9));
        
    }
    private void demoConversor ()
    {
        Conversor  conv =new Conversor();
        System.out.println(" 25° C a F => "+ conv.convertir(25)+ "F");
        System.out.println(" 10 Km a millas =>"+conv .convertir(10, "kmAMillas")+ "mi");
        System.out.println(" Convertir de seg a min y seg ");
        int [] mm=conv.convertir(130);
        System.out.println(" 130 seg => "+mm [0]+"min "+mm[1]+"seg");
    }
    private void demoBanco()
    {
     Banco B= new Banco();
        Banco.actulizartasaInteres(6.5);
        System.out.println("la tasa actulizada (6.5) ");
        
        System.out.println("la tasa de interes actual es"+Banco.mostrarTasaInteres()+"%");
        
        Banco.actulizartasaInteres(8.2);
        System.out.println("se actulizo la tasa de interes a 8.2%");
         System.out.println(" la tasa de interes actual es "+ Banco.mostrarTasaInteres()+"%");
        
    }
}
