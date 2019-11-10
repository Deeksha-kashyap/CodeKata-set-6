import java.util.*;

class BinaryTree 
{
	public static void AncestorMatrix(int arr[][],int n,Node root)
	{
       if(root==null)
		   return;
	   AncestorMatrix(arr,n,root.left);
	   AncestorMatrix(arr,n,root.right);
	   if(root.left!=null)
		{
		   arr[root.data][root.left.data] = 1;
		   for(int i=0;i<n;i++)
			{
			   if (arr[root.left.data][i] == 1) 
                arr[root.data][i] = 1; 
			}
		}
		 if (root.right != null) 
        { 
            arr[root.data][root.right.data] = 1; 
              
            for (int i = 0; i < size; i++) 
            { 
                if (arr[root.right.data][i]==1) 
                arr[root.data][i] = 1; 
            } 
        } 
	}
	public static void main(String[] args) 
	{
		Node tree_root = new Node(5); 
        tree_root.left = new Node (1); 
        tree_root.right = new Node(2); 
        tree_root.left.left = new Node(0); 
        tree_root.left.right = new Node(4); 
        tree_root.right.left = new Node(3); 
		 int n = 6; 
        int arr[][]=new int[n][n]; 
          
        ancestorMatrix(arr,n,tree_root); 
          
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print(arr[i][j]+" "); 
            } 
            System.out.println(); 
        } 
    }
    static class Node  
    { 
        public int data ; 
        public Node left ,right; 
        public Node (int data) 
        { 
            this.data = data; 
            this.left = this.right = null; 
        } 
    } 
	
}
