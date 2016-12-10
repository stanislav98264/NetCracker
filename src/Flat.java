/**
 * Created by Станислав on 08-Dec-16.
 */
public class Flat {
    private int rooms;
    private double area;
    private int ROOMS = 2;
    private int AREA = 50;

    public Flat(){
        rooms = ROOMS;
        area = AREA;
    }
    public Flat (double area){
        rooms = ROOMS;
        this.area = area;
    }
    public Flat (int rooms, double area){
        this.area = area;
        this.rooms = rooms;
    }
    public int getRooms(){
        return rooms;
    }
    public void setRooms(int rooms){
        this.rooms = rooms;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                ", area=" + area +
                ", ROOMS=" + ROOMS +
                ", AREA=" + AREA +
                '}';
    }
}
