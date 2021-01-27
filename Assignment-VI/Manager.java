
public class Manager extends Employee
{
    public Manager(String n, double s, Day d){
        super(n, s, d);
        secretaryName = " ";
    }
    public void raiseSalary(double byPercent){
        Day today = new Day();
        double bonus = 0.5 * (today.getYear() - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    public void setSecratoryName(String n)
    {
        secretaryName = n;
    }
    public String getSecrataryName(){
        return secretaryName;
    }
    private String secretaryName;
}
