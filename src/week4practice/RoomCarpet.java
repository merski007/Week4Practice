package week4practice;

public class RoomCarpet {
    private RoomDimension size; //creating a variable type of RoomDimension, everytime it is initialized, it has width & length properties
    private double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }
    
    public double getTotalCost(){
        return size.getArea() * carpetCost;
        /**when i create a RoomCarpet object, im also creating a RoomDimension
         * object at the same time. This allows me to use the size.getArea()
         * method in this method. 
         */
    }
    
    /**this class practices both method & class encapsulation.
     * 
     */
}
