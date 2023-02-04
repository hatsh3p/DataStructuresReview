public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight; // Use Integer instead of int so that it can be set to null for unweighted graphs.

    public Edge(Vertex start, Vertex end, Integer inputWeight) {
        this.start = start;
        this.end = end;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return this.start;
    }

    public Vertex getEnd() {
        return this.end;
    }

    public Integer getWeight() {
        return this.weight;
    }
}
