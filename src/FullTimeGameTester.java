public class FullTimeGameTester extends GameTester{
    @Override
    protected double setSalary() {
        salary = 3000.00;
        return salary;
    }
    public FullTimeGameTester(){
        status = true;
        setName();
        salary = setSalary();
    }
}
