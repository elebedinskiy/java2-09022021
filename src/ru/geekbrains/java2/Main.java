package ru.geekbrains.java2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать сколько раз встречается каждое слово.

        2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get()
        искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
        (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись
        добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем
        через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто
        из метода main() прописывая add() и get().
         */

        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        String[] wordsArray = {"Hello", "Mouse", "No", "Mouse", "Mouse", "Notebook", "Words", "Game", "Display",
                "Notebook", "Notebook", "Mouse", "Virus", "Moscow", "Job", "Job", "Job", "Job", "Job"};
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, wordsArray); //  Заполнили список значениями массива
        System.out.println("Коллекция слов (содержит повторы): " + wordsList);

        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        HashSet<String> wordsHashSet = new HashSet<>(wordsList); // инициировали HashSet значениями из ArrayList
        System.out.println("Коллекция слов (содержит уникальные значения): " + wordsHashSet);

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

    }
}
