package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {

       int[] arr = {1,2,6,7,5};
       int target = 14;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println("printing 1 d array using for loop");
        for (int a: arr) {
            System.out.print(a + " ");
        }
        swap(arr, 2, 4);
        System.out.println();
        System.out.println("After swapp" +Arrays.toString(arr));
        System.out.println("Max number of Array " +max(arr));
       //printing array using enhanced for loop
        reverse(arr);
        System.out.print("Reverse arrays " + Arrays.toString(arr));
       int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2d arrays");
        for(int row=0;row<a.length;row++) {
            for(int col=0;col<a[row].length; col++) {
                a[row][col] = sc.nextInt();
            }
        }
        System.out.println("printing 2d arrays using for loop");
        for (int row=0;row<a.length;row++) {
            for (int col=0;col<a[row].length;col++) {
                System.out.print(a[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("printing 2d arrays using using Arrays collection class");
        for(int[] ar: a) {
            System.out.println(Arrays.toString(ar));
        }
    }
    static int max(int[] arr) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static void swap(int[] arr,int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        while (start<end) {
            swap(arr,start, end);
            start++;
            end--;
        }
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        int sum =0;
        for (int i=0;i<nums.length;i++) {
            if(i< nums.length) {
                 sum = nums[i] + nums[i + 1];
            }
                if (target == sum) {
                    ans[0] = i;
                    ans[1] = i + 1;
                    return ans;
                }
        }
        return ans;
    }
}