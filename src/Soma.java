import java.util.ArrayList;
import java.util.List;

public class Soma {

    public static void main(String[] args) {

        List<Integer>lista = new ArrayList<>(); 
        lista.add(2);
        lista.add(4);
        lista.add(6);

        int total = soma(lista, 0);

        System.out.println("Total: " + total);
    }

    static int soma(List<Integer>lista, int i){
        i = lista.size() -1;

        if (lista.size() == 0) {
            return 0;
        }else{
            return (lista.remove(i) + soma(lista, i));
        }
     
    }

}
