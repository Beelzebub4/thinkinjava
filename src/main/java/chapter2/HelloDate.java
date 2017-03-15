package chapter2;

import org.junit.Test;
import java.util.Date;

/**
 * 第一个java程序<br>
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 11:27.
 */
public class HelloDate {

    @Test
    public void helloData(){
        System.getProperties().list(System.out);//环境信息
        System.out.println(System.getProperty("user.name"));//用户名
        System.out.println(System.getProperty("java.library.path"));//library路径
        System.out.println("Hello! it's:"+new Date());
    }
}
