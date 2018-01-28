class BSTtest {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();

		bt.addNode(15);
        bt.addNode(5);
        bt.addNode(2);
        bt.addNode(9);
        bt2.addNode(2);
        bt2.addNode(20);
        bt2.addNode(25);
        bt2.addNode(6);

        BinaryTree bt3 = BinaryTree.constructNew(bt, bt2, new treeNode(20));

        System.out.println("Post order traversal"); 
        bt3.postOrder(bt3.root); 
        System.out.println("\n" + "In order traversal");
        bt3.inOrder(bt3.root);
        System.out.println("\n" + "Pre order traversal");
        bt3.preOrder(bt3.root);
	}
}