package sstringTokenizer;

import java.util.StringTokenizer;
public abstract class text {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java is a powerful programming languange,it's simple,fast,robust!||Most of all,it's widely used by the programers all arounds the world.",", .'");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}

}
