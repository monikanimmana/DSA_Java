import java.util.*;
class ptice{
    public void examScore(int n , String str){
        String adrian="ABC";
        String bruno="BABC";
        String goran="CCAABB";
        int A_score=0;
        int B_score=0;
        int G_score=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if( ch == adrian.charAt(i%3)){
                A_score++;
            }
            if( ch == bruno.charAt(i%4)){
                B_score++;
            }
             if( ch == goran.charAt(i%6)){
                G_score++;
            }
        }
        int max = Math.max(A_score , Math.max(B_score,G_score));
        System.out.println(max);
        if(max==A_score){
            System.out.println("Adrian");
        }
        if(max == B_score){
            System.out.println("Bruno");
        }
        if(max == G_score){
            System.out.println("Goran");
        }

    }
    public static void main(String [] args){
        ptice obj=new ptice();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.nextLine();
        obj.examScore(n,str);
    }
}