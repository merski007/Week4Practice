package week4practice;

public class RoomCarpet {
    private RoomDimension size; //creating a variable type of RoomDimension, everytime it is initialized, it has width & length properties
    private double carpetCost;
    
    private double length;
    private double width;
    private RoomDimension room;

    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
        
        /** size is just the object name. the object size contains 2 properties,
         * a length and a width. this is what allows us to calculate area.
         * 
         * so when i create the variable RoomDimension size, im creating an object
         * with length and width properties.
         */
    }
    
    public RoomCarpet(double length, double width, double carpetCost){
        //this.length = length;
        //this.width = width;
        this.carpetCost = carpetCost;
        room = new RoomDimension(length, width);
        
    }
    
    public double getTotalCost(){
        //return size.getArea() * carpetCost;
        return room.getArea() * carpetCost;
        /**when i create a RoomCarpet object, im also creating a RoomDimension
         * object at the same time. This allows me to use the size.getArea()
         * method in this method. 
         */
    }

    public double getSizeLength() {
        //return size;
        return size.getLength();
    }

    public double getSizeWidth(){
        return size.getWidth();
    }
    
    public double getCarpetCost() {
        return carpetCost;
    }
    
    /**this class practices both method & class encapsulation.
     * 
     */
    
    
}
