package java二级;

import java.awt.*;
import java.applet.*;

//*********Found********
public class text02 extends Applet//考
{
    TextArea outputArea;

    public void init()
    {
        setLayout(new BorderLayout());
        outputArea = new TextArea();
     //*********Found********
        add( outputArea );//考

      // 计算0至10的阶乘
        for ( long i = 0; i <= 10; i++ )
            //*********Found********
            outputArea.append(i + "! = " + factorial(i) + "\n" );//考
    }
   
   // 用递归定义阶乘方法
    public long factorial( long number )
    {                  
        if ( number <= 1 )  // 基本情况
            return 1;
        else
            //*********Found********
            return number * factorial( number - 1 );//考
    }  
}
