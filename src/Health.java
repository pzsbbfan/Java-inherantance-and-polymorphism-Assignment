public class Health extends Insurance{

    @Override
    public double setInsuranceCost(Double cost) {
        return monthlyCost = cost;
    }

    @Override
    public String displayInfo() {
        String info = "Insurance Type: Health" + "  Monthly Cost: $" + monthlyCost;
        return info;
    }
}
