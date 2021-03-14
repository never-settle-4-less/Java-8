class BinaryTree {
  Node root;
  
  public void traverseTree(Node node) {
      if (node != null) {
        traverseTree(node.left);
        System.out.print(" " + node.data);
        traverseTree(node.right);
      }
  }

  public void addNode(int data){
    
  }

}

