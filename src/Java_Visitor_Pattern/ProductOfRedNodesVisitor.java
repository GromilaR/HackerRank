package Java_Visitor_Pattern;

import java.util.ArrayList;

public class ProductOfRedNodesVisitor implements Visitor{
    long productOfRedNodes = 1L;
    TreeNode node;
    TreeLeaf leaf;

    public ProductOfRedNodesVisitor(Tree tree) {

        this.node = new TreeNode(tree);
        this.leaf = new TreeLeaf(tree);
    }

    @Override
    public int getResult() {
        visitNode(node);
        visitLeaf(leaf);
        return (int) productOfRedNodes;
    }

    @Override
    public void visitNode(TreeNode node) {

        for (ArrayList temp : node.getNode().values()){
            if ((Integer)temp.get(1)==0) productOfRedNodes=productOfRedNodes*(Integer)temp.get(0)%(1000000007);
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        for (ArrayList temp : leaf.getLeaf().values()){
            if ((Integer)temp.get(1)==0) productOfRedNodes=productOfRedNodes*(Integer)temp.get(0)%(1000000007);
        }
    }
}
