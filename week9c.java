import java.awt.*;
public class week9c{
    public static void main(String args[]){
        Frame f = new Frame("Button example");
        Button b = new Button("Click me");
        b.setBounds(150,50,50,80);
        f.add(b);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}