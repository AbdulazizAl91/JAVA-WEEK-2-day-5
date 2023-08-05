public class NonSubscribers extends Passenger{
    private boolean discount_coupon ;

    public NonSubscribers(String name, String ID,  boolean discount_coupon) {
        super(name, ID);
        this.discount_coupon = discount_coupon;
    }


    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public void display() {
        if (discount_coupon == true){
            double discount = getCar().getRoutes().getTrip_price();
            discount=discount-discount*10/100;
            setTrip_cost(discount);
            System.out.println("Passenger name: " +getName()+"\n"+"Passenger ID :" +getID()+
                    "\ncar code: " + getCar().getCode()+"\nprice : "+getTrip_cost());

        }
        else {
            double discount = getCar().getRoutes().getTrip_price();
            setTrip_cost(discount);
            System.out.println("Passenger name: " +getName()+"\n"+"Passenger ID :" +getID()+
                    "\ncar code: " + getCar().getCode()+"\nprice : "+getTrip_cost());

        }



    }
}
