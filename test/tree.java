package test;

public class tree {
	
	Node root;
	
	public void inorder(Node focusNode) {
		
		if(focusNode != null) {
			
			inorder(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inorder(focusNode.rightChild);
			
		}
		
		
	}
	
	public void preorder(Node focusNode) {
		
		if(focusNode != null) {
			System.out.println(focusNode);
			preorder(focusNode.leftChild);
			preorder(focusNode.rightChild);
		}
		
	}
	
	public void postorder(Node focusNode) {
		
		if(focusNode!= null) {
		postorder(focusNode.leftChild);
		postorder(focusNode.rightChild);
		System.out.println(focusNode)c ;
		
		}
	}
	
	public void addNode(int key,String name) {
		
		Node NewNode = new Node(key , name);
		
		if(root == null) {
			root = NewNode;
		}else {
			
			Node focusNode = root;
			Node parent;
			
			while(true) {
				
				parent = focusNode;
				
				if(key<focusNode.key) {
					
					 focusNode = focusNode.leftChild;
					 if(focusNode == null) {
						 parent.leftChild =NewNode;
						 return;
					 }
					
				}else {
					focusNode = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = NewNode;
						return;
					}
				}
				
			}
			
			
			
		}
		
		
	}
	
	public Node findNode(int key) {
		Node focusNode  = root;
		
		while(focusNode.key != key) {
			
			if(key < focusNode.key) {
				
				focusNode = focusNode.leftChild;
				
			}else {
				
				focusNode = focusNode.rightChild;
				
				
				
			}
			if(focusNode == null) {
				return null;
			}
			
		}
		
		
		
		return focusNode;
	}
	
	
	public static void main(String args[]) {
		
		tree t = new tree();
		t.addNode(3,"a");
		t.addNode(2,"b");
		t.addNode(6, "c");
		
		t.inorder(t.root);
		t.preorder(t.root);
		System.out.println(t.findNode(2));
		
		
		
	}


}


class Node{
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	
	Node(int key,String name){
		
		this.key = key;
		this.name = name;
		
	}
	
	public String toString()
	{
		return name +" has key "+ key; 
	}
}
