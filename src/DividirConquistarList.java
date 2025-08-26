import java.util.ArrayList;
import java.util.List;

public class DividirConquistarList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(6);

        int total = soma(list);
        System.out.println("Total = " + total);
        
        int maior = maior(list);
        System.out.println("Maoir = " +  maior);

        int menor = menor(list);
        System.out.println("Menor = " + menor);

        int numeroItens = numsItens(list);
        System.out.println("Número de itens = " + numeroItens);
    }

    static Integer soma(List<Integer> nums) {
    
        if (nums.isEmpty()) {
            return 0;
        }else{
            return nums.get(0) + soma(nums.subList(1, nums.size()));
        }
    } 
    
    static Integer maior(List<Integer> nums){
        int maior = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) > maior) {
                maior = nums.get(i);
            }
        }
        return maior;
    }

    static Integer menor(List<Integer> nums){
        int menor = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            
            if (nums.get(i) < menor) {
                menor = nums.get(i);
            }
        }
        return menor;
    }

    static Integer numsItens(List<Integer> nums){
        if (nums.isEmpty()) {
            return 0;
        }
        else{
            return 1 + numsItens(nums.subList(1, nums.size()));
        }
    }
    
}
