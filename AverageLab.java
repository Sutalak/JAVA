import javax.swing.JOptionPane;
public class AverageLab {
    public static void main(String[] args) {
        String num;
        double numD;
        num = JOptionPane.showInputDialog("Score All : ");
        numD = Double.parseDouble(num);

        JOptionPane.showMessageDialog(null, "average : "
        + getScore(numD));
    }
    public static double getScore(double num){
        String score;
        double scoreD = 0;
        double scorel=0;
        for(double i=1; i<=num;i++){
            score = JOptionPane.showInputDialog("Score number "+ i +" : ");
            scoreD = Double.parseDouble(score);
            scorel += scoreD;
        }
        return average(scorel, num);
    }
    public static double average(double score, double averNum){
        
        return score / averNum;
    }
}
