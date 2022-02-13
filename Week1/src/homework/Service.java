package homework;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public int totalHousePrice(List<House> houseList) {
        return houseList.stream().mapToInt(House::getPrice).sum();
    }

    public int totalVillaHome(List<Villa> villaList) {
        return villaList.stream().mapToInt(Villa::getPrice).sum();
    }

    public int totalSummerHouse(List<SummerHouse> summerHouseList) {
        return summerHouseList.stream().mapToInt(SummerHouse::getPrice).sum();
    }

    public int totalPriceofAllHome(List<AllHomes> allHomesList) {
        return allHomesList.stream().mapToInt(AllHomes::getPrice).sum();
    }

    public double averageSizeofHouse(List<House> houseList) {
        return houseList.stream()
                .mapToInt(House::getSize)
                .average().getAsDouble();
    }

    public double averageSizeofVilla(List<Villa> villaList) {
        return villaList.stream()
                .mapToInt(Villa::getSize)
                .average().getAsDouble();
    }

    public double averageSizeofSummerHouse(List<SummerHouse> summerHouseList) {
        return summerHouseList.stream()
                .mapToInt(SummerHouse::getSize)
                .average().getAsDouble();
    }

    public double averageSizeofAllHomes(List<AllHomes> allHomesList) {
        return allHomesList.stream()
                .mapToInt(AllHomes::getSize)
                .average().getAsDouble();
    }

    public List<AllHomes> houseType(List<AllHomes> allHomesList, int roomNumber) {
        return allHomesList.stream().filter(home -> home.numberofRooms == roomNumber)
                .collect(Collectors.toList());
    }
}
