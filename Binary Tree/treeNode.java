class treeNode {

	public treeNode parent, leftChild, rightChild;
	public int data; 

// ----------- constructors -----------
	
    // constructor for root without parent or child nodes
	public treeNode(int newData) {
		parent = null;
		leftChild = null;
		rightChild = null;
		data = newData;
	}

// ----------- setters -----------
	public void setParent(treeNode newParent) {
		parent = newParent;
	}

	public void setleftChild(treeNode newleftChild) {
		leftChild = newleftChild;
	}

	public void setrightChild(treeNode newrightChild) {
		rightChild = newrightChild;
	}

	public void setData(int newData) {
		data = newData;
	}

// ----------- getters -----------
	public treeNode getParent() {
		return parent;
	}

	public treeNode getleftChild() {
		return leftChild;
	}

	public treeNode getrightChild() {
		return rightChild;
	}

	public int getData() {
		return data;
	}
}