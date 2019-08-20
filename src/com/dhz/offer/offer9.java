package com.dhz.offer;

import java.util.LinkedList;

/**
 * 使用两个队列实现一个栈
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 16:46
 */
public class offer9 {

    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();


    /**
     * 入栈时，只需入队列q1即可。
     *
     * 弹栈时，需考虑两种情况。
     *
     * 1. q1 只有一个元素，出队即可。
     * 2. q1 不只一个元素，此时弹栈的数据应该为位于队尾的元素，也就是最后进入的元素。我们需要把q1 元素依次出队，保存到q2中，其中q1 的最后一个元素不入q2，直接输出。然后将队列q2 的元素再入队q1.
     *
     * @return
     */
    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public synchronized void push(int node) {
        queue1.add(node);
    }

    public synchronized int pop() {
        if (queue1.size() == 1) {
            return queue1.poll();
        } else {
            while (queue1.size() != 1) {
                queue2.add(queue1.poll());
            }
            int res = queue1.pop();

            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            return res;
        }
    }
}
