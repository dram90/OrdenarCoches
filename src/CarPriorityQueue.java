import java.util.PriorityQueue;

/**
 * Created by Dimple on 01/07/2016.
 */
public class CarPriorityQueue {

    public static void main(String args[]){

        PriorityQueue<Car> carPriorityQueue = new PriorityQueue<>(new CarComparatorByYear());
        /*
        queue will be sorted by the parameter YearOfFab using the comparator method
        instead of being sorted by plate number, which has been defined as the natural
        comparison parameter
        */

        Car car1= new Car (1L,"Jaguar","TheRoadIsYours",2016,"1234UKK");
        Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065GER");
        Car car3= new Car (3L,"Lexus","FastAndGlorious",2016,"5638USA");
        Car car4= new Car (4L,"Aston","BeLikeBond",2015,"3564UKK");
        Car car5= new Car (5L,"AlfaRomeoGiulietta","DramaMasterpiece",2013,"4749ITA");

        carPriorityQueue.add(car1);
        carPriorityQueue.add(car2);
        carPriorityQueue.add(car3);
        carPriorityQueue.add(car4);
        carPriorityQueue.add(car5);

        while (true)
        {
            Car car = carPriorityQueue.poll();
            if (car == null)
            {
                break;
            }
            else
            {
                System.out.println(car);
            }
        }
    }
}
