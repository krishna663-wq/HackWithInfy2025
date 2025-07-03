import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3},{2, 4},{3, 5},{0, 6},{5, 7},{8, 9}};

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println(Arrays.deepToString(arr));

        int count= 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0] <= arr[i-1][1]){
                count++;
            }  
        }
        System.out.println(count);
    }
}
