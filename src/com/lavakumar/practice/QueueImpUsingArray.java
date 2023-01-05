package com.lavakumar.practice;

import java.util.Scanner;

public class QueueImpUsingArray {
    public static void main(String[] args) {
        System.out.println("enter the Queue initial capacity");
        Scanner sc= new Scanner(System.in);
        Queues que=new Queues(sc.nextInt());
        System.out.println("Stack is created with the capacity "+que.capacity);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(6);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(7);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.pop();
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.pop();
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.pop();
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
        System.out.println(que.front()+"--"+""+que.back()+""+que.isEmpty()+""+que.size());
        que.push(5);
    }
}
class Queues{
    int[] queue;
    int capacity,front,rear;
    Queues (int capacity) {
        this.capacity=capacity;
        queue = new int[this.capacity];
        front=-1;rear=-1;
    }

    boolean isEmpty() {
        return front==rear;
    }

    int size() {
        if(rear==front){
            return 0;
        } else if(front==-1){
            return rear+1;
        }else{
           return  (this.capacity-1)-front+(rear==-1?0:rear+1);
        }
    }

    int front() {
        if(front==-1){
            return -1;
        }
        return queue[front+1];
    }

    int back() {
        if(rear==-1){
            return -1;
        }
        return queue[rear];
    }

    void push(int element) {
        if(this.rear==this.capacity-1){
            this.rear=-1;
        }
        if(rear<=front){
            queue[++rear]=element;
        } else if (rear<this.capacity-1 && front<=rear) {
            queue[++rear]=element;
        }else {
            System.out.println("****QUEUE IS FULL*******");
        }
    }

    void pop() {
        if(this.size()!=0){
            if(front==this.capacity-1){
                this.front=-1;
            }
            queue[++front]=0;
        }
    }
}