import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bus extends Transport {

    private DriverD driver;
    private final List<Mechanic<Bus>> mechanics;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Mechanic<Bus>... mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics = Arrays.asList(mechanics);
    }

    public void addMechanic(Mechanic<Bus> mechanic) {
        mechanics.add(mechanic);
    }

    @Override
    public String toString() {
        return "Автобус с водителем " + driver + "\n" + super.toString();
    }

    public void setDriver(DriverD driver) {
        this.driver = driver;
    }

    public List<Mechanic<Bus>> getMechanics() {
        return mechanics;
    }

    @Override
    public ArrayList<Sponsor> getSponsors() {
        return null;
    }

    @Override
    public List<?> mechanics() {
        return getMechanics();
    }

    @Override
    public boolean serviсe() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагростике не нуждается.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен.");
    }

}
