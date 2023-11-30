class question{
    static int a =10;
}
class question1 extends question{
 static int a =20;
}
public class quest extends question1{
  public static void main(String args[]){
        a =100;
        System.out.println(question.a);
        System.out.println(question1.a);
    }

}