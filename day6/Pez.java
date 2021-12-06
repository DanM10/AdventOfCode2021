public class Pez {
    private int contador;
    private boolean esNuevo = false;


    public Pez(){
        this.contador=8;
        this.esNuevo = true;
    }

    public Pez(int contador){
        this.contador=contador;
    }

    public void pasar_dia(){
        if (this.contador==0){
            this.contador=6;
        }else {
            this.contador--;
        }
    }


    public  boolean getEstado(){
        return esNuevo;
    }

    public int getContador() {
        return contador;
    }
}
