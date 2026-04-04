import java.util.Arrays;

public class containsduplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,3,4};

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                System.out.println("duplicate element: "+arr[i]);
            }
        }
    }
}
