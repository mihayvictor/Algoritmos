

public class QuadradoMax {
    public static void main(String[] args) {
        int largura=1680, comprimento=640;

        int[] result = encontrarQuadrado(largura, comprimento);
        System.out.println();
        System.out.println(formatarResultado(result));

    }

    static int[] encontrarQuadrado(int x, int y){
        
        if (x == y) { //caso base
            int[] result = {x , y};
            return result;
        
        //caso recurssivo
        }else if(x > y){   
            x -= y; 
            System.out.println("Reduzindo largura:     " +  x); 
        }else{
            y -= x;
            System.out.println("Reduzindo comprimento: " + y);
            }

        return encontrarQuadrado(x, y);
    }

    public static String formatarResultado(int[] result){
        return "Quadrado máximo:  " + result[0] + " x " + result[1];
    }

}
