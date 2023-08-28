package practice;

import java.util.ArrayList;
import java.util.List;

public class GratestCandies {
    public static void main(String[] args) {
        int[] arr= {2,3,5,1,3};//4 7 3 4 6 9
        System.out.println(kidswithcandies(arr, 3));
    }


static List<Boolean> kidswithcandies(int[] candies, int extraCandies) {
    List<Boolean> l= new ArrayList<>();
    int maxCandies=Maxcandies(candies);
        for (int i=0;i<candies.length;i++) {
        int sum=candies[i]+extraCandies;
        if(sum>=maxCandies) {
            l.add(true);
        } else {
            l.add(false);
        }
    }
        return l;
}
    static int Maxcandies(int[] candies) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++) {
            if(candies[i]>max) {
                max=candies[i];
            }
        }
        return max;
    }
}
