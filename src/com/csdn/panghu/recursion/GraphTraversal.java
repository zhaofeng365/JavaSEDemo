package com.csdn.panghu.recursion;


import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @Description:  [ͼ�����㷨����Ҫ��DFS���еĵݹ��㷨]
 * @Author:       [�ֻ�]   
 * @CreateDate:   [2014-4-1 ����5:58:33]
 * @CsdnUrl:      [http://blog.csdn.net/ljphhj]
 * 
 * 
 * ���룺 graphΪ������ ͼ�� ʾ��������ͼ���ڽӾ���
 * �����
 *  ͼ����ȱ���
	A����(V0)�������ˣ�
	B����(V1)�������ˣ�
	E����(V4)�������ˣ�
	D����(V3)�������ˣ�
	C����(V2)�������ˣ�
	ͼ�Ĺ�ȱ���
	A����(V0)�������ˣ�
	B����(V1)�������ˣ�
	D����(V3)�������ˣ�
	E����(V4)�������ˣ�
	C����(V2)�������ˣ�
 */


class Graph{
	String[] Vexs;
	int[][] Edges;
	int VexsLen;
	public Graph(String[] vexs, int[][] edges) {
		super();
		Vexs = vexs;
		Edges = edges;
		VexsLen = vexs.length;
	}
}
public class GraphTraversal {
	
	public static void main(String[] args) {
		
		/*ͼ�ĳ�ʼ��: ����ѡȡһ��������ͼ3�е�����ͼ������*/
		String[] vexs = new String[5];
		for (int i=0; i<5; ++i){
			vexs[i] = (char)('A' + i ) + "����(V" + i + ")";
		}
		int[][] edges = new int[][]{
			{0,1,0,1,0},
			{1,0,0,0,1},
			{0,1,0,1,0},
			{1,0,0,0,0},
			{0,0,0,1,0}
		};
		Graph graph = new Graph(vexs, edges);
		
		/*ͼ����ȱ���(�ݹ�)*/
		System.out.println("ͼ����ȱ���");
		DFSTraversal(graph);
		
		
		/*ͼ�Ĺ�ȱ���(�޹صݹ�,����Ȼ�漰��ͼ������Ҳд��)*/
		System.out.println("ͼ�Ĺ�ȱ���");
		BFSTraversal(graph);
		
	}
	
	public static void DFSTraversal(Graph graph){
		/*��ʼ��visited[]����*/
		boolean[] visited = new boolean[graph.VexsLen];
		for (int i=0; i<graph.VexsLen; ++i){
			visited[i] = false;
		}
		
		/*��ȱ���*/
		for (int i=0; i<graph.VexsLen; ++i){
			if (!visited[i]){
				DFS(graph, i, visited);
			}
		}
	}
	
	/**
	 * 
	 * @param graph ͼ����
	 * @param i		Ҫ���ʵĶ����±�i
	 */
	public static void DFS(Graph graph, int i, boolean[] visited){
		/*���ʸö���*/
		visitedMethod(graph,i);
		/*���ó��ѷ���*/
		visited[i] = true;
		for (int k=0; k<graph.VexsLen; ++k){
			/*Ѱ�һ�û�б����ʹ����ڽӵ�*/
			if (graph.Edges[i][k] == 1 && !visited[k]){
				DFS(graph, k, visited);
			}
		}
		
	}
	
	public static void BFSTraversal(Graph graph){
		/*��ʼ��visited[]����*/
		boolean[] visited = new boolean[graph.VexsLen];
		for (int i=0; i<graph.VexsLen; ++i){
			visited[i] = false;
		}
		
		/*��ȱ���,Ѱ��Դ��*/
		for (int i=0; i<graph.VexsLen; ++i){
			if (!visited[i]){
				BFS(graph,i,visited);
			}
		}
	}
	
	public static void BFS(Graph graph, int i,boolean[] visited){
		if (graph.VexsLen < 0)
			return ;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(i);	//��Դ����±�i���뵽������
		
		while (!queue.isEmpty()){
			int index = queue.remove();
			visitedMethod(graph, index);
			visited[index] = true;	//�����±�index�Ķ���Ϊ�ѷ��ʹ�
			for (int k=0; k<graph.VexsLen; ++k){
				/*Ѱ�һ�û�б����ʹ����ڽӵ�*/
				if (graph.Edges[index][k] == 1 && !visited[k]){
					queue.add(k);	//�ö����±���뵽������
				}
			}
		}
		
	}
	
	
	public static void visitedMethod(Graph graph, int i){
		System.out.println(graph.Vexs[i] + "�������ˣ�");
	}
}
