
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.io.IOException;
public class App {
    public static void Sort(int[] sortArr)throws IOException{
        Logger logger=Logger.getLogger(App.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);


        logger.addHandler(fh);
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.info("TEST"+Arrays.toString(sortArr));
                }
            }
        }
    }

   


    public static void main(String[] args) throws Exception {
        // 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
        //  Данные для фильтрации приведены ниже в виде json-строки.
        //  Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        System.out.println("Задание 1");
        String base_1="select * from students where ";
        StringBuilder new_base_1 = new StringBuilder(base_1);
        String input_1 = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        String [] out_1=input_1.split(",");
      


        for (int i=0; i<out_1.length;i++){
            if (!(out_1[i].contains("null"))){
                String [] l =out_1[i].split(":");
                String p=l[0].replace('"', ' ');
                if (i==out_1.length-2){
                    new_base_1.append(p+'='+l[1]);
                }
                else {new_base_1.append(p+'='+l[1]+" AND ");}
                }
        }
        System.out.println(new_base_1);

        System.out.println("Задание 2");
        // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        StringBuilder base_2 = new StringBuilder("");
        int[] array = {123, 34, 24, 1324, 432, 135};
            Sort(array);
            for(int i = 0; i < array.length; i++){
                base_2.append(array[i]+" ");
            }
        System.out.println(base_2); 



        
        


    }
}
