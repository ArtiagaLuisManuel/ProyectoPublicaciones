//Luis Manuel Artiaga Cortes
//Se conserva la lista-

package publicacion;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

   public static int ctrlpub = 0;      
   public static Object publicaciones [] = new Object[20];
   public static boolean val=false;
   
   public static void main (String[] args) {
      Scanner leer = new Scanner (System.in);
            
         int opc=0, opc2=0, control=0;
      do{
         System.out.println ("---MENU---");
         System.out.println ("[1] Dar de alta una publicacion");
         System.out.println ("[2] Ver contenido");
         System.out.println ("[3] Salir");
         try{
            opc=leer.nextInt();
         }catch(Exception e){
            System.out.println ("Dato no valido...");
            control=0;
         }
            switch (opc){
               case 1:
                  System.out.println ("---TIPO DE PUBLICACION---");
                  System.out.println ("[1] Libro");
                  System.out.println ("[2] Revista");
                  System.out.println ("[3] Periodico");
                   try{
                      opc2=leer.nextInt();
                   }catch(Exception e){
                      System.out.println ("Dato no valido...");
                   }
                     switch (opc2){
                        case 1:
                           llenadoLibro();
                           break;
                        case 2:
                           llenadoRevista();
                           break;
                        case 3:
                           llenadoPeriodico();
                           break;
                        default:
                           System.out.println ("Dato no valido...");
                           break;  
                     }
                  break;  
               case 2: 
                  System.out.println ("----DATOS----"); 
                  mostrar();
                  break;
               case 3:
                  System.out.println ("Fin del programa");
                  control=1;
                  break;
               default:
                  System.out.println (" No existe esta opcion");
                  return;    
            }
          }while(control==0);   
   }
   
    public static void llenadoLibro(){
         Scanner leer = new Scanner (System.in);
         
         String dato1L, dato2L;
         double dato3L;
         int dato4L, dato5L, dato6L;
         Revista revista = new Revista();
         System.out.println ("- Llena los sig datos:");
         System.out.print ("ISSN: ");
         dato1L=leer.nextLine();
         revista.setISSN(dato1L);
         System.out.print ("\tTITULO: ");
         dato2L=leer.nextLine();
         revista.setTitulo(dato2L);
         System.out.print ("\tPRECIO: ");
         dato3L=leer.nextInt();
         revista.setPrecio(dato3L);
         System.out.print ("\tNUMERO: ");
         dato4L=leer.nextInt();
         revista.setNum(dato4L);
         System.out.print ("\tA\u00f1o: ");
         dato5L=leer.nextInt();
         revista.setAnio(dato5L);
         System.out.print ("\tNUMERO DE PAGINAS: ");
         dato6L=leer.nextInt();
         revista.setNumpag(dato6L);
         publicaciones[ctrlpub] = revista;
         ctrlpub++;
     }
     
     public static void llenadoRevista(){
         Scanner leer = new Scanner (System.in);
         
         String dato1R, dato2R, dato3R, dato4R;
         int dato6R;
         double dato5R;
         Libro libro = new Libro();
         System.out.println ("- Llena los sig datos:");
         System.out.print ("ISBN: ");
         dato1R=leer.nextLine();
         libro.setISBN(dato1R);
         System.out.print ("\tTITULO: ");
         dato2R=leer.nextLine();
         libro.setTitulo (dato2R);
         System.out.print ("\tAUTOR: ");
         dato3R=leer.nextLine();
         libro.setAutor (dato3R);
         System.out.print ("\tEDICION: ");
         dato4R=leer.nextLine();
         libro.setEdicion (dato4R);
         System.out.print ("\tPRECIO: ");
         dato5R=leer.nextDouble();
         libro.setPrecio (dato5R);
         System.out.print ("\tNUMERO DE PAGINAS: ");
         dato6R=leer.nextInt();
         libro.setNumpag (dato6R);
         publicaciones [ctrlpub] = libro;
         ctrlpub++;
     }
     
     public static void llenadoPeriodico(){
         Scanner leer = new Scanner (System.in);
         
         String dato1P, dato2P, dato4P;
         double dato6P;
         int dato3P, dato5P;
         Periodico periodico = new Periodico();
         System.out.println ("- Llena los sig datos:");
         System.out.print ("DEPOSITO LEGAL: ");
         dato1P=leer.nextLine();
         periodico.setDeposito(dato1P);
         System.out.print ("TITULO: ");
         dato2P=leer.nextLine();
         periodico.setTitulo(dato2P);
         System.out.print ("NUMERO DE EJEMPLARES: ");
         dato3P=leer.nextInt();
         periodico.setNumEjemplares(dato3P);
         System.out.print ("FECHA (dd/mm/aaaa): ");
         do{
            dato4P=leer.nextLine();
            validar(dato4P);
         }while(val==false);
         periodico.setFecha(dato4P);
         System.out.print ("NUMERO DE PAGINAS:");
         dato5P=leer.nextInt();
         periodico.setNumpag(dato5P);
         System.out.print ("PRECIO:");
         dato6P=leer.nextDouble();
         periodico.setPrecio(dato6P);
         publicaciones [ctrlpub] = periodico;
         ctrlpub++;
     }
     
     public static void mostrar(){
         for (int i=0 ; i < ctrlpub ; i++){
            System.out.println ("  " + publicaciones [i].getClass());
            if (publicaciones[i] instanceof Revista){
               Revista rev1 = new Revista();
               rev1 = (Revista)publicaciones[i];
               System.out.println ("      ----Revista-----");
               System.out.println ("ISSN: "+ rev1.getISSN());
               System.out.println ("Titulo: "+ rev1.getTitulo());
               System.out.println ("Precio: "+ rev1.getPrecio());
               System.out.println ("Numero: "+ rev1.getNum());
               System.out.println ("A\u00f1o: "+ rev1.getAnio());
               System.out.println ("Numero de paginas: "+ rev1.getNumpag());
               System.out.println ("____________________________________");
            }
            else if (publicaciones[i] instanceof Libro){
               Libro lib = new Libro();
               lib = (Libro)publicaciones[i];
               System.out.println ("      ----Libro-----");
               System.out.println ("ISBN: "+ lib.getISBN());
               System.out.println ("Titulo: "+ lib.getTitulo());
               System.out.println ("Autor: "+ lib.getAutor());
               System.out.println ("Edicion: "+ lib.getEdicion());
               System.out.println ("Precio: "+ lib.getPrecio());
               System.out.println ("Numero de paginas: "+ lib.getNumpag());
               System.out.println ("____________________________________");
            }
            else if (publicaciones[i] instanceof Periodico){
               Periodico per = new Periodico();
               per = (Periodico)publicaciones[i];
               System.out.println ("      ----Periodico-----");
               System.out.println ("Deposito Legal: "+ per.getDeposito());
               System.out.println ("Titulo: "+ per.getTitulo());
               System.out.println ("Numero de ejemplares: "+ per.getNumEjemplares());
               System.out.println ("Fecha: "+ per.getFecha());
               System.out.println ("Precio: "+ per.getPrecio());
               System.out.println ("Numero de paginas: "+ per.getNumpag());
               System.out.println ("____________________________________");
            }
         }
     }
     
     public static boolean validar(String dato4P){
         try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(dato4P);
            val=true;
        } catch (ParseException e) {
            return false;
        }
        return true;
     }
     
}