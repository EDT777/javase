package 小孩出圈;
//数三退一问题:有500个小孩手拉手围成一圈，从1开始数，数3小孩退出圈外，直到最后一位小孩，求最后一位小孩的序号是？
public class text {
			public static void main(String[] args) {
					boolean[] childrenStatus = new boolean[500];
					//初始化为true
					for(int i=0;i<childrenStatus.length;i++) {
						childrenStatus[i]=true;
					}
					int count = 0;//数数
					int childrenLeft = childrenStatus.length;
					int i =0;//数组下标循环变量
					while(childrenLeft>1) {
						//数数，规则是小孩必须在圈子中
						if(childrenStatus[i]) {
							count++;
							if(count%3==0) {
								childrenStatus[i]=false;
								childrenLeft--;
							}
						}
						i++;
						//回头开始数数
						if(i>=childrenStatus.length) {
							i=0;
						}
					}
					//检查最后是谁
					for(int j =0;j<childrenStatus.length;j++) {
						if(childrenStatus[j]) {
							System.out.println("最后剩下的为第"+(j+1)+"个小孩");
						}
					}
			}

}