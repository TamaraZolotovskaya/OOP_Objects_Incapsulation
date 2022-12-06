public class Main {

    public static void main(String[] args) {

        //class Human
        Human Maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human Ann = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human Kate = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human Artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");

        System.out.println(Maxim);
        System.out.println(Ann);
        System.out.println(Kate);
        System.out.println(Artem);

        //class Car
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "России");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyindai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Car zero = new Car(" ", null, -1, "", 0, "     ");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyindai);
        System.out.println(zero);


    }
}
