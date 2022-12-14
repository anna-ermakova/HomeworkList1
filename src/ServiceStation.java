import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();
    private String company;

    public void addCar(Car car) {
        queue.offer((T) car);
    }

    public void addTruck(Truck truck) {
        queue.offer((T) truck);
    }

    public void doService() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            System.out.println("На станции техобслуживания производится обслуживание " + transport.getBrand() + " " + transport.getModel());
            transport.serviсe();
            doService();
        }
    }

    public String getCompany() {
        return company;
    }
}
