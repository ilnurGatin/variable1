public class Main {
    public static void main(String[] args) {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Вес двух боксеров " + boxersWeight);
        var differenceInWeigth = secondBoxer - firstBoxer;
        var weightDifference = secondBoxer % firstBoxer;
        System.out.println(differenceInWeigth);
        System.out.println(weightDifference);

        // задача №8
        var totalAmountOfHours = 640;
        var hoursPerEmployee = 8;
        var amountOfEmploeeys = totalAmountOfHours / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + amountOfEmploeeys + " человек");
        amountOfEmploeeys = amountOfEmploeeys + 94;
        var hoursTotal = amountOfEmploeeys * hoursPerEmployee;
        System.out.println("Если в компании работает " + amountOfEmploeeys + " человек, то всего " + hoursTotal + " часов работы может быть поделено между сотрудниками");



    }
}