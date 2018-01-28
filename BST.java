class BST {
	public treeNode data, left, right;

	public void makeEmpty(searchTree bst) { // construct an empty BST
		bst = null; // set the root of BST to null
	}

	public void insertNode(data x, searchTree bst) {
		if (bst == null) { // if the BST (root) is currently empty
			bst.data = x; // set the x to the root as data
			bst.left = null; // it does not have a left child, set to null
			bst.right = null; // no right child, set to null
		} else if (x < bst.data) { // if x is less than the current node data, insert node as left child
			insertNode(x, bst.left);
		} else if (x > bst.data) { // if x is greater than current node data, insert as right child
			insertNode(x, bst.right);
		}
	}

	public treeNode findNode(data x, searchTree bst) {
		if (bst == null) { // if the BST is empty, return null
 			return null;
		} else if (x == bst.data) { // check the value of root first
			return bst;
		} else if (x < bst.data) { // if the value of x is less than the current node data, search to the left
			return findNode(x, bst.left);
		} else if (x > bst.data) { // if the value of x is greater than the current node data, search to the right
			return findNode(x, bst.right);
		}
	}
}