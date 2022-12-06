public class Car {
    public final String brand;
    public final String model;
    public final double engineVolume;
    public String color;
    public final int year;
    public final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null && brand.isBlank() == false) {
            this.brand = brand;
        } else this.brand = "default";
        if (model != null && model.isBlank() == false) {
            this.model = model;
        } else this.model = "default";
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5;
        if (color != null && color.isBlank() == false) {
            this.color = color;
        } else this.color = "белый";
        if (year > 0) {
            this.year = year;
        } else this.year = 2000;
        if (country != null && country.isBlank() == false) {
            this.country = country;
        } else this.country = "default";

    }

    @Override
    public String toString() {
        return brand + " " + model + ", год выпуска " + year + ", сборка в " + country + ", объем двигателя " + engineVolume + ", цвет " + color;
    }
}
