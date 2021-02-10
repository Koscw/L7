package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> strings =new Stack<>();
        strings.push("one ");
        System.out.println(strings.peek());
        System.out.println(strings.size());

        System.out.println(strings.pop());
        System.out.println(strings.size());

        strings.push("two");
        strings.push("three");
        System.out.println(strings);

    }
}
