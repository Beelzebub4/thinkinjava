package chapter5;

import org.junit.Test;

/**
 * 所有Book对象在当作垃圾回收之前
 * <br>都应该被check in，但是由于程序员
 * <br>的错误，有一本书未被check in
 * <br>Created by 吴海南 on 2017/3/13.
 * <br>星期一 at 11:01.
 */
public class TerminationCondition {
    class Book {
        boolean checkedOut = false;

        public Book(boolean checkOut) {
            checkedOut = checkOut;
        }

        void checkIn() {
            checkedOut = false;
        }

        protected void finalize() {
            if (checkedOut) {
                System.out.println("Error:checked out");
            }
        }
    }

    @Test
    public void terminationCondition() {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();//用于强制终结动作
    }

}
