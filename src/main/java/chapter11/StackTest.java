package chapter11;

import java.util.Stack;

import static util.Print.printnb;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 11:17.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        for(String s:"My dog is fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            printnb(stack.pop()+" ");
    }
}
