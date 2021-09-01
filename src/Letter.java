// Определение класса "Письмо".
public class Letter {

    String name = "Письмо";
    String to, from;
    int numberDoc;

    public Letter(String to, String from, int numberDoc) {
        this.to = to;
        this.from = from;
        this.numberDoc = numberDoc;
    }

    public String getName() {
        return name;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public int getNumberDoc() {
        return numberDoc;
    }
}
