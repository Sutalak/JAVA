package JFrameGUI;
import java.awt.*;
class Balloon {
    private int diameter = 10;
    private int x = 25, y = 80;
    Graphics g;
    public void display(Graphics g) {
        g.drawOval(x, y, diameter, diameter);
    }
    public void left() {
        if(x > 25) x = x - 10;
    }
    public void right() {
        if(x < 260) x = x + 10;
    }
    public void up() {
        if(y > 80) y = y - 10;
    }
    public void down() {
        if(y < 270) y = y + 10;
    } 
    public void LeftDown() {
        // diameter = diameter + 5;
        if(x > 25 && y > 80) {
           x = x - 10; 
           y = y + 10;
        }
        
    }
    public void rightUp() {
        // diameter = diameter - 5;
        if(x < 260 && y > 80) {
            x = x + 10;
            y = y - 10;
         }
    }
}
