package ex039;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {

    Map<String , Employee> employees = new HashMap<>();
    TreeMap<String, Employee> sortedEmployees;

    public EmployeeMap()
    {
        employees.put("johnson" , new Employee("John","Johnson" , "Manager" , "2016-12-31"));
        employees.put("xiong" , new Employee("Tou",	"Xiong",	"Software Engineer",	"2016-10-05"));
        employees.put("michaelson" , new Employee("Michaela",	"Michaelson",	"District Manager",	"2015-12-19"));
        employees.put("jacobson" , new Employee("Jake",	"Jacobson",	"Programmer"));
        employees.put("jackson" , new Employee("Jacquelyn",	"Jackson",	"DBA"));
        employees.put("webber" , new Employee("Sally",	"Webber",	"Web Developer",	"2015-12-18"));

        sortedEmployees = new TreeMap<>(employees);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(StringUtils.rightPad("Name" , 20));
        output.append(StringUtils.rightPad("| Position" , 20));
        output.append(StringUtils.rightPad("| Separation Date" , 10));
        output.append("\n");
        output.append(StringUtils.rightPad("",20, '-'));
        output.append(StringUtils.rightPad("|",20, '-'));
        output.append(StringUtils.rightPad("|",20, '-'));
        output.append("\n");


        for(Map.Entry<String, Employee> entry : sortedEmployees.entrySet())
        {
            output.append(entry.getValue());
            output.append("\n");
        }

        return output.toString();
    }
    public void findNames(String substring)
    {
        ArrayList<String> keys = new ArrayList<>();
        for(Map.Entry<String, Employee> entry : sortedEmployees.entrySet())
        {

            String fullName = entry.getValue().getFirstName() + " " + entry.getValue().getLastName();
            if (!fullName.contains(substring))
            {
                keys.add (entry.getKey());
            }
        }
        for(String s: keys)
        {
            sortedEmployees.remove(s);
        }
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }

    public TreeMap<String, Employee> getSortedEmployees() {
        return sortedEmployees;
    }

    public void setSortedEmployees(TreeMap<String, Employee> sortedEmployees) {
        this.sortedEmployees = sortedEmployees;
    }
}
