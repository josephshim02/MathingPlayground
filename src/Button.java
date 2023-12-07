import javax.swing.*;
public class Button extends JFrame{//inheriting JFrame
    JFrame f;
    Button(){
        JButton b=new JButton("click");//create button
        b.setBounds(30,100,50, 40); //x axis, y axis, width, height

        add(b);//adding button on frame
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Button();
    }
}