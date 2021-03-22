package publicacion;

//Luis Manuel Artiaga Cortes

public class Revista extends Publicacion implements Periodicidad {
   
   private String ISSN;
   private int numero;
   private int anio;
   
   public String getISSN (){
      return ISSN;
   }
   
   public void setISSN (String isnn){
      ISSN = isnn;
   }
   
   public int getNum(){
      return numero;
   }
   
   public void setNum (int num){
      numero = num;
   }
   
   public int getAnio(){
      return anio;
   }
   
   public void setAnio (int a){
      anio = a;
   }
   
   @Override
   public String getPeriodicidad(){
      return periodicidad;
   }

}