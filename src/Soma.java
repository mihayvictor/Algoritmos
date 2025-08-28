import java.util.ArrayList;
import java.util.List;

public class Soma {

    public static void main(String[] args) {

        List<Integer>lista = new ArrayList<>(); 
        lista.add(2);
        lista.add(4);
        lista.add(6);

        int totalSoma = soma(lista, 0);
        //int totalContagem = contagem(lista, 0);
 
        System.out.println("Total: " + totalSoma);
        //System.out.println("Itens na lista: " + totalContagem );
    }

    static int soma(List<Integer>lista, int i){
        i = lista.size() -1;

        if (lista.size() == 0) {
            return 0;
        }else{
            return lista.remove(i) + soma(lista, i);
        }
     
    }

    static int contagem(List<Integer>lista, int i){
   
        if (lista.size() == 0) {
            return i;
        }
        else{
            lista.remove(0);
            i++;
            return contagem(lista, i);
        }

    }

}
