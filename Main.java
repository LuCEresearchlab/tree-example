public class Main {

  /**
 * @param args
 */
public static void main(String[] args) {
    // Model
    TreeNode tree = new FunctionCall("above",
      new FunctionCall("triangle",
        new Constant("100"),
        new Constant("100"),
        new Constant("60"),
        new FunctionCall("rgb_color",
        new Constant("255"),
        new Constant("0"),
        new Constant("0"))
      ),
      new FunctionCall("rectangle",
        new Constant("100"),
        new Constant("100"),
        new Constant("white")
      )
    );

    tree.print();
    System.out.println();
    System.out.println( TreeComponent.getCounter());

    new MainFrame(tree);

  }

  
}
