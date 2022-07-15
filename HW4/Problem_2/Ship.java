public class Ship {
    private String name;
    private String year;
    
    Ship(){

    }
    
    Ship(String name, String year){
        this.name = name;
        this.year = year;
    }

    public void setName(String n){
        name = n;
    }

    public String get_name(){
        return name; 
    }

    public void setYear(String y){
        year = y;
    }
    public String get_year(){
        return year;
    }

    public String toString(){
        String str = "\nShip Details \nName: " + get_name() +
                     "\nYear it was built: " + get_year();
        return str;
    }
}
