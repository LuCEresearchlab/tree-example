public class Main {

  /**
 * @param args
 */
public static void main(String[] args) {
    // Model
    TreeNode tree = new FunctionCall("above",
      new FunctionCall("rectangle",
        new Constant("100"),
        new Constant("200"),
        new FunctionCall("rgb_color",
        new Constant("255"),
        new Constant("0"),
        new Constant("0"))
      ),
      new FunctionCall("triangle",
        new Constant("100"),
        new Constant("200"),
        new Constant("90"),
        new Constant("green")
      )
    );

    tree.print();
    System.out.println();
    System.out.println( ((FunctionCall) tree).getCounter());

    new MainFrame(tree);

  }

  
}
