public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача6");
        var boxWeight1 = 78.2;
        var boxWeight2 = 82.7;
        var totalWeight = boxWeight1 + boxWeight2;
        System.out.println("Общий вес боксёров" + totalWeight + "кг!");
        var differenceWeight = boxWeight2 - boxWeight1;
        System.out.println("Разница веса боксёров" + differenceWeight + "кг!");
    }
    public static void task7 () {
        System.out.println("Задача7");
        var BoxWeight1 = 78.2;
        var BoxWeight2 = 82.7;
        var DifferenceWeight = BoxWeight2 - BoxWeight1;
        System.out.println("разница на" + DifferenceWeight + "кг!");
        var WeightDifference = DifferenceWeight % BoxWeight2;
        System.out.println("Разница на" + WeightDifference + "кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var AllTime = 640;
        var WorkTime = 8;
        var AllWorkers = AllTime / WorkTime;
        System.out.println("Всего человек в компании" + AllWorkers + "человек");
        var AllWorkers2 = AllWorkers + 94;
        var AllTime2 = AllWorkers2 * WorkTime;
        System.out.println("Если в компании работае"  + AllWorkers2 +  "человек" + ",то всего" + AllTime2 + "часов работы может быть поделено между сотрудниками");
    }
}




