import java.util.Calendar;
import java.util.Date;

public class ProjectPrint implements Runnable {
    Project project;
    public ProjectPrint(Project project) {
        this.project = project;
    }

    @Override
    public void run() {
        project.getListOfEmployee().stream().forEach(a -> {System.out.println("Project ID:" + a.getEmployeeld() +" - Project Duration::" + project.getStartDate() + " to "
        + project.getEndDate() + "][Name:"+ a.getEmployeeName() + " - Salary Per Hour:" + a.getSalaryPerHour()+ "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        Project project = new Project("Khan",new Date(1990, 2, 1),new Date(1990, 3, 1));
        Employee a = new Employee("01","Khan",8,0,0);
        project.listOfEmployee.add(a);
        Employee b = new Employee("02","Khang",9,0,0);
        project.listOfEmployee.add(b);
        ProjectPrint projectPrint = new ProjectPrint(project);
        Thread thread = new Thread(projectPrint);
        thread.start();
    }
}
