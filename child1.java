class Question{
    int a=400;
    int b=200;
}
public class child1 extends Question{
    int a=1000;
     int b=2000;
void add(int a,int b) {
     System.out.println(a+this.b-super.a);
}
public static void main(String[] args){
     child1 c = new child1();
     c.add(100,300);
}
}