package 监狱;
//100个牢房有100个犯人，释放部分犯人，每个犯人依次操作依次自己的序号整数倍的牢房锁，原来锁为打开则关闭，否则打开
public class textt {

	public static void main(String[] args) {
		int lockCount = 100;
		//初始化所有的锁，0表示关闭，1表示打开
		int[] allLocks = new int[lockCount];
		//依次操作锁
		for(int i=1;i<=lockCount;i++) {
			for(int j=i;j<=lockCount;j=j+i) {
				allLocks[j-1]=allLocks[j-1]==0?1:0;
			}
		}
		//输出锁的状态
		for(int i=1;i<=allLocks.length-1;i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(allLocks[i]+"\t");
		}
	}

}
