public class test9 {
    //10.叩丁狼在中秋节组织了一次吃月饼大赛, 两个人(老钟和老李) 吃20个月饼,
    // 规则是谁吃得多谁赢,打印出比赛结果是, 如: 老钟肚子大,老钟胜出,共吃了15个!
    public static void main(String[] args) {
            xian x1 =new xian();
            xian x2 =new xian();
            x1.setName("老钟");
            x2.setName("老李");
            x1.start();
            x2.start();
    }
}
class xian extends Thread{
    static int bin =20;
    int num=0;
    public void run(){
        for (int i=0;i<20;i++){
            if(bin>0) {
                System.out.println(super.getName() + "吃了编号" + bin-- + "月饼");
                num++;
            }
        }
        if(num>10){
            System.out.println(super.getName()+"肚子大,"+super.getName()+"胜出,共吃了"+num+"个");
        }else if(num==10){
            System.out.println("打平");
        }
    }
}
