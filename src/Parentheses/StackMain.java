package Parentheses;

import java.util.ArrayList;

public class StackMain {
    public static void main(String[] args) {
        String value = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        int count = 0;

        for (int i = 0; i < value.length(); i++)
            if (value.charAt(i) != ' ')
                count++;

        String[] input = new String[count];
        char[] input1 = value.toCharArray();
        for (int i = 0; i < count; i++)
            input[i] = String.valueOf(input1[i]);

        StackImplementation stackImpl = new StackImplementation(input.length);
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < input.length; i++) {
            if (!input[i].equals(")"))
                arrayList = stackImpl.push(input[i]);
            else {
                stackImpl.pop(arrayList);
            }
        }

        if(stackImpl.isEmpty())
            System.out.println("Stack is empty: Arithmetic Expression is balanced!");
        else
            System.out.println("Stack is not empty: Arithmetic Expression is not balanced!");
    }
}
