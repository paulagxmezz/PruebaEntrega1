package mp.e3.ejerciciosclase.e6;

public class Mammal extends Animal{
    public Mammal(String nombre){
        super(nombre);

    }
    @Override
    public String toString(){
        return "Mammal["+ super.toString();
    }

}
