package drawwing;
import javax.swing.*; 
import java.awt.*; 
public class chick extends javax.swing.JFrame{
    public chick(){}
    public void paint(Graphics g){
        super.paint( g );
        // ปาก
        g.setColor( new Color(205,133,63));
        for(int y=106; y<=120; y++){
            g.drawLine(40, 116, 54, y);
        }
        //ตัว
        g.setColor( new Color(255,219,88) );
        g.fillOval(50, 50, 100, 106);
        g.setColor( new Color(150,75,0));
        g.drawOval(50, 50, 100, 106);
        //ตา
        g.setColor( new Color(101,67,33));
        g.fillOval(70, 106, 10, 10);
        // ขา
        g.drawLine(94, 156, 92, 170);
        g.drawLine(88, 170, 92, 170);
        g.drawLine(108, 156, 110, 170);
        g.drawLine(106, 170, 110, 170);
        // ปีก
        g.drawArc(112, 80, 50, 50, 180, 100);
        // name
        String name1 = "Suteera Sunakorn", name2 = "Sutalak Sunakorn";
        g.setColor( new Color(0,51,102));
        g.drawString("Chick", 20, 50);
        g.drawString(name1, 50, 190);
        g.drawString(name2, 52, 202);
    }
    public static void main(String[] args){
        chick test = new chick();
        test.setSize(200, 220); 
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        test.setVisible(true);
    }
}