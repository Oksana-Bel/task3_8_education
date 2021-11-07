public class CarInfo {

    int id;
    boolean isAutomatic;
    double volumeMotor;
    int year;
    double price;
    String box;
    String brandCar;
    String[] brand = {"Audi", "BMW", "Honda"};

    public CarInfo(int id, boolean isAutomatic, double volumeMotor, int year, double price) {
        this.id = id;
        this.isAutomatic = isAutomatic;
        this.volumeMotor = volumeMotor;
        this.year = year;
        this.price = price;
    }

    void infoCar() {
        System.out.println("Марка машины: " + getBrandCar() + ", коробка передач: " + transmission() + ", объем двигателя: " + volumeMotor +
                ", год выпуска:" + year + ", цена: " + price);
    }

    String transmission() {
        if (isAutomatic)
            box = "автомат";
        else
            box = "механика";
        return this.box;
    }

    String getBrandCar() {
        if (id == 0)
            brandCar = brand[0];
        else if (id == 1)
            brandCar = brand[1];
        else brandCar = brand[2];
        return this.brandCar;
    }
}




