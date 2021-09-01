/* Программа для вывода на печать различных видов документов:
    - письма,
    - приказа о приёме на работу,
    - приказа об увольнении.
   После запуска программы необходимо ввести запрашиваемые данные.
*/

import java.util.*;

public class Zadanie2 {

    public static void main(String[] args) {

        int numberDoc = 1; // Начальный номер документа
        Status status = Status.Cоздан; // Переменная, отражающая статус документа
        String flagWorker, flagStatus; // Переменная для завершения ввода данных
        ArrayList<Worker> workerArrayList = new ArrayList<>(); // Массив ФИО сотрудников
        ArrayList<Letter> letterArrayList = new ArrayList<>(); // Массив писем
        ArrayList<OrderAccept> orderAcceptArrayList = new ArrayList<>(); // Массив приказов о приеме
        ArrayList<OrderDismiss> orderDismissArrayList = new ArrayList<>(); // Массив приказов об увольнении

        Scanner input = new Scanner(System.in); // Включения ввода данных из консоли

        // Цикл для создания сотрудников
        do {
            // Ввод ФИО сотрудника
            System.out.println("Введите фамилию сотрудника и нажмите Enter: ");
            String lastName = input.nextLine();
            System.out.println("Введите имя сотрудника и нажмите Enter: ");
            String firstname = input.nextLine();
            System.out.println("Введите отчество сотрудника и нажмите Enter: ");
            String middleName = input.nextLine();

            // Создание объекта "Сотрудник"
            Worker worker = new Worker(lastName, firstname, middleName);
            workerArrayList.add(worker);

            System.out.println("Для создания следующего сотрудника нажмите любую клавишу.\nДля окончания введите q.");
            flagWorker = input.nextLine();
        } while (!flagWorker.equals("q"));

        // Запуск цикла для поочередного формирования документов
        for (Worker worker : workerArrayList) {

            // Задание переменной содержащей ФИО сотрудника
            String to = worker.getLastName() + " "
                    + worker.getFirstName() + " "
                    + worker.getMiddleName();

            System.out.println("Создание документов для сотрудника " + to);
            System.out.println("Введите данные \"от кого\" для письма: ");
            String from = input.nextLine();
            System.out.println("Введите причину увольнения: ");
            String reason = input.nextLine();

            Letter letter = new Letter(to, from, numberDoc);  // Создание объекта "Письмо"
            letterArrayList.add(letter); // Добавление письма в массив
            numberDoc++; // Увеличение № документа на 1

            // Форма письма
            System.out.println("-------------------------------------------------");
            System.out.println();
            System.out.println("\t\t" + letter.getName() + " № " + letter.getNumberDoc());
            System.out.println();
            System.out.println("\t\t\tкому: " + letter.getTo());
            System.out.println("\t\t\tот кого: " + letter.getFrom());
            System.out.println();
            System.out.println("Здравствуйте, " + letter.getTo() + "!\n" +
                    "Спешим обрадовать Вас приятной новостью:\n" +
                    "\"Вы приняты на работу!\"\n" +
                    "Но, к сожалению, Вы были сразу же уволены.");
            System.out.println();
            System.out.println("-------------------------------------------------");
            System.out.println();

            OrderAccept orderAccept = new OrderAccept(to, numberDoc, status); //Создание объекта "Приказ на прием на работу"
            orderAcceptArrayList.add(orderAccept);  // Добавление приказа в массив
            numberDoc++; // Увеличение № документа на 1

            // Форма приказа на прием на работу
            System.out.println("-------------------------------------------------");
            System.out.println();
            System.out.println("\t\t" + orderAccept.getName() + " № " + orderAccept.getNumberDoc());
            System.out.println();
            System.out.println("\t\t\tСотрудник: " + orderAccept.getTo());
            System.out.println();
            System.out.println("Вы приняты на работу на должность программист.");
            System.out.println();
            System.out.println("Статус документа: " + orderAccept.getStatus());
            System.out.println("-------------------------------------------------");
            System.out.println();

            // Создание объекта "Приказ на увольнение" и его добавление в карту map
            OrderDismiss orderDismiss = new OrderDismiss(to, reason, numberDoc, status); //Создание объекта "Приказ на увольнение"
            orderDismissArrayList.add(orderDismiss); // Добавление приказа в массив
            numberDoc++; // Увеличение № документа на 1

            // Форма пприказа на увольнение
            System.out.println("-------------------------------------------------");
            System.out.println();
            System.out.println("\t\t" + orderDismiss.getName() + " № " + orderDismiss.getNumberDoc());
            System.out.println();
            System.out.println("\t\t\tСотрудник: " + orderDismiss.getTo());
            System.out.println();
            System.out.println("Вы уволены.");
            System.out.println("Причина увольнения, " + orderDismiss.getReason() + ".");
            System.out.println();
            System.out.println("Статус документа: " + orderDismiss.getStatus());
            System.out.println("-------------------------------------------------");
            System.out.println();
        }

        System.out.println("Перевести документы в статус \"Исполнено\"?" +
                "(введите \"yes\" для подтверждения, иначе статус не изменится");
        flagStatus = input.nextLine();
        if (flagStatus.equals("yes")) {
            status = Status.Исполнен;
        }

        // Вывод на печать информации по письмам
        for (Letter letter : letterArrayList) {
            System.out.println(letter.getName() + " № "+ letter.getNumberDoc());
        }

        // Вывод на печать информации по приказам о приёме на работу
        for (OrderAccept orderAccept : orderAcceptArrayList) {
            orderAccept.setStatus(status);
            System.out.println(orderAccept.getName() + " № "+ orderAccept.getNumberDoc() + " " + orderAccept.getStatus());
        }

        // Вывод на печать информации по приказам об увольнении
        for (OrderDismiss orderDismiss : orderDismissArrayList) {
            orderDismiss.setStatus(status);
            System.out.println(orderDismiss.getName() + " № " + orderDismiss.getNumberDoc() + " " + orderDismiss.getStatus());
        }
    }

    // Список статусов документа
    public enum Status {
        Cоздан,
        Исполнен
    }
}