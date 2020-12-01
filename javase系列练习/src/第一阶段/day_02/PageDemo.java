package 第一阶段.day_02;

public class PageDemo {


    //（2）一共有55条数据,每页显示10条数据,当前页为2，请求出下一页
    public static void main(String[] args) {
        int data = 55;
        int pageData = 10;
        int currentPage;
        int pageTotal;
        if((data%pageData)!=0){
            pageTotal=(data/pageData)+1;
        }else {
            pageTotal = data/pageData;
        }
        System.out.println("总页数为:"+pageTotal);
        //（1）一共有55条数据,每页显示10条数据,当前页为2，请求出上一页
        currentPage=2;
        System.out.println("当前页为:"+currentPage);
        currentPage= (currentPage == 1) ? 1 :(currentPage -1);
        System.out.println("上一页为"+currentPage);
        //（2）一共有55条数据,每页显示10条数据,当前页为2，请求出下一页
        currentPage=2;
        currentPage= (currentPage == pageTotal) ? 1 :(currentPage +1);
        System.out.println("下一页为:"+currentPage);
    }
}
