
import java.util.*;

public class HR_end_of_file{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 1;
        for(int i=1;i<=n;i++){
            String str = sc.nextLine();
            if( str == null || str.isEmpty()){
                break;
            }
            else{
                System.out.println(i + " " + str);
                n++;
            }
        }   
        
    }
}


