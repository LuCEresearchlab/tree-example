import java.awt.Graphics;

public class Constant extends TreeNode {

  /**
   *
   */
  private String label;

  private int size;

  /**
   * @param label
   */
  public Constant(String label) {
    this.label = label;
    TreeComponent.setCounter();
  }

  /**
   * @return
   */
  public String getLabel() {
    return label;
  }

  @Override
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public void print() {
    System.out.print(this.getLabel());
  }
  
  @Override
  public void draw(Graphics g, int x, int y) {
    g.drawRect(x, y, 50, 50);
    g.drawString(this.getLabel(), x+10, y+20);
  }

  @Override
  public TreeNode contains(int mouseX, int mouseY, int x, int y) {
    if (mouseX >= x && mouseX <= x + 100 && mouseY >= y && mouseY <= y + 100) {
      // clicked on us
      return this;
    } else {
      // not clicked on us
      return null;
    }
  }

}
