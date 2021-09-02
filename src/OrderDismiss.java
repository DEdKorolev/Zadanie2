// Определение класса "Приказ об увольнении".
public class OrderDismiss {

    String name = "Приказ об увольнении";
    String to, reason;
    int numberDoc;
    Zadanie2.Status status;

    public OrderDismiss(String to, String reason, int numberDoc, Zadanie2.Status status) {
        this.to = to;
        this.reason = reason;
        this.numberDoc = numberDoc;
        this.status = status;
    }

    public void printOrderDismiss (){
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\t" + getName() + " № " + getNumberDoc());
        System.out.println();
        System.out.println("\t\t\tСотрудник: " + getTo());
        System.out.println();
        System.out.println("Вы уволены.");
        System.out.println("Причина увольнения, " + getReason() + ".");
        System.out.println();
        System.out.println("Статус документа: " + getStatus());
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getTo() {
        return to;
    }

    public String getReason() {
        return reason;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public Zadanie2.Status getStatus() {
        return status;
    }

    public void setStatus(Zadanie2.Status status) {
        this.status = status;
    }
}
