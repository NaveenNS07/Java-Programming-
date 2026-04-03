public class leaderelement {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int rightmax = arr[arr.length - 1];
        System.out.println("Leader element: "+ rightmax);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > rightmax) {
                rightmax = arr[i];
                System.out.println("Leader element: "+ rightmax);
            }
        }
    }
}
