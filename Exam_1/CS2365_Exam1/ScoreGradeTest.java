import javax.swing.JOptionPane;

public class ScoreGradeTest {
    public static void main(String args[]){

        String t1 = JOptionPane.showInputDialog("TestScore1: ");
        double score1 = Double.parseDouble(t1);

        String t2 = JOptionPane.showInputDialog("TestScore2: ");
        double score2 = Double.parseDouble(t2);

        String t3 = JOptionPane.showInputDialog("TestScore3: ");
        double score3 = Double.parseDouble(t3);

        ScoreGrade score = new ScoreGrade(score1, score2, score3);

        double score_average = score.calculateAverage();
        double max_score = score.maxScore();

    

        JOptionPane.showMessageDialog(null, "Average Score is " + score_average);
        JOptionPane.showMessageDialog(null, "Max score is " + max_score);

        System.exit(0);

    }
}
