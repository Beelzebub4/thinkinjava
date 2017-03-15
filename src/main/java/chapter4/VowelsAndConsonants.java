package chapter4;

import org.junit.Test;

import java.util.Random;

/**
 * 随机生成字母 判断是原音还是辅音
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 9:45.
 */
public class VowelsAndConsonants {

    @Test
    public void vowelsAndConsonants() {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonants");
            }
        }
    }
}
