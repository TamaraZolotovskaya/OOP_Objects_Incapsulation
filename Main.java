import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //class Human
        Human maxim = new Human(LocalDate.now().getYear() - 35, "Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(LocalDate.now().getYear() - 28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(LocalDate.now().getYear() - 27, "Артём", "Москва", "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);

        Human vlad = new Human(2001, "Владимир", "Казань", null);
        System.out.println(vlad);

        //class transport.Car
        Car.Insurance myInsuranse = new Car.Insurance(LocalDate.of(2022, 12, 19), 5000, "234567891");
        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "механическая",
                "Седан",
                "1213СС234",
                5,
                true,
                myInsuranse);


        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3,
                "черный",
                2020,
                "Германия",
                "механическая",
                "хэтчбек",
                "А000СС234",
                6,
                true,
                myInsuranse);
        Car bmw = new Car("BMW",
                "Z8",
                3,
                "черный",
                2021,
                "Германия",
                "автоматическая",
                "хэтчбек",
                "А137СС234",
                5,
                true,
                myInsuranse);
        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "автоматическая",
                "универсал",
                "А123СС454",
                5,
                false,
                myInsuranse);
        Car hyindai = new Car("Hyundai",
                "Avante", 1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "автоматическая",
                "универса",
                "А123СС999",
                5,
                false,
                myInsuranse);
        Car zero = new Car(" ",
                null,
                -1,
                "",
                0,
                "     ",
                null,
                " ",
                "",
                1,
                true,
                myInsuranse);
        lada.changeTires(5);
        hyindai.changeTires(12);
        boolean trueNumber = lada.isCorrectNumber();
        if (trueNumber == false) {
            System.out.println(lada.getBrand() + " " + lada.getModel() + " имеет некорректный номер " + lada.getRegistrationNumber());
        }

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyindai);
        System.out.println(zero);

        //class Flower
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", null, 15, 5);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        //calss Bouqet
        Flower[] flowers = new Flower[]{rose, rose, rose};
        Bouquet firstBouquet = new Bouquet(flowers);
        System.out.println(firstBouquet);


    }
}
