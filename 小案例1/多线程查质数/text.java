package 多线程查质数;

import java.util.ArrayList;
import java.util.List;

//查找2-100000内所有质数，并存储到一个集合中(答案一共有9592个，从2开始计算)
public class text {
	
	//最大要判断的数字
	public static final int MAX_NUMBER=100000;
	//使用多少个线程
	public static final int THREAD_COUNT =4;
	//判断一个数是否为质数
	public static boolean isPrime(int num) {
		if(num==2) {
			return true;
		}
		boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime =false;
				break;
			}
		}
		return isPrime;
	}
	//计算线程
	public static class PrimeCalculator extends Thread{
		//实例化线程并启动
		private int startNumber;//startNumber 开始计算的数字
		private int stopNumber;//stopNumber 终止计算的数字
		private List primes = new ArrayList();
		public PrimeCalculator(int startNumber,int stopNumber) {
			this.startNumber=startNumber;
			this.stopNumber=stopNumber;
			this.start();
		}
		
		public void run() {
			for(int i=startNumber;i<=stopNumber;i++) {
				if(isPrime(i)) {
					primes.add(i);
				}
			}
		}
		
		public List getPrimes() {
			return primes;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//main方法负责根据thread的个数分配任务范围
		int[] startNumber = new int[THREAD_COUNT];
		int[] stopNumber = new int[THREAD_COUNT];
		//任务均分到多个线程
		for(int i=0;i<THREAD_COUNT;i++) {
			startNumber[i]=MAX_NUMBER/THREAD_COUNT*i;
			stopNumber[i]=MAX_NUMBER/THREAD_COUNT*(i+1)-1;
		}
		startNumber[0]=2;
		stopNumber[THREAD_COUNT-1]=MAX_NUMBER;
		//启动线程计算
		PrimeCalculator[] threads = new PrimeCalculator[THREAD_COUNT];
		for(int i=0;i<THREAD_COUNT;i++) {
			threads[i]=new PrimeCalculator(startNumber[i],stopNumber[i]);
		}
		//等待所有计算
		boolean isEnd =false;
		while(!isEnd) {
			Thread.sleep(10);
			isEnd=true;
			for(Thread th:threads) {
				if(th.isAlive()){
					isEnd=false;
				}
			}
		}
		
		//合并所有结果
		List allPrimes = new ArrayList<>();
		for(int i=0;i<threads.length;i++) {
			allPrimes.addAll(threads[i].getPrimes());
		}
		System.out.println(allPrimes.size());
	}
	
}
