package job4j.factory;

public class AudiFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new AudiSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new AudiCoupe();
    }



    private class AudiSedan implements Sedan {
        public AudiSedan() {
            System.out.println("Create Audi sedan.");
        }
    }

    private class AudiCoupe implements Coupe {
        public AudiCoupe(){
            System.out.println("Create Audi coupe.");
        }
    }
}
