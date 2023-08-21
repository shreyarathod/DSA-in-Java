import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int arr[] = {i,j};
                    return arr;
                }
            }
        }
        System.out.println("No such numbers found.");
        int arr[] = {-1,-1};
        return arr;
    }
}
public class ArraysTwoSum {

    public static void main (String [] args){
        Solution obj = new Solution ();
        int nums [] = {2,7,11,14};
        int target = 12;
       System.out.println(Arrays.toString(obj.twoSum(nums,target)));

    }

}