public class Subscribers extends Passenger{

    public Subscribers(String name, String ID) {
        super(name, ID);

    }




    @Override
    public void display() {
        double discount = getCar().getRoutes().getTrip_price();
        discount=discount-discount*50/100;
        setTrip_cost(discount);
        System.out.println("Passenger name: " +getName()+"\n"+"Passenger ID :" +getID()+
                           "\ncar code: " + getCar().getCode()+"\nprice : "+getTrip_cost());




    }
}
