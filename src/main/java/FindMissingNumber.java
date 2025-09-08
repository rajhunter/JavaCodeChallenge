import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumber {

public static void main(String [] args){

    Integer nums[]= {12,1,4,6,5,8,9};


    Arrays.sort(nums);
    Integer max=nums[nums.length-1];
    System.out.println("Max: "+max);
    HashSet<Integer> setData= new HashSet<>(Arrays.asList(nums));

    for (int i=1 ; i<max+1;i++){
        if(!setData.contains(i)){
            System.out.print(""+i+",");

        }

    }


    //System.out.println(nums);


}


}
