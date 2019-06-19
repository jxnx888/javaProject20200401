package com.myproject190414.util;

/**
 * *****************************************************************************************
 *
 * @ClassName DisplacementOperation
 * @Author: cjc
 * @Descripeion TODO
 * @Date： 2019/6/19 10:55:40
 * @Version 1.0
 * <p>
 * <p>
 * Version    Date                ModifiedBy                 Content
 * --------   ---------           ----------                -----------------------
 * 1.0.0       10:55:402019/6/19     cjc                       初版
 * ******************************************************************************************
 */
public class DisplacementOperation {
    public static boolean JudgingParity(int a) {
        // 位移操作符判断是否是奇数偶数
        int i = a & 1;
        return i == 1;
    }
    private static void System(boolean b1,int b) {
        if(b1){
            System.out.println(b+" 是奇数 = " + b1);
        }else {
            System.out.println(b+" 是偶数 = " + b1);
        }
    }
    public static void main(String[] args) {
        int b = 6;
        System(JudgingParity(b),b);
        b = 7;
        System(JudgingParity(b),b);
        //交换两数
        int c = 1;
        int d = 2;
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("d = " + d + "  c = " + c);
        d = 2 << 2;
        System.out.println("d = " + d);
        d = 16 >>> 2;
        System.out.println("d = " + d);

    }

}
