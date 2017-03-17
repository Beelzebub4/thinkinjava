package util;

/**
 * 生成简单的整数序列
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 10:55.
 */
public class Range {
    //生成一组序列[0...n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    //生成一组序列[start...end)
    public static int[] range(int start, int end) {
        int sz = end = start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = i;
        return result;
    }

    //生成一组序列[start...end) 根据step增长
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }
}
