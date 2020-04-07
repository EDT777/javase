package 二叉树;
//使用Java代码实现将有序二叉树转为有序数组及将有序数组转为有序二叉树。
//提示，转数组第一步我们需要实现求二叉树的总节点数。
import java.util.*;
public class text {

	public static void main(String[] args) {
		
	}
//基本思想，遍历输出，左序
	//data 数据以及索引
	//node 起始节点
	public void toArray(DataHolder data,BTreeNode node) {
		if(node==null) {
			return;
		}
		if(node.left!=null) {
			toArray(data,node.left);
		}
		data.data[data.index++]=node.data;
		System.out.println(node.data);
		if(node.right!=null) {
			toArray(data,node.right);
		}
	}
	//定义一个类用来保存数据和当前数据操作的索引。然后利用左序遍历节点的思想输出所有内容
	public static class DataHolder{
		public Object[]data;
		public int index;
	}
	//将有序数组转化为有序二叉树
	public static BTree sorteArrayToBTree(Object[] datas) {
		BTree btree =new BTree();
		btree.root =sorteArrayToBTree(datas,0,datas.length-1);
		return btree;
		
	}
	public static BTreeNode sortedArrayToBTree(Object[] datas,int left,int right) {
		if(left>right) {
			return null;//边界条件
		}
		int mid =(left+right)/2;
		BTreeNode root = new BTreeNode(datas[mid]);//递归向左探索，范围变成Left~mid-1
		root.left =sortedArrayToBTree(datas,left,mid-1);
		root.right =sortedArrayToBTree(datas,mid+1,right);
		return root;
		
		
	}
}
