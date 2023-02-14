package Java_Visitor_Pattern;

public interface Visitor {
    public int getResult();
    public void visitNode(TreeNode node);
    public void visitLeaf(TreeLeaf leaf);
}
