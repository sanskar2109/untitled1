// Graph by Adjacency matrix
import java.util.Scanner;

class GraphByAdjancyMatrix {
    int[][] matrix;

    public GraphByAdjancyMatrix(int ver) {
        this.matrix = new int[ver][ver];
    }

    public void addEdge(int src,int des)
    {
        matrix[src][des]=1;
        matrix[des][src]=1;
    }

    public void display()
    {
        System.out.print("   ");
        for(int i=0;i<matrix.length;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<matrix.length;i++)
        {
            System.out.print(i+": ");
            for(int j:matrix[i])
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //no. of vertices
        int ver=s.nextInt();
        //no. of edge
        int edg=s.nextInt();
        GraphByAdjancyMatrix obj=new GraphByAdjancyMatrix(ver);
        for(int i=0;i<edg;i++)
        {
            int src=s.nextInt();
            int des=s.nextInt();
            obj.addEdge(src,des);
        }
        obj.display();
    }
}