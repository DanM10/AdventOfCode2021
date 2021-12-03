import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class day1 {

public static void main(String[] args){
    //day3

    //problema 1
     try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\day3.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        ArrayList<String[]> aux = new ArrayList<String[]>();
        while ((cadena=buff.readLine())!=null){
            String[] nuevo = cadena.split("");
            aux.add(nuevo);
        }


       int x =0;
        String gamma ="";
        String epsilon ="";

        while (x<aux.get(0).length){
            int size = aux.size();
            int uno = 0;
            int cero = 0;
            for (int y=0;y<size;y++){
                int lin = Integer.parseInt(aux.get(y)[x]);
                if (lin==1){
                    uno++;
                }else if (lin==0){
                    cero++;
                }
            }

            if (uno>cero){
                gamma=gamma.concat("1");
                epsilon=epsilon.concat("0");
            }else {
                gamma=gamma.concat("0");
                epsilon=epsilon.concat("1");
            }

            x++;
        }

        Long decimalGamma = Long.parseLong(gamma,2);
        Long decimalEpsilon = Long.parseLong(epsilon,2);
        System.out.println(decimalGamma);
        System.out.println(decimalEpsilon);
        Long final2 = decimalEpsilon*decimalGamma;
        System.out.println("Problema 1 dia 3: "+ final2);



    }catch (Exception exception){

    }




    //problema 2

    try {
        int valor=0;
        FileReader lector = new FileReader("D:\\Documents\\POLI SEXTO\\IA\\advent\\day3.txt");
        BufferedReader buff = new BufferedReader(lector);
        String cadena;
        ArrayList<String[]> aux = new ArrayList<String[]>();
        while ((cadena=buff.readLine())!=null){
            String[] nuevo = cadena.split("");
            aux.add(nuevo);
        }

        ArrayList<String[]> resultado2 = aux;
        ArrayList<String[]> resultado = aux;
        int i = 0;
        while (resultado.size()>1){
            resultado = recortarGenerador(resultado,i);
            i++;
        }
        String[] res = resultado.get(0);
        String oxigeno = "";
        for (String c : res){
            oxigeno = oxigeno.concat(c);
        }
        System.out.println(oxigeno);

        int z=0;
        while (resultado2.size()>1){
            resultado2 = recortardepurador(resultado2,z);
            z++;
        }
        String[] res2 = resultado2.get(0);
        String co2 = "";
        for (String c : res2){
            co2 = co2.concat(c);
        }
        System.out.println(co2);
        Long oxig = Long.parseLong(oxigeno,2);
        Long co22 = Long.parseLong(co2,2);
        Long final3 = oxig*co22;
        System.out.println("Problema 2 dia 3: "+final3);

    }catch (Exception exception){

    }


}

public static ArrayList<String[]> recortarGenerador(ArrayList<String[]> aux, int i){
    ArrayList<String[]> resultado = new ArrayList<String[]>();
    if (saberSiEsUnoOcero(aux,i)==1){
            //es uno
        for (int y =0;y<aux.size();y++){
            int val = Integer.parseInt(aux.get(y)[i]);
            if (val==1){
                resultado.add(aux.get(y));
            }else {

            }
        }
    }else if(saberSiEsUnoOcero(aux,i)==0){
        //es cero
        for (int y =0;y<aux.size();y++){
            int val = Integer.parseInt(aux.get(y)[i]);
            if (val==0){
                resultado.add(aux.get(y));
            }else {

            }
        }
    }else {
        for (int y =0;y<aux.size();y++){
            int val = Integer.parseInt(aux.get(y)[i]);
            if (val==1){
                resultado.add(aux.get(y));
            }else {

            }
        }
    }
   return resultado;
}


    public static ArrayList<String[]> recortardepurador(ArrayList<String[]> aux, int i){
        ArrayList<String[]> resultado = new ArrayList<String[]>();
        if (saberSiEsUnoOcero(aux,i)==1){
            //cero es menor
            for (int y =0;y<aux.size();y++){
                int val = Integer.parseInt(aux.get(y)[i]);
                if (val==0){
                    resultado.add(aux.get(y));
                }else {

                }
            }
        }else if(saberSiEsUnoOcero(aux,i)==0){
            //uno es menor
            for (int y =0;y<aux.size();y++){
                int val = Integer.parseInt(aux.get(y)[i]);
                if (val==1){
                    resultado.add(aux.get(y));
                }else {

                }
            }
        }else {
            //iguales
            for (int y =0;y<aux.size();y++){
                int val = Integer.parseInt(aux.get(y)[i]);
                if (val==0){
                    resultado.add(aux.get(y));
                }else {

                }
            }
        }
        return resultado;
    }



public static int saberSiEsUnoOcero(ArrayList<String[]> aux,int i){
    int uno = 0;
    int cero =0;
    for (int y =0;y<aux.size();y++){
        int val = Integer.parseInt(aux.get(y)[i]);
        if (val==1){
            uno++;
        }else {
            cero++;
        }
    }

    if (uno>cero){
        return 1;
    }else if(uno<cero) {
        return 0;
    }else {
        return -1;
    }

    //true significa que uno es el mayor
}
}
