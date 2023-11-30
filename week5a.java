interface X {
    void display();
}
class Y implements X{
public void display(){
        System.out.println("Java");
    }

}
public class week5a{
    public static void main(String[] args){
        Y r = new Y();
        r.display();
    }
}