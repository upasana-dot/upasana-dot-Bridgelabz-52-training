package Recursion_Backtracking;

import java.util.*;

public class Subsetsum {

    static boolean subsetSum(int[] arr, int target, int index,
                             int currentSum, List<Integer> solution){

        if(currentSum == target){
            System.out.println(solution);
            return true;
        }

        if(index >= arr.length || currentSum > target)
            return false;

        solution.add(arr[index]);

        if(subsetSum(arr, target, index+1,
                currentSum + arr[index], solution))
            return true;

        solution.remove(solution.size()-1);

        if(subsetSum(arr, target, index+1,
                currentSum, solution))
            return true;

        return false;
    }

    public static void main(String[] args){

        int[] arr = {3,34,4,12,5,2};
        int target = 9;

        subsetSum(arr, target, 0, 0, new ArrayList<>());
    }
}
