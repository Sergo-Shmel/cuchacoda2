import java.util.ArrayList;
import java.util.List;
public class Manager extends Worker{
    private List<Worker> workers;

    public Manager(String name, int age, String gender,int salary) {
        super(name, age, gender,salary);
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        this.workers.add(worker);
    }

    public void removeWorkers(Worker worker) {
        this.workers.remove(worker);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Подчиненные сотрудники:");
        for (Worker worker : workers) {
            System.out.println("- " + worker.getName());
        }
    }
}
