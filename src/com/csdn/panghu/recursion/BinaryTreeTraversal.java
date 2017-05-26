package com.csdn.panghu.recursion;


/**
 * 
 * @Description:  [�ݹ鷽ʽ�������������ֱ���]
 * @Author:       [�ֻ�]   
 * @CreateDate:   [2014-4-1 ����12:29:35]
 * @CsdnUrl:      [http://blog.csdn.net/ljphhj]
 * 
 * 
 *  ��������
 *  ǰ�������
	0 1 3 7 8 4 2 5 6 
	���������
	7 3 8 1 4 0 5 2 6 
	���������
	7 8 3 4 1 5 6 2 0 
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
public class BinaryTreeTraversal {
	public static void PreOrderTraversal(TreeNode root){
		/*�ݹ��������*/
		if (root == null)
			return ;
		System.out.print(root.val + " ");
		/*�ݹ����*/
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
	}
	public static void InOrderTraversal(TreeNode root){
		/*�ݹ��������*/
		if (root == null)
			return ;
		
		/*�ݹ����*/
		InOrderTraversal(root.left);
		System.out.print(root.val + " ");
		InOrderTraversal(root.right);
	}
	public static void PostOrderTraversal(TreeNode root){
		/*�ݹ��������*/
		if (root == null)
			return ;
		
		/*�ݹ����*/
		PostOrderTraversal(root.left);
		PostOrderTraversal(root.right);
		System.out.print(root.val + " ");
	}
	public static void main(String[] args) {
		//��ʼ��һ�ö�����, ��Ӱ��ݹ��˼�룬�ɺ���
		TreeNode[] nodes = new TreeNode[9];
		for (int i=8; i>=0; --i){
			nodes[i] = new TreeNode(i);
			if (2*i + 1 > 8){
				nodes[i].left = null;
				nodes[i].right = null;
			}else{
				nodes[i].left = nodes[2*i+1];
				if (2*i + 2 > 8){
					nodes[i].right = null;
				}else{
					nodes[i].right = nodes[2*i+2];
				}
			}
		}
		System.out.println("ǰ�������");
		PreOrderTraversal(nodes[0]);
		System.out.println("\n���������");
		InOrderTraversal(nodes[0]);
		System.out.println("\n���������");
		PostOrderTraversal(nodes[0]);
	}
}
