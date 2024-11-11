//2. Наследование: Класс "Работник" и "Менеджер"
//Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
//Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иван", 30, "Мужской", 50000);
        Worker worker2 = new Worker("Мария", 25, "Женский", 45000);
        Manager manager = new Manager("Петр", 40, "Мужской", 70000);

        // Добавляем подчиненных сотрудников менеджеру
        manager.addWorker(worker1);
        manager.addWorker(worker2);

        // Выводим информацию о сотрудниках
        System.out.println("Информация о сотруднике:");
        worker1.Info();

        System.out.println("\nИнформация о менеджере:");
        manager.Info();
    }
}