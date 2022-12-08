package lesson_6;

        /*
        Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        (переопределить toString(), пример:
        Номер счёта : <сумма>
        Количество денег на счету : <цифра>
        Напишите программу, которая создает три объекта класса CreditCard
        у которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее
        состояние всех трех карточек.
         */

public class CreditCard {

    String accountnumber;
    int sum;

    public CreditCard (String accountnumber, int sum) {
        this.accountnumber = accountnumber;
        this.sum = sum;
    }


    public void plus (int nachisleno) {
        sum += nachisleno;
    }

    public void minus (int spisano) {
        if (sum < spisano) {
            System.out.println("Недостаточно средств, нищеброд");
        } else {
            sum -= spisano;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "Номер Вашего счета:" + accountnumber + '\'' +
                ", Текущая сумма на счету: " + sum +
                '}';
    }
}
