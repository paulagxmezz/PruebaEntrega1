package mp.e2.ejerciciosclase;

public class Author {
    private static String name;
    private String email;
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



    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        //this.gender = getGender();
        setGender(gender);



    }
    public static String getName() {
        return name;

    }
    public char getGender() {
        return gender;

    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Author [ name= "+ name + " , email =" + email+ " , gender = "+ gender + "]";
    }

}
