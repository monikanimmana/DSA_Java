public class palindrom_recursion {
    public boolean palin(int i , int n , String str){
        if(i>=n/2){
            return true;
        }
        if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(n-i-1))){
            return false;
        }
        return palin(i+1,n,str);
    }
    public static void main(String[] args) {
        palindrom_recursion obj=new palindrom_recursion();
        String str="Madam";
        int n=str.length();
        System.out.println(obj.palin(0, n, str));


    }
}
