package com.tutorialhorizon.com.arrays;

import java.util.*;

/**
 * Created by archithrapaka on 10/19/16.
 */
public class Graph {
    private int V;  // vertices
    private LinkedList<Integer> adj[];
    private boolean[] marked;

    private int[] edgeTo;

    static void init(){

    }

    void BFS(String actor1 , String actor2){
        HashMap<String,Set<String>> ACTOR_TO_MOVIES = new HashMap<>();
        Set<String> Amovies = new HashSet<>();
        Amovies.add("one");
        Amovies.add("three");


        ACTOR_TO_MOVIES.put("A",Amovies);

        Set<String> Bmovies = new HashSet<>();

        Bmovies.add("three");
        Bmovies.add("four");

        ACTOR_TO_MOVIES.put("B",Bmovies);

        HashMap<String,Set<String>> MOVIES_TO_ACTOR = new HashMap<>();

        Set<String> Aactors = new HashSet<>();
        Aactors.add("A");
        Aactors.add("C");
        MOVIES_TO_ACTOR.put("one",Aactors);

        Set<String> Bactors = new HashSet<>();
        Bactors.add("B");
        Bactors.add("C");

        MOVIES_TO_ACTOR.put("four",Bactors);

        Set<String> cAactors = new HashSet<>();
        cAactors.add("A");
        cAactors.add("B");
        MOVIES_TO_ACTOR.put("three",cAactors);


        BFShelper(actor1,actor2,ACTOR_TO_MOVIES,MOVIES_TO_ACTOR);


    }



    void BFShelper(String actor1,String actor2 , HashMap<String,Set<String>> ACTOR_TO_MOVIES , HashMap<String,Set<String>> MOVIES_TO_ACTOR) {
        Queue<String> q = new LinkedList<>();

    }


    // graph
    public Graph(int V){
        this.V = V;
        adj = new LinkedList[V];
        marked = new boolean[V];
        edgeTo = new int[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v , int w) {
        adj[v].add(w); // add w to v's list
    }

    // from geeks for geeks , look down prefer sedgewick
    void DFSUtil(int v , boolean visited[]){
        visited[v] = true;
        System.out.println(v + "->");

        // recur for all vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
              if(!visited[n]){
                  DFSUtil(n,visited);
              }

        }
    }
    // Dfs from one vertex v
    void DFS(int  v) {
         boolean[] visited = new boolean[V]; // values for all vertices default to false
        DFSUtil(v,visited);  // recursive helper for DFS
    }

    // from sedgewick..preferred
    void DFS(Graph g , int v){
        marked[v] = true;

        System.out.println("->" + v);
        for (int w : g.adj[v]) {
               if(!marked[w]) {
                   edgeTo[w] = v;
                   DFS(g,w);
               }
        }
    }

    void BFS(Graph g , int source){
        Queue<Integer> q = new LinkedList<>();
        marked[source] = true;
        q.add(source);

        while (!q.isEmpty()){
              int top = q.poll();
            System.out.println(top + " ");
            for (int w : g.adj[top]
                 ) {
                    if(!marked[w]){
                        marked[w] = true;
                        q.add(w);
                    }
            }

        }
        // printing the BFS traversal
        for (int w:q
             ) {
             System.out.print(w);
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }
    public void pathTo(int source,int v){
        if(!hasPathTo(v)){
            System.out.print("no path exists from source");
        }
        Stack<Integer> stack = new Stack();
        for (int i = v; i != source ; i = edgeTo[i]) {
            stack.push(i);
        }
       stack.push(source);
        //System.out.print(source + "-->");
        for (int i:stack
             ) {
            System.out.print("---> ");
            System.out.print(i);
        }
    }

    // Boolean
    Boolean isCyclic(Graph g) {

        for (int i = 0; i < V; i++) {
              if(!marked[i]){
                  if(DFS(g,i,i)){
                      return true;
                  }
              }
        }
        return false;
    }

    // dfs for cycle detection

    Boolean DFS(Graph g ,int v , int parent){
          marked[v] = true;

        for (int w: g.adj[v]) {
                 if(!marked[w]){
                      DFS(g,w,v);
                 }
               else if( w != parent){
                     return true;
                 }
        }
        return false;
    }



    public static void main(String...args){
        Graph g1 = new Graph(3);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
//        g1.addEdge(2, 0);
//        g1.addEdge(0, 3);
//        g1.addEdge(3, 4);

        //g.DFS(g,0); // from source
        //System.out.print(g.hasPathTo(5));
        //g.pathTo(0,5);

       // System.out.println("BFS traversal .......");
        //g.BFS(g,2);
        if(g1.isCyclic(g1)) {
            System.out.println("Cyclic");
        }
        else {
            System.out.println("ACyclic");
        }

    }
}
