public class Main {
    public static void main(String[] args) {

        double account = 100;   // Счёт пользователя.
        double qtyFill = 1500;  // Сумма пополнения счёта.
        int bonus;              // Количество бонусов.

        System.out.println("Баланс счёта: " + account + " рублей.");

        if (qtyFill > 1000) {
            bonus = (int) (qtyFill / 100);
            account += qtyFill + bonus;
            System.out.println("Вы пополнили счёт на " + qtyFill + " рублей.");
            System.out.println("Полученно бонусов по акции: " + bonus + ".");
        } else {
            bonus = 0;
            account += qtyFill;
            System.out.println("Вы пополнили счёт на " + qtyFill + " рублей.");
            System.out.println("Внимание, акция! Пополните счёт более чем на 1000 рублей и получите по 1 рублю за каждые полные 100 рублей пополнения.");
        }
        System.out.println("Текущий баланc счёта: " + account + " рублей.");
    }
}