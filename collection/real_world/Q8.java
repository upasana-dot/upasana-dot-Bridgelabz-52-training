package collection.real_world;

import java.util.*;

class Package {
    String id;
    boolean delivered;

    Package(String id) { this.id = id; this.delivered = false; }
    public String toString() { return id + (delivered?"✅":"🚚"); }
}

public class Q8 {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        Package p1 = new Package("P101");
        Package p2 = new Package("P102");

        if (packageIds.add(p1.id)) pending.offer(p1);
        if (packageIds.add(p2.id)) pending.offer(p2);

        while (!pending.isEmpty()) {
            Package p = pending.poll();
            p.delivered = true;
            delivered.add(p);
        }

        returned.push(p1);

        System.out.println("📦 Delivered: " + delivered);
        System.out.println("↩ Returned: " + returned);
    }
}

