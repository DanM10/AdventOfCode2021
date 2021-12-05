import java.util.ArrayList;

public class Lineas {
    private int[] incio;
    private int[] fin;
    private ArrayList<int[]> puntosCubiertos=new ArrayList<int[]>();
    private int linea; //cero horizontal uno vertical,-1 ninguna,3 diagonal cuadrada,4 diagonal cruzada
    private boolean orientacion;


    Lineas(int[] inico,int[] fin){
        this.incio=inico;
        this.fin=fin;
        if (inico[0]==fin[0]){
            //x1=x2
            this.linea=0;
        }else if (inico[1]==fin[1]){
            this.linea=1;
        }else if (inico[0]==inico[1] && fin[1]==fin[0]){
            this.linea=3;
        }else if(calcularPendiente(inico,fin)==1||calcularPendiente(inico,fin)==-1){
            this.linea=4;
        }else {
            this.linea=-1;
        }

        if(linea==0){
            //horizontal
            if (inico[1]>fin[1]){
                this.orientacion = false;
            }else {this.orientacion=true;}
        }else if(linea==1){
            if (inico[0]>fin[0]){
                this.orientacion = false;
            }else {this.orientacion=true;}
        }else if (linea==3){
            if (inico[1] > fin[1]){
                this.orientacion = false;
            }else {this.orientacion=true;}
        }else if(linea==4){
                if(inico[0]<fin[0]){
                    //bien
                    this.orientacion=true;
                }else {this.orientacion=false;}
        }else {

        }
        sacarDatos();
    }


    public int llenarMatriz(int[][] aux,int x){
        if (linea==0||linea==1||linea==3||linea==4||linea==5){
            for (int[] z : puntosCubiertos){
                int x1 = z[0];
                int x2 = z[1];
                if (aux[x1][x2]==0){
                    //vacio
                    aux[z[0]][z[1]]=1;

                }else if (aux[z[0]][z[1]]==1){
                    aux[z[0]][z[1]]=2;
                    x++;
                }else if (aux[z[0]][z[1]]==2){
                    aux[z[0]][z[1]]=3;
                }else{

                }
            }
        }else {
            return x;
        }
        return x;
    }


  public void sacarDatos(){
      if (linea==0){
          //horizontal
          if (orientacion){
              //a la dere
              for (int i=incio[1];i<=fin[1];i++){
                  int[] aux = new  int[2];
                  aux[0]=incio[0];
                  aux[1]=i;
                  puntosCubiertos.add(aux);
              }
          }else if(!orientacion){
              // a la izq
              for (int i=fin[1];i<=incio[1];i++){
                  int[] aux = new  int[2];
                  aux[0]=incio[0];
                  aux[1]=i;
                  puntosCubiertos.add(aux);
              }
          }else {

          }
      }else if(linea==1){
          //vertical
          if (orientacion){
              //arriba
              for (int i=incio[0];i<=fin[0];i++){
                  int[] aux = new  int[2];
                  aux[1]=incio[1];
                  aux[0]=i;
                  puntosCubiertos.add(aux);
              }
          }else if(orientacion==false) {
              // a la izq
              for (int i=fin[0];i<=incio[0];i++){
                  int[] aux = new  int[2];
                  aux[1]=incio[1];
                  aux[0]=i;
                  puntosCubiertos.add(aux);
              }
          }else {

          }

      }else if(linea==3){
          if (orientacion){
              //arriba
              for (int i=incio[0];i<=fin[0];i++){
                  int[] aux = new  int[2];
                  aux[1]=i;
                  aux[0]=i;
                  puntosCubiertos.add(aux);
              }
          }else if(orientacion==false) {
              // a la izq
              for (int i=fin[0];i<=incio[0];i++){
                  int[] aux = new  int[2];
                  aux[1]=i;
                  aux[0]=i;
                  puntosCubiertos.add(aux);
              }
          }else {

          }

      }else if (linea==4){
          if (orientacion){
              //arriba
              if(incio[1]>fin[1]){
                  //abajo
                  int p = incio[1];
                  for (int i=incio[0];i<=fin[0];i++){
                      int[] aux = new  int[2];
                      aux[0]=i;
                      aux[1]=p;
                      puntosCubiertos.add(aux);
                      p--;
                  }
              }else {
                  int p = incio[1];
                  for (int i=incio[0];i<=fin[0];i++){
                      int[] aux = new  int[2];
                      aux[1]=p;
                      aux[0]=i;
                      puntosCubiertos.add(aux);
                      p++;
                  }
              }
          }else if(orientacion==false) { //inico[0]>fin[0]
              // a la izq
              if(incio[1]>fin[1]){
                  //abajo
                  int p = fin[1];
                  for (int i=fin[0];i<=incio[0];i++){
                      int[] aux = new  int[2];
                      aux[1]=p;
                      aux[0]=i;
                      puntosCubiertos.add(aux);
                      p++;
                  }
              }else {//inico[0]>fin[0] && incio[1] < fin[1]
                  int p = fin[1];
                  for (int i=fin[0];i<=incio[0];i++){
                      int[] aux = new  int[2];
                      aux[1]=p;
                      aux[0]=i;
                      puntosCubiertos.add(aux);
                      p--;
                  }
              }
          }else {

          }

      }else {

      }
  }

    public int getLinea() {
        return linea;
    }

    public int[] getIncio() {
        return incio;
    }

    public int[] getFin() {
        return fin;
    }

    public int calcularPendiente(int[]a ,int[]b){
        //1
        int x1 = a[0];
        int x2 = b[0];
        int y1 = a[1];
        int y2 = b[1];
        int resultado = (x2-x1)/(y2-y1);
        return resultado;
    }

    public void imprimirPuntos(){
      for (int[] x:puntosCubiertos){
          System.out.println(x[0]+" "+x[1]);
      }
    }


}
