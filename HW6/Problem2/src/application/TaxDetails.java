package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import java.io.File;
import java.util.Scanner;

import java.util.*;

class FileContent{
	private String name;
	private String address;
	private int value;
	
	public FileContent() {
		this.name = "";
		this.address = "";
		this.value = 0;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public double getAssessedValue() {
		return value * 0.6;
	}
	
	public double getPropertyTax() {
		return getAssessedValue() * 0.0064;
	}
	
}

public class TaxDetails extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
      
   }
	@Override
	public void start(Stage primaryStage)
	{
	   final Label search_label = new Label("Enter a Property Address");
	   final Label name = new Label("Name: N/A");
	   final Label property_address = new Label("Property Address: N/A");
	   final Label assessed_value = new Label("Assessed Value: N/A");
	   final Label property_tax = new Label("Property Tax: N/A");
	   final TextField search_address = new TextField("");
	   
	   Button search = new Button("Search");
	   search.setOnAction(new EventHandler<ActionEvent>() {
				   public void handle(ActionEvent event){
					 
					   try {
						   ArrayList<FileContent> storage = new ArrayList<FileContent>();
						   File file = new File("property.txt");
						   Scanner sc = new Scanner(file);
					
					   while (sc.hasNextLine()) {
						   
						   String line = sc.nextLine();
						   String[] stringtokens = line.split(";");
						   
						   FileContent fc = new FileContent();
						   fc.setName(stringtokens[0].trim());
						   fc.setAddress(stringtokens[1].trim());
						   stringtokens[2] = stringtokens[2].replace(",", "");
						   int value = Integer.parseInt(stringtokens[2].trim());
						   fc.setValue(value);
						   storage.add(fc);
						  
					   }
					   sc.close();
					   
					   for (int i = 0 ; i < storage.size(); i++ ) {
						   String add_input = search_address.getText();
						   String add_current = storage.get(i).getAddress();
						   if(add_current.equals(add_input)) {
							   name.setText("Name: " + storage.get(i).getName());
							   property_address.setText("Address: " + storage.get(i).getAddress());
							   assessed_value.setText("Assessed Value: $" + storage.get(i).getAssessedValue());
							   property_tax.setText("Property Tax: $" + storage.get(i).getPropertyTax());
							   
						   }
					   }
					   }
					   catch (Exception e) {
							e.printStackTrace();
					   }
	}
	});
	   			VBox vbox = new VBox(10, search_label, search_address, search, name, property_address, assessed_value, property_tax);
	   			Scene scene = new Scene(vbox, 300, 300);
	   			vbox.setAlignment(Pos.CENTER);
	   			primaryStage.setScene(scene);
	   			primaryStage.setTitle("Property");
	   			primaryStage.show();
	   			
	}
}