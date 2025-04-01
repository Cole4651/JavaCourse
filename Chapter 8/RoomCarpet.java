public class RoomCarpet {
    RoomDimension room;
    double cost; 

    public RoomCarpet(RoomDimension room, double cost) {
        this.room = room;
        this.cost = cost;
    }

    public double getCost() {
        return room.getArea() * cost;
    }
}
