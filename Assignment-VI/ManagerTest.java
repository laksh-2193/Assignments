
public class ManagerTest
{
    public static void main(String args[])
    {
        Manager boss = new Manager("Lakshay Kumar",750000, new Day(2003,9,21));
        boss.setSecratoryName("James Doe");
        Employee[] staff = new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("Mr Person A",35000, new Day(2009,10,1));
        staff[2]=new Employee("Mr Person B",38000, new Day(2010,3,15));
        new Day(2010,3,15);
        int i;
        for (i=0;i<3;i++){
            staff[i].raiseSalary(5);
        }
        for (i=0;i<3;i++){
            staff[i].print();
        }
        System.out.println("The department secretary is "+boss.getSecrataryName());
    }
}

        