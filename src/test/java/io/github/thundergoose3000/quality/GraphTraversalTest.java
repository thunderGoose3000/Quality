package io.github.thundergoose3000.quality;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import static io.github.thundergoose3000.quality.GraphTraversal.breadthFirstTraversal;

public class GraphTraversalTest {

    @Test
    public void GraphTest1() {          // Bob
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        assertEquals("[Bob, Alice, Rob, Mark, Maria]", breadthFirstTraversal(graph, "Bob").toString());
    }

    @Test
    public void GraphTest2() {            // Alice
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        assertEquals("[Alice, Bob, Mark, Maria, Rob]", breadthFirstTraversal(graph, "Alice").toString());
    }
    @Test
    public void GraphTest3() {              // Mark
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        assertEquals("[Mark, Alice, Rob, Bob, Maria]", breadthFirstTraversal(graph, "Mark").toString());
    }
    @Test
    public void GraphTest4() {               // Rob
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        assertEquals("[Rob, Bob, Mark, Maria, Alice]", breadthFirstTraversal(graph, "Rob").toString());
    }
    @Test
    public void GraphTest5() {                // Maria
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        assertEquals("[Maria, Alice, Rob, Bob, Mark]", breadthFirstTraversal(graph, "Maria").toString());
    }
    @Test
    public void GraphTest6() {                  // e
        Graph graph = new Graph();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addEdge("a", "b");
        graph.addEdge("a", "d");
        graph.addEdge("b", "c");
        graph.addEdge("d", "c");
        graph.addEdge("b", "e");
        graph.addEdge("d", "e");
            assertEquals("[e, b, d, a, c]", breadthFirstTraversal(graph, "e").toString());
    }
    @Test
    public void GraphTest7() {                  // 2
        Graph graph = new Graph();
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");
        graph.addVertex("5");
        graph.addVertex("6");
        graph.addEdge("1", "2");
        graph.addEdge("1", "4");
        graph.addEdge("2", "3");
        graph.addEdge("4", "3");
        graph.addEdge("2", "5");
        graph.addEdge("4", "5");
        graph.addEdge("2", "6");
        assertEquals("[2, 1, 3, 5, 6, 4]", breadthFirstTraversal(graph, "2").toString());
    }
    /* @Test
    public void GraphTest8White() { //the # of unique nodes visited must be equal to the # of nodes in the graph
        Graph graph = new Graph();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addEdge("a", "b");
        graph.addEdge("a", "c");
        graph.addEdge("b", "c");
        var arr = breadthFirstTraversal(graph, "a").toArray();
        assertEquals(3, arr.length);
    } */
    @Test
    public void GraphTest9White() { // NOT NULL
        Graph graph = new Graph();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addEdge("a", "b");
        graph.addEdge("a", "c");
        graph.addEdge("b", "c");
        assertNotNull(breadthFirstTraversal(graph, "a"));
    }
}