package in.nit.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import in.nit.model.Si;

public class Test {
	static float Per_Day_SI(float principle, float rate,float Year) 
    { 
		float Si,n;
          //Year = (float) (1.0/365);
          n = Year/365;
        Si = principle * n * rate /100;
        System.out.println(Si);
        return Si;  
    } 

	public static void main(String[] args) throws ParseException {
		 // Given start Date
        String start_date 
            = "05-07-2020 00:00:00"; 
        // Given end Date 
        String end_date 
            = "10-07-2020 00:00:00"; 
            
     // SimpleDateFormat converts the 
        // string format to date object 
        SimpleDateFormat sdf 
            = new SimpleDateFormat( 
                "dd-MM-yyyy HH:mm:ss"); 
  
        // Try Block 
      
            // parse method is used to parse 
            // the text from a string to 
            // produce the date 
            Date d1 = sdf.parse(start_date); 
            Date d2 = sdf.parse(end_date); 
  
            // Calucalte time difference 
            // in milliseconds 
            long difference_In_Time 
                = d2.getTime() - d1.getTime(); 
            long difference_In_Days 
                = (difference_In_Time 
                   / (1000 * 60 * 60 * 24)) 
                  % 365; 
            
        System.out.println(difference_In_Days);
        System.out.println("-------------");
        float Year=difference_In_Days;
        
        for(float i=1;i<=Year;i++) {
        // Function Call 
        System.out.println(i+" Day Interest:"+Per_Day_SI(340000,10,i));
        }
       
	}

}
