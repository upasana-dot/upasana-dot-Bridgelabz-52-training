package collection.real_world;
import java.util.*;

class Booking implements Comparable<Booking> {
    String user; boolean vip;

    Booking(String user, boolean vip) { this.user = user; this.vip = vip; }

    @Override
    public int compareTo(Booking b) { return Boolean.compare(b.vip, this.vip); }

    public String toString() { return user + (vip?" (VIP)":""); }
}

public class Q9 {
    public static void main(String[] args) {
        List<Booking> allBookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> pq = new PriorityQueue<>();

        Booking b1 = new Booking("Alice", false);
        Booking b2 = new Booking("Bob", true);

        if (users.add(b1.user)) queue.offer(b1);
        if (users.add(b2.user)) queue.offer(b2);

        pq.addAll(queue);
        while (!pq.isEmpty()) {
            Booking b = pq.poll();
            allBookings.add(b);
            System.out.println("Confirmed → " + b);
        }
    }
}

