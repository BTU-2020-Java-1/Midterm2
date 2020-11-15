package ge.edu.btu.midterm.oop;

public class House extends Realty {

    private double area;

    private double placeCoefficient;

    public House() {
    }

    public House(String code, double price, double area, double placeCoefficient) {
        super(code, price);
        this.area = area;
        this.placeCoefficient = placeCoefficient;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPlaceCoefficient() {
        return placeCoefficient;
    }

    public void setPlaceCoefficient(double placeCoefficient) {
        this.placeCoefficient = placeCoefficient;
    }

    @Override
    public double getTax() {
        return (getPrice() + getArea() * getPlaceCoefficient()) * 0.1;
    }
}
