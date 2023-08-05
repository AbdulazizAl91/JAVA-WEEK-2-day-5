public abstract class Passenger {
    private String name;
    private String ID;
    private Car car;
    private double trip_cost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.car = null;
        this.trip_cost=-0.0;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }



    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }


    public abstract void display();


}
