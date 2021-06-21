package job4j.factory;


// 3. Фабричный метод, абстрактная фабрика. [#95067 #117342]
// интерфейс

public interface CarsFactory {
       Sedan createSedan();
       Coupe createCoupe();
}
