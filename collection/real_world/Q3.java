package collection.real_world;
import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    int requestId;
    String pickup;
    int priority; // lower = more urgent

    RideRequest(int requestId, String pickup, int priority) {
        this.requestId = requestId;
        this.pickup = pickup;
        this.priority = priority;
    }

    @Override
    public int compareTo(RideRequest other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Request#" + requestId + " (" + pickup + ", priority " + priority + ")";
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Queue<RideRequest> rideQueue = new LinkedList<>();
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
        Set<Driver> drivers = new HashSet<>();
        List<RideRequest> completedRides = new ArrayList<>();

        rideQueue.offer(new RideRequest(1, "Airport", 2));
        rideQueue.offer(new RideRequest(2, "Station", 1));

        drivers.add(new Driver("Ravi"));
        drivers.add(new Driver("Neha"));

        System.out.println("🚘 Ride Requests:");
        for (RideRequest r : rideQueue) System.out.println(r);

        // Move all rides to priority queue
        priorityQueue.addAll(rideQueue);

        System.out.println("\n Assigning Rides:");
        while (!priorityQueue.isEmpty() && !drivers.isEmpty()) {
            RideRequest req = priorityQueue.poll();
            Driver d = drivers.iterator().next();
            drivers.remove(d);
            System.out.println("Assigned " + req + " → Driver: " + d);
            completedRides.add(req);
            drivers.add(d);
        }

        System.out.println("\n Completed Rides:");
        completedRides.forEach(System.out::println);
    }
}
