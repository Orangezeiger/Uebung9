package h2;

public class Passenger {
    String name;
    int planned;
    int visited;
    boolean ticket;

    public Passenger(String name, int planned, boolean ticket) {
        this.name = name;
        this.planned = planned;
        this.ticket = ticket;
        visited = 0;
    }

    @Override
    public String toString() {
        return "(Name: " + name + ", Planned: " + planned + ", Visited: " + visited + ", Ticket: " + ticket + ")";
    }
}
