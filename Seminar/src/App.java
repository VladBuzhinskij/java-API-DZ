import java.util.LinkedList;


public class App {
    public static void enqueue(LinkedList<Integer> linked_list2, int number) {
        linked_list2.add(number);
        return;
    }

    public static int  dequeue(LinkedList<Integer> linked_list2) {
        int number=linked_list2.remove();
        return number;
    }

    public static int  first(LinkedList<Integer> linked_list2) {
        int number=linked_list2.getFirst();
        return number;
    }
 
    public static void main(String[] args) throws Exception {
    //     // 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        System.out.println("Задание 1");
        LinkedList<Integer> linked_list = new LinkedList<Integer>(); // Создание linkedlist
        for (int i=0;i<15;i++){
            linked_list.add(i);
        }//Заполнение листа
        System.out.println(linked_list);
        for (int i=0;i<15;i++){
            linked_list.addFirst(linked_list.remove(i));
        }
        System.out.println(linked_list);
    
        // 2. Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
        // dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

        System.out.println("Задание 2");
        LinkedList<Integer> linked_list2 = new LinkedList<Integer>(); // Создание linkedlist
        for (int i=0;i<15;i++){
            linked_list2.add(i);
        }//Заполнение листа
        System.out.println(linked_list2);
        enqueue(linked_list2,3);
        System.out.println(linked_list2);
        int numd=dequeue(linked_list2);
        System.out.println(linked_list2);
        System.out.println(numd);
        int numd1=first(linked_list2);
        System.out.println(linked_list2);
        System.out.println(numd1);
    }
}
