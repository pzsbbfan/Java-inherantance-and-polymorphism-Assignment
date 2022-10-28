import javax.swing.*;

public abstract class GameTester {
    protected String name;
    protected Boolean status;
    protected Double salary;

    protected void setName(){
        name = JOptionPane.showInputDialog("Enter the name for GameTester");
    }

    protected void displayInfo(){
        System.out.println("Tester Name: " + name + " Status: "
                + (status? "Full-Time": "Part-Time") + " Salary :$"+salary);
    }
    protected abstract double setSalary();
}
