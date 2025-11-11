package collection.real_world;
import java.util.*;

class Patient {
    String name;
    Patient(String name){ this.name=name; }
    public String toString(){ return name; }
}

public class Q10 {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1=new Patient("Ravi"); Patient p2=new Patient("Sita");

        admitted.add(p1); admitted.add(p2);
        waiting.offer(p1); waiting.offer(p2);

        while(!waiting.isEmpty()){
            Patient p=waiting.poll();
            history.add(p);
            discharged.push(p);
        }

        System.out.println("🩺 Discharged: "+discharged);
        System.out.println("↩ Re-admit: "+discharged.pop());
    }
}
