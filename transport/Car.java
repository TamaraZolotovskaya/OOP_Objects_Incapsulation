package transport;

import java.time.LocalDate;

public class Car {
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final double price;
         final String number;

        public Insurance(LocalDate expireDate, double price, String number) {
            if (expireDate == null){expireDate=LocalDate.now().plusDays(60);}
            this.expireDate = expireDate;
            if (price <= 0) {
                price = 1000;
            }
            this.price = price;
            if (number == null || number.isBlank() == true) {
                number = "000000000";
            }
            this.number = number;
        }
        public void isCorrectNumber (){
            if (number.length()!=9){
                System.out.println("Номер страховки некорректный!");
            }
        }

        public void isInsuranceExpired (){
            boolean IsExpared= expireDate.isAfter(LocalDate.now());
            if (IsExpared) {
                System.out.println("Страховка просрочена!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "дата окончания " + expireDate +
                    ", цена " + price +
                    ", номер " + number;
        }
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires,
               Insurance insurance) {

        if (brand == null || brand.isBlank() == true) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isBlank() == true) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year < 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isBlank() == true) {
            country = "default";
        }
        this.country = country;
        setTransmission(transmission);
        if (bodyType == null || bodyType.isBlank() == true) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats < 2) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;
        setWinterTires(winterTires);
        setInsurance(insurance);
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 00) ==0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() == true) {
            color = "белый";
        }
        this.color = color;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() == true) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() == true) {
            registrationNumber = "default";
        }
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTires(int month) {
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                winterTires = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                winterTires = false;
                break;
            default:
                winterTires = false;
        }
    }

    private boolean isCorrectNumberletter(char letter)
    //А, В, Е, К, М, Н, О, Р, С, Т, У, Х
    {
        if (letter == 'А' ||
                letter == 'В' ||
                letter == 'Е' ||
                letter == 'К' ||
                letter == 'М' ||
                letter == 'Н' ||
                letter == 'О' ||
                letter == 'Р' ||
                letter == 'С' ||
                letter == 'Т' ||
                letter == 'У' ||
                letter == 'Х' ) {
            return true;
        } else return false;

    }

    public boolean isCorrectNumber() {
        char[] number = registrationNumber.toCharArray();
        if (number.length != 9 ||
                Character.isDigit(number[1]) == false ||
                Character.isDigit(number[2]) == false ||
                Character.isDigit(number[3]) == false ||
                Character.isDigit(number[6]) == false ||
                Character.isDigit(number[7]) == false ||
                Character.isDigit(number[8]) == false ||
                isCorrectNumberletter(number[0]) == false ||
                isCorrectNumberletter(number[4]) == false ||
                isCorrectNumberletter(number[5]) == false ) {
            return false;
        } else return true;
    }


    @Override
    public String toString() {
        String season = new String();
        if (winterTires == true){ season="зимняя";}
        else season="летняя";
        return brand + " " +
                model + "\n"+
                "год выпуска " + year +"\n"+
                "сборка в " + country + "\n"+
                "объем двигателя " + engineVolume +"\n"+
                "цвет " + color +"\n"+
                "коробка передач "+transmission+"\n"+
                "тип кузова "+bodyType+ "\n"+
                "регистрационный номер "+registrationNumber+"\n"+
                "количество мест "+numberOfSeats+ "\n"+
                "резина "+ season+ "\n"+
                "страховка: "+ insurance.toString()+ "\n";
    }
}
