package homework;

public class Main {
    public static void main(String[] args) {
        methodList methodList = new methodList();
        Service service = new Service();
        System.out.println("Total price of houses: " + service.totalHousePrice(methodList.getHouseList()));
        System.out.println("Total price of villas: " + service.totalVillaHome(methodList.getVillaList()));
        System.out.println("Total price of summer houses: " + service.totalSummerHouse(methodList.getSummerHouse()));
        System.out.println("Total price of all houses(house,villa,summer house): " + service.totalPriceofAllHome(methodList.getHomeList()));

        System.out.println("Average size of the houses: " + service.averageSizeofHouse(methodList.getHouseList()));
        System.out.println("Average size of the villas: " + service.averageSizeofVilla(methodList.getVillaList()));
        System.out.println("Average size of the summer houses: " + service.averageSizeofSummerHouse(methodList.getSummerHouse()));
        System.out.println("Average size of all houses(house,villa,summer house): " + service.averageSizeofAllHomes(methodList.getHomeList()));

        System.out.println("Home Type : " + service.houseType(methodList.getHomeList(), 3));
    }
}
