package graphs;
import java.util.*;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Class        UnweightedGraph.java
 * Description  Concrete class in the triad of defining data structures in
 *              Java with interfaces, abstract classes and concrete classes.
 *              It extends the abstract AbstractGraph class.
 * Platform     jdk 1.8.0_241; NetBeans IDE 11.3; PC Windows 10
 * Course       CS 143
 * Hourse       1 hours and 9 minutes
 * Date         4/5/2021
 * History Log  7/18/2018, 5/7/2020
 * @author	<i>Niko Culevski</i>
 * @version 	%1% %2%
 * @param       <V> generic type
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class UnweightedGraph<V> extends AbstractGraph<V> 
{
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Constructor  UnweightedGraph()-default constructor
     * Description  Construct an empty graph
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Niko Culevski</i>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public UnweightedGraph() 
    {
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Constructor  UnweightedGraph()-overloaded constructor
     * Description  Construct a graph from vertices and edges stored in arrays.
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Niko Culevski</i>
     * @param       vertices V[]
     * @param       edges int[][]
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/     
    public UnweightedGraph(V[] vertices, int[][] edges) 
    {
        super(vertices, edges);
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Constructor  UnweightedGraph()-overloaded constructor
     * Description  Construct a graph from vertices and edges stored in List.
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Niko Culevski</i>
     
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/     
    public UnweightedGraph(List<V> vertices, List<Edge> edges) 
    {
        super(vertices, edges);
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Constructor  UnweightedGraph()-overloaded constructor
     * Description  Construct a graph for integer vertices 0, 1, 2 and edge list.
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Niko Culevski</i>
     * @param       numberOfVertices int
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    
    public UnweightedGraph(List<Edge> edges, int numberOfVertices) 
    {
        super(edges, numberOfVertices);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     
     * Constructor  UnweightedGraph()-overloaded constructor
     * Description  Construct a graph from integer vertices 0, 1, and edge array.
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Niko Culevski</i>
     * @param       edges int[][]
     * @param       numberOfVertices int
    
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public UnweightedGraph(int[][] edges, int numberOfVertices) 
    {
        super(edges, numberOfVertices);
    }
}
