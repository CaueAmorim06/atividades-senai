public class MyClassJava{
    public void mensagemVerdadeira(){
        System.out.println("Verdadeiro");
    }
    public void mensagemFalsa(){
        System.out.println("Falso");
    }
    public static void main(String[] args) {
        MyClassJava objeto = new MyClassJava();

        if (18 > 16 || 23>=23){
            objeto.mensagemVerdadeira();
        }else{
            objeto.mensagemFalsa();
        }
    }    
}