class A{
    public void display(){
        System.out.println("A's display method");
    }

}
class B extends A{
    public void display(){
        System.out.println("B's display method");
    }
}
public class task8{
    public static void main(String[] args){
        A a = new B();
        a.display();
        ((B) a).display();
    }
}