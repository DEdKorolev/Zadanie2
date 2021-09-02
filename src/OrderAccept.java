// Определение класса "Приказ о приеме на работу".
public class OrderAccept {

    String name = "Приказ о приеме на работу";
    String to;
    int numberDoc;
    Zadanie2.Status status;

    public OrderAccept(String to, int numberDoc, Zadanie2.Status status) {
        this.to = to;
        this.numberDoc = numberDoc;
        this.status = status;
    }

    public void printOrderAccept (){
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\t" + getName() + " № " + getNumberDoc());
        System.out.println();
        System.out.println("\t\t\tСотрудник: " + getTo());
        System.out.println();
        System.out.println("Вы приняты на работу на должность программист.");
        System.out.println();
        System.out.println("Статус документа: " + getStatus());
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public void setStatus(Zadanie2.Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getTo() {
        return to;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public Zadanie2.Status getStatus() {
        return status;
    }
}
