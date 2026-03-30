public class removeDuplicateArray {

    public static void main(String[] args) {
        int j=0;
        int[] arr = {1,1,1,2,2,4,5,7,8,9};

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("Length: "+(j+1));

        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }
