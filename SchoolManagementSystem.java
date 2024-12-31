import java.util.ArrayList;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<Person>();
        people.add(new Student(1,"Ravi",16,"123 street","10th Grade","S101"));
        people.add(new Student(2, "Jane Smith", 17, "456 Street", "11th Grade", "S102"));

        // Add Teachers
        people.add(new Teacher(3, "Mr. Wilson", 35, "789 Street", "Mathematics", 50000));
        people.add(new Teacher(4, "Ms. Taylor", 29, "321 Street", "English", 48000));

        // Add Admin Staff
        people.add(new AdminStaff(5, "Anna Johnson", 40, "654 Street", "Finance", "Accountant"));
        people.add(new AdminStaff(6, "Paul Brown", 45, "987 Street", "HR", "HR Manager"));

        System.out.println("School management System:");
        for(Person person:people){
            person.displayDetails();
            System.out.println("-------------------------------------------------");
        }
    }
}
