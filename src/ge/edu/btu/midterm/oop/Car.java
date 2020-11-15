package ge.edu.btu.midterm.oop;

public class Car extends Realty {

    private boolean verified;

    public Car() {
    }

    public Car(String code, double price, boolean verified) {
        super(code, price);
        this.verified = verified;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public double getTax() {
        if (verified) {
            return getPrice() * 0.1;
        } else {
            return getPrice() * 0.12;
        }
    }
}
