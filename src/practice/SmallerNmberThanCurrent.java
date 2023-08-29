package practice;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
public class SmallerNmberThanCurrent {
    public static void main(String[] args) {
        SmallerNmberThanCurrent smallerNmberThanCurrent = new SmallerNmberThanCurrent();
        int[] a={6,5,4,8};
        System.out.println(Arrays.toString(smallerNmberThanCurrent.smallerNumbersThanCurrent(a)));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            int num=0;
            for(int j=nums.length-1;j>=0;j--) {
                if(nums[i]>nums[j]) {
                    num++;
                }
            }
            ans[i]=num;
        }
        return ans;
    }
}
