import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPorSelecao {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(6);
        lista.add(2);
        lista.add(10);

        System.out.println("Lista não ordenada: " + lista);
        System.out.println("Lista ordenada: " + ordenacaoPorSelecao(lista));
    
    }
    
    static int buscarMenor(List<Integer> lista){
        int menor = lista.get(0);
        int menor_indice = 0;

        for (int i = 1; i < lista.size(); i++){

            if (lista.get(i) < menor) {
                menor = lista.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    static List<Integer> ordenacaoPorSelecao(List<Integer> lista){
        int menor = lista.get(0);
        int menor_indice = 0;
        List<Integer> novaLista = new ArrayList<>();

        while (!lista.isEmpty()) {
            menor_indice = buscarMenor(lista);
            menor = lista.get(menor_indice);
            novaLista.add(menor);
            lista.remove(menor_indice);
        }
        return novaLista;
    }



}
