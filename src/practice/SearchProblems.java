package practice;

import java.util.Arrays;

public class SearchProblems {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        System.out.println(Arrays.toString(buildArray(arr)));
        System.out.println("running sum Array " + Arrays.toString(runningSum(arr)));//1 3 6 11 18
    }

    //build an array from permutation
    static int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            int index = nums[i];
            if (index<nums.length) {
                ans[i] = nums[index];
                index++;
            }
        }
        return ans;
    }
    //running sum of array
    static int[] runningSum(int[] nums) {
        int sum=0;
        int j=0;
        int[] sumarray=new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            //nums[i]=sum;
            if(j<i) {
                sum=nums[i]+nums[j];
                j++;
                nums[i]=sum;
            }
        }
        return nums;
    }
    //Maximum wealth array question
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int account=0;account<accounts.length;account++) {
            int rowsum=0;
            for (int money=0;money<accounts[account].length;money++) {
                rowsum+=accounts[account][money];
            }
            if(rowsum>max) {
                max=rowsum;
            }
        }
        return max;
    }
}
