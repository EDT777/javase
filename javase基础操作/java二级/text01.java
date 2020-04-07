package java二级;

import java.util.Random;

public class text01
{
   public static void main(String args[]){
      Random random = new Random();
      float x = random.nextFloat();//产生0.0与1.0之间的一个符点数
      int n = Math.round(20*x);  //构造20以内的一个整数
      long f = 1 ;  //保存阶乘的结果
      int k = 1 ;  //循环变量
   //*********Found********
      do{f*=k;//考
         k++;
   //*********Found********
      }while(n>=k) ;	//考  
      System.out.println(n+"!= "+f);
   }
}