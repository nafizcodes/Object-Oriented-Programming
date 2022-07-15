import javax.swing.JOptionPane;

class Car{

    String make;
    String model;
    int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(){

        this.make = "Ford";
        model = "Explorer";
        year = 2000;
    }

    void show(){
        JOptionPane.showMessageDialog(null, "Details of Car: \nMake= " + this.make + "\nmodel = " + this.model +"\n Year = "+ this.year);
        //System.out.println("Make: " + make + " Model: " + model + " Year: " + year);
    }
}


public class CarTest {
    public static void main(String args[]){

        Car car1 = new Car();
        
        String make = JOptionPane.showInputDialog("Make: ");
        String model = JOptionPane.showInputDialog("Model: ");
        String input = JOptionPane.showInputDialog("Year: ");
        int year = Integer.parseInt(input); 
        Car car2 = new Car(make, model, year);

        car1.show();
        car2.show();
    }
}
