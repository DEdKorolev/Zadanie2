// Определение класса "Приказ об увольнении".
public class OrderDismiss {

    //Создает приказ с параметрами "кому", "причина увольнения", "статус", "номер документа"
    public OrderDismiss(String to, String reason, String status, long numberDoc) {

        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\tПриказ об увольнении № " + numberDoc);
        System.out.println();
        System.out.println("\t\t\tСотрудник: " + to);
        System.out.println();
        System.out.println("Вы уволены.");
        System.out.println("Причина увольнения, " + reason + ".");
        System.out.println();
        System.out.println("Статус документа: " + status);
        System.out.println("-------------------------------------------------");
        System.out.println();
    }
}
