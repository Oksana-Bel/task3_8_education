import java.math.BigDecimal;

public class CarSell {
    int id;
    boolean isAutomatic;
    double volumeMotor;
    int year;
    //BigDecimal
    double price;
    String korobka;
    String brendCar;
    String[] brend = {"Audi", "BMW", "Honda"};

    public CarSell(int id, boolean isAutomatic, double volumeMotor, int year, double price) {
        this.id = id;
        this.isAutomatic = isAutomatic;
        this.volumeMotor = volumeMotor;
        this.year = year;
        this.price = price;
    }

    void infoCar() {
        System.out.println("Марка машины: " + getBrendCar() + ", коробка передач: " + transmision() + ", объем двигателя: " + volumeMotor +
                ", год выпуска:" + year + ", цена: " + price);
    }

    String transmision() {
        if (isAutomatic)
            korobka = "автомат";
        else
            korobka = "механика";
        return this.korobka;
    }

    String getBrendCar() {
        if (id == 0)
            brendCar = brend[0];
        else if (id == 1)
            brendCar = brend[1];
        else brendCar = brend[2];
        return this.brendCar;
    }
}




