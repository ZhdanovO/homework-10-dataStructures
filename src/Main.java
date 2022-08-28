import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Создание ArrayList
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("меня");
        strings.add("зовут");
        strings.add("массив");

        //поиск по индексу
        System.out.println(strings.get(2));
        //поиск по значению
        if (strings.indexOf("массив") != -1){
            System.out.println("В нашем списочном массиве присутствует элемент со значением \"массив\". Его индекс " + strings.indexOf("массив"));
        }
        //удаление
        strings.remove(1);


        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("Привет");
        linkedStrings.add("меня");
        linkedStrings.add("зовут");
        linkedStrings.add("массив");

        //поиск по значению
        System.out.println(linkedStrings.indexOf("меня"));
        //поиск по индексу
        System.out.println(linkedStrings.get(0));
        //удаление
        linkedStrings.remove(1);




        //Вызов своей реализации ArrayList
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            customArrayList.add(String.valueOf(i));
        }
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + ", ");
        }
        System.out.println();
        //Удалим элемент
        customArrayList.remove(3);
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + ", ");
        }
        System.out.println();

        //работа со своей реализацией LinkedList
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        for (int i = 0; i < 10; i++) {
            customLinkedList.add(String.valueOf(i));
        }
        for (int i = 0; i < customLinkedList.size(); i++) {
            System.out.print(customLinkedList.get(i) + ", ");
        }
        System.out.println();
        customLinkedList.remove(4);
        for (int i = 0; i < customLinkedList.size(); i++) {
            System.out.print(customLinkedList.get(i) + ", ");
        }
        System.out.println();
        customLinkedList.add("Hello", 2);
        for (int i = 0; i < customLinkedList.size(); i++) {
            System.out.print(customLinkedList.get(i) + ", ");
        }
        System.out.println();


        //Определяем время выполнения миллиона операций добавления элементов
        SpeedTest speedTest = new SpeedTest();
        System.out.println(speedTest.ArrayListAddSpeed(1000000));
        System.out.println(speedTest.LinkedListAddSpeed(1000000));
        //моя реализация значительно (примерно на 2 порядка) медленнее(
        System.out.println(speedTest.CustomArrayListAddSpeed(10000));
        System.out.println(speedTest.CustomLinkedListAddSpeed(10000));
    }
}