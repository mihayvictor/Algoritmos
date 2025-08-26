public class DividirConquistarArray {

    public static void main(String[] args) {
        int[] list = { 2, 4, 6, 1 };

        int total = soma(list, 0);
        System.out.println("Soma dos números = " + total);

        int maior = maior(list, 0);
        System.out.println("Maior = " + maior);

        int menor = menor(list, 0);
        System.out.println("Menor = " + menor);

        int numsitems = numItems(list, 0);
        System.out.println(numsitems);

    }

    static int soma(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        } else {
            return arr[index] + soma(arr, index + 1);
        }
    }

    static int maior(int[] arr, int index) {
      
        if (index == arr.length -1) {
            return arr[index];
        }
        int restante = maior(arr, index + 1);
        return Math.max(arr[index], restante);
    }

    static int menor(int[] arr, int index){
        if (index == arr.length -1) {
            return arr[index];
        }
        int restante = menor(arr, index +1);
        return Math.min(arr[index], restante);
    }

    static int numItems(int[] arr, int index){
        if (index == arr.length) {
            return 0;
        }else{
            return 1 + numItems(arr, index +1);
        }
    }
        
    
}
