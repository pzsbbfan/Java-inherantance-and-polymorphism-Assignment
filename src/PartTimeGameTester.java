import javax.swing.*;

import static java.lang.System.exit;

public class PartTimeGameTester extends GameTester{

    @Override
    protected double setSalary() {
        Double hours = 0.0;
        Boolean invalidInput = true;

        while (invalidInput){
            try {
                hours = Double.valueOf(JOptionPane.showInputDialog("Enter the hours for the part time game tester: "));
                invalidInput = false;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Invalid input of hours, try again");
            }
            catch (NullPointerException ne){
                exit(0);
            }
        }
        salary = hours * 20;
        return salary;
    }

    public PartTimeGameTester(){
        setName();
        salary = setSalary();
        status = false;
    }
}
