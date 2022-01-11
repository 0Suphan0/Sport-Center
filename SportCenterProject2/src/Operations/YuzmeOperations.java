/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class YuzmeOperations {
 
 /* public void yuzmeControl(String adSoyad){
    
     Calendar rightNow = Calendar.getInstance();
     int hour = rightNow.get(Calendar.HOUR_OF_DAY);
      

      int cikisSaat = hour +1;
      int girisDakika=rightNow.get(Calendar.MINUTE);

     if(cikisSaat==rightNow.get(Calendar.HOUR_OF_DAY) && girisDakika==Calendar.MINUTE){
   //çıkart.
         System.out.println("Çıkar");
}

*/

   

    public static void main(String[] args) {
     Calendar rightNow = Calendar.getInstance();
     int hour = rightNow.get(Calendar.HOUR_OF_DAY);
      

      int cikisSaat = hour +1;
      int girisDakika=rightNow.get(Calendar.MINUTE);

     if(cikisSaat==rightNow.get(Calendar.HOUR_OF_DAY) && girisDakika==Calendar.MINUTE){
   //çıkart.
         System.out.println("Çıkar");

    }
      
  


}
}