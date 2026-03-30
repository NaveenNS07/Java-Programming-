public class FrequencyofElement {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,1,8,1,9};
        int target = 1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}