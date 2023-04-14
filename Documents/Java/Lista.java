import java.util.Arrays;

public class Lista {
    public static void main(String[] args) {
        String[] meusItems = new String[5];
        meusItems[0] ="Caneta" ;
        meusItems[1] ="Borracha" ;
        meusItems[2] ="Corretivo" ;
        meusItems[3] ="Caderno" ;
        meusItems[4] ="Lápis" ;

        int[] numeros = new int[2];
        numeros[0] = 2;
        numeros[1] = 9;

        System.out.println(meusItems.length - numeros.length);
        
    }
    
}
