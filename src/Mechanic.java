public class Mechanic<T extends Transport> {
    private final String name;
    private final String surName;
    private final String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик " + name + " " + surName + " из " + company;

    }

    public void doServiсe(T transport) {
        transport.serviсe();
    }

    public void doRepair(T transport) {
        transport.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }
}
