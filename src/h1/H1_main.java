package h1;

public class H1_main {
    static PrioListe prioListe = new PrioListe();

    public static void main(String[] args) {
        prioListe.addPatient(new Patient("Max",12));
        System.out.println(prioListe.myList.toString());
        prioListe.addPatient(new Patient("Max",16));
        System.out.println(prioListe.myList.toString());
        prioListe.addPatient(new Patient("Max",2));
        System.out.println(prioListe.myList.toString());
        prioListe.addPatient(new Patient("Max",55));
        System.out.println(prioListe.myList.toString());
        prioListe.addPatient(new Patient("Max",1));
        System.out.println(prioListe.myList.toString());

        prioListe.getNextPatient();
        System.out.println(prioListe.myList.toString());
        prioListe.getNextPatient();
        System.out.println(prioListe.myList.toString());
        prioListe.getNextPatient();
        System.out.println(prioListe.myList.toString());
        prioListe.getNextPatient();
        System.out.println(prioListe.myList.toString());
        System.out.println();
        System.out.println(prioListe.getPosition(new Patient("Jamal", 122)));
    }
}
