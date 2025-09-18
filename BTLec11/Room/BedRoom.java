
package BTLec11.Room;

public class BedRoom extends Room {
    private int numberOfBed;

    public BedRoom(int numberOfBed, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBed = numberOfBed;
    }

    public BedRoom(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    
    
    @Override
    public double calculateCost() {
        double finalPrice = 0;
       if (this.getNumberOfBed() >= 3)
           finalPrice = this.getBaseCost()*1.1;
       else 
           finalPrice = this.getBaseCost();
       return finalPrice;
    }
    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.print("Gia cuoi cung: ");
        System.out.println(calculateCost());
        System.out.println("==============================================");
    }
}
