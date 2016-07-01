import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car1= new Car (1L,"Jaguar","TheRoadIsYours",2016,"1234ENG");
        Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065AME");
        Car car3= new Car (3L,"Lexus","FastAndGlorious",2016,"5638DDD");
        Car car4= new Car (4L,"Austin","BeLikeBond",2015,"3564GER");
        Car car5= new Car (5L,"RomeoAlfaJulietta","DramaMasterpiece",2013,"4749JAV");

        List<Car> carList= new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        for(Car car: carList) {
            System.out.println(car);
        }

        Collections.sort(carList);

        System.out.println("Cars sorted by plate number");
        for(Car car: carList)
        {
            System.out.println(car);
        }

    }
}
