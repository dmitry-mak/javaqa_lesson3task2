public class Main {
    public static void main(String[] args) {

        int startingBalance = 100; // начальный баланс
        int replenishmentAmount = 1100; // сумма пополнения баланса

        int bonusAmount = 0; // количество начисленных бонусов
        int finalBalance; // конечный баланс с учетом бонусов

        if (replenishmentAmount > 1000) {
            bonusAmount = (int) (replenishmentAmount * 0.01);
        }

        finalBalance = startingBalance + replenishmentAmount + bonusAmount; // расчет конечной суммы баланса

        // вывод результатов в консоль:
        System.out.println("Конечный баланс после пополнения: " + finalBalance);
        System.out.println("Количество начисленных бонусных баллов: " + bonusAmount);

    }
}