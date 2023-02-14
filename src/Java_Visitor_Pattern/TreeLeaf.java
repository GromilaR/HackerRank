package Java_Visitor_Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeLeaf extends Tree{
    int i=0;
    private Map<Integer, ArrayList> leaf = new HashMap<Integer,ArrayList>();
    TreeLeaf(int nodeValue, int nodeColour, int depth) {
        super(nodeValue, nodeColour, depth);
    }

    public Map<Integer, ArrayList> getLeaf() {
        return leaf;
    }

    public TreeLeaf(Tree tree) {
        AddLeaf(tree);
    }

    void AddLeaf(Tree tree){
        if (tree.getLeftNode()==null && tree.getRigthNode()==null)
        {   ArrayList temp = new ArrayList<>();
            temp.add(tree.getValue());
            temp.add(tree.getColour());
            temp.add(tree.getDepth());
            leaf.put(i,temp);i++;}
        if (tree.getLeftNode()!=null) AddLeaf(tree.getLeftNode());
        if (tree.getRigthNode()!=null) AddLeaf(tree.getRigthNode());
    }
}
