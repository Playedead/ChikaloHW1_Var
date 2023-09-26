public class Main {
  public static void main(String[] args) {
    System.out.println("Задача №1");
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    System.out.println();

    System.out.println("Задача №2");
    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    System.out.println();

    System.out.println("Задача №3");
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    System.out.println();

    System.out.println("Задача №4");
    var friend = 19;
    System.out.println(friend);
    friend = friend * 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);
    System.out.println();

    System.out.println("Задача №5");
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);
    System.out.println();

    System.out.println("Задача №6");
    var firstBoxerWeight = 78.2;
    var secondBoxerWeight = 82.7;
    var totalWeight = firstBoxerWeight + secondBoxerWeight;
    System.out.println("Общая масса бойцов составляет " + totalWeight + " кг.");
    var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
    System.out.println("Разница в весе составляет " + weightDifference1 + " кг.");
    System.out.println();

    System.out.println("Задача №7");
    System.out.println("1 способ: Разница в весе составляет " + weightDifference1 + " кг.");
    var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
    System.out.println("2 способ: Разница в весе составляет " + weightDifference2 + " кг.");
    System.out.println();

    System.out.println("Задача №8");
    var totalHours = 640;
    var hoursPerEmploee = 8;
    var emploeesNumber = totalHours / hoursPerEmploee;
    System.out.println("Всего работников в компании — " + emploeesNumber + " человек.");

    emploeesNumber = emploeesNumber + 94;
    var newTotalHours = hoursPerEmploee * emploeesNumber;
    System.out.println("Если в компании работает " + emploeesNumber + " человека, " +
        "то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками.");
  }
}