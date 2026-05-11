public class LC_242 {
    public void validanagram(String str1,String str2){
        
    }
    public static void main(String[] args) {
        LC_242 obj=new LC_242();
        String str1="rat";
        String str2="cat";
        obj.validanagram(str1,str2);
    }
}

//BRUTE FORCE METHOD
// int count=0;
//         if(str1.length()==str2.length()){
//             for(int i=0;i<str1.length();i++){
//                 char ch=str1.charAt(i);
//                 int j=0;
//                 while(j<str1.length()){
//                     if(ch!=str2.charAt(j)){
//                         j++;
//                     }else{
//                         count++;
//                         break;
//                     }

//                 }
//             }
//             if(count==str1.length()){
//                 System.out.println("Valid Anagram");

//             }else{
//                 System.out.println("not a valid annagram");
//             }
//         }else{
//             System.out.println("not a valid anagram");
//         }
