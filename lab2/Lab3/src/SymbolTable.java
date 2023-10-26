public class SymbolTable {
    private HashTable<Integer, Object> identifierTable;
    private HashTable<Integer, Object> constantTable;
    private int identifierCounter = 0;
    private int constantCounter = 0;

    public SymbolTable() {
        identifierTable = new HashTable<>();
        constantTable = new HashTable<>();
    }

    public void putIdentifier(Object value) {
        int key = identifierCounter++;
        if (getIdentifierPosition(value) == -1)
            identifierTable.put(key, value);
    }

    public int getIdentifierPosition(Object value) {
        for (Integer key : identifierTable.getKeys()) {
            if (identifierTable.get(key).equals(value)) {
                return key;
            }
        }
        return -1;
    }

    public boolean hasIdentifier(int identifier) {
        return identifierTable.get(identifier) != null;
    }
    
    public void putConstant(Object value) {
        int key = constantCounter++;
        if (getConstantPosition(value) == -1)
            constantTable.put(key, value);
    }

    public int getConstantPosition(Object value) {
        for (Integer key : constantTable.getKeys()) {
            if (constantTable.get(key).equals(value)) {
                return key;
            }
        }
        return -1;
    }

    public boolean hasConstant(int constant) {
        return constantTable.get(constant) != null;
    }

    @Override
    public String toString() {
        return "SymbolTable :" + "\nidentifierTable = " + identifierTable.toString() + "\nconstantTable = " + constantTable.toString();
    }
}