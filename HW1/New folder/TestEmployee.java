//Question number 2

import javax.swing.JOptionPane;

class Employee
{
    String name;
    int ID;
    String position;

    //constructor with parameters
    public Employee(String n, int id, String p)
    {
        this.name  = n;
        this.ID = id;
        this.position = p;
    }
}

public class TestEmployee
{
    public static void main(String[]args)
    {
        JOptionPane.showMessageDialog(null, "Enter the details of Employee 1.");
        String name1 = JOptionPane.showInputDialog("Name: ");
        String input_id1 =  JOptionPane.showInputDialog("ID: ");
        int ID1 = Integer.parseInt(input_id1);
        String position1 = JOptionPane.showInputDialog("Position: ");

        Employee e1 = new Employee(name1, ID1, position1);
        


        JOptionPane.showMessageDialog(null, "Enter the details of Employee 2.");
        String name2 = JOptionPane.showInputDialog("Name: ");
        String input_id2 =  JOptionPane.showInputDialog("ID: ");
        int ID2 = Integer.parseInt(input_id2);
        String position2 = JOptionPane.showInputDialog("Position: ");

        Employee e2 = new Employee(name2, ID2, position2);
        
        

        JOptionPane.showMessageDialog(null, "Enter the details of Employee 3.");
        String name3 = JOptionPane.showInputDialog("Name: ");
        String input_id3 =  JOptionPane.showInputDialog("ID: ");
        int ID3 = Integer.parseInt(input_id3);
        String position3 = JOptionPane.showInputDialog("Position: ");

        Employee e3 = new Employee(name3, ID3, position3);
        

        JOptionPane.showMessageDialog(null, "Details of Employee1: \nName = " + e1.name + "\nID = " + e1.ID +"\nPosition = "+ e1.position);
     
        JOptionPane.showMessageDialog(null, "Details of Employee2: \nName = " + e2.name + "\nID = " + e2.ID +"\nPosition = "+ e2.position);

        JOptionPane.showMessageDialog(null, "Details of Employee3: \nName = " + e3.name + "\nID = " + e3.ID +"\nPosition = "+ e3.position);

        System.exit(0);
    }
}
