import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

enum TypeSponsor {
    COMPANY, PERSON;

}

public class Sponsor {
    private TypeSponsor type;
    private String name;
    private int sum;
    Set<Transport> transports;

    public Sponsor(String name, TypeSponsor type, int sum) {
        setName(name);
        setSum(sum);
        setType(TypeSponsor.valueOf(String.valueOf(type)));
        this.transports = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Спонсор %s %s сумма спонсорского взноса: %d", type, name, sum);
    }

    public double getSum() {
        return sum;
    }

    public void setType(TypeSponsor type) {
        this.type = type;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}