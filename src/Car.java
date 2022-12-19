import java.util.*;

enum CarBody {
    SEDAN, PIKAP, FOURGON, KOUPE;
}

public class Car extends Transport {
    private DriverB driver;
    private CarBody carBody;

    Set<Sponsor> sponsors;
   private final Set<Mechanic<Car>> mechanics;

    public Car(String brand, String model, double engineVolume, CarBody carBody, DriverB driver, Mechanic<Car>... mechanics) {
        super(brand, model, engineVolume);
        setCarBody(carBody);
        setDriver(driver);
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
    }

    public String toString() {
        return "Автомобиль с водителем " + driver + "\n" + super.toString();
    }

    public void setDriver(DriverB driver) {
        this.driver = driver;
    }

    public DriverB getDriver() {
        return driver;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    @Override
    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<Car>> getMechanics() {
        return mechanics;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void addMechanic(Mechanic<Car> mechanic) {
        mechanics.add(mechanic);
    }

    public void printAllSponsors() {
        for (Sponsor sponsor : sponsors) {
            System.out.println(sponsor + " проспонсировал заезд " + getBrand() + " " + getModel() + " на сумму " + sponsor.getSum());
        }
    }

    public void printAllMechanics() {
        for (Mechanic<? super Car> mechanic : mechanics) {
            System.out.println(mechanic + " обслужил " + getBrand() + " " + getModel());
        }
    }


    @Override
    public Set<?> mechanics() {
        return getMechanics();
    }

    public boolean serviсe() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(driver, car.driver) && carBody == car.carBody && Objects.equals(sponsors, car.sponsors) && Objects.equals(mechanics, car.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver, carBody, sponsors, mechanics);
    }
}