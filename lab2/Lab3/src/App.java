public class App {
    public static void main(String[] args) throws Exception {
        SymbolTable symbolTable = new SymbolTable();
        symbolTable.putIdentifier("a");
        System.out.println("add a identifier\n" + symbolTable.toString());
        symbolTable.putIdentifier("b");
        System.out.println("add b identifier\n" + symbolTable.toString());
        symbolTable.putIdentifier("a");
        System.out.println("add a identifier\n" + symbolTable.toString());
        symbolTable.putConstant("3");
        System.out.println("add 3 constant\n" + symbolTable.toString());
        symbolTable.putConstant("3");
        System.out.println("add 3 constant\n" + symbolTable.toString());
    }
}
