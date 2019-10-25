package com.studyexample.leetcode.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum_1 {
    public static int[] twoSum(int [] nums ,int target){
            for(int i=0;i < nums.length ;  i ++){
                for(int j=i+1;j < nums.length ;  j ++){
                    if(nums[i] + nums[j] == target){
                        return  new int[]{i,j};
                    }
                }
            }
           throw   new IllegalArgumentException("no two sum solution");
    }

    public static int[] twoSum2(int [] nums ,int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i < nums.length ;  i ++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return  new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw   new IllegalArgumentException("no two sum solution");
    }



    public static void main(String[] args) {
        int [] nums = new int[]{1,4,6,3,9,11};
        int target = 17;
        int[] ints = twoSum2(nums, target);
        if (ints != null){
            System.out.println("我获得了想要的数据->index1:"+ ints[0]+",index2:"+ints[1]);
            return;
        }
        System.out.println("我没得到想要的数据");
    }
}
