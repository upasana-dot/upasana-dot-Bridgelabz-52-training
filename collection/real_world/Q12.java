package collection.real_world;
import java.util.*;

class Parcel implements Comparable<Parcel>{
    String id; int priority;
    Parcel(String id,int priority){this.id=id;this.priority=priority;}
    public int compareTo(Parcel p){return Integer.compare(this.priority,p.priority);}
    public String toString(){return id+"(P"+priority+")";}
}

public class Q12{
    public static void main(String[] args){
        PriorityQueue<Parcel> pq=new PriorityQueue<>();
        Set<String> ids=new HashSet<>();
        List<Parcel> done=new ArrayList<>();
        Queue<Parcel> normal=new LinkedList<>();

        Parcel p1=new Parcel("A1",1); Parcel p2=new Parcel("A2",2);
        if(ids.add(p1.id)) pq.offer(p1);
        if(ids.add(p2.id)) normal.offer(p2);

        while(!pq.isEmpty()) done.add(pq.poll());
        while(!normal.isEmpty()) done.add(normal.poll());

        System.out.println("✅ Delivered: "+done);
    }
}
