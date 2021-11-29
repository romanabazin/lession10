import java.util.*;

public class Homework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Москва");
        list.add("Лондон");
        list.add("Париж");
        list.add("Берлин");
        list.add("Вашингтон");
        list.add("Токио");
        list.add("Пекин");
        list.add("Дели");
        list.add("Москва");
        list.add("Сеул");
        list.add("Лондон");
        list.add("Мадрид");
        list.add("Рим");
        list.add("Каир");
        list.add("Москва");
        System.out.println(list);
        Set<String> cities = new HashSet<>(list);
        System.out.println(cities);
        Map<String, Integer> counter = new HashMap<>();
        for (String c : list){
            Integer count = counter.get(c);
            if(count == null) {
                count = 0;
            }
            counter.put(c, ++count);
            System.out.print(c + ": " + counter.get(c) + "; ");
        }
        Phonebook phonebook = new Phonebook();

        phonebook.add("+79999999999", "Иванов");
        phonebook.add("+79888888888", "Петров");
        phonebook.add("+79777777777", "Петров");
        phonebook.add("+79666666666", "Сидоров");
        phonebook.add("+79555555555", "Ахмедов");

        phonebook.getNumber("Петров");
        phonebook.getNumber("Васютин");
        phonebook.getNumber("Иванов");
        phonebook.getName("+79999999999");
        phonebook.getName("+79999999998");
    }

}
