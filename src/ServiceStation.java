import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;
    private String company;

    public void addCar(Car car) {
        queue.offer(car);
    }

    public void addTruck(Truck truck) {
        queue.offer(truck);
    }

    public void doService() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.serviсe();
        }
    }

    public String getCompany() {
        return company;
    }
}
