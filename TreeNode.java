import java.awt.Graphics;

public abstract class TreeNode {
  
  /**
   * 
   */
  public abstract void print();
  /**
   * @param g
   * @param x
   * @param y
   */
  public abstract void draw(Graphics g, int x, int y);
  /**
   * @param mouseX
   * @param mouseY
   * @param x
   * @param y
   * @return
   */
  public abstract TreeNode contains(int mouseX, int mouseY, int x, int y);

}
