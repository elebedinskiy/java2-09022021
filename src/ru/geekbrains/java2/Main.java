package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array1 = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16", "17"}
        };

        System.out.println("\n#1 start");
        try {
            procArray(array1);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage() + " Строка в коде: " + e.lineCode);
        }
        System.out.println("#1 end");

        String[][] array2 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        String[][] array3 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "F", "3", "3"},
                {"4", "4", "4", "4"}
        };

        System.out.println("\n#2 start");
        try {
            System.out.println("Сумма элементов массива: " + procArray(array2));
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        System.out.println("#2 end");

        System.out.println("\n#3 start");
        try {
            System.out.println("Сумма элементов массива: " + procArray(array3));
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        System.out.println("#3 end");

    }

    static int procArray(String[][] arrayFourOnFour) throws MyArraySizeException, MyArrayDataException {
        if (arrayFourOnFour.length != 4) {
            throw new MyArraySizeException("Некорректный размер массива!", Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
        for (int i = 0; i < arrayFourOnFour.length; i++) {
            if (arrayFourOnFour[i].length != 4){
                throw new MyArraySizeException("Некорректный размер массива!", Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
        }

        int sum = 0;
        for (int i = 0; i < arrayFourOnFour.length; i++){
            for (int j = 0; j < arrayFourOnFour[i].length; j++){
                try {
                    sum += Integer.parseInt(arrayFourOnFour[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(arrayFourOnFour[i][j], i, j);
                }
            }
        }
        return sum;
    }

    static class MyArraySizeException extends Exception {

        private final int lineCode;

        public MyArraySizeException(String message, int lineCode) {
            super(message);
            this.lineCode = lineCode;
        }

    }

    static class MyArrayDataException extends Exception {

        public MyArrayDataException(String element, int i, int j) {
            super("Ошибка приведения типов. Значение элемента массива: " + element + ". Строка: " + i + ", столбец: " + j);
        }
    }

}