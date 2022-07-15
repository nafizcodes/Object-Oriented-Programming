public class CargoShip extends Ship{
    private int capacity;
    private String name;

    CargoShip(String name, int capacity){

        this.capacity = capacity;
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int c){
        capacity = c;
    }

    @Override
    public String toString(){
        String str = "\nCargoShip Details \nName: " + getName() +
                     "\nCapacity(tonnage): " + getCapacity();

        return str;
    }
}
