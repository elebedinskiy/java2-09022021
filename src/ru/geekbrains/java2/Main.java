package ru.geekbrains.java2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task #1");
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(
                "Hello", "Mouse", "Job", "Mouse", "Mouse", "Notebook", "Words", "Game", "Job", "Job",
                "Notebook", "Notebook", "Mouse", "Job", "Moscow", "Job", "Job", "Job", "Job", "Job"));
        System.out.println("Коллекция из " + wordsList.size() + " слов (содержит повторы): " + wordsList);

        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        HashSet<String> wordsHashSet = new HashSet<>(wordsList); // инициировали HashSet значениями из ArrayList
        System.out.println("Коллекция из " + wordsHashSet.size() + " слов (содержит уникальные значения): " + wordsHashSet);

        // Посчитать сколько раз встречается каждое слово.
        Map<String, Integer> calcWords = new HashMap<>(); // сюда будем записывать результат подсчета
        Iterator<String> iter = wordsHashSet.iterator(); // создаем итератор
        while (iter.hasNext()){
            String str = iter.next();
            int i = 1;
            do{
                if (wordsList.contains(str)){
                    calcWords.put(str, i++);
                    wordsList.remove(wordsList.indexOf(str)); // уберем элемент, чтобы повторить поиск
                }
            } while (wordsList.contains(str));
        }
        System.out.println("Сколько раз встречаются слова: " + calcWords);

        System.out.println();

        System.out.println("Task #2");
        Phonebook item1 = new Phonebook("Ivanov", "+7-903-000-55-22");
        Phonebook item2 = new Phonebook("Ivanov", "+7-903-888-66-33");
        Phonebook item3 = new Phonebook("Petrov", "+7-910-777-77-77");

        HashMap<Phonebook, Phonebook> phonesHM = new HashMap<>();
        phonesHM.put(item1, item1);
        phonesHM.put(item2, item2);
        phonesHM.put(item3, item3);

        for (Map.Entry<Phonebook, Phonebook> o : phonesHM.entrySet()){
            if (o.getKey().getFamily().equals("Ivanov")){
                System.out.println(o.getValue().getFamily() + ", " + o.getValue().getPhone());
            }
        }
    }
}