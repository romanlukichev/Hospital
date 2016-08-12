package domain_dao;

import domain.Employee;

/**
 * Created by Roman on 07.08.2016.
 */
public class EmployeeDAO {

    //connectionManager DatabaseConnectionManager;



    public void saveEmployee(Employee employee){
//
//        database.DatabaseConnectionManager connectionManager = database.DatabaseConnectionManager.getManagerInstance();
//        connectionManager.getConnectionObject("insert into Employee_tbl");
//        connectionManager.disconnect();

        System.out.println("saved employee to the database " + employee);

    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database " + employee);
    }
}
