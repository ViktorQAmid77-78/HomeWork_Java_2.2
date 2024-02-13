public class Main {
    public static void main(String[] args) {
        int currentBalance = 2000;
        int topUpAmount = 500;

        int bonusAmount = 0;
        if (topUpAmount > 1000) {
            bonusAmount = (topUpAmount / 100) * 1;
        }

        int totalBalance = currentBalance + topUpAmount + bonusAmount;

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
    }
}