package com.cal.main;

/**
 * Created by Zhiyi Zhang on 2017/9/23.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cal.calculate.NewCalculate;
import com.cal.calculate.Simplify;
import com.cal.create.CreateExp;

public class Display {
    public static void display(int num){
        String ans=null;
        int cnt_right=0;
        int i;
        List<String> expression = new ArrayList<>();
        List<String> result = new ArrayList<>();
        System.out.println("本次共"+num+"题，满分"+num*10+"分");
        String exp;
        for(i=0;i<num;i++){
            do {
                exp = CreateExp.exp((int) ((Math.random() * 100) % 4 + 3));  //运算符数目在[3,6]范围内
                ans = NewCalculate.newcalculate(exp);
            }while(ans.contains("-"));
            expression.add(exp);
            System.out.println("第" + (i + 1) + "道题：" + exp);
            Scanner scanner = new Scanner(System.in);
            String input;
            while(true) {
                try {
                    input = scanner.nextLine();           //读取用户输入
                    if (input.matches("^[A-Za-z]+$")) throw new Exception();
                }catch (Exception e){
                    System.out.println("请重新输入");
                    continue;
                }
                break;

            }
            ans = Simplify.gcd(ans);
            result.add(ans);
            if(input.equals(ans)){
                System.out.println("正确！");
                cnt_right+=1;
            }
            else{
                System.out.println("错误！正确答案=" + ans);
            }
        }
        if(i==num){
            System.out.println("本次得分：" + cnt_right * 10 + "分");
        }

    }
}
