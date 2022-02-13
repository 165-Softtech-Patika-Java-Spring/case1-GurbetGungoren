package homework;

public class AllHomes {
    public int price;
    public int size;
    public int numberofRooms;

    public AllHomes(int price, int size, int numberofRooms) {
        this.price = price;
        this.size = size;
        this.numberofRooms = numberofRooms;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
