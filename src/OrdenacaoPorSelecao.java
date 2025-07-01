import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPorSelecao {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);

        ordenacaoPorSelecao(arr);

    }
    
    public static int buscarMenor(List<Integer> arr){
        int menor = arr.get(0);
        int menor_indice = 0;

        for (int i = 1; i < arr.size(); i++){

            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr){
        int menor = arr.get(0);
        int menor_indice = 0;
        List<Integer> novoArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            menor_indice = buscarMenor(arr);
            menor = arr.get(menor_indice);
            novoArr.add(menor);
            arr.remove(menor_indice);
        }
        System.out.println(novoArr);
        return novoArr;
    }



}
