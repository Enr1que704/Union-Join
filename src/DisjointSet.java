
public class DisjointSet {
    private int[] size;

    public DisjointSet(int size) {
        this.size = new int[size];
        for (int i = 0; i < size; i++) {
            this.size[i] = -1;
        }
    }


    public void union(int root1, int root2) { // smart union by size
        // negative number means size, positive number is the parent of the node
        // root1 and root2 are not in the same tree - must do a find first
        if (find(root1) != find(root2)) {
            if (size[root2] < size[root1]) {
                size[root2] += size[root1];
                size[root1] = root2;
            } else {
                size[root1] += size[root2];
                size[root2] = root1;
            }
        }
    }

    public int find(int node) {
        if (size[node] < 0) { // if it is a negative value, it is the root, and its value should be returned
            return node;
        } else {
            int findParent = find(size[node]);
            return size[node] = findParent;
        }
    }
}
