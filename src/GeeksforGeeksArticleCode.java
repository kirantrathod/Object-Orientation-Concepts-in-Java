class Salary{
    private double salary;
    private String Name;
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setSalary(double Salary)
    {

//You can check whether salary is negative or positive
        if(Salary>=0)
        {
            salary=Salary;
        }
        else{
            System.out.println("you have entered wrong amount for salary");
        }

    }
    public double getSalary()
    {
        return salary;
    }
}

class GeeksforGeeksArticleCode{
    public static void main(String arg[])
    {
        Salary s=new Salary();
        s.setSalary(15000);
        s.setName("ABC");
        System.out.println("Salary of "+s.getName() +"is: "+s.getSalary());
    }
}
