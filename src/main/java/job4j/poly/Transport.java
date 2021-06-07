package job4j.poly;


// этот интерфейс будет определять любой вид транспорта
public interface Transport {

// метод ехать
    public void drive();

// метод пассажиры
   public void passengers(int amount);

// метод топливо
    public int refuel(int fuel, double price);

}
