import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class day1 {

public static void main(String[] args){
    //day2
    //problema 1

    try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\day2.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        int posicion=0;
        int profundidad=0;

        while ((cadena=buff.readLine())!=null){
            String[] auxC = cadena.split(" ");
            if (auxC[0].equals("forward")){
                //forward
                posicion=posicion + Integer.parseInt(auxC[1]);
            }else if (auxC[0].equals("up")){
                profundidad = profundidad-Integer.parseInt(auxC[1]);
            }else if (auxC[0].equals("down")){
                profundidad = profundidad+Integer.parseInt(auxC[1]);
            }
        }

            System.out.println(posicion);
            System.out.println(profundidad);
            int final2 = posicion*profundidad;
            System.out.println("Problema 1:" + final2);


    }catch (Exception exception){

    }

     //problema 2
    try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\day2.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        int posicion=0;
        int profundidad=0;
        int punteria=0;
        while ((cadena=buff.readLine())!=null){
            String[] auxC = cadena.split(" ");
            if (auxC[0].equals("forward")){
                //forward
                posicion=posicion + Integer.parseInt(auxC[1]);
                profundidad = profundidad + (Integer.parseInt(auxC[1])* punteria);
            }else if (auxC[0].equals("up")){
                punteria = punteria - Integer.parseInt(auxC[1]);
            }else if (auxC[0].equals("down")){
                punteria = punteria+ Integer.parseInt(auxC[1]);
            }
        }

        System.out.println(posicion);
        System.out.println(profundidad);
        int final2 = posicion*profundidad;
        System.out.println("Problema2: " + final2);


    }catch (Exception exception){

    }

}


}
