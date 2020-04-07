package 小孩出圈;
////数三退一问题:有500个小孩手拉手围成一圈，从1开始数，数3小孩退出圈外，直到最后一位小孩，求最后一位小孩的序号是？
public class text2 {

	public static void main(String[] args) {
			boolean[] xiaoHai = new boolean[500];
			for(int i=0;i<xiaoHai.length;i++) {
				xiaoHai[i]=true;//遍历全部为true 都在圈内
			}
			int zongShu =500;//当前有500个小孩在圈内
			int count =0;//数数
			int i=0;//从第0个小孩开始判断是否出圈
			//圈内还有小孩的时候进行遍历 让小孩出圈
			while(zongShu>1) {
				if(xiaoHai[i]) {
					count++;//数数
					if(count%3==0) {
						xiaoHai[i]=false;//让小孩出圈
						zongShu--;//出圈一个小孩总数就少一个
					}
				}
				i++;//遍历下标接着往后判断
				
				if(i>xiaoHai.length-1) {
					i=0;//i超过了最大下标就重新来一遍遍历判断是否还有没出圈的小孩
				}
			}
			for(int i1=0;i1<xiaoHai.length;i1++) {
				if(xiaoHai[i1]) {
					System.out.println("最后小孩为第"+(i1+1)+"个");
				}
			}
			
	}

}
