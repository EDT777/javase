package 百鸡百钱;
//一只公鸡5块钱，一只母鸡3块钱，三只小鸡一块钱
//用一百块买一百个鸡，求公鸡，母鸡，小鸡各几只
public class text {

	public static void main(String[] args) {
		//采用穷举法
		
		for(int gong=0;gong<=20;gong++) {
			for(int mu=0;mu<=33;mu++) {
				int xiao=100-gong-mu;
				double qian=gong*5+mu*3+xiao/3;
				if(qian==100) {
					System.out.println("公鸡数量:"+gong+"母鸡数量"+mu+"小鸡数量："+xiao);
				}
			}
		}
	}

}
