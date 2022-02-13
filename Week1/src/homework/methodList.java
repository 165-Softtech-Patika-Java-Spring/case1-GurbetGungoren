package homework;

import java.util.ArrayList;
import java.util.List;

public class methodList {
    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        House house1 = new House(400000, 145, 3);
        House house2 = new House(500000, 150, 2);
        House house3 = new House(450000, 160, 3);
        House house4 = new House(370000, 165, 4);
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        return houseList;
    }

    public List<Villa> getVillaList() {
        List<Villa> villaList = new ArrayList<>();
        Villa villa1 = new Villa(1500000, 450, 7);
        Villa villa2 = new Villa(1610000, 500, 8);
        Villa villa3 = new Villa(1700000, 600, 10);
        Villa villa4 = new Villa(1550000, 470, 6);
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
        villaList.add(villa4);
        return villaList;
    }

    public List<SummerHouse> getSummerHouse() {
        List<SummerHouse> summerHouseList = new ArrayList<>();
        SummerHouse summerHouse1 = new SummerHouse(500000, 450, 4);
        SummerHouse summerHouse2 = new SummerHouse(750000, 600, 8);
        SummerHouse summerHouse3 = new SummerHouse(700000, 550, 6);
        SummerHouse summerHouse4 = new SummerHouse(780500, 650, 3);
        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);
        summerHouseList.add(summerHouse4);
        return summerHouseList;
    }

    public List<AllHomes> getHomeList() {
        List<AllHomes> allHomesList = new ArrayList<>();
        allHomesList.addAll(getVillaList());
        allHomesList.addAll(getHouseList());
        allHomesList.addAll(getSummerHouse());
        return allHomesList;
    }
}
