
public class Conversor {
    // ° a farenheit
    public double convertir (double celsius){
        return (celsius*1.8)+32;
    }
    // km a millas 
    public double convertir ( double valor , String tipo) {
        
            if ("kmAMillas".equalsIgnoreCase(tipo)){
                return valor * 0.6213371;
        }
    throw new IllegalArgumentException( "tipo "+ " de conversión no soportada ");
    }
    // segundos a [min,seg]
    public int [] convertir (int segundos ){
        int min=segundos/ 60;
        int seg=segundos% 60;
        return new int [] {min, seg};
    }
}
