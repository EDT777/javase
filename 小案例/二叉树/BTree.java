package 二叉树;


/**
 * 二叉树
 * 
 * @author hw
 *
 */
public class BTree {
	public BTreeNode root;

	public void store(Object data) {
		store(data, this.root);
	}

	/**
	 * 在保障数据有序的情况下插入数据 首先是查找，看哪个节点的数据比我们要插入的数据小(或者是大),然后找到一个是空的左（右）节点放入数据
	 * 
	 * @param data
	 */
	public void store(Object data, BTreeNode startNode) {
		int number = (Integer) data;
		int number2 = (Integer) startNode.data;
		if (number > number2) {  
			// 放到右边
			if (startNode.right == null) {
				// 直接可以放下数据了
				startNode.right = new BTreeNode(number);
			} else {
				// 说明还要往下一级查找null节点
				store(data, startNode.right);
			}
		} else {
			// 包括相等的都往左边放
			if (startNode.left == null) {
				startNode.left = new BTreeNode(data);
			} else {
				store(data, startNode.left);
			}
		}
	}

	public BTreeNode find(int num) {
		return find(num, this.root);
	}

	/**
	 * 查找元素：比较该数组是否和当前节点相同，相同则直接返回，否则往下一级查找，根据大小判断往左还是往右
	 * 
	 * @param num
	 * @param startNode
	 * @return
	 */
	public BTreeNode find(int num, BTreeNode startNode) {
		BTreeNode node = null;
		int data = (Integer) startNode.data;
		if (data == num) {
			node = startNode;
			return node;
		} else {
	
			// 分大小和左右
			if (num > data) {
				if (startNode.right != null) {
					node = find(num, startNode.right);
				}
			} else {
				if (startNode.left != null) {
					node = find(num, startNode.left);
				}
			}
		}

		return node;
	}

	public int depth() {
		return depth(this.root);
	}1

	/**
	 * 获取该树的最大深度 一个个节点遍历，分开左右，看那边的深度深就累加那边
	 * 
	 * @param startNode
	 * @return
	 */
	public int depth(BTreeNode startNode) {
		int depth = 0;
		if (startNode != null) {
			depth = 1;
		}
		int leftDepth = 0;
		int rightDepth = 0;
		if (startNode.left != null) {
			leftDepth = depth(startNode.left);
		}

		if (startNode.right != null) {
			rightDepth = depth(startNode.right);
		}

		if (leftDepth >= rightDepth) {
			depth += leftDepth;
		} else {
			depth += rightDepth;
		}

		return depth;
	}

	public void showAll() {
		showAll(this.root);
	}

	/**
	 * 输出：首先获得所有当前节点、右节点、左节点的数据，依次输出
	 * 
	 * @param node
	 */
	public void showAll(BTreeNode node) {
		if (node.left != null) {
			showAll(node.left);
		}
		System.out.println(node.data + ",");// 前序输出
		if (node.right != null) {
			showAll(node.right);
		}
	}

	public int getNodeSize(BTreeNode startNode) {
		int size = 1;
		if (startNode.left != null) {
			size += getNodeSize(startNode.left);
		}
		if (startNode.right != null) {
			size += getNodeSize(startNode.right);
		}

		return size;
	}

	/**
	 * 将当前二叉树转为数组
	 * 
	 * @return
	 */
	public Object[] toArray() {
		DataHolder holder = new DataHolder();
		holder.data = new Object[getNodeSize(this.root)];
		toArray(holder, this.root);
		return holder.data;
	}

	/**
	 * 基本思想：类似于遍历输出，左序
	 * 
	 * @param data 数据及索引
	 * @param node 起始节点
	 */
	public void toArray(DataHolder data, BTreeNode node) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			toArray(data, node.left);
		}
		data.data[data.index++] = node.data;
		System.out.println(node.data);
		if (node.right != null) {
			toArray(data, node.right);
		}

	}

	/**
	 * 定义一个类用来保存数据和当前数据操作的索引，然后利用左序遍历节点的思想输出所有内容
	 * 
	 * @author hw
	 *
	 */
	public static class DataHolder {
		public Object[] data;

		public int index;

	}

	/**
	 * 将有序数组转为有序二叉树
	 * 
	 * @param datas
	 * @return
	 */
	public static BTree sortedArrayToBTree(Object[] datas) {
		BTree btree = new BTree();
		btree.root = sortedArrayToBTree(datas, 0, datas.length - 1);

		return btree;

	}

	public static BTreeNode sortedArrayToBTree(Object[] datas, int left, int right) {
		if (left > right)
			return null; // 边界条件，注意是left>right
		int mid = (left + right) / 2;
		BTreeNode root = new BTreeNode(datas[mid]);
		root.left = sortedArrayToBTree(datas, left, mid - 1); // 递归向左探索，范围变成left~mid-1;
		root.right = sortedArrayToBTree(datas, mid + 1, right);
		return root;
	}

	/**
	 * 交换树的所有左右节点
	 */
	public void switchTree() {
		switchTree(this.root);
	}

	/**
	 * 交换树的所有左右节点
	 */
	public void switchTree(BTreeNode node) {
		BTreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		if (node.left != null) {
			switchTree(node.left);
		}
		if (node.right != null) {
			switchTree(node.right);
		}
	}
}

