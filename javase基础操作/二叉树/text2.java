package 二叉树;
//实现二叉树倒序功能，以及交换所有二叉树的左右节点
public class text2 {
		public void switchTree(BTreeNode node) {
			BTreeNode temp=node.left;
			node.left = node.right;
			node.right = temp;
			if(node.left!=null) {
				switchTree(node.left);
			}
			if(node.right!=null) {
				switchTree(node.right);
			}
		}
}
