package 二叉树;

/**
 * 二叉树树的节点
 * 
 * @author hw
 *
 */
public class BTreeNode {
	public BTreeNode left;

	public BTreeNode right;

	public Object data;

	public BTreeNode() {

	}

	public BTreeNode(Object data, BTreeNode left, BTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;

	}

	public BTreeNode(Object data) {
		this.data = data;

	}

	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}
