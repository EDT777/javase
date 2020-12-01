package 第二阶段.day04;
/*
需求：定义一个ClothType枚举类，表示衣服分类的三种情况：男装、女装、中性服装

并在测试类中获取枚举中的常量对象，并调用枚举中的name、ordinal方法。
 */
public class test5 {
    public static void main(String[] args) {
        System.out.println("序号1对应的服装类是:"+ClothType.name(1));
        System.out.println("女装对应的序号是"+ClothType.ordinal("女装"));
    }

}

enum ClothType{
    AKA("男装",1),AKB("女装",2),AKC("中性风",3);

    private String name;
    private int code;


        ClothType(String name,int code){
        this.name=name;
        this.code=code;
    }
    //定义方法
   static String name(int code){
        for (ClothType a :ClothType.values()){
            if (  code==a.getCode()){
                return a.getName();
            }
        }
        return null;
    }
   static int ordinal(String name){
            for (ClothType c : ClothType.values()){
                if(c.getName()==name){
                    return c.getCode();
                }
            }
            return -1;
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
