package Animals;

public class Cat extends Animals{
    static int count=0;
    public Cat(String name) {
        this.name=name;
        runDistance=200;
        swimDistance=0;
        count++;
        if (listOfAnimals.containsKey("Cat")) {
            listOfAnimals.replace("Cat", count);
        } else listOfAnimals.put("Cat", count);
    }
    @Override
    public void swim(int dist) {
        System.out.println(name + " не умеет плавать.");
    }
}
