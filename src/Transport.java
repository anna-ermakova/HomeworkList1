import java.util.*;

abstract public class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    Set<Sponsor> sponsors;
    Set<Mechanic> mechanics;

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
        this.engineVolume = engineVolume;

    }

    public String mechanicsInfo() {
        List<?> mechanics=new ArrayList<>(mechanics());
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

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract Set<?> mechanics();

    public abstract boolean serviсe();

    public abstract void repair();

    @Override
    public String toString() {
        List<Sponsor> sponsorList =new ArrayList<>(sponsors);
        StringBuilder result = new StringBuilder();
        if (!sponsorList.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsorList.size(); i++) {
            result.append(sponsorList.get(i));
            if (i != sponsorList.size() - 1) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(sponsors, transport.sponsors) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, sponsors, mechanics);
    }
}
