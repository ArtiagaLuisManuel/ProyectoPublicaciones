package publicacion;

//Luis Manuel Artiaga Cortes

public class Periodico extends Publicacion implements Periodicidad {
   
   private String depositoLegal;
   private String fecha;
   private int numEjemplares;
   
   public String getDeposito (){
      return depositoLegal;
   }
   
   public void setDeposito (String depo){
      depositoLegal = depo;
   }
   
   public int getNumEjemplares(){
      return numEjemplares;
   }
   
   public void setNumEjemplares (int numE){
      numEjemplares = numE;
   }
   
   public String getFecha(){
      return fecha;
   }
   
   public void setFecha (String date){
      fecha = date;
   }
   
   @Override
   public String getPeriodicidad(){
      return periodicidad;
   }

}