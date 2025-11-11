package collection.real_world;

import java.util.*;

public class Q14{
    public static void main(String[] args){
        List<String> feedbacks=new ArrayList<>();
        Set<String> unique=new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        Stack<String> recent=new Stack<>();

        feedbacks.add("Great Service!");
        feedbacks.add("Late delivery");
        feedbacks.add("Great Service!"); // duplicate

        for(String f:feedbacks)
            if(unique.add(f)) queue.offer(f);

        while(!queue.isEmpty()){
            String msg=queue.poll();
            recent.push(msg);
        }

        System.out.println("🗣 Unique Feedbacks: "+unique);
        System.out.println("🔝 Recent: "+recent.peek());
    }
}

