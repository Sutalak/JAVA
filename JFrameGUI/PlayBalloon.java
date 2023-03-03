package JFrameGUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayBalloon extends JFrame implements ActionListener {
    private Button LeftDown, rightUp, left, right, up, down;
    private Balloon myBalloon;
    public PlayBalloon(){
        super("Display Balloon in JFrame");
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        LeftDown = new Button("LeftDown");
        LeftDown.addActionListener(this);
        c.add(LeftDown);
        rightUp = new Button("rightUp");
        rightUp.addActionListener(this);
        c.add(rightUp);
        left = new Button("Left");
        left.addActionListener(this);
        c.add(left);
        right = new Button("Right");
        right.addActionListener(this); 
        c.add(right);
        up = new Button("Up");
        up.addActionListener(this);
        c.add(up);
        down = new Button("Down");
        down.addActionListener(this); 
        c.add(down);
        myBalloon = new Balloon();
        setSize(400,400);
        setForeground(Color.BLUE);
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == LeftDown){
            myBalloon.LeftDown(); 
        }
        else if (event.getSource() == rightUp){
            myBalloon.rightUp(); 
        }
        else if (event.getSource() == left){
            myBalloon.left();
        }
        else if (event.getSource() == right){
            myBalloon.right();
        }
        else if (event.getSource() == up){
            myBalloon.up();
        }
        else if (event.getSource() == down){
            myBalloon.down();
        }
        repaint();    
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect( 25, 80, 250, 200 );
        myBalloon.display(g);
    }
    public static void main(String[] args){
        PlayBalloon test = new PlayBalloon();
        test.setSize(320,300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
