import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {

    public String ArrayListAddSpeed(int iterations) {
        ArrayList<String> strings = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            strings.add(i, "не");
        }
        long finishTime = System.currentTimeMillis();
        long duration =  finishTime - startTime;
        return "Время выполнения добавления " + iterations + " элементов в ArrayList = " + duration + " миллисекунд";
    }

    public String LinkedListAddSpeed (int iterations) {
        LinkedList<String> linkedStrings = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedStrings.add(i, "не");
        }
        long finishTime = System.currentTimeMillis();
        long duration =  finishTime - startTime;
        return "Время выполнения добавления " + iterations + " элементов в LinkedList = " + duration + " миллисекунд";

    }

    public String CustomArrayListAddSpeed(int iterations) {
        CustomArrayList<String> strings = new CustomArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            strings.add("-");
        }
        long finishTime = System.currentTimeMillis();
        long duration =  finishTime - startTime;
        return "Время выполнения добавления " + iterations + " элементов в CustomArrayList = " + duration + " миллисекунд";
    }

    public  String CustomLinkedListAddSpeed(int iterations) {
        CustomLinkedList<String> strings = new CustomLinkedList();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            strings.add("-");
        }
        long finishTime = System.currentTimeMillis();
        long duration =  finishTime - startTime;
        return "Время выполнения добавления " + iterations + " элементов в CustomLinkedList = " + duration + " миллисекунд";
    }
}
