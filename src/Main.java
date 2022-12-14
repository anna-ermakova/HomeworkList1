public class Main {
    public static void main(String[] args) {
        DriverB kurt = new DriverB("Курт");
        Mechanic<Car> sofa = new Mechanic<>("Софья", "Гаврилова", "BMV");
        DriverB iv = new DriverB("Iv");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, CarBody.FOURGON, iv);
        DriverB john = new DriverB("Джон");
        Car bmv = new Car("BMW", "Z8", 3, CarBody.SEDAN, john);


        DriverC alex = new DriverC("Alex");
        Mechanic<Truck> sveta = new Mechanic<>("Светлана", "Измайлова", "Best");
        Mechanic<Truck> dima = new Mechanic<>("Дмитрий", "Иванов", "Best");
        Truck kamaz = new Truck("Камаз", "Мастер", 3.5, alex);
        DriverC glen = new DriverC("Глен");
        DriverC zus = new DriverC(" Зус");
        Truck mercedes = new Truck("Мерседес", "Zetros", 11.5, zus);


        DriverD bob = new DriverD("Bob");
        Mechanic<Bus> sona = new Mechanic<>("Соня", "Абрамова", "BMV");
        Mechanic<Bus> johny = new Mechanic<>("Джони", "Black", "AAA");
        DriverD tom = new DriverD("Tom");
        Bus paz = new Bus("ПАЗ", "Вектор", 1.8, tom);
        DriverD zak = new DriverD("Зак");
        Bus busik = new Bus("Бусик", "111", 1.2, zak);


        Sponsor selmash = new Sponsor("РостСельМаш", TypeSponsor.COMPANY, 100_000_000);
        Sponsor vova = new Sponsor("Владимир", TypeSponsor.PERSON, 50_000_000);


        Car lada = new Car("Lada", "Granta", 1.7, CarBody.SEDAN, kurt, sofa);

        lada.addSponsor(vova);
        Truck maz = new Truck("МАЗ", "6440 RR", 12, glen, dima);

        maz.addSponsor(vova);
        Bus liaz = new Bus("Лиаз", "ЛиАЗ-5256", 3.5, bob, sona);

        liaz.addSponsor(selmash);

        System.out.println(lada);
        System.out.println(maz);
        System.out.println(liaz);

        System.out.println();
        ServiceStation<Transport> transportServiceStation = new ServiceStation<Transport>();
        transportServiceStation.addCar(audi);
        transportServiceStation.addCar(bmv);
        transportServiceStation.addTruck(kamaz);
        transportServiceStation.addTruck(mercedes);
        transportServiceStation.doService();

        System.out.println();
        Market market = new Market();
        String a = "Anna";
        String b = "Bob";
        String c = "Coco";
        String d = "Don";
        String e = "Eva";
        String f = "Figen";
        String g = "Goga";
        String h = "Hloya";
        String i = "Ira";
        String j = "John";
        String k = "Karen";
        String l = "Lola";
        String m = "May";
        String n = "Nora";
        String o = "Oleg";
        String p = "Piter";

        market.add(a);
        market.add(b);
        market.add(c);
        market.add(d);
        market.add(e);
        market.add(f);
        market.add(g);
        market.add(h);
        market.add(i);
        market.add(j);
        market.add(k);
        market.add(l);
        market.add(m);
        market.add(n);
        market.add(o);
        market.add(p);


    }
}