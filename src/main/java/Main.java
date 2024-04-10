import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("На сколько человек разделить счет?");

        int visitors = 0;

        // узнаем сколько на сколько человек делить счет
        while(true){
            Scanner scanner = new Scanner(System.in);
            visitors = scanner.nextInt();
            if(visitors > 1){
                break;
            } else if(visitors == 1){
                System.out.println("Одному человеку нечего делить, введите количество человек от 2 и больше");
            } else {
                System.out.println("Вы ввели некорректное количество, число может быть от 2 и больше");
            }

        }
        Calculator calculator = new Calculator();
        // узнаем у пользователя что было заказано
        calculator.addItems();
        // показываем список товаров
        calculator.showItems();
        // считаем
        calculator.calculate(visitors);
    }
}