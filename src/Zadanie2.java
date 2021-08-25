/* Программа для вывода на печать различных видов документов:
    - письма,
    - приказа о приёме на работу,
    - приказа об увольнении.
   После запуска программы необходимо ввести запрашиваемые данные.
*/

import java.util.*;

public class Zadanie2 {

    public static void main(String[] args) {

        String status = "создан"; // Переменная, отражающая статус документа
        String flag; // Переменная для завершения ввода данных

        Scanner input = new Scanner(System.in); // Включения ввода данных из консоли

        // Карта. K: назвавание документа, V: статус документа
        TreeMap<String, String> map = new TreeMap<>();

        // Запуск цикла для поочередного формирования документов
        for (long numberDoc = 1; numberDoc > 0; numberDoc++) {

            System.out.println("Введите фамилию сотрудника и нажмите Enter: ");
            String lastName= input.nextLine();

            System.out.println("Введите имя сотрудника и нажмите Enter: ");
            String firstname = input.nextLine();

            System.out.println("Введите отчество сотрудника и нажмите Enter: ");
            String middleName= input.nextLine();

            System.out.println("Введите данные \"от кого\" для письма: ");
            String from = input.nextLine();

            System.out.println("Введите причину увольнения: ");
            String reason = input.nextLine();

            // Создание объекта "Сотрудник"
            Worker worker = new Worker(lastName, firstname, middleName);

            // Переменная содержащая ФИО сотрудника
            String to = worker.lastName + " " + worker.firstName + " " + worker.middleName;

            // Создание объекта "Письмо" и его добавление в карту map
            Letter letter = new Letter(to, from, numberDoc);
            map.put("Письмо № " + numberDoc, " отправлено.");
            numberDoc++;

            //Создание объекта "Приказ на прием на работу" и его добавление в карту map
            OrderAccept orderAccept = new OrderAccept(to, status, numberDoc);
            map.put("Приказ на прием на работу № " + numberDoc, " исполнен.");
            numberDoc++;

            // Создание объекта "Приказ на увольнение" и его добавление в карту map
            OrderDismiss orderDismiss = new OrderDismiss(to, reason, status, numberDoc);
            map.put("Приказ на увольнение № " + numberDoc, " исполнен.");

            // Блок для выхода из цикла заполнения документов
            System.out.println("Для продолжения нажмите любую клаишу.\nДля окончания введите q.");
            flag = input.nextLine();
            if (flag.equals("q")) {
                break;
            }
        }

        // Перебор карты map для вывода информации о названии документа и его статусе
        for(Map.Entry<String,String> m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }


}
