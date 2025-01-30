import java.util.ArrayList;

public class Player {
    private String name = "";
    private double currency = 1000;
    private ArrayList<Flower>flowerOwnedInv = new ArrayList<>();
    private ArrayList<Animal>animalOwnedInv = new ArrayList<>();

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }
    public void addFlower(Flower flower){
        flowerOwnedInv.add(flower);
    }
    public void addAnimal(Animal animal){
        animalOwnedInv.add(animal);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
