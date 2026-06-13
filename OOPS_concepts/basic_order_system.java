package DSA_Java.OOPS_concepts;

class User{
    String name;
    String email;

    User(){
        name="Guest";
        email="guest@gmail.com";
    }

    User(String name,String email){
        this.name=name;
        this.email=email;
    }
    void displayUser(){
        System.out.println("Guest name"+name+"with eamil"+email);
    }

}

class Product{
    String productName;
    int price;

    Product(String productName , int price){
        this.productName=productName;
        this.price=price;
    }

    void displayProduct(){
        System.out.println("Product is "+productName+"with amount"+price);
    }

}

class Order{
    User user;
    Product product;

    Order(User user,Product product){
        this.user=user;
        this.product=product;
    }

    void displayOrder(){
        System.out.println("user orders are"+user.name+"product name  is"+product.productName);
    }
}
public class basic_order_system {
    public static void main(String[] args) {
        User obj=new User();
        User obj3=new User("moanika","monika@gmail.com");
        Product pro=new Product("iphone", 200000);
        Order ord=new Order(obj,pro);
        obj.displayUser();
        obj3.displayUser();
        pro.displayProduct();
        ord.displayOrder();

    }
}
