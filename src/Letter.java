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

    public void printLetter () {
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\t" + getName() + " № " + getNumberDoc());
        System.out.println();
        System.out.println("\t\t\tкому: " + getTo());
        System.out.println("\t\t\tот кого: " + getFrom());
        System.out.println();
        System.out.println("Здравствуйте, " + getTo() + "!\n" +
                "Спешим обрадовать Вас приятной новостью:\n" +
                "\"Вы приняты на работу!\"\n" +
                "Но, к сожалению, Вы были сразу же уволены.");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
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
