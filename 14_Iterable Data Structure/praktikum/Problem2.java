import java.util.*;

public class Problem2 {
    
    public static void main(String[] args) {
        
        int[] inputArray = {7,6,5,2,3,7,5,2};
        //int[] inputArray = {1,1,2,2,};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
   
        for(Integer val: inputArray){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }
  
        System.out.println("Element yang sama \n");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            if(map.get(key) > 1){
                System.out.print(key + " ");
            }
        }
    }
}
