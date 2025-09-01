public class ContarArr {
    public static void main(String[] args) {
        int[] arr = {2,10,4,6};
        
        int totalI = contar(arr, 0);
        System.out.println("Quantidade de itens no array: " +totalI); 
        int maior = max(arr, 0,0);
        System.out.println("Maior valor: " + maior);
        int totalSoma = soma(arr, 0, 0);
        System.out.println("Total valores somados: " + totalSoma);
    }

    static int contar(int[]arr, int i){
        if (i == arr.length) {
                return i;
        }
        i++;
        return contar(arr, i);     
    }

    static int max(int[]arr, int i, int maior){
        if (i == 0) {
            i++;
            maior = arr[0];
            return max(arr, i, maior);
        }
        if (i == arr.length) {
            return maior;
        }
        else {
            if(maior<arr[i]) {
            maior = arr[i];
            }
        i++;
        return max(arr, i, maior);
        } 
    }

    static int soma(int[] arr, int i, int total){
        if (i == arr.length) {
            return total;
        }
        total += arr[i];
        i++;
        return soma(arr, i, total);
    }
}
