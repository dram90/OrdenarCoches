import java.util.Set;
import java.util.TreeSet;

public class CarTreeSet {

public static void main(String args[]){

    Car car1= new Car (1L,"Jaguar","TheRoadIsYours",2016,"1234ENG");
    Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065AME");
    Car car3= new Car (3L,"Lexus","FastAndGlorious",2016,"5638DDD");
    Car car4= new Car (4L,"Austin","BeLikeBond",2015,"3564GER");
    Car car5= new Car (5L,"RomeoAlfaJulietta","DramaMasterpiece",2013,"4749JAV");

    //Set setCars = new TreeSet();

    Set setCars = new TreeSet(new CarComparatorByYear());
    /*TreeSet que usa el comparador por año en vez del
    compare to natural(por matrícula)*/

    System.out.println("Inserting car1 into the TreeSet");
    setCars.add(car1);
    System.out.println("Inserting car2 into the TreeSet");
    setCars.add(car2);
    System.out.println("Inserting car3 into the TreeSet");
    setCars.add(car3);
    System.out.println("Inserting car4 into the TreeSet");
    setCars.add(car4);
    System.out.println("Inserting car5 into the TreeSet");
    setCars.add(car5);


    System.out.println(setCars);



}
}
