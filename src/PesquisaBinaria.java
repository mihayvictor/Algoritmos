public class PesquisaBinaria{
    public static void main(String[] args) throws Exception {
       int [] array = {1, 5, 7, 10, 15, 20, 33, 42, 45, 54, 61, 72, 78, 80, 88, 91, 93, 97, 99, 100};

       int item = 97;

       int baixo = 0;
       int alto = array.length-1;
       int meio = 0;

        while (baixo <= alto ) {

            meio = (alto + baixo) /2;
            int chute = array[meio];

            if (chute == item) {
                System.out.println(meio);
                break;
            }
            if (chute > item) {
                alto = meio - 1;
            }
            if (chute < item) {
                baixo = meio + 1;
            }
            
        }
    }
}
