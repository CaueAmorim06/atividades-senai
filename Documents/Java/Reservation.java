public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation (int count, int capacity, boolean open){
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;

        if (count < 1 || count > 8){
            System.out.println("Invalid Reservation");
        }
    }

    public void confirmReservation(){
        if (restaurantCapacity >= guestCount || isRestaurantOpen){
            System.out.println("Reservation Confirmed");
            isConfirmed = true;
        }else{
            System.out.println("Reservation Denied");
            isConfirmed = false;
        }
    }

    public void informUser(){
        System.out.println("Please enjoy your meal!");
        if (isConfirmed = false){
            System.out.println("Unable to confirm reservation, please contact restaurant");
        }
        if (isConfirmed = true){
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 12, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
    }
