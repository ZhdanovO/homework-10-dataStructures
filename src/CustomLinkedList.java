public class CustomLinkedList<E> {
    private static int counter;
    private Node head;

    //получение количества элементов
    private static int getCounter() {
        return counter;
    }
    //прибавление одного элемента
    private static void incrementCounter() {
        counter++;
    }
    //удаление элемента
    private void decrementCounter() {
        counter--;
    }
    public int size() {
        return getCounter();
    }
    // добавление элемента в конец списка
    public void add(Object data) {
        // создаем ноду если еще нет
        if (head == null) {
            head = new Node(data);
        }
        Node nodeTemp = new Node(data);
        Node nodeCurrent = head;

        // добавляем элемент после последнего узла
        while (nodeCurrent.getNext() != null) {
            nodeCurrent = nodeCurrent.getNext();
        }
        nodeCurrent.setNext(nodeTemp);
        // +1 в счетчике элементов
        incrementCounter();
    }
    // добавление элемента в конкретное место списка
    public void add(Object data, int index) {
        Node nodeTemp = new Node(data);
        Node nodeCurrent = head;
        if (nodeCurrent != null) {
            // перебираем элементы до указанного индекса или конца списка
            for (int i = 0; i < index && nodeCurrent.getNext() != null; i++) {
                nodeCurrent = nodeCurrent.getNext();
            }
        }
        // устанавливаем ссылку нового узла на следующий элемент
        nodeTemp.setNext(nodeCurrent.getNext());
        // связываем новый узел со следующим
        nodeCurrent.setNext(nodeTemp);
        // +1 в счетчике элементов
        incrementCounter();
    }
    public Object get(int index)
    // возвращаем элемент списка с известным индексом
    {
        // индекс не может быть меньше нуля
        if (index < 0) {
            return null;
        }
        Node nodeCurrent = null;
        if (head != null) {
            nodeCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return null;
                nodeCurrent = nodeCurrent.getNext();
            }
            return nodeCurrent.getData();
        }
        return null;
    }
    // удаление элемента с известным индексом
    public boolean remove(int index) {
        // if the index is out of range, exit
        if (index < 0 || index > getCounter())
            return false;
        Node nodeCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return false;
                nodeCurrent = nodeCurrent.getNext();
            }
            nodeCurrent.setNext(nodeCurrent.getNext().getNext());
            decrementCounter();
            return true;
        }
        return false;
    }
    // класс самого узла (элемента связанного списка)
    private class Node {
        // ссылка на следующий узел в цепочке или null, если его нет.
        Node next;
        // данные самого узла
        Object data;
        // конструктор узла если есть только данные
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }
        // конструктор узла, если нужно указать связь с другим узлом
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        public Object getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}

