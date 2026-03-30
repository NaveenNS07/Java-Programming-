import java.util.ArrayList;
import java.util.List;

public class listbasic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        int max=list.get(0);

        for(int num : list){
            if (max<num) {
                max=num;
            }
        }

        System.out.println("Largest num: "+max);

        list.remove(2);
        for (int j = 0; j < list.size(); j++) {
        System.out.print(list.get(j)+" ");
        }
        int count=0;
        for(int nums : list){
            if(nums%2==0){
                count++;
            }
        }
        System.out.println("Even count: "+count);
    }
}
