package h2;

import java.util.ArrayList;

public class Bus {
    ArrayList<Passenger> passengers;

    public Bus(){
        passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p){
        passengers.add(p);
    }

    public void exitBus(){
        passengers.removeIf(pass -> pass.visited >= pass.planned);
    }

    public void nextStop(Passenger[] boarding){
        for (Passenger pass : passengers) {
            pass.visited++;
        }
        exitBus();

        for (Passenger pass : boarding) {
            enterBus(pass);

        }
    }

    public void nextStop(){
        for (Passenger pass : passengers) {
            pass.visited++;
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets(){
        ArrayList<Passenger> invalid = new ArrayList<>();
        for (int i = passengers.size() - 1; i >= 0; i--) {
            Passenger p = passengers.get(i);
            if (!p.ticket) {
                invalid.add(0,p);
                passengers.remove(i);
            }
        }
        return invalid;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames){
        for(Passenger p : passengers){
            for(String name : passengerNames){
                if(p.name.equals(name)){
                    otherBus.enterBus(p);
                    passengers.remove(p);
                }
            }
        }
    }
}
