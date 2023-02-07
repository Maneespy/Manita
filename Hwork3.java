public class Hwork3 {
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.salaryDetails(120000);
    employee.calculateScale();
        System.out.println("Employee Salary scale is :"+employee.calculateScale());
    }
}
class Employee
{
    private int salary;
    private char scale;


    void salaryDetails(int x)
    {
        salary = x;
    }
    char calculateScale() {
        if (salary < 35000)
            scale = 'L';
        else if (salary >= 45000 && salary < 75000) {
            scale = 'M';
        } else {
            scale = 'H';
        }
        return scale;
    }

}