/**
 * Created by Станислав on 08-Dec-16.
 */
public class Building {
    public static void main(String[] args){
        double robit;
    Flat flat = new Flat(4,40);
        System.out.println(flat.getArea());
        System.out.println(flat.getRooms());
     Flat flat1 = new Flat();
     Flat flat2 = new Flat(45.2);
     Flat[] flats = {flat, flat1, flat2};
     DwellingFloor dwellingFloor = new DwellingFloor(flats);
        System.out.println(dwellingFloor.getNumberOfFlats());
        System.out.println(dwellingFloor.getSummaryArea());
        System.out.println(dwellingFloor.getSummaryRooms());
        System.out.println(dwellingFloor.getFlats().toString());
        System.out.println(dwellingFloor.getFlat(2).toString());
        dwellingFloor.setFlatByNumber(2,flat1);
        System.out.println(dwellingFloor.getFlat(2).toString());
        System.out.println(dwellingFloor.getBestSpace());
    }
}
