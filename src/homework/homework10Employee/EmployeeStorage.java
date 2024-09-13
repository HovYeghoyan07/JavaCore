package homework.homework10Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = -1;

    public void addEmployee(Employee employee) {
        if (size+1 == employees.length) {
            extendStorage();
        }
        employees[++size] = employee;
    }

    private void extendStorage() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i <= size; i++) {
            if (employees[i].getCompany().equals(companyName)) {
                System.out.println(employees[i]);
            }
        }
    }

    public Employee searchEmployeeById(String id) {
        for (int i = 0; i <= size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }
}
