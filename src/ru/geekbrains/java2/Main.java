package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*
        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        участники должны выполнять соответствующие действия (бежать или прыгать),
        результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников
        пройти этот набор препятствий.

        4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку
        он препятствий не идет.
        */
        People people1 = new People();
        Cat cat1 = new Cat();
        Robot robot1 = new Robot();
        Member[] members = {people1, cat1, robot1};

        Track track1 = new Track();
        Wall wall1 = new Wall();
        Obstacle[] obstacles = {track1, wall1};

        overcomeObstacles(members, obstacles);
    }

    static void overcomeObstacles (Member[] members, Obstacle[] obstacles){

        // перебираем участников
        for (int i = 0; i < members.length; i++){

            // перебираем препятствия
            for (int j = 0; j < obstacles.length; j++) {

                // если препятствие = дорожка, то пробуем бежать
                if (obstacles[j] instanceof Track) {
                    // для само проверки
                    System.out.printf("Участник: " + members[i].getClass() + " Препятствие: " + obstacles[j].getClass() + " ");
                    members[i].run();
                }
                // если препятствие = стена, то пробуем прыгать
                else if (obstacles[j] instanceof Wall) {
                    System.out.printf("Участник: " + members[i].getClass() + " Препятствие: " + obstacles[j].getClass() + " ");
                    members[i].jump();
                }
            }
        }
    }

}
