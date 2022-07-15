import java.util.Scanner;

public class GeometryTest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Geometry Calculator"+
            "\n1. Calculate the Area of a Circle" +
            "\n2. Calculate the Area of a Rectangle" +
            "\n3. Calculate the Area of a Triangle"+
            "\n4. Quit" +
            "\nEnter your choice (1-4): ");
            
            
            int input = sc.nextInt();

            while ((input < 1 || input > 4 )){
                System.out.print("\nInvalid Input!!" +
            "\n\nGeometry Calculator"+
            "\n1. Calculate the Area of a Circle" +
            "\n2. Calculate the Area of a Rectangle" +
            "\n3. Calculate the Area of a Triangle"+
            "\n4. Quit" +
            "\nEnter your choice (1-4): ");
            
            input = sc.nextInt();
            } 
            
        while(input != 4){

            while ((input < 1 || input > 4 )){
                System.out.print("\nInvalid Input!!" +
            "\n\nGeometry Calculator"+
            "\n1. Calculate the Area of a Circle" +
            "\n2. Calculate the Area of a Rectangle" +
            "\n3. Calculate the Area of a Triangle"+
            "\n4. Quit" +
            "\nEnter your choice (1-4): ");
            
            input = sc.nextInt();
            } 

        if (input == 1){
            System.out.print("Enter the radius: ");
            double input_radius = sc.nextDouble();

            Geometry.getAreaCircle(input_radius);

        }else if(input == 2){
            System.out.print("Enter the length: ");
            double input_length = sc.nextDouble();

            if(input_length < 0){
                while(!(input_length > 0)){
                    System.out.print("\nInvalid input!");
                    System.out.print("\nEnter a valid length: ");
                    input_length = sc.nextDouble();
                }
            }

            System.out.print("Enter the width: ");
            double input_width = sc.nextDouble();

            Geometry.getAreaRectangle(input_length, input_width);
            

        }else if(input == 3){
            System.out.print("Enter the base length of Triangle: ");
            double input_base_length = sc.nextDouble();

            if(input_base_length < 0){
                while(!(input_base_length > 0 )){
                    System.out.print("\nInvalid input!");
                    System.out.print("\nEnter a valid base length: ");
                    input_base_length = sc.nextDouble();
                }
            }

            System.out.print("Enter the height: ");
            double input_height = sc.nextDouble();

            Geometry.getAreaTriangle(input_base_length, input_height);

        }
        System.out.print(
            "\n\nGeometry Calculator"+
            "\n1. Calculate the Area of a Circle" +
            "\n2. Calculate the Area of a Rectangle" +
            "\n3. Calculate the Area of a Triangle"+
            "\n4. Quit" +
            "\nEnter your choice (1-4): ");
            
            input = sc.nextInt();
    }
    System.out.print("\nProgram ends.");
    }   
}
