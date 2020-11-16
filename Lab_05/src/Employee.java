public class Employee implements java.lang.Comparable {
    private String employeeld;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeld, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeld = employeeld;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfLeavingDay / 2);
    }

    @Override
    public String toString() {
        return "{Name:" + this.employeeName + " - Salary Per Hour:" + this.salaryPerHour + " - Weekly salary:" + calculateWeeklySalary();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            if (noOfTravelDay > ((Employee) o).noOfTravelDay) {
                return 1;
            } else if (noOfTravelDay == ((Employee) o).noOfTravelDay) {
                if (noOfLeavingDay < ((Employee) o).noOfLeavingDay) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return 0;
        }
        return -1;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }
}
