package ex039;

import org.apache.commons.lang3.StringUtils;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee (String firstName,String lastName, String position, String separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public Employee(String firstName, String lastName, String position)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = "";
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();
        output.append(StringUtils.rightPad(firstName + " " + lastName, 20));
        output.append(StringUtils.rightPad("| " +position, 20));
        output.append(StringUtils.rightPad("| " +separationDate, 10));

        return output.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }
}
