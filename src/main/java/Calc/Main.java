package Calc;

import Calc.Advanced_Calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Calculator calculator;
        String answer;
        String result = "";
        while (true) {
            System.out.println("Do you want to use buffered Calculator?y/n");
            answer = in.nextLine();
            if (answer.toLowerCase().equals("y")) {
                calculator = new Advanced_Calculator();
                break;
            } else if (answer.toLowerCase().equals("n")) {
                calculator = new Calculator();
                break;
            } else {
                System.out.println("Wrong input, please repeat");
            }
        }

        System.out.println("Do you want to read from file? y/n");
        answer = in.nextLine();
        if (answer.toLowerCase().equals("y")) {
            //System.out.println("String");
            answer = "C:\\Users\\User1\\IdeaProjects\\Main\\src\\main\\java\\Calc\\input.txt";
            Input input = new Input();
            result = input.reader(answer);
        } else {
            if (answer.compareTo("n") != 0) {
                System.out.println("Wrong input, please repeat");
            }
        }
        int i = 1;
        String[] str = result.split(",");
        if (calculator instanceof Advanced_Calculator) {
            System.out.println("Enter operation in format:'first number' 'operation' 'second number'\n" +
                    "It's possible to enter without first number or/and operation, then it will use it's " +
                    "buffer if exists or will throw an exception.\n" +
                    "To break cycle type 'break' instead of operation");
            while (true) {
                if (result.compareTo("") == 0) {
                    answer = in.nextLine();
                } else {
                    answer = str[i];
                    i++;
                }
                if (answer.equals("break")) {
                    break;
                } else {
                    String[] array = answer.split(" ");
                    switch (array.length) {
                        case 1: {
                            System.out.println(((Advanced_Calculator) calculator).calculate(0, Integer.parseInt(array[0]), 0, true, true));
                       //    answers.add(((Advanced_Calculator) calculator).calculate(0, Integer.parseInt(array[0]), 0, true, true));
                            break;
                        }
                        case 2: {
                            Options options = new Options(array[0]);
                            int operation = options.getOperation();
                            System.out.println(((Advanced_Calculator) calculator).calculate(0, Integer.parseInt(array[1]), operation, true, false));
                        //   answers.add(((Advanced_Calculator) calculator).calculate(0, Integer.parseInt(array[1]), operation, true, false));
                            break;
                        }
                        case 3: {
                            Options options = new Options(array[1]);
                            int operation = options.getOperation();
                            System.out.println(((Advanced_Calculator) calculator).calculate(Integer.parseInt(array[0]), Integer.parseInt(array[2]), operation, false, false));
                        //  answers.add(((Advanced_Calculator) calculator).calculate(Integer.parseInt(array[0]), Integer.parseInt(array[2]), operation, false, false));
                            break;
                        }
                    }


                }
            }
        } else {
            System.out.println("Enter operation in format:'first number' 'operation' 'second number'\n" +
                    "To break cycle type 'break' instead of operation");

            while (true) {
                if (result.compareTo("") == 0) {
                    answer = in.nextLine();
                } else {
                    //   String [] str  = result.split(",");
                    answer = str[i];
                    //  System.out.print(answer);
                    i++;
                }
                if (answer.equals("break")) {
                    break;
                } else {
                    String[] array = answer.split(" ");
                    Options options = new Options(array[1]);
                    int operation = options.getOperation();
                    System.out.println(calculator.calculate(Integer.parseInt(array[0]), Integer.parseInt(array[2]), operation));
                  //  answers.add(calculator.calculate(Integer.parseInt(array[0]), Integer.parseInt(array[2]), operation));
                }

            }
        }
        System.out.println("Do you want to write results in file?y/n");
        answer = in.nextLine();

    }
}