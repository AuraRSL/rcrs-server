package maps.gml;

import java.util.List;

/**
   A building in GML space.
*/
public class GMLBuilding extends GMLShape {
    private int floors;
    private int code;
    private int importance;
    private int capacity;
    private int bedCapacity;
    private int refillCapacity;

    /**
       Construct a GMLBuilding.
       @param id The ID of the building.
    */
    public GMLBuilding(int id) {
        super(id);
    }

    /**
       Construct a GMLBuilding.
       @param id The ID of the building.
       @param edges The edges of the building.
    */
    public GMLBuilding(int id, List<GMLDirectedEdge> edges) {
        super(id, edges);
    }

    /**
       Construct a GMLBuilding.
       @param id The ID of the building.
       @param edges The edges of the building.
       @param neighbours The neighbours of each edge.
    */
    public GMLBuilding(int id, List<GMLDirectedEdge> edges, List<Integer> neighbours) {
        super(id, edges, neighbours);
    }

    @Override
    public String toString() {
        return "GMLBuilding " + getID();
    }

    /**
     Set the capacity of this building.
     @param newCapacity The new capacity of the building.
     */
    public void setCapacity(int newCapacity) {
        capacity = newCapacity;
    }

    /**
     Get the capacity of this building.
     @return The the capacity of building.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     Set the bed capacity of this building.
     @param newCapacity The new bed capacity of the building.
     */
    public void setBedCapacity(int newCapacity) {
        bedCapacity = newCapacity;
    }

    /**
     Get the bed capacity of this building.
     @return The the bed capacity of building.
     */
    public int getBedCapacity() {
        return bedCapacity;
    }

    /**
     Set the refill capacity of this building.
     @param newCapacity The new refill capacity of the building.
     */
    public void setRefillCapacity(int newCapacity) {
        refillCapacity = newCapacity;
    }

    /**
     Get the refill capacity of this building.
     @return The the refill capacity of building.
     */
    public int getRefillCapacity() {
        return refillCapacity;
    }


    /**
       Set the number of floors in this building.
       @param newFloors The new number of floors.
    */
    public void setFloors(int newFloors) {
        floors = newFloors;
    }

    /**
       Get the number of floors in this building.
       @return The number of floors.
    */
    public int getFloors() {
        return floors;
    }

    /**
       Set the building code of this building.
       @param newCode The new building code.
    */
    public void setCode(int newCode) {
        code = newCode;
    }

    /**
       Get the building code of this building.
       @return The building code.
    */
    public int getCode() {
        return code;
    }

    /**
       Set the importance of this building.
       @param newImportance The new importance.
    */
    public void setImportance(int newImportance) {
        importance = newImportance;
    }

    /**
       Get the importance of this building.
       @return The importance.
    */
    public int getImportance() {
        return importance;
    }
}
