// Определение класса "Письмо".
public class Letter {

    //Создает письмо с параметрами "кому", "от кого", "номер документа"
    public Letter(String to, String from, long numberDoc) {

        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("\t\tПисьмо № " + numberDoc);
        System.out.println();
        System.out.println("\t\t\tкому: " + to);
        System.out.println("\t\t\tот кого: " + from);
        System.out.println();
        System.out.println("Здравствуйте, " + to + "!\n" +
                "Спешим обрадовать Вас приятной новостью:\n" +
                "\"Вы приняты на работу!\"\n" +
                "Но, к сожалению, Вы были сразу же уволены.");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }
}
