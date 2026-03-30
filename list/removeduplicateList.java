import java.util.ArrayList;
import java.util.List;

public class removeduplicateList {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newlist = new ArrayList<>();

        list.add(40);
        list.add(40);
        list.add(70);
        list.add(60);
        list.add(60);
        list.add(10);

        for(int num : list){
            if (!newlist.contains(num)) {
                newlist.add(num);
            }
        }
        System.out.println(newlist);
    }
}
