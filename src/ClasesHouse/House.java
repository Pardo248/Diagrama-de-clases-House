package ClasesHouse; // ola

import ClasesHouse.Rooms.BedRoom;
import ClasesHouse.Rooms.DiningRoom;
import ClasesHouse.Rooms.LivingRoom;
import ClasesHouse.Rooms.RestRoom;

public class House {

    private static final int MAX_BED_ROOMS = 10;
    private static final int MAX_REST_ROOMS = 10;
    private  int inexBedRoom = 0;
    private  int inexRestRoom = 0;

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public void addRoom (BedRoom bedRoom){
        int max = bedRooms.length;

        if (inexBedRoom < max){
            bedRooms[inexBedRoom] = bedRoom;
            inexBedRoom++;
        }
    }
    public void addRoom (RestRoom restRoom){
        int max = restRooms.length;

        if (inexRestRoom < max){
            restRooms[inexRestRoom] = restRoom;
            inexRestRoom++;
        }
    }


    public Kitchen getKitchen(){
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen){
        this.kitchen = kitchen;
    }
    public DiningRoom getDiningRoom (){
        return diningRoom;
    }
    public void setDiningRoom(DiningRoom diningRoom){
        this.diningRoom = diningRoom;
    }
    public LivingRoom getLivingRoom(){
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom){
        this.livingRoom = livingRoom;
    }
    public RestRoom[] getRestRoom (){
        return restRooms;
    }
    public void setRestRooms (RestRoom[] restRooms){
        this.restRooms = restRooms;
    }
    public BedRoom[] getBedRooms (){
        return bedRooms;
    }
    public void setBedRooms ( BedRoom[] bedRooms){
        this.bedRooms = bedRooms;
    }
    public Yard getYard(){
        return yard;
    }
    public void setYard(Yard yard){
        this.yard = yard;
    }
}
