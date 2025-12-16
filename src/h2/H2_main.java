package h2;

public class H2_main {
    public static void main(String[] args) {
        Bus A = new Bus();
        A.enterBus(new Passenger("Max", 12, true));
        A.enterBus(new Passenger("Son", 3, true));
        A.enterBus(new Passenger("Lenny", 4, false));

        Bus B = new Bus();
        System.out.println(A);

        A.nextStop();
        System.out.println(A);

        A.nextStop(new Passenger[]{new Passenger("Jamal", 2, false)});
        System.out.println(A);

        A.nextStop();
        System.out.println(A);

        System.out.println(A.findPassengersWithoutTickets());
        System.out.println(A);

        System.out.println(B);
        A.transferPassengers(B, new String[]{"Max"});
        System.out.println(B);
    }
}
