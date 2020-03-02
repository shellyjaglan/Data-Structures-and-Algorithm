  public TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> pre) {
        TreeNode result = buildTree(in, pre, 0, in.size()-1);
        return result;
    }

 Node buildTree(ArrayList<Integer> in, ArrayList<Integer> pre, int inStrt, int inEnd) 
{ 
    if (inStrt > inEnd) 
        return null; 

  
    TreeNode tNode = new TreeNode(pre.get(preIndex)); 
    preIndex = preIndex+1;

    if (inStrt == inEnd) 
        return tNode; 

    int inIndex = search(in, inStrt, inEnd, tNode.data); 

  
    tNode.left = buildTree(in, pre, inStrt, inIndex - 1); 
    tNode.right = buildTree(in, pre, inIndex + 1, inEnd); 

    return tNode; 
}

int search(ArrayList<Integer> arr, int strt, int end, int value) 
{ 
    int i; 
    for (i = strt; i <= end; i++) { 
        if (arr.get(i) == value) 
            break; 
    } 
    return i; 
} 