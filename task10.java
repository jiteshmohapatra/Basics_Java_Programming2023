class question{
    static int a =10;
}
class question1 extends question{
    static int a =20;
}
public class task10 extends question1{
    public static void main(String args[]){
        a =100;
        System.out.println(task10.a);
        System.out.println(question1.a);
    }

}