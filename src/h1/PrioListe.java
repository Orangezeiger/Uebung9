package h1;

import java.util.ArrayList;

public class PrioListe {
    ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient(Patient p) {
        if (myList.isEmpty()) {
            myList.add(p);
        } else {
            int indx = 0;
            for (Patient pat: myList) {
                if (p.prio > pat.prio){
                    indx = myList.indexOf(pat) + 1;
                }
            }
            myList.add(indx,p);
        }
    }

    public Patient getNextPatient() {
        if (myList.isEmpty() ) {
            return null;
        } else {
            return myList.removeFirst();
        }
    }

    public int getPosition (Patient p) {
        return myList.indexOf(p);
    }
}
