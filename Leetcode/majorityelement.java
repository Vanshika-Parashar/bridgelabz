package Leetcode;

import java.util.Arrays;
public class majorityelement {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int max=nums[0];
        Arrays.sort(nums);
        int sum=1;
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]){
                sum++;
            }
            else{
                sum=1;
                max=nums[i];

        }
        if(sum>n){
            return nums[i];
        }
        

        
    }
    return max;

}


    
    
    

