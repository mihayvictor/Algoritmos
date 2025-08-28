public class ContarArr {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        
        int total = contar(arr, 0);
        System.out.println("Quantidade de itens no array: " +total); 
    }

    static int contar(int[]arr, int i){
        if (i == arr.length) {
                return i;
        }
        i++;
        return contar(arr, i);     
    }
}
