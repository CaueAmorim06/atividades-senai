public class Order {

    public static void main(String[] args) {
               
        double itemCost = 30.99;
        boolean isFilled = false;
        
        if (itemCost > 24.00){
            System.out.println("High value item!");
        }
        if(isFilled){
            System.out.println("Shipping");
        }else {
            System.out.println("Order not ready");
        }                   
        
    }

}
