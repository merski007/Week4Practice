package week4practice;

public class RoomDimension {
    private double width;
    private double length;

    public RoomDimension(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double getArea(){
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    
}
