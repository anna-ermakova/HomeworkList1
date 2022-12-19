import java.util.*;

public class Truck extends Transport{
private DriverC driver;
private final Set<Mechanic<Truck>> mechanics;


    public Truck(String brand, String model, double engineVolume, DriverC driver, Mechanic<Truck> ...mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
    }
    public void addMechanic(Mechanic<Truck> mechanic) {
        mechanics.add(mechanic);
    }
    public String toString() {
        return "Грузовик с водителем " + driver +"\n"+super.toString();
    }

    @Override
    public Set<Sponsor> getSponsors() {
        return null;
    }

    @Override
    public Set<?> mechanics() {
        return null;
    }

    public boolean serviсe() {
        System.out.println("Грузовик "+ getBrand()+" "+getModel()+" прошел диагностику.");
        return true;
    }

    public DriverC getDriver() {
        return driver;
    }


    @Override
    public void repair() {
        System.out.println("Грузовик "+ getBrand()+" "+getModel()+" починен.");
    }
    public void setDriver(DriverC driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(driver, truck.driver) && Objects.equals(mechanics, truck.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver, mechanics);
    }
}
