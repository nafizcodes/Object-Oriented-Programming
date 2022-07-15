
public class RoomDimension {
    
    private double length;
    private double width;

    public RoomDimension(double len , double w){
        this.length = len;
        this.width = w;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
    
    public String toString(){
        String str = "\nLength: "  + length +
                     "\nWidth: " + width +
                     "\nArea: "  + getArea();
        
        return str;
    }
}
