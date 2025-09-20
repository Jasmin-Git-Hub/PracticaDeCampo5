
public class Banco {
   public  static double tasaInteres;
    
    
    public static void actulizartasaInteres (double nuevaTasa)
    {
        tasaInteres=nuevaTasa;
    }
    
    public static double  mostrarTasaInteres(){
        return tasaInteres;
    }
}
