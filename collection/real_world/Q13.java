package collection.real_world;
import java.util.*;

class Movie {
    String title; String genre;
    Movie(String t,String g){title=t;genre=g;}
    public String toString(){return title+" ["+genre+"]";}
}

public class Q13{
    public static void main(String[] args){
        Stack<Movie> watched=new Stack<>();
        List<Movie> all=new ArrayList<>();
        Set<String> genres=new HashSet<>();
        Queue<Movie> upNext=new LinkedList<>();

        all.add(new Movie("Inception","Sci-Fi"));
        all.add(new Movie("Titanic","Romance"));

        upNext.offer(all.get(0));
        Movie current=upNext.poll();
        watched.push(current);
        genres.add(current.genre);

        System.out.println("🎬 Watched: "+watched);
        System.out.println("⭐ Genres: "+genres);
    }
}
