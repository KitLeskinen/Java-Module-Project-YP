public class Formatter {
    public String getCase(Double number){
        // округляем число до целых
        double flooredNumber = Math.floor(number);
        // находим остаток от деления на 10 чтобы получить крайнюю цифру справа
        // по нему определяем падеж, единственное или множественное число
        int remainder = (int) flooredNumber % 10;
        if(remainder == 1){
            return "рубль";
        } else if(remainder > 1 && remainder < 5){
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
