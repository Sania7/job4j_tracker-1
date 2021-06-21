package job4j.factory;

public class BmwFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new BmwSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BmwCoupe();
    }

    private class BmwSedan implements Sedan {
        public BmwSedan() {
            System.out.println("Create BMW sedan.");
        }
    }

    private class BmwCoupe implements Coupe {
        public BmwCoupe() {
            System.out.println("Create BMW coupe.");
        }
    }

    public static void main(String[] args) {
        CarsFactory factory;
        factory = new AudiFactory();
        factory = new BmwFactory();
        factory.createSedan();
    }
}
