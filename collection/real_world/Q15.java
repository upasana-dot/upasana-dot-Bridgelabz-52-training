package collection.real_world;
import java.util.*;

class Team{
    String name; int points;
    Team(String n,int p){name=n;points=p;}
    public String toString(){return name+"("+points+")";}
}

class Match{
    String t1,t2;
    Match(String a,String b){t1=a;t2=b;}
    public String toString(){return t1+" vs "+t2;}
}

public class Q15{
    public static void main(String[] args){
        Set<Team> teams=new HashSet<>();
        Queue<Match> fixtures=new LinkedList<>();
        List<String> results=new ArrayList<>();
        TreeSet<Team> ranking=new TreeSet<>((a,b)->b.points-a.points);

        teams.add(new Team("A",10));
        teams.add(new Team("B",15));
        fixtures.offer(new Match("A","B"));

        while(!fixtures.isEmpty()){
            Match m=fixtures.poll();
            results.add(m+" done");
        }

        ranking.addAll(teams);
        System.out.println("🏆 Rankings: "+ranking);
    }
}

