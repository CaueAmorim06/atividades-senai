import java.util.ArrayList;

public class PrimeDirective {
    public PrimeDirective(){

    }

    public boolean isPrime(int number){
        if (number == 2){
            return true; 
        } else if(number < 2){
            return(false);
        }
        

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
    }
    return true;
}

public int onlyPrimes(){

}




    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();        
        System.out.println(prime.isPrime(7));
        System.out.println(prime.isPrime(28));
        System.out.println(prime.isPrime(2));
        System.out.println(prime.isPrime(0));
    }
    

    
    
}
