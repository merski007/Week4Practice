package week4practice;

public class Startup {

    public static void main(String[] args) {
        //RoomDimension bedroomRD = new RoomDimension(10.0,10.0);
        //creating an object for bedroomRD
        //RoomCarpet bedroomRC = new RoomCarpet(bedroomRD,12);
        //putting the RoomDimension, bedroomRD, object into the bedroomRC object
        
        //System.out.println(bedroomRC.getTotalCost());
        //System.out.println(bedroomRC.getSizeLength());
        //System.out.println(bedroomRC.getSizeWidth());
        //System.out.println(bedroomRC.getCarpetCost());
        
        RoomCarpet b2 = new RoomCarpet(10.0, 10.0, 75);
        
        System.out.println(b2.getTotalCost());
        
        
    }
    
}
