import java.text.DecimalFormat;
public class Flower {
    private final String flowerName;
    private final String country;
    private  double cost;
    int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName==null || flowerName.isBlank()==true)
        {flowerName="Тип цветка не указан";}
        this.flowerName = flowerName;
        if (country==null || country.isBlank()==true)
        {country="Россия";}
        this.country = country;
        setCost(cost);
        setLifeSpan(lifeSpan);
    }
    public Flower(String flowerName, String country, double cost) {
        this(flowerName,country,cost,3);
    }

    public void setCost(double cost) {
        if(cost<=0) {cost=1;}
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan<=0) {lifeSpan=3;}
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public String toString() {
        return getFlowerName()+" из "+getCountry()+", цена "+new DecimalFormat("0.00").format(getCost())+" рублей, срок стояния "+lifeSpan+ " дней";
    }
}
