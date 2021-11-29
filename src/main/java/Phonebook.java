import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Phonebook {
    private Map<String, String> phonebook;
    Phonebook() {phonebook = new HashMap<>();}

    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }
    public void getNumber(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> name : set) {
                if(name.getValue().equals(surname)) {
                    System.out.println(name.getValue() + " : " + name.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии в телефонной книге нет.");
        }
    }
    public void getName(String number){
        if(phonebook.containsValue(number)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> phone : set) {
                if(phone.getValue().equals(number)) {
                    System.out.println(phone.getKey() + " : " + phone.getValue());
                }
            }
        } else {
            System.out.println("Такого номера в телефонной книге нет.");
        }
    }
}
