import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;


public class FunctionCall extends TreeNode {

  private String label;
  private ArrayList<TreeNode> children;

  public FunctionCall(String label, TreeNode... nodes) {
    this.label = label;
    children = new ArrayList<TreeNode>(Arrays.asList(nodes));
  }

  public String getLabel() {
    return label;
  }

  public ArrayList<TreeNode> getChildren() {
    return children;
  }

  @Override
  public void print() {
    System.out.print(this.getLabel());
    System.out.print("(");
    for (int i = 0; i < this.getChildren().size(); i++) {
      TreeNode child = children.get(i);
      child.print();
      if (i < this.getChildren().size() - 1) {
        System.out.print(",");
      }
    }
    System.out.print(")");
  }

  @Override
  public void draw(Graphics g, int x, int y) {
    g.drawRect(x, y, 100, 400);
    for (int i = 0; i < this.getChildren().size(); i++) {
      TreeNode child = children.get(i);
      child.draw(g, x - 100, y + 100 * i);
    }
  }

  @Override
  public TreeNode contains(int mouseX, int mouseY, int x, int y) {
    if (mouseX >= x && mouseX <= x + 100 && mouseY >= y && mouseY <= y + 100) {
      return this;
    } else {
      for (int i = 0; i < this.getChildren().size(); i++) {
        TreeNode child = children.get(i);
        TreeNode found = child.contains(mouseX, mouseY, x - 100, y + 100 * i);
        if (found != null) {
          return found;
        }
      }
    }
    return null;
  }

}
