import javax.swing.JFrame;

public class MainFrame extends JFrame {


  public MainFrame(TreeNode tree) {
    add(new TreeComponent(tree));
    pack();
    setVisible(true);
  }
  
}
