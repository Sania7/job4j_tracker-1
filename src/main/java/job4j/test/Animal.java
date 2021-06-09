package job4j.test;


// 3.2. Зачем нужно приведение типов [#310019 #117301]
//1. Повышающее приведение типов (можно встретить также расширяющее приведение, или неявное);

//2. Понижающее приведение типов (также встречается сужающее приведение, или явное).

public class Animal {
    String nameClass = getClass().getSimpleName();
    public void sound() {
        System.out.println(nameClass + " - издает какой - то звук!");
    }
}
