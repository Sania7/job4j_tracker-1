package job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;//результатирущая переменная
        for (int i = 0; i < value.length; i++) {// проходим циклом по массиву для поиска key
            if (value[i].equals(key)) { //сравниваем index и key и если равно
                rsl = i; //помещаем индекс в переменную
                break;// останавливаем цикл
            }
        }
        if (rsl == -1) { //делаем проверку если rsl == -1 то выбрасываем исключение
            throw new ElementNotFoundException("This element not found!");
        }
        return rsl; //возвращаем результат
    }

    public static void main(String[] args) {
        String[] value = {"first", "second", "third"}; //создаем массив
        try { //оборачиваем метод в блок
            indexOf(value,"f"); //применяем метод к переменной value
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
