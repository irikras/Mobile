public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1000;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int res = balance + refill + bonus;
        System.out.println("Бонус равен: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету клиента: " + res + " руб.");
    }
}
