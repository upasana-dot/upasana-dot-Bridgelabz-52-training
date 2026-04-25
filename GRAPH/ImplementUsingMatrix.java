// // undirected graph using adjacency matrix
// package GRAPH;
// import java.util.*;
// class Graph{

//     int[][]mat;

//     Graph(int v){
//         mat=new int[v][v];
//     }

//     public void addEdge(int u,int v){
//         mat[u][v]=1;
//         mat[v][u]=1;
//     }

//      public void printGraph(){
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat.length;j++){
//                 System.out.print(mat[i][j]+" ");
//             }
//             System.out.println();
//         }
//      }
// }

// public class ImplementUsingMatrix {

//     public static void main(String[] args){

//         Graph g = new Graph(5);

//         g.addEdge(0,1);
//         g.addEdge(0,2);
//         g.addEdge(1,3);
//         g.addEdge(2,3);
//         g.addEdge(3,4);     
//         g.printGraph();
//     }
// }



// directed graph using adjacency matrix
package GRAPH;
import java.util.*;
class Graph{

    int[][]mat;

    Graph(int v){
        mat=new int[v][v];
    }
    public void addEdge(int u,int v){
        mat[u][v]=1;
    }
     public void printGraph(){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
     }
}

public class ImplementUsingMatrix {

    public static void main(String[] args){

        Graph g = new Graph(5);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);     

        g.printGraph();
    }  
}

