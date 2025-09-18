/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTLec11.Room;

/**
 *
 * @author HP
 */
public abstract class Room implements IRoom {
    private String id;
    private String name;
    private double baseCost;

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public Room() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public abstract double calculateCost();

    @Override
    public void displayDetail(){
        System.out.println("ID: "+ this.getId()+
                           ", Name Room: "+ this.getName()+
                           ", Base Cost: "+ this.getBaseCost());
    }

    @Override
    public void updateRoom(String id){
        
    }

    @Override
    public void addRoom(){
        
    }
    
    
}
