package ru.geekbrains.java2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    // write your code here

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
        String[] arrayWords = {"Hello", "Yes", "No", "Words", "Game", "Display", "Notebook", "Mouse", "Virus",
        "Moscow", "Mother", "Car", "Job", "Platform", "Apple", "Year", "Game", "Notebook", "Car", "Job"};
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < arrayWords.length; i++){
            words.add(arrayWords[i]);
        }
        System.out.println("Коллекция слов (содержит повторы): " + words);
        HashSet<String> uniqueWords = new HashSet<>(words); // инициировали HashSet значениями из ArrayList
        System.out.println("Коллекция слов (содержит уникальные значения): " + uniqueWords);
    }
}
