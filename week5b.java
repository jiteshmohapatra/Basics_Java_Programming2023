class Question{
    int i;
    public question(int i){
        this.i = i--;
    }
}
class Question1 extends Question{
    public question1(int i){
        super(++i);
        System.out.println(i);
    }
}
public class week5b{
    public static void main(String args[]){
        Question1 n = new Question1(20);
    }
}