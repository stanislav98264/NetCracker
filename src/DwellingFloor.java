/**
 * Created by Станислав on 08-Dec-16.
 */
public class DwellingFloor {
    private Flat[] flats;

    public DwellingFloor(int number){
        Flat[] flats = new Flat[number];
    }

    public DwellingFloor(Flat[] flats){
        this.flats = flats;
    }
    public int getNumberOfFlats(){
        return flats.length;
    }
    public double getSummaryArea(){
        double summaryArea = 0;
        for (int i = 0; i < flats.length ; i++) {
             summaryArea += flats[i].getArea();
        }
        return summaryArea;
    }
    public int getSummaryRooms(){
        int summaryRooms = 0;
        for (int i = 0; i < flats.length ; i++) {
            summaryRooms += flats[i].getRooms();
        }
        return summaryRooms;
    }
    public Flat[] getFlats(){
        return flats;
    }
    public Flat getFlat (int number){
        return flats[number];
    }
    public void setFlatByNumber(int number, Flat flat){
        flats[number] = flat;
    }
    public void addNewFlat(int number, Flat newFlat) {
        Flat[] newFlats = new Flat[flats.length + 1];
        for (int i = 0; i < flats.length; i++) {
            if (i < number) {
                newFlats[i] = flats[i];
            }
            if (i == number) {
                newFlats[number] = newFlat;
            } else {
                newFlats[i + 1] = flats[i];
            }


        }
        this.flats = newFlats;
    }

    public void deleteFlat(int number) {
        Flat[] deleteFlats = new Flat[flats.length - 1];
        for (int i = 0; i < flats.length; i++) {
            if (i < number) {
                deleteFlats[i] = flats[i];
            } else {
                deleteFlats[i - 1] = flats[i];
            }

        }
        this.flats = deleteFlats;
    }

    public Flat getBestSpace() {
        Flat maxAreaFlat = null;
        for (int i = 0; i < flats.length; i++){
            if (i < flats.length){
                if (flats[i].getArea() > flats[i+1].getArea()){
                    maxAreaFlat = flats[i];
                }
                else {
                    maxAreaFlat = flats [i+1];
                }

            }
            else {
                if (flats[i-1].getArea() > flats[i].getArea()){
                    maxAreaFlat = flats[i-1];
                }
                else {
                    maxAreaFlat = flats [i];
                }
            }
        }
        return maxAreaFlat;
    } 

}




