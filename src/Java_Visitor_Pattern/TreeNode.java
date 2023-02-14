package Java_Visitor_Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeNode extends Tree{
    int i=0;
    Map<Integer, ArrayList> node = new HashMap<Integer,ArrayList>();
    TreeNode(int nodeValue, int nodeColour, int depth) {
        super(nodeValue, nodeColour, depth);
    }
    public TreeNode (Tree tree){
         AddNode(tree);
    }

    public Map<Integer, ArrayList> getNode() {
        return node;
    }

    void AddNode(Tree tree){
        if (tree.getLeftNode()!=null && tree.getRigthNode()!=null)
        {   ArrayList temp = new ArrayList<>();
            temp.add(tree.getValue());
            temp.add(tree.getColour());
            temp.add(tree.getDepth());
            node.put(i,temp);i++;}
        if (tree.getLeftNode()!=null) AddNode(tree.getLeftNode());
        if (tree.getRigthNode()!=null) AddNode(tree.getRigthNode());
    }
}
