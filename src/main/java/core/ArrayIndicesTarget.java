package core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by golagem on 10/4/17.
 */
public class ArrayIndicesTarget {

    public static void main(String... args){

        int[] nums={2,7,6,3,1,8};
        int target=9;
        List<int[]> ints=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] indices={i,j};
                    ints.add(indices);
                }
            }
        }

        for (int[] intArr:ints){
            System.out.print("[");
            for(int i=0;i<intArr.length;i++){
                System.out.print(intArr[i]);
                if(i==intArr.length-2){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}
