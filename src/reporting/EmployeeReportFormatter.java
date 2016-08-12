package reporting;

import domain.Employee;

/**
 * Created by Roman on 07.08.2016.
 */
public class EmployeeReportFormatter extends ReportFormatter {
    private Employee anEmployee;
    private FormatType formatType;

    public EmployeeReportFormatter(Employee employee , FormatType formatType) {
        super(employee , formatType);
    }

    public Employee getFormattedEmployee(Employee inEmployee){
        return getFormattedEmployee(inEmployee);
    }
}
