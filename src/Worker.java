// Определение класса "Сотрудник"
public class Worker {

    String firstName, lastName, middleName;

    // Создает сотрудника с фамилией и именем
    public Worker(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Создает сотрудника с фамилией, именем и отчеством
    public Worker(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
}
