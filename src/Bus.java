import java.util.*;

public class Bus extends Transport {

    private DriverD driver;
    private final Set<Mechanic<Bus>> mechanics;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Mechanic<Bus>... mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics =new HashSet<> (Arrays.asList(mechanics));
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

    public Set<Mechanic<Bus>> getMechanics() {
        return mechanics;
    }

    @Override
    public Set<Sponsor> getSponsors() {
        return null;
    }

    @Override
    public Set<?> mechanics() {
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
