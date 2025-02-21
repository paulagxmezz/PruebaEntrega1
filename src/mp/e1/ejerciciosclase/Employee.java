package mp.e1.ejerciciosclase;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;

        this.lastName = lastName;
        this.salary = salary;


    }
    public int getId(){
        return id;

    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;

    }
    public String getName(){
        return firstName + " " + lastName;

    }
    public int getSalary(){
        return salary;

    }
    public void setSalary(int salary){
        this.salary = salary;

    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        this.salary= this.salary+(percent*this.salary)/100;
        return this.salary;
    }
    public String toString(){
        return "es.uah.matcom.mp.e1.Employee[id="+ id + "name = "+ firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
    }


}
