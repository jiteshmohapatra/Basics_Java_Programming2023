import java.awt.*;
public class week9d{
    public static void main(String args[]){
        Frame f = new Frame("Check box example");
        Checkbox c1 = new Checkbox("c++");
        c1.setBounds(100,100,50,50);
        Checkbox c2 = new Checkbox("java");
        c2.setBounds(100,150,50,50);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}