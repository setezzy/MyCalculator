package com.cal.main;

import java.util.Scanner;

/**
 * Created by Zhiyi Zhang on 2017/9/21.
 */
public class main {
    public static void main(String[] args) {
       /*if(args.length==0)
            System.out.println("No command line arguments");
       else {
           int n = Integer.parseInt(args[0]); } //获取题目数量  */
        System.out.println("输入题目数量：");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Display.display(n);

    }
}
