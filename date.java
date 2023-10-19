// //import java.text.DateFormat;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;  
// import java.util.Date;  
// //import java.util.Calendar;  
//  public class date {  
//        /**
//      * @param args
//      * @throws ParseException
//      */
//     public static void main(String args[]) throws ParseException {  
//                 String input = "2023-01-17 00:00:00.0";
//                 SimpleDateFormat inputFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
//                 SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
//                 Date date = inputFormat.parse(input);
//                 String output =outputFormat.format(date);
//                 System.out.println(output);
                 
//         }  
// } 

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
class date {
    public static void main (String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = simpleDateFormat.parse("2013-12-01");
        Date date2 = simpleDateFormat.parse("2021-08-09");
 
        System.out.println(date1.before(date2));
        System.out.println(date1.equals(date2));
        System.out.println(date1.after(date2));
        boolean cnt4=date1.before(date2);
        if(cnt4==true){
            System.out.println("imin");
        }
    }
}