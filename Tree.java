class Tree {
	public Object data;
	public treeNode left, right;

	public treeNode(Object newItem) { // constructor for a new tree node (root)
		data = newItem;
		left = null;
		right = null;
	}

	public treeNode(Object newItem, treeNode newLeft, treeNode newRight) { // constructor for any normal node
		data = newItem;
		left = newLeft;
		right = newRight;
	}

	// setters
	public void setData(Object newItem) {
		data = newItem;
	}

	public void setLeft(treeNode newLeft) {
		left = newLeft;
	}

	public void setRight(treeNode newRight) {
		right = newRight;
	}

	// getters
	public Object getData() {
		return data;
	}

	public treeNode getLeft() {
		return left;
	}

	public treeNode getRight() {
		return right;
	}

    // initialise a tree object 
	//print(tree.data); // print the data of the root node
	//tree = tree.left // move to the left child of the root
	//print(tree.data) // print the data of the left child
	//tree = tree.right // move to the right child 
	//print(tree.data) // print the data of the right child of the left parent

	public Object initialise() { // create an empty tree
		return null;
	}

	public boolean isEmpty(treeNode t) { // check whether a tree is empty
		return (t == null);
	}

	public Tree combine(Tree left, Tree right) {
		t = null; // set the root to null
		setLeft(l);
		setRight(r);
		return t; // return the full tree once combined
	}

	public void preOrder(Tree t) {
		print(t.data); // print root first
		preorder(t.left);
		preorder(t.right);
	}

	public void inOrder(Tree t) {
		inorder(t.left);
		print(t.data); // print root in between
		inorder(t.right);
	}

	public void postOrder(Tree t) {
		postorder(t.left);
		postorder(t.right);
		print(t.data); // print root last
	}

}