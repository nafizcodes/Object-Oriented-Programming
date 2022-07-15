public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;


    public RoomCarpet(RoomDimension dim, double cost){

        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost(){

        double cost = size.getArea() * carpetCost;
        return cost;
    }

    public String toString(){
        String str = "Size: " + size +
                    "\nTotal Cost: " + getTotalCost(); 
    
        return str;
    }
}
