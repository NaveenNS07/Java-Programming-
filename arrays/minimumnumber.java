public class minimumnumber {
    public static void main(String[] args) {
        int[] arr = {9,4,6,7,1,5,7,8,9,5};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
