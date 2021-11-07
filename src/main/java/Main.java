import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CarInfo car1 = new CarInfo(0, true, 1.5, 2020, 5000000);
        CarInfo car2 = new CarInfo(1, true, 2.0, 2019, 3000000);
        CarInfo car3 = new CarInfo(2, false, 1.8, 2013, 1100000);

        System.out.println("У нас есть марки машин: \n 1 - Audi\n 2 - BMW \n 3 - Honda.");
        System.out.println("Введите номер интересующей Вас марки машины:");

        Scanner console = new Scanner(System.in);
        int numberCarUser = console.nextInt();

        if (numberCarUser == 1) car1.infoCar();
        else if (numberCarUser == 2) car2.infoCar();
        else if (numberCarUser == 3) car3.infoCar();
        else
            System.out.println("На данный момент других машин нет.");
    }
}
