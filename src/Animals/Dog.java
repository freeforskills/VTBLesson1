package Animals;

public class Dog extends Animals{
    static int count=0;
    public Dog(String name) {
        this.name=name;
        runDistance=500;
        swimDistance=10;
        count++;
        if (listOfAnimals.containsKey("Dog")) {
            listOfAnimals.replace("Dog", count);
        } else listOfAnimals.put("Dog", count);
    }

    public static int getCount() {
        return count;
    }
}
