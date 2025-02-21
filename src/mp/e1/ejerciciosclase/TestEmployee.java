package mp.e1.ejerciciosclase;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is " + e1.getId());
        System.out.println("First name is " + e1.getFirstName());
        System.out.println("Last name is " + e1.getLastName());
        System.out.println("Salary is " + e1.getSalary());

        System.out.println("name is" + e1.getName());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);



    }
}
