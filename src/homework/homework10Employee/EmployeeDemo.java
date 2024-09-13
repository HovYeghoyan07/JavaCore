package homework.homework10Employee;

import java.util.Scanner;

public class EmployeeDemo implements CompanyCommands {
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            CompanyCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchByCompanyName();
                    break;
            }
        }
    }

    private static void searchByCompanyName() {
        System.out.println("Please input company name for searching employee");
        String company = scanner.nextLine();
        employeeStorage.searchEmployeeByCompanyName(company);
    }

    private static void searchById() {
        System.out.println("Please input employee's id");
        String id = scanner.nextLine();
        System.out.println(employeeStorage.searchEmployeeById(id));
    }

    private static void addEmployee() {
        System.out.println("Please input employee's ID");
        String employeeID = scanner.nextLine();
        if (employeeStorage.searchEmployeeById(employeeID)==null) {
            System.out.println("Please input employee name");
            String name = scanner.nextLine();
            System.out.println("Please input employee surname");
            String surname = scanner.nextLine();
            System.out.println("Please input employee's salary");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input employee's company");
            String company = scanner.nextLine();
            System.out.println("Please input employee's position");
            String position = scanner.nextLine();
            employeeStorage.addEmployee(new Employee(name, surname, employeeID, salary, company, position));
        }else{
            System.out.println("Employee's Id  already exists");
        }



    }
}