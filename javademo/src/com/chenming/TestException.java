package com.chenming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("请输入被除数：");
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }/*catch (Exception e) {
            //InputMismatchException
            //ArithmeticException
            e.printStackTrace();
        }*/
        System.out.println("前面没有异常");
    }
}
