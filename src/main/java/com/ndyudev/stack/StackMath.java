package com.ndyudev.stack;

import java.util.Stack;

public class StackMath {
    public static void main(String[] args) {
        String math = "(((((a+b" + "))))*c-d";
        Stack<String> stack = new Stack<>();
        String charecter = null;
        int countCharecter = 0;
        for (int i = 0; i < math.length(); i++) {
            charecter = String.valueOf(math.charAt(i));
            if (charecter.equals("(")) {
                stack.push(charecter);
                countCharecter++;
                System.out.println("Đã thêm \"(\" Tổng:" + countCharecter + "\n");
            }
            if (charecter.equals(")")) {
                if(stack.isEmpty()) {
                    System.out.println("cú pháp sai");
                    return;
                }
                stack.pop();
                countCharecter--;
                System.out.println("Dã xóa");
                System.out.println("Đã xóa \"(\" Tổng:" + countCharecter + "\n");
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("cú pháp sai");
        } else {
            System.out.println("cú pháp đúng");
        }
        stack.forEach(System.out::println);
    }
}
