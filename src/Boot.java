import java.util.ArrayList;

public class Boot {

    private ArrayList<Mammal> animals;
    public static void main(String[] args) {
        new Boot();
        //System.out.println(one.getName());
    }

    public Boot(){
        //Mammal one = new Mammal("pig");
        Text2Bracket.convert();
        this.animals = Text2Bracket.getAnimals();

        

    }
}
