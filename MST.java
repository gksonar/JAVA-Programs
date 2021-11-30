/*
    Assignment : Find Minimum Spanning Tree Using Prims ALgorithm.
    Name: Gaurav Sonar 
    Roll no: 223083                 Gr no: 22020272
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class MST {
	private static final int V = 5;
	int minkey(int k[], Boolean set[])
	{
		
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < V; v++)
			if (set[v] == false && k[v] < min) {
				min = k[v];
				min_index = v;
			}
		return min_index;
	}
	
	void print(int root[], int g[][])
	{
		System.out.println("Edges \t\t Weight");
		for (int i = 1; i < V; i++)
			System.out.println(root[i] + " - " + i + "\t\t" + g[i][root[i]]);
	}

	void prims(int g[][])
	{
		int root[] = new int[V];
		int k[] = new int[V];
		Boolean set[] = new Boolean[V];
		for (int i = 0; i < V; i++) {
			k[i] = Integer.MAX_VALUE;
			set[i] = false;
		}

			k[0] = 0; 
		    root[0] = -1;  
			for (int count = 0; count < V - 1; count++) {
			int u = minkey(k, set);
			set[u] = true;
			for (int v = 0; v < V; v++)
				if (g[u][v] != 0 && set[v] == false && g[u][v] < k[v]) {
					root[v] = u;
					k[v] = g[u][v];
				}
		}
		print(root, g);
	}

	public static void main(String[] args)
	{

		MST ms = new MST();
		int g[][] = new int[][] {{0,1,3,0,0 },{1,0,0,4,0},{3,0,0,0,5},{0,4,0,0,5},{0,0,2,5,0}};

		ms.prims(g);
	}
}

/*INPUT DIAGRAM
               3
        1 -----------3
        |           |
    1   |           |   2
        |           |
        2           5
        |       /
    4   |   /   5    
        |/
        4
        
*/
/*
OUTPUT
        
        
Edges 		 Weight
0 - 1		1
0 - 2		3
1 - 3		4
2 - 4		2


*/
