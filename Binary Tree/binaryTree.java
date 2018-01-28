class BinaryTree {
	treeNode root; // create variable root of treeNode type

    public BinaryTree() {
    	root = null; // set root to null when constructor is called
    }

    // return true if the tree is empty, false otherwise
	boolean isEmpty() {
		return (root == null); // return true if root is null, else return false
	}
  
    // traverse the tree using pre order traversal
	void preOrder(treeNode newTree) {
		if (newTree != null) { // as long as the tree is not empty, this condition is satisfied
			System.out.println(newTree.getData());
			preOrder(newTree.getleftChild());
			preOrder(newTree.getrightChild());
		}
	}
    
    // traverse the tree using in order traversal
	void inOrder(treeNode newTree) {
		if (newTree != null) { // as long as the tree is not empty, this condition is satisfied
			inOrder(newTree.getleftChild());
			System.out.println(newTree.getData());
			inOrder(newTree.getrightChild());
		}
	}

	// traverse the tree using post order traversal
	void postOrder(treeNode newTree) {
		if (newTree != null) { // as long as the tree is not empty, this condition is satisfied
		postOrder(newTree.getleftChild());
		postOrder(newTree.getrightChild());
		System.out.println(newTree.getData());
	    }
	}

    // method to add a node to the tree
	public void addNode(int data) {

		treeNode newNode = new treeNode(data); // create a new treenode object

		if (root == null) { // if the tree is empty, make a node for the root
			root = newNode;
		} else {
			treeNode currentNode = root; // start from the root
			treeNode parentNode;

			while(true) { // infinite loop
				parentNode = currentNode; // set parentNode
			
			if (data < currentNode.data) { // if data is less than data in current node, go to the left
				currentNode = currentNode.leftChild; // current node becomes left child
			
			if (currentNode == null) { // if left child has no children, add a node to the left
				parentNode.leftChild = newNode;
				break; // break out of while loop
			}} else { // if data is greater than data in current node, go to the right
				currentNode = currentNode.rightChild; // current node becomes right child

		    if (currentNode == null) { // if right child has no children, add a node to the right
		    	parentNode.rightChild = newNode;
		    	break; // break out of while loop
		    }
			}
			}
		}
        }

public static BinaryTree constructNew(BinaryTree t1, BinaryTree t2, treeNode newNode) {
	BinaryTree binT = new BinaryTree();

	binT.root = newNode; // set root of the new tree to the parsed in parameter

	binT.root.setleftChild(t1.root); // set left child of new tree to root of tree t1
	binT.root.setrightChild(t2.root); // set right child of new tree to root of tree t2

	t1.root = null; // empty tree t1
	t2.root = null; // empty tree t2

	return binT; // return the new tree
}
}