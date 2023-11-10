import java.awt.Graphics;

public abstract class TreeNode {
  
  public abstract void print();
  public abstract void draw(Graphics g, int x, int y);
  public abstract TreeNode contains(int mouseX, int mouseY, int x, int y);

}
