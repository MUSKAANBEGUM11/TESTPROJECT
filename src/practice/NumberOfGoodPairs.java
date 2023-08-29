package practice;
//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
    int ans = numIdenticalPairs(a);
        System.out.println(ans);
    }
    static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
