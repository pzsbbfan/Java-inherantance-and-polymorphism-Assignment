import javax.swing.*;
import java.awt.*;
import java.util.Locale;
public class Test {

    public static void  main (String[] args) {
        Insurance[] insurances = new Insurance[5];
        int index = 0;
        Boolean newInsurance = true;
        Boolean invalidTypeInput = true;
        Boolean invalidFeeInput = true;
        String type = "";
        Double monthlyFee = 0.0;
        int insertInsurance;

        //check if user wants to insert another insurance
        while (newInsurance){

            //validate insurance type input
            while(invalidTypeInput){
            type = JOptionPane.showInputDialog("Enter the type of Insurance (Life or Health): ");
            type = type.toLowerCase();
            if (type.equals("life")||type.equals("health")){
                invalidTypeInput = false;
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter life or health");}
            }

            //validate monthly fee input
            while (invalidFeeInput){
                try{
                    monthlyFee = Double.valueOf(JOptionPane.showInputDialog("Enter the monthly fee for the insurance"));
                    invalidFeeInput = false;
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Please Enter a number for your monthly fee");
                }
            }

            // prevent user insert too many insurances
            try{
                if (type.equals("life")){
                    insurances[index] = new Life();
                    insurances[index].setTypeOfInsurance("Life");
                    insurances[index].setInsuranceCost(monthlyFee);
                    index++;
                }

                if (type.equals("health")){
                    insurances[index] = new Health();
                    insurances[index].setTypeOfInsurance("Health");
                    insurances[index].setInsuranceCost(monthlyFee);
                    index++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"You can register no more than 5 insurance");
            }

            //End the loop if user does not want to insert another insurance
            insertInsurance = JOptionPane.showConfirmDialog(null,
                    "Do you want to insert another insurance?",
                    "Insert Another Insurance?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null);
            if (insertInsurance == JOptionPane.NO_OPTION){
                newInsurance = false;

            }
            else {
                invalidTypeInput = true;
                invalidFeeInput = true;
            }
        }

        //walk through every insurance in the array and display message
        for (int i = 0; i < insurances.length ; i++){
            if (insurances[i] == null){
                break;
            }
            else {
                System.out.println(i+1 +". "+ insurances[i].displayInfo());
            }

        }
    }
}
