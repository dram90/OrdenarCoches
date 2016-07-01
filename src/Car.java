import java.util.Comparator;

/**
 * Created by professor on 29/06/2016.
 */
public class Car implements Comparable<Car> {

    private long id;
    private String brand;
    private String model;
    private Integer yearOfFab;
    private String plateNumber;

    public Car(long id, String brand, String model, Integer yearOfFab, String plateNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfFab = yearOfFab;
        this.plateNumber = plateNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfFab() {
        return yearOfFab;
    }

    public void setYearOfFab(String yearOfFab) {
        yearOfFab = yearOfFab;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", YearOfFab='" + yearOfFab + '\'' +
                ", PlateNumber='" + plateNumber + '\'' +
                '}'+ System.lineSeparator();
    }

    public int compareTo(Car anotherCar){

        System.out.println("Comparing the following two cars: ");
        System.out.println(this);
        System.out.println(anotherCar);
       return this.plateNumber.compareTo(anotherCar.plateNumber);
    }

}

class CarComparatorByYear implements Comparator<Car>
{
    @Override
    public int compare(Car car, Car anotherCar)
    {
        if(car.getYearOfFab() > anotherCar.getYearOfFab())
        {
        return 1;
        }
        else if (car.getYearOfFab() < anotherCar.getYearOfFab())
        {
            return -1;
        }
        else return 0;
    }
}
