package kotlinversion.travellingsalesman

import kotlin.math.pow
import kotlin.math.sqrt

class Node(var x: Int, var y: Int) {
    private var following: Node? = null

    fun appendToEnd(x: Int,y: Int) {
        val end = Node(x, y)
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

        while (firstNode != null) {
            output.append(" --> ${firstNode.x}, ${firstNode.y}")
            firstNode = firstNode.following
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
            sum += distance(firstNode.x, firstNode.y)
            firstNode = firstNode.following
        }

        return sum
    }

    fun deleteNode(head: Node, x: Int, y: Int): Node? {
        var n: Node = head

        if(n.x == x && n.y == y) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        lateinit var previousNode: Node

        while (!(n.x == x && n.y == y)) {
            previousNode = n
            n = n.following!!
        }

        previousNode.following = n.following

        //
        return head
    }

    private fun distance(x:Int, y:Int) : Int {
        val xValue = (x - 3.toDouble()).pow(2.0)
        val yValue = (y - 7.toDouble()).pow(2.0)
        val distance = sqrt(xValue + yValue).toInt()

        return distance * 2
    }
}