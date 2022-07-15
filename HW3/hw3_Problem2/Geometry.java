import java.util.Scanner;

public class Geometry {

    static Scanner sc = new Scanner(System.in);
    static double getAreaCircle(double radius){

        if(radius < 0){
            while(!(radius > 0 )){
                System.out.print("\nInvalid input!");
                System.out.print("\nEnter a valid radius: ");
                radius = sc.nextDouble();
            }
            double area = Math.PI * radius * radius;
            System.out.print("\nArea of the circle: " + area);
            return area;
        }else{
            
            double area = Math.PI * radius * radius;
            System.out.print("\nArea of the circle: " + area);
            return area;
        }   
    }   

    static double getAreaRectangle(double length, double width){
        
        if(length < 0){
            while(!(length > 0)){
                System.out.print("\nInvalid input!");
                System.out.print("\nEnter a valid length: ");
                length = sc.nextDouble();
            }
        }

        if(width < 0){
            while(!(width > 0)){
                System.out.print("\nInvalid input!");
                System.out.print("\nEnter a valid width: ");
                width = sc.nextDouble();
            }
        }

        double area = length * width;
        System.out.print("\nArea of Rectangle: " + area);
        return area;
    }

    static double getAreaTriangle(double length_base, double height){

        
        if(length_base < 0){
            while(!(length_base > 0 )){
                System.out.print("\nInvalid input!");
                System.out.print("\nEnter a valid base length: ");
                length_base = sc.nextDouble();
            }
        }

        if(height < 0 ){
            while(!(height > 0 )){
                System.out.print("\nInvalid height!");
                System.out.print("\nEnter a valid height: ");
                height = sc.nextDouble();
            }
        }
        double area = 0.5 * length_base * height;
        System.out.print("\nArea of Triangle: " + area);
        return area;
    }
}
