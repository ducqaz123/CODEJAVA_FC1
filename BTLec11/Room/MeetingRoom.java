
package BTLec11.Room;

public class MeetingRoom extends Room{
    private int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }
    
    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        double finalPrice = 0;
       if (capacity > 50)
           finalPrice = this.getBaseCost()*1.2;
       else 
           finalPrice = this.getBaseCost();
       return finalPrice;
    }
    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.print(", Gia cuoi cung: ");
        System.out.println(calculateCost());
        System.out.println("==============================================");
    }
}
