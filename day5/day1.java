import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class day1 {

public static void main(String[] args) {
    //day3

    //problema 1
    try {
        int valor = 0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\day5.txt");
        BufferedReader buff = new BufferedReader(lector);

        String cadena;
        ArrayList<Lineas> Lineass = new ArrayList<Lineas>();
        int maxX =0;
        int maxY =0;
        while ((cadena = buff.readLine()) != null) {
            int[] inicio=new int[2];
            int[] fin=new int[2];
            String[] nuevo = cadena.split(" -> ");
            String [] auxInicio = nuevo[0].split(",");
            String [] auxFin = nuevo[1].split(",");
            inicio[0]=Integer.parseInt(auxInicio[0]);
            inicio[1]=Integer.parseInt(auxInicio[1]);
            fin[0]=Integer.parseInt(auxFin[0]);
            fin[1]=Integer.parseInt(auxFin[1]);
            Lineass.add(new Lineas(inicio,fin));
        }

        int[][] matriz = new int[1000][1000];
        int contador=0;
        for (Lineas l: Lineass){
            contador =
            l.llenarMatriz(matriz,contador);
        }
        System.out.println(contador);
       // imprimir(matriz);
        System.out.println();
        //imprimir(ejercicio17(matriz));
    } catch (Exception exception) {

    }

    }

    public static void imprimir(int [][] aux){
    for (int i=0;i<aux.length;i++){
        for (int y=0;y<aux[0].length;y++){
            System.out.print(aux[i][y]+" ");
        }
        System.out.println();
    }
    }

    public static int[][] ejercicio17(int[][] matriz) {
        int[][] nueva = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                nueva[j][i] = matriz[i][j];
                // nueva[i][j] = matriz[j][i]; // Línea errónea
            }
        }
        return nueva;
    }
}
