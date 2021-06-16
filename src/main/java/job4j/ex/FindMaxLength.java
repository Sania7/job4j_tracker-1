package job4j.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null && el.length() >= max) {// делаем проверку на два условия
                //если индекс не равен 0 и длина элемента больше max.
                    max = el.length();//присваеваем в max самый длинный элемент массива
                }
            }
        System.out.println("Max length :" + max);
        }
    }
