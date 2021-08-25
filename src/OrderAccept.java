// Определение класса "Приказ о приеме на работу".
public class OrderAccept {

    //Создает приказ с параметрами "кому", "статус", "номер документа"
    public OrderAccept(String to, String status, long numberDoc) {

        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\tПриказ о приеме на работу № " + numberDoc);
        System.out.println();
        System.out.println("\t\t\tСотрудник: " + to);
        System.out.println();
        System.out.println("Вы приняты на работу на должность программист.");
        System.out.println();
        System.out.println("Статус документа: " + status);
        System.out.println("-------------------------------------------------");
        System.out.println();
    }
}
