import java.util.ArrayList;

public class Farm {


    private double farmSize = 100;
    private ArrayList<Flower>farm = new ArrayList<>();
    private ArrayList<Animal>barn = new ArrayList<>();
    private double usedSpaceFarm;

    public void harvestFlower(String name){
        for (int i = 0; i < farm.size(); i++) {
        if(farm.get(i).name.equals(name)){
            farm.remove(i);
            System.out.println("Successfully harvested flower");
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
            }else{
                System.out.println("Failed to add flower");
            }


    }
    public void waterFlower(){

    }
    public void removeFlower(){

    }
    public void buyAnimal(){

    }
    public void petAnimal(){

    }
    public void sellAnimal(){

    }


}
