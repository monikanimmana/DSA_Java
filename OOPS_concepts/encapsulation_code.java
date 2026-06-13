package DSA_Java.OOPS_concepts;
public class encapsulation_code{
    private String name;
    private int marks;
    void setDetails(String name , int marks){
        if(marks >= 0 && marks <= 100){
            this.name=name;
            this.marks=marks;
        }
    }
    void getDisplay(){
        System.out.println(name + " " +marks);
    }
    public static void main(String[] args) {
        encapsulation_code obj=new encapsulation_code();
        obj.setDetails("monika", 95);
        obj.getDisplay();

    }
}