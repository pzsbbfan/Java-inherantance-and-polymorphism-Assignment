import javax.swing.*;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args){
        String[] options = new String[2];
        options[0] = "Full-Time";
        options[1] = "Part-Time";

        int type = (JOptionPane.showOptionDialog(null,
                "Choose the type of object you want to create",
                "Choose Type",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, options[0]));

        if (type == 0){
            System.out.println("Full-Time Game Tester is created");
            GameTester tester = new FullTimeGameTester();
            tester.displayInfo();
        }
        else
        {
            System.out.println("Part-Time Game Tester is created");
            GameTester tester=new PartTimeGameTester();
            tester.displayInfo();
        }


    }
}





