import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double bouquetSum() {
        double sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            sum = sum + flowers[i].getCost();
        }
        sum = sum * 1.1;
        return sum;
    }

    private int bouquetLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getLifeSpan() < min) {
                min = flowers[i].getLifeSpan();
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета:").append("\n");
        for (int i = 0; i < flowers.length; i++) {
            result.append(flowers[i].getFlowerName()).append("\n");
        }
        result.append("Цена букета: ")
                .append(new DecimalFormat("0.00").format(bouquetSum()))
                .append("\n")
                .append("Время стояния букета: ")
                .append(bouquetLifeSpan())
                .append(" дней");

        return result.toString();
    }
}
