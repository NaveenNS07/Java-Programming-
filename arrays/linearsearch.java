public class linearsearch {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,7,5,4,5,6};
        int target = 5;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i+" ");
            }
        }
    }
}
