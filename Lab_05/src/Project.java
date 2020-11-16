import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectld;
    private Date startDate;
    private Date endDate;
    ArrayList<Employee> listOfEmployee;

    public Project(String projectld, Date startDate, Date endDate) {
        this.projectld = projectld;
        this.endDate = endDate;

        listOfEmployee = new ArrayList<>();
        this.startDate = startDate;
    }

    public int estimateBudget() {
        return 0;
    }

    @Override
    public String toString() {
        return "Project{" +
                "listOfEmployee=" + listOfEmployee +
                '}';
    }

    public String getProjectld() {
        return projectld;
    }

    public void setProjectld(String projectld) {
        this.projectld = projectld;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }
}
