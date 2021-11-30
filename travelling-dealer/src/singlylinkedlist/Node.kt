package kotlinversion.singlylinkedlist

class Node(var data: Int) {

    private var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var firstNode: Node? = this
        val output = StringBuilder()

        while (firstNode?.following != null) {
            output.append(" --> ${firstNode.data}")
            firstNode = firstNode.following
            if (firstNode?.following == null) {
                output.append(" --> ").append(firstNode!!.data)
            }
        }
        println(output)
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var node = h
        var nodeLength = 0

        while (node != null) {
            node = node.following
            nodeLength++
        }

        return nodeLength
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var sum = 0
        var firstNode: Node? = this

        while (firstNode!!.following != null) {
            sum += firstNode.data
            firstNode = firstNode.following
            if (firstNode!!.following == null) {
                sum += firstNode.data
            }
        }

        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        var n: Node = head

        if(n.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        lateinit var previousNode: Node

        while (n.data != data) {
            previousNode = n
            n = n.following!!
        }

        previousNode.following = n.following

        //
        return head
    }
}