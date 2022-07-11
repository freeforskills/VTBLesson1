package Animals;

import java.util.HashMap;
import java.util.Map;

public class Animals implements Comparable<Animals>{
    public static Map<String, Integer> listOfAnimals = new HashMap<>();
    public String name;
    int swimDistance;
    int runDistance;

    public void swim(int dist){
        if (dist>=0) {
            if (swimDistance-dist > 0){
                System.out.println(name+" проплыл "+ dist + "м и может проплыть еще "+ (swimDistance-dist)+"м.");
            } else if (swimDistance-dist < 0) {
                System.out.println(name+" смог проплыть "+ dist + "м, а нужно проплыть еще "+ (-1*(swimDistance-dist))+"м.");
            } else {
                System.out.println(name+" проплыл "+ dist + "м.");
            }
        }

    }

    public void run(int dist){
        if (dist>=0) {
            if (runDistance-dist > 0){
                System.out.println(name+" пробежал "+ dist + "м и может пробежать еще "+ (runDistance-dist)+"м.");
            } else if (runDistance-dist < 0) {
                System.out.println(name+" смог пробежать "+ dist + "м, а нужно пробежать еще "+ (-1*(runDistance-dist))+"м.");
            } else {
                System.out.println(name+" пробежал "+ dist + "м.");
            }
        }
    }

    public static void getInfo(){
        int total=0;
        for (Map.Entry<String,Integer> o:Animals.listOfAnimals.entrySet()) {
            System.out.println(o.getKey()+ " = " +o.getValue());
            total += o.getValue();
        }
        System.out.println("Всего животных = "+total);
    }

    @Override
    public int compareTo(Animals o) {
        return this.name.compareTo(o.name);
    }

}
