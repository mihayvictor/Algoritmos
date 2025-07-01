import java.util.ArrayList;
import java.util.List;

public class DividirConquistar {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        int total = soma(list);
        System.out.println(total);
        
    }

    public static Integer soma(List<Integer> nums) {
    
        if (nums.isEmpty()) {
            return 0;
        }else{
            return nums.get(0) + soma(nums.subList(1, nums.size()));
        }
    }    
}
