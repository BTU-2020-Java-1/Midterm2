package ge.edu.btu.midterm.oop;

public abstract class Realty {

    private String code;

    private double price;

    public Realty() {
    }

    public Realty(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + ": " + getTax();
    }

    public abstract double getTax();
}
