import java.util.Scanner;

public class ScoreGrade{
    private double testScore1;
    private double testScore2;
    private double testScore3;


    ScoreGrade(double t1, double t2, double t3){
        this.testScore1 = t1;
        this.testScore2 = t2;
        this.testScore3 = t3;

    }

    double calculateAverage(){
        double sum = this.testScore1 + this.testScore2 + this.testScore3;
        double average = sum / 3; 
        return average;
    }

    double maxScore(){
        double max = (Math.max((Math.max(this.testScore1, this.testScore2)),testScore3));
        return max;
    }
} 



