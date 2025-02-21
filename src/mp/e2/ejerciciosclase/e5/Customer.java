package mp.e2.ejerciciosclase.e5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public void setGender(char gender) {
        if (gender == 'm') {
            this.gender = gender;

        }
        else if (gender == 'f'){
            this.gender = gender;

        }
        else {
            this.gender = 'e';
        }

    }

    public Customer(int id, String name,char gender) {
        this.id = id;
        this.name = name;
        setGender(gender);

    }

    public int getId(){
        return id;

    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }

    public String toString() {
        return "name " + name + "(" + id + ")";
    }
}
