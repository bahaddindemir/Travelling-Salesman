package kotlinversion.singlylinkedlist

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Example
        val node = Node(4)
        node.appendToEnd(5)
        node.appendToEnd(6)
        node.appendToEnd(7)
        // End of Example

        // Test Todos
        node.printNodes();
        println("Node Length = " + node.length(node));
        println("Sum of Nodes = " + node.sumOfNodes());
        node.deleteNode(node, 5);
        node.printNodes();
        // End of Test Todos
    }
}