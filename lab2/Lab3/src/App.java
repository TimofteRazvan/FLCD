public class App {
    public static void main(String[] args) throws Exception {
        SymbolTable identifierTable = new SymbolTable();
        SymbolTable constantTable = new SymbolTable();
        identifierTable.put("a");
        System.out.println("add a identifier\n" + identifierTable.toString());
        identifierTable.put("b");
        System.out.println("add b identifier\n" + identifierTable.toString());
        identifierTable.put("a");
        System.out.println("add a identifier\n" + identifierTable.toString());
        constantTable.put("3");
        System.out.println("add 3 constant\n" + constantTable.toString());
        constantTable.put("3");
        System.out.println("add 3 constant\n" + constantTable.toString());
    }
}
