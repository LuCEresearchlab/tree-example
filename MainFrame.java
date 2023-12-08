import javax.swing.JFrame;

public class MainFrame extends JFrame {


  /**
   * @param tree
   */
  public MainFrame(TreeNode tree) {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setSize(1500, 500);
    setPreferredSize(getMaximumSize());
    
    add(new TreeComponent(tree));
    pack();
    setVisible(true);
  }
  
}
