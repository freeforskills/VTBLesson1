package Animals;

public class Tiger extends Animals{
    static int count=0;
    public Tiger(String name) {
        this.name=name;
        runDistance=1000;
        swimDistance=250;
        count++;
        if (listOfAnimals.containsKey("Tiger")) {
            listOfAnimals.replace("Tiger", count);
        } else listOfAnimals.put("Tiger", count);
    }
}
