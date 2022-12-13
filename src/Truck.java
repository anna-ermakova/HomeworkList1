import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Truck extends Transport{
private DriverC driver;
private final List<Mechanic<Truck>> mechanics;


    public Truck(String brand, String model, double engineVolume, DriverC driver, Mechanic<Truck> ...mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics= Arrays.asList(mechanics);
    }
    public void addMechanic(Mechanic<Truck> mechanic) {
        mechanics.add(mechanic);
    }
    public String toString() {
        return "Грузовик с водителем " + driver +"\n"+super.toString();
    }

    @Override
    public ArrayList<Sponsor> getSponsors() {
        return null;
    }

    @Override
    public List<?> mechanics() {
        return getMechanics();
    }

    public boolean serviсe() {
        System.out.println("Грузовик "+ getBrand()+" "+getModel()+" прошел диагностику.");
        return true;
    }

    public List<Mechanic<Truck>> getMechanics() {
        return mechanics;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик "+ getBrand()+" "+getModel()+" починен.");
    }
    public void setDriver(DriverC driver) {
        this.driver = driver;
    }
}
