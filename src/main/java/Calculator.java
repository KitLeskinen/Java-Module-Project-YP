import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    ArrayList<Item> items = new ArrayList<>();

    public void addItems() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите название товара или напишите \"завершить\"");
        while(true){

            String itemName = scanner.next();
            if(itemName.equalsIgnoreCase("завершить")){
                break;
            }
            System.out.println("Введите стоимость товара");
            boolean isDouble = scanner.hasNextDouble();
            if(isDouble){
                items.add(new Item(itemName, scanner.nextDouble()));
                System.out.println(String.format("Товар %s успешно добавлен!\n", itemName));
                System.out.println("Напишите название следующего товара или напишите \"завершить\"");

            } else if(scanner.next().equalsIgnoreCase("завершить")){
                break;
            } else {
                System.out.println("Стоимость введена неверно, напишите название товара или напишите \"завершить\"");
            }
        }
        scanner.close();
    }
    public void calculate(int visitors){
        Double total = 0.0;
        for (Item item : items) {
            total += item.price;
        }
        Double separatedPrice = total/visitors;
        System.out.println(String.format("Каждый должен заплатить %.2f %s", separatedPrice, new Formatter().getCase(separatedPrice)));
    }

    public void showItems() {
        System.out.println("Добавленные товары:");
        for (Item item: items) {
            System.out.println(String.format("- %s: %s %s", item.name, item.price, new Formatter().getCase(item.price)));
        }
    }
}
