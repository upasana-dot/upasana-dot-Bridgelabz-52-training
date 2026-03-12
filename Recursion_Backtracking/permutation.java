package Recursion_Backtracking;


import java.util.*;

public class permutation {

    static void permute(String chosen, String remaining){

        if(remaining.length() == 0){
            System.out.println(chosen);
            return;
        }

        for(int i = 0; i < remaining.length(); i++){

            char c = remaining.charAt(i);

            String newChosen = chosen + c;

            String newRemaining =
                    remaining.substring(0,i) +
                    remaining.substring(i+1);

            permute(newChosen, newRemaining);
        }
    }

    public static void main(String[] args){

        String str = "ABC";

        permute("", str);
    }
}