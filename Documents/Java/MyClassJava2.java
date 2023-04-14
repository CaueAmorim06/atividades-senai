public class MyClassJava2 {
    public static void main(String[] args) {
        int idade = 18;

        if(idade>= 16 && idade < 18){
            System.out.println("voto opc");
        }else if (idade < 16){
            System.out.println("nao vota");
        }else if (idade > 60){
            System.out.println("nao vota");
        }else{
            System.out.println("voto obrigatorio");
        }
    }
    
}
