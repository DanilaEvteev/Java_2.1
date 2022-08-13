public class Main {
    public static void main(String[] args) {
        // сумма на счету клиента
        int score = 50;
        int money = 580;
        // сумма пополнения счета
        int bonus = 0;
        // кол-во бонусов на данный момент
        if (money > 100) {
            bonus = money / 100;
        } else {
            bonus = 0;
        }
        int result = score + money + bonus;
        System.out.println("итого: " + result);
        System.out.println("итого бонусов: " + bonus);
    }
}
