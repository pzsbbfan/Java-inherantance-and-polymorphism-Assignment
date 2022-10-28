public class Life extends Insurance {

    @Override
    public double setInsuranceCost(Double cost) {
        return monthlyCost = cost;
    }

    @Override
    public String displayInfo() {
       String info = "Insurance Type: Life Insurance"  + "  Monthly Cost: $" + monthlyCost;
       return info;
    }
}
