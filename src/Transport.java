import java.util.ArrayList;
import java.util.List;

abstract public class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Sponsor> sponsors;


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        this.sponsors = new ArrayList<>();

    }

    public abstract ArrayList<Sponsor> getSponsors();

    public abstract List<?> mechanics();

    public String mechanicsInfo() {
        List<?> mechanics = mechanics();
        StringBuilder result = new StringBuilder();
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }


    public abstract boolean serviсe();

    public abstract void repair();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!sponsors.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsors.size(); i++) {
            result.append(sponsors.get(i));
            if (i != sponsors.size() - 1) {
                result.append(", ");
            }
        }
        return result.append("\n").append(mechanicsInfo()).toString();
    }


    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
