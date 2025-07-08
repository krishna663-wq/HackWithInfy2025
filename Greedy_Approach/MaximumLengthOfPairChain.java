import java.util.*;

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        int[][] arr = {{1,9},{2,3},{3,4},{5,6}};

        Arrays.sort(arr, (a,b) -> Integer.compare(a[1],b[1]));

        // for(int[] rows: arr){
        //     System.out.println(Arrays.toString(rows));
        // }
        for(int[] col : arr){
            System.out.println(Arrays.toString(col));
        }

    }
}