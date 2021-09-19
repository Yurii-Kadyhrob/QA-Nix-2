package com.nixsolutions;

public class TaskOne {                  //class //test123

    public void pupAge(){           //method
        String home = "1w4tt!7";
        int numbers = Integer.parseInt(home.replaceAll("[^0-9]", ""));
        int a = numbers;    //147
        int b = 0;
        while (a > 0) {
            b = b + a % 10;    //b=14+
            a = a / 10;         //целочисленное, остаток от деления на 10 a = 7

        }
        System.out.println(b);
    }

    public static void main(String args[]){
        TaskOne test = new TaskOne();               //без этой конструкции не работает, но я не до конца понимаю почему((
        test.pupAge();
    }
}
