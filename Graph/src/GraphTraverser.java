import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraverser {
    public static void depthFirstTraversal(Vertex start) {
        ArrayList<Vertex> visitedVertices = new ArrayList<>();
        visitedVertices.add(start);
        depthFirstTraversal(start, visitedVertices);
    }

    private static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        System.out.println(start.getData());

        for (Edge edge: start.getEdges()){
            Vertex neighbor = edge.getEnd();

            if (!visitedVertices.contains(neighbor)) {
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void breadthFirstTraversal(Vertex start) {
        ArrayList<Vertex> visitedVertices = new ArrayList<>();
        visitedVertices.add(start);
        breadthFirstTraversal(start, visitedVertices);
    }

    public static void breadthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(start);
        while (!visitQueue.isEmpty()) {
            Vertex currentVertex = visitQueue.remove();
            System.out.println(currentVertex.getData());
            for(Edge e : currentVertex.getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visitedVertices.contains(neighbor)) {
                    visitQueue.add(neighbor);
                    visitedVertices.add(neighbor);
                }
            }
        }
    }
}
