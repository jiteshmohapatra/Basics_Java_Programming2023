class x{
    static{
        Y.display();
    }
}
class Y extends x{
    static void display(){
        System.out.println("Java");
    }
}
public class week5{
    public static void main(String[] args){
        Y.display();
    }
}