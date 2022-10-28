public abstract class Insurance {
    protected String typeOfInsurance;
    protected Double monthlyCost;

    public String getTypeOfInsurance(){return typeOfInsurance;}

    public Double getMonthlyCost(){return monthlyCost;}
    public void setTypeOfInsurance(String typeOfInsurance){this.typeOfInsurance = typeOfInsurance;}

    public abstract double setInsuranceCost(Double cost);
    public abstract String displayInfo();
}
