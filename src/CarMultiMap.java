import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.List;

/**
 * Created by professor on 01/07/2016.
 */
public class CarMultiMap {
    static ListMultimap<Integer,Car> carMultimap = ArrayListMultimap.create();

    public static  void main (String args[]){

        Car car1= new Car (1L,"Jaguar","TheRoadIsYours",2016,"1234ENG");
        Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065AME");
        Car car3= new Car (3L,"Lexus","FastAndGlorious",2016,"5638DDD");
        Car car4= new Car (4L,"Austin","BeLikeBond",2015,"3564GER");
        Car car5= new Car (5L,"RomeoAlfaJulietta","DramaMasterpiece",2013,"4749JAV");

        carMultimap.put(2016,car1);
        carMultimap.put(2014,car2);
        carMultimap.put(2016,car3);
        carMultimap.put(2015,car4);
        carMultimap.put(2013,car5);

        List<Car> carList = carMultimap.get(2016);
        System.out.println("These are the cars made in 2016: " +
                            System.lineSeparator() +carList);






    }
}
