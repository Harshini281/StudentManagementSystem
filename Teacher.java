public class Teacher extends Person {
    private String subject;
    private double salary;
    public Teacher(int id,String name,int age,String address,String subject, double salary) {
        super(id,name,age,address);
        this.subject = subject;
        this.salary = salary;
    }
    @Override
    public void displayDetails(){
       super.displayDetails();
       System.out.println("Subject: " + subject+", Salary: " + salary);
    }
}
