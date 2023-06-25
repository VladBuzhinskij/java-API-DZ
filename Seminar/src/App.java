import java.util.LinkedList;


public class App {
    public static void derevo (LinkedList<Integer> linked_list, int number){
        boolean stop=true;
        while (stop){
            int r=linked_list.get(number);
            if (linked_list.size()>number*2+1){ //Есть ли первый потомок
                int p1=linked_list.get(number*2+1);
                if (linked_list.size()>number*2+2){ // Есть ли второй потомок
                    int p2=linked_list.get(number*2+2);
                    if (r>=p1){ //Если родитель больше потомка 1
                        if (r>=p2){
                            return;
                        }//Если родитель больше потомка 2
                        else{
                            linked_list.set(number,p2);
                            linked_list.set(number*2+2,r);//Менем местами родителя и потомка 2
                            number=number*2+2;
                        }
                    }
                    else{
                        if(p1>=p2){
                            linked_list.set(number,p1);
                            linked_list.set(number*2+1,r);//Менем местами родителя и потомка 1 
                            number=number*2+1;
                        }
                        else{
                            linked_list.set(number,p2);
                            linked_list.set(number*2+2,r);//Менем местами родителя и потомка 2
                            number=number*2+2;
                        }
                    }
                    
                }
                else{
                    if (r<p1){
                        linked_list.set(number,p1);
                        linked_list.set(number*2+1,r);//Менем местами родителя и потомка 1
                        number=number*2+1;
                    }
                    else{return;}
                }
            }
            else{return;}
        }
        
    }
    public static LinkedList<Integer> sort_derevo (LinkedList<Integer> linked_list){
        for (int i=linked_list.size()-2;i>-1;i--){
            derevo (linked_list, i);
        }// Формирование начального сортирующего дерева
        LinkedList <Integer> res_list = new LinkedList<Integer>();
        for (int i=linked_list.size()-2;i>-1;i--){
            res_list.add(linked_list.remove());
            linked_list.addFirst(linked_list.pollLast());
            derevo (linked_list,0);
        }//2 этап, максимумы в новый лист
        res_list.add(linked_list.remove());
        return res_list;
    }

    public static void main(String[] args) throws Exception {
        LinkedList <Integer> linked_list = new LinkedList<Integer>();
        for (int i=0;i<15;i++){

            linked_list.add((int)(Math.random() * 100));
            }
        System.out.println(linked_list);
     
        System.out.println(sort_derevo (linked_list));

    }
}
