package h1;

public class Patient {
    String name;
    int prio;

    public Patient(String name, int prio) {
        this.name = name;
        this.prio = prio;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Prio: " + prio;
    }
}
