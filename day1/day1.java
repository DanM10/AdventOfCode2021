import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class day1 {

public static void main(String[] args){
//problema 1
    /*
    try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\output.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        ArrayList<Integer> aux = new ArrayList<>();
        while ((cadena=buff.readLine())!=null){
            aux.add(Integer.parseInt(cadena));
        }

        for (int i = 0;i<aux.size()+1;i++){
            if(i+1>aux.size()-1){
                break;
            }
            if(aux.get(i)<aux.get(i+1)){
                valor=valor+1;
            }

        }
        System.out.println(valor);

    }catch (Exception exception){

    }
*/
    //problema 2
    try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\output.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        ArrayList<Integer> aux = new ArrayList<>();
        while ((cadena=buff.readLine())!=null){
            aux.add(Integer.parseInt(cadena));
        }

        int x,y,z;
        x=0;
        y=0;
        z=0;
        ArrayList<Integer> valorF = new ArrayList<>();
            boolean clubEPN = true;
        while (x+2<aux.size()-1){
            x=y+1;
            int suma1 = aux.get(y)+aux.get(y+1)+aux.get(y+2);
            int suma2 = aux.get(x)+aux.get(x+1)+aux.get(x+2);
            if (suma1<suma2){
                valor++;
            }
            y++;
        }


            System.out.println(valor);


    }catch (Exception exception){

    }
}


}
