package practice;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        int[] arr = {2,7,4,5,9,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element to find");
        int target = sc.nextInt();
        System.out.println(linearsearch(arr, target));
    }
    static int linearsearch(int[] arr, int target) {
        if(arr.length==0) {
            return -1;
        }
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
