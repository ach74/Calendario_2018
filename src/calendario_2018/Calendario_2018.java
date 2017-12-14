/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario_2018;

/**
 *
 * @author dam1a07
 */
public class Calendario_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calendario 2018");
        
        
        Dias();
        
        
    }
    
    
   private static void Dias(){
       
       
       
       
       int Abril = 30 ;
       int Mayo = 31;
       int Junoi = 30;
       int Julio = 31;
       int Agosto = 31;
       int Septiembre = 30;
       int Octubre = 31;
       int Noviembre = 30;
       int Dicciembre = 31;
       
       int Enero = 31;
       System.out.println("Enero");
       int week = 7;
       int num = 1;
       for (int rows = 0; rows < week-2; rows++){
           for(int cols = 0; cols < week; cols++ ){
               if (num<=Enero){
               System.out.print (num+"\t");
               num++;
               }
           }
           System.out.println();
       }
       System.out.println("");
       
       int Febrero = 28;
       System.out.println("Febrero");
       
       for (int rows = 0; rows < week-2; rows++){
           for(int cols = 0; cols < week; cols++ ){
               if (num<=Febrero){
               System.out.print (num+"\t");
               num++;
               }
           }
           System.out.println();
       } 
       
       
       
   }
    
    
   
   
   
   
   
   
   
   
   
   
   
   
}
