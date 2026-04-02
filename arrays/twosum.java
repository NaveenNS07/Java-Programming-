public class twosum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,3,5};
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
