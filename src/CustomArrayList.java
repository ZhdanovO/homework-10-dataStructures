public class CustomArrayList<E> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


    /*
    Добавляем новый элемент в список. При достижении размера внутреннего
    массива происходит его увеличение на единицу.
    */
    public void add(E item) {
        if(pointer == array.length - 1) {
            resize(array.length + 1);
        }
        array[pointer++] = item;
    }

    /*
    Возвращает элемент списка по индексу.
    */
    public E get(int index) {
        return (E) array[index];
    }

    /*
    Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    перемещаются на шаг налево. Если после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.
    */
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
    }
    /*Возвращает количество элементов в списке*/
    public int size() {
        return pointer;
    }

    /*Вспомогательный метод для масштабирования.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}