
import java.util.Scanner;
public class App {
    public static int input_int(){
        boolean i=true;
        Scanner sc = new Scanner(System.in);
        while (i){
            System.out.println("Введите число:");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                i=false;
                
                return number;
            } else {
                System.out.println("Ошибка");
            }
            sc.nextLine();
        }
        return 0;
    }
    public static String [] input_calc(){
        System.out.println("Введите выражение типа 'A' (+ - / *) 'B':");
        Scanner scc = new Scanner(System.in);
        String input=scc.nextLine();
        String [] res;
        int j=1;
        res = new String[4];
        res[0]="0";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)==' '){}
            else if (input.charAt(i)==','){
                res [0]="1";
            }
            else if((input.charAt(i)=='/') || (input.charAt(i)=='+')|| (input.charAt(i)=='-')|| (input.charAt(i)=='*')){
                if (res[2]==null){
                    res[2]=Character.toString(input.charAt(i));
                    j=3;
                }
                else{res [0]="1";} 
            }
            else{
                if (res[j]!=null){res[j]=res[j]+Character.toString(input.charAt(i));}
                else{res[j]=Character.toString(input.charAt(i));}   
            }
        }
        if (res[3]==null){res [0]="1";}
        scc.close();
        return res;
    }
    public static void calc (String [] inp){
        boolean err=false;
        double a=0.1,b=0.1;
        if (inp[0]=="0"){
            try {
            a = Double.parseDouble(inp[1]);
            } catch (NumberFormatException nfe) {err=true;}
            System.out.println(err);
            try {
            b = Double.parseDouble(inp[3]);
            } catch (NumberFormatException nfe) {err=true;}
            System.out.println(err);
            if (err==false){
                switch (inp[2]){
                    case "/":
                        System.out.println(String.format("%s / %s = %s",a,b,a/b));
                        break;
                    case "*":
                        System.out.println(String.format("%s * %s = %s",a,b,a*b));
                        break;
                    case "+":
                        System.out.println(String.format("%s + %s = %s",a,b,a+b));
                        break;
                    case "-":
                        System.out.println(String.format("%s - %s = %s",a,b,a-b));
                        break;
                }
            }
            else{System.out.println("Error");}
        }
        else{System.out.println("Error");}
    }



    public static void main(String[] args) throws Exception {
        // 1) Вычислить сумма чисел от 1 до n
        System.out.println("Задание 1");
        int number1=input_int();
        int sum1=0;
        int i=0;
        while (i<=number1){
            sum1=i+sum1;
            i++;
        }
        System.out.println("Ответ: "+sum1);
        // 2) Вывести все простые числа от 1 до 1000
        System.out.println("Задание 2");
        i=3;
        String res2="2";
        while (i<1000){
            res2=res2+", "+Integer.toString(i);
            i=i+2;
        }
        System.out.println(res2);
        // 3) Реализовать простой калькулятор
        calc (input_calc());
        


    }
}
