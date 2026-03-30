import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class decendingsortlist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(40);
        list.add(7);
        list.add(5);
        list.add(9);

        Collections.sort(list,Collections.reverseOrder());

        for(int num : list){
            System.out.print(num+" ");
        }
    }
}
