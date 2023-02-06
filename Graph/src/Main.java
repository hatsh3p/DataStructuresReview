public class Main {
    public static void main(String[] args) {
        Graph bartTransit = new Graph(true, false);
        Vertex richmondStation = bartTransit.addVertex("Richmond Station");
        Vertex antiochStation = bartTransit.addVertex("Antoch Station");
        Vertex dublinStation = bartTransit.addVertex("Dublin Station");
        Vertex oaklandAirportStation = bartTransit.addVertex("Oakland Airport");
        Vertex oakland19thStation = bartTransit.addVertex("19th Street Oakland Station");
        Vertex westOaklandStation = bartTransit.addVertex("West Oakland Station");
        Vertex bayFairStation = bartTransit.addVertex("Bay Fair Station");
        Vertex dalyCityStation = bartTransit.addVertex("Daly City Station");
        Vertex berryessaStation = bartTransit.addVertex("Berryessa Station");
        Vertex powellStation = bartTransit.addVertex("Powell Station");
        Vertex downtownBerkeleyStation = bartTransit.addVertex("Downtown Berkeley Station");

        bartTransit.addEdge(richmondStation, downtownBerkeleyStation, 5);
        bartTransit.addEdge(downtownBerkeleyStation, oakland19thStation, 4);
        bartTransit.addEdge(oakland19thStation, westOaklandStation, 3);
        bartTransit.addEdge(westOaklandStation, powellStation, 4);
        bartTransit.addEdge(powellStation, dalyCityStation, 7);
        bartTransit.addEdge(oakland19thStation, antiochStation, 12);
        bartTransit.addEdge(oakland19thStation, bayFairStation, 7);
        bartTransit.addEdge(westOaklandStation, bayFairStation, 6);
        bartTransit.addEdge(bayFairStation, berryessaStation, 8);
        bartTransit.addEdge(bayFairStation, dublinStation, 4);
        bartTransit.addEdge(westOaklandStation, oaklandAirportStation, 5);
        bartTransit.addEdge(oakland19thStation, oaklandAirportStation, 6);
        bartTransit.addEdge(bayFairStation, oaklandAirportStation, 4);
        bartTransit.addEdge(berryessaStation, oakland19thStation, 14);
        bartTransit.removeEdge(berryessaStation, oakland19thStation);

        bartTransit.print();
        System.out.println("======Depth First Traversal======");
        GraphTraverser.depthFirstTraversal(oakland19thStation);
        System.out.println("======Breadth First Traversal======");
        GraphTraverser.breadthFirstTraversal(oakland19thStation);
    }
}
