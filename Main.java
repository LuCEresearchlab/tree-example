public class Main {

  public static void main(String[] args) {
    // Model
    TreeNode tree = new FunctionCall("above",
      new FunctionCall("rectangle",
        new Constant("100"),
        new Constant("200"),
        new Constant("red")
      ),
      new FunctionCall("triangle",
        new Constant("100"),
        new Constant("200"),
        new Constant("90"),
        new Constant("green")
      )
    );

    tree.print();

    new MainFrame(tree);

  }

  
}
