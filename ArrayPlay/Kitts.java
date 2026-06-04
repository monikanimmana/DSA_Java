class Kitts{
    public String find(String str){
        StringBuilder ans=new StringBuilder();
        ans.append(str.charAt(0));
        boolean take=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                take=true;

            }else{
                if(take){
                    ans.append(str.charAt(i));
                    take=false;
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Kitts obj=new Kitts();
        String str="Pasko-Patak";
        System.out.println(obj.find(str));
    }
}