public class Main {

  /**
 * @param args
 */
public static void main(String[] args) {
    // Model
    TreeNode tree = new FunctionCall("above", 2,
      new FunctionCall("triangle", 4,
        new Constant("100"),
        new Constant("100"),
        new Constant("60"),
        new FunctionCall("rgb_color", 3,
        new Constant("255"),
        new Constant("0"),
        new Constant("0"))
      ),
      new FunctionCall("rectangle", 3,
        new Constant("100"),
        new Constant("100"),
        new Constant("white")
      )
    );

    tree.print();
    System.out.println();
    System.out.println(TreeComponent.getCounter());

    new MainFrame(tree);

  }

  
}
