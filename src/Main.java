import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Passenger> passengers = new ArrayList<>();
            Passenger p1 =new Subscribers("ahmed","2020");
            p1.setCar(new Car("11",new Routes("King Fahad road","Sheikh Jaber Street",60.0),5));
            p1.display();

            Passenger p2 = new NonSubscribers("salem","1010",true);
            p2.setCar(new Car("10",new Routes("King Abdulaziz road","Prince Turki Bin Abdulaziz",40.0),0));
            p2.display();
            passengers.add(p1);
            passengers.add(p2);




        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }

    }
}