package job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> emailAndName = new HashMap<>();
        emailAndName.put("79824177721@yandex.ru", "А.А.Банников");
        emailAndName.put("matviiva1982@mail.ru", "Ю.П.Банникова");
        for (String key : emailAndName.keySet()) {
            String value = emailAndName.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();
        for (Map.Entry<String, String> entry : emailAndName.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
