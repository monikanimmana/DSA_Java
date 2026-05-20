

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_Static_Variables {
        static boolean flag = false;
        static int H;
        static int B ;
        static {
            Scanner sc= new Scanner(System.in);
            H = sc.nextInt();
            B = sc.nextInt();
            try{
                if (H<=0 || B<=0){
                 throw new Exception("Breadth and height must be positive");
                }
                flag = true;
            }
            catch(Exception e){
             
                System.out .println("java.lang.Exception: " + e.getMessage());
    
            } 

        }
        

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

