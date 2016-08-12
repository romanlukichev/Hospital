package clients;

import domain.Employee;
import domain_dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {

        Employee peggy = new Employee( true , 1 , "peggy" , "accounting" );
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy , FormatType.XML);

    }

    public static void hireNewEmployee(Employee emp){

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
    }

    public static void terminateEmployee(Employee emp){

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }

    public static void printEmployeeReport(Employee emp , FormatType formatType){

        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp , FormatType.XML);
        System.out.println(formatter.getFormattedEmployee(emp));
    }
}
