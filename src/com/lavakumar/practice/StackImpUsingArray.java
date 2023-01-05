package com.lavakumar.practice;

import java.util.Scanner;

public class StackImpUsingArray {
    public static void main(String[] args) {
        System.out.println("enter the stack initial capacity");
        Scanner sc= new Scanner(System.in);
        Stack stack=new Stack(sc.nextInt());
        System.out.println("Stack is created with the capacity "+stack.capacity);
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.push(5);
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.push(6);
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.push(7);
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.pop();
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.pop();
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.pop();
        System.out.println(stack.top()+""+stack.isEmpty()+""+stack.size());
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
    }
}
// Implement the Stack class
class Stack {
    int[] stack;
    int stackCursor,capacity;

    public Stack (int capacity) {
        this.capacity=capacity;
        this.stack= new int[capacity];
        this.stackCursor=-1;
    }

    public boolean isEmpty() {
       return stackCursor == -1;
    }

    public int size() {
        return stackCursor +1;
    }

    public int top() {
        if(this.stackCursor ==-1){
            return -1;
        }
        return stack[stackCursor];
    }

    public void push(int element) {
        if(stackCursor <capacity-1){
            this.stack[++stackCursor]=element;
        }else{
            System.out.println("*****STACK IS FULL*****");
        }
    }

    public void pop() {
        this.stack[stackCursor--]=0;
    }

    public int capacity(){
        return this.capacity;
    }

}
