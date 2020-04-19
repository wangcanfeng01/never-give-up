package com.github.wangcanfeng01.freedom.ragnaros;

/**
 * 功能说明：两个有序数组合并
 * Created in 2020/4/16-19:52
 *
 * @author wangcanfeng
 * @since 2.0.0
 */
public class JointTwoArray {

    static int num = 10;
    static int[] data1 = new int[num];
    static int[] data2 = new int[num];

    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            data2[i] = i;
        }
        for (int i = 0; i < num; i++) {
            data1[i] = 2 * i+1;
        }
        int[] data3 = new int[2 * num];
        int index3 = 0;
        int index2 = 0;
        int index1 = 0;
        for (; index1 < num; ) {
            int temp = data1[index1];
            for (int j = index2; j < num; j++) {
                if (temp > data2[j]) {
                    temp = data2[j];
                    index2++;
                }
            }
            if(temp==data1[index1]){
                index1++;
            }
            data3[index3] = temp;
            index3++;
        }
        for (int i = index2; i < num; i++) {
            data3[i + num] = data2[i];
        }
        for (int i = 0; i < 2 * num; i++) {
            System.out.println(data3[i]);
        }
    }


}

