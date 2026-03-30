import java.util.*;

public class maximumnumberinarray {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,2,4,3};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
