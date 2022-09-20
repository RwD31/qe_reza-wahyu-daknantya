import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1{

    public static String[]mergeArray(String Arr1[], String Arr2[]){
        if (Arr1 == null || Arr1.length == 0) {
            return Arr2;
        }
        if (Arr2 == null || Arr2.length == 0) {
            return Arr1;
        }
        
        List < String > firstList = Arrays.asList(Arr1);
        List < String > secondList = Arrays.asList(Arr2);

        List < String > result = new ArrayList < String > (firstList);
        List < String > tmp = new ArrayList < String > (firstList);

        tmp.retainAll(secondList);
        result.removeAll(tmp);
        result.addAll(secondList);
        return ((String[]) result.toArray(new String[result.size()]));
    }

    public static void main(String[] args) {
       String[] mgr1 = mergeArray(new String[]{
        "kazuya", "jin", "lee"
       }, new String[]{
        "kazuya", "feng"
       });

       String[] mgr2 = mergeArray(new String[]{
         "lee", "jin"
       }, new String[]{
        "kazuya", "panda"
       });

       System.out.println("Merge ke 1");
       for (String string : mgr1) {
        System.out.println(string);
       }

       System.out.println(" \n Merge ke 2");
       for (String string : mgr2) {
        System.out.println(string);
       }
    }
}