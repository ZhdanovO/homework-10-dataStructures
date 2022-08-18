import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("меня");
        strings.add("зовут");
        strings.add("массив");

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            strings.add(i, "не");
        }

        long finishTime1 = System.currentTimeMillis();
        long duration =  finishTime1 - startTime1;

//        for (String str : strings) {
//            System.out.println(str);
//        }

        System.out.println("Время выполнения добавления миллиона элементов в ArrayList = " + duration + " миллисекунд");

        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("Привет");
        linkedStrings.add("меня");
        linkedStrings.add("зовут");
        linkedStrings.add("массив");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedStrings.add(i, "не");
        }
        long finishTime2 = System.currentTimeMillis();
        long duration2 =  finishTime2 - startTime2;
        System.out.println("Время выполнения добавления миллиона элементов в LinkedList = " + duration2 + " миллисекунд");

//        for (String str : linkedStrings) {
//            System.out.println(str);
//        }

    }
}