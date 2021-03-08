package core8HomeTaskString;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(10);
        arrayList.add(9);
        sort(arrayList);
        System.out.println("1. Array 1 - 10");
        printArray(arrayList);
        System.out.println();
        printFive(arrayList);
        System.out.println();
        printDoNotPrint7(arrayList);
        System.out.println();
        System.out.println("-----");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(1);
        arrayList2.add(5);
        arrayList2.add(4);
        arrayList2.add(3);
        arrayList2.add(8);
        arrayList2.add(7);
        arrayList2.add(6);
        arrayList2.add(10);
        arrayList2.add(9);
        arrayList2.add(11);
        arrayList2.add(12);
        arrayList2.add(13);
        arrayList2.add(14);
        arrayList2.add(15);
        arrayList2.add(16);
        arrayList2.add(17);
        arrayList2.add(18);
        arrayList2.add(19);
        arrayList2.add(20);
        sort(arrayList2);

        System.out.println("1.2. Array 1 - 20 before");
        printArray(arrayList2);
        System.out.println();
        System.out.println("Array 1 - 20 after");
        printArrayInBackwardOrder(arrayList2);

        System.out.println("-----");
        System.out.println("2. the value of one number raised to the power of another");
        printNumberRaisedToPowerOfAnother();

        System.out.println("-----");
        System.out.println("3. Fibonacci");
        printFibonacci();
    }

    static void printArray(ArrayList<Integer> arrayList) {
        for (Integer current : arrayList) {
            System.out.print(current + " ");
        }
    }
    static void printFive(ArrayList<Integer> arrayList){
            for (Integer current : arrayList) {
                if (current == 5) {
                    System.out.print("Five ");
                } else System.out.print(current + " ");
            }
    }
    static void printDoNotPrint7(ArrayList<Integer> arrayList){
            for (Integer current : arrayList) {
                if (current == 7) {
                    continue;
                } else System.out.print(current + " ");
            }
    }
    static void printArrayInBackwardOrder(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() / 2; i++) {
            Integer temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - i - 1));
            arrayList.set(arrayList.size() - i - 1, temp);
        }
        System.out.println(arrayList);
//        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
//        for (int i = arrayList.size() - 1; i >= 0; i--) {
//            revArrayList.add(arrayList.get(i));
//        }
//        System.out.println( revArrayList);
    }
    static void printNumberRaisedToPowerOfAnother() {
        int firstNumber, secondNumberPower, temp, result;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter first number");
            firstNumber = Integer.parseInt(br.readLine());
            System.out.println("Please enter second number (power)");
            secondNumberPower = Integer.parseInt(br.readLine());
            result = 1;
            temp = secondNumberPower;
            while(secondNumberPower!=0)
            {
                result = result * firstNumber;
                secondNumberPower = secondNumberPower - 1;
            }
            System.out.println(String.format("Number %d raised to the power %d equals: %d", firstNumber, temp, result));
        } catch(Exception e){
            System.out.println("You have entered not a valid Number (Expected: 1 / 2 / etc");
            e.printStackTrace();
        }
    }
    static void printFibonacci() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter N number where N is n-th Fibonacci sequence");
            int n = Integer.parseInt(br.readLine());
            int f1 = 0, f2 = 1, i;
            if (n < 1)
                return;
            System.out.print(f1 + " ");
            for (i = 1; i < n; i++) {
                System.out.print(f2 + " ");
                int next = f1 + f2;
                f1 = f2;
                f2 = next;
            }
        } catch(Exception e){
            System.out.println("You have entered not a valid Number (Expected: 1 / 2 / etc");
            e.printStackTrace();
        }
    }
}
