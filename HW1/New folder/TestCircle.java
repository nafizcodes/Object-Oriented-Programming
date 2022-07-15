//Question number 1

import java.util.Scanner;
import java.text.DecimalFormat;

class Circle{
    private double radius;
    
    // verify that Radius is a double point number greater than 0 and less than 50
    public void set()  
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the radius? ");
        radius = sc.nextDouble();

        while( !(radius > 0 && radius < 50))
        {
            System.out.print("Invalid! \nPlease enter radius between 0 and 50 :");
            radius = sc.nextDouble();
        }
    }

    //shows the value of Radius
    public void get()
    {
        System.out.println("The radius is " + radius);
    }

    //Calculates the area 
    public double Area()
    {
        double area;
        area = (Math.PI*radius*radius);
        return area;
    }

    //Calculates the circumference
    public double Circumference()
    {
        double circumference;
        circumference = (2*Math.PI*radius);
        return circumference;
    }
}

//Test class
public class TestCircle {
    public static void main(String[]args)
    {
        DecimalFormat decimal = new DecimalFormat("###.##");
       
        Circle circle = new Circle();

        circle.set();

        circle.get();

        System.out.println("Area is " + decimal.format(circle.Area()) );

        System.out.println("Circumference is " + decimal.format(circle.Circumference()));
   
        // End the program.
        System.exit(0);
    }
}
