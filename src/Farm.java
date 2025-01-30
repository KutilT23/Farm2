import java.util.ArrayList;
import java.util.Random;

public class Farm {


    private double farmSize = 100;
    private ArrayList<Flower>farm = new ArrayList<>();
    private ArrayList<Animal>barn = new ArrayList<>();
    private double usedSpaceFarm;
    Player player = new Player();
    private int chance = 0;

    public void harvestFlower(String name){
        for (int i = 0; i < farm.size(); i++) {
        if(farm.get(i).name.equals(name)){
            farm.remove(i);
            Random rd = new Random();
            chance = rd.nextInt(1,101);
            if(chance >=50){
                System.out.println("Successfully harvested flower");
                player.setCurrency(player.getCurrency()+75);
            }else{
                System.out.println("Plant did not grow up");
            }

         }else{
            System.out.println("Failed to harvest flower");
        }
        }

    }
    public void plantFlower(Flower flower){
            if(flower.neededArea+usedSpaceFarm <= farmSize&&farm.size()<5){
                farm.add(flower);
                usedSpaceFarm = usedSpaceFarm + flower.neededArea;
                System.out.println("Successfully added flower");
                player.setCurrency(player.getCurrency()-50);

            }else{
                System.out.println("Failed to add flower");
            }


    }
    public void waterFlower(){
    chance = chance+20;
    }
    public void removeFlower(String name){
        for (int i = 0; i <farm.size() ; i++) {
            if(farm.get(i).name.equals(name)){
                farm.remove(i);
                System.out.println("Successfully removed flower, but no money :(");
            }else{
                System.out.println("Failed to destroy your flower");
            }

        }
    }
    public void addAnimalsToBarn(){

    }
    public void buyAnimal(){

    }
    public void petAnimal(){

    }
    public void sellAnimal(){

    }


}
