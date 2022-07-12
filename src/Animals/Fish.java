package Animals;

public class Fish extends Animals {
    static int count=0;
    public Fish(String name) {
        this.name=name;
        runDistance=0;
        swimDistance=10000;
        count++;
        if (listOfAnimals.containsKey("Fish")) {
            listOfAnimals.replace("Fish", count);
        } else listOfAnimals.put("Fish", count);
    }
    @Override
    public void run(int dist) {
        System.out.println(name + " не умеет бегать.");
    }
}
