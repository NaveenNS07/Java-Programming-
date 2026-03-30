public class checksorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,5,6};
        boolean check = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                check = false;
                break;
            }
        }

        if (check==true) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
