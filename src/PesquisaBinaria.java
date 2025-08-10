public class PesquisaBinaria {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 5, 7, 10, 15, 20, 33, 42, 45, 54, 61, 72, 78, 80, 88, 91, 93, 97, 99, 100 };

        int item = 97;
        System.out.println("O item é " + item);
        System.out.println("Há " + array.length + " itens no array.");
        System.out.println();
        int resultado = pesquisaBinaria(array, item);

        if (resultado >= 0) {
            System.out.println("O item está no indice " + resultado + " do array.");
        }else{
            System.out.println("O item não está presente no array.");
        }

        }

    public static int pesquisaBinaria(int[] array, int item){

        int baixo = 0;
        int alto = array.length - 1;
        int meio = (alto + baixo) / 2;

        while (baixo <= alto) {

        meio = (alto + baixo) / 2;
        int chute = array[meio];
 
            if (chute == item) {
                return meio;
            }
            else if (chute > item) {
                System.out.println("Chute muito alto: indice " + meio);
                alto = meio - 1;
            }
            else {
                System.out.println("Chute muito baixo: indice " + meio);
                baixo = meio + 1;
            }
            
               
        }

        return -1; 

    }

        

        
    
}
