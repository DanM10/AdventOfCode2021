import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class day1 {

public static void main(String[] args) {
    //day3

    //problema 1
    try {
        int valor = 0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\output2.txt");
        BufferedReader buff = new BufferedReader(lector);

        String cadena;
        String[] aux = new String[600];
        cadena = buff.readLine();
        aux = cadena.split(",");
        int cantidadInicialPeces = aux.length;
        ArrayList<Pez> pezes = new ArrayList<Pez>();
        for (String x: aux){
            pezes.add(new Pez(Integer.parseInt(x)));
        }

        for (int i =0;i<256;i++){
            ArrayList<Pez> auxPez = new ArrayList<Pez>();
            for (Pez p:pezes){
                if (p.getContador()==0){
                    p.pasar_dia();
                    auxPez.add(new Pez());
                }else {
                    p.pasar_dia();
                }
            }
            if(!auxPez.isEmpty()){
                for (Pez p: auxPez){
                    pezes.add(p);
                }
            }

            /*
            for (Pez p:pezes){
                System.out.print(p.getContador()+" ");
            }
            System.out.println();*/
        }

        System.out.println(pezes.size());

    } catch (Exception exception) {

    }

    }

}
