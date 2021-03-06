package api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * This class represents the set of operations applicable on a directional edge(src,dest)
 * in a directional weighted graph.
 */
public class edgeData implements edge_data {

    private int src, dest, key, tag;
    private double weight;
    private String id, info;
    private static int counter;

    /**
     * default constructor
     */
    public edgeData(int src, int dest, double weight){
        this.src= src;
        this.dest= dest;
        this.weight= weight;
        this.id= src + "-" + dest;
        this.key= counter();  //unique key of the edge
    }

    private int counter(){
        return counter++;
    }

    /**
     * copy constructor
     */
    public edgeData(edge_data e){
        this.src= e.getSrc();
        this.dest= e.getDest();
        this.weight= e.getWeight();
    }

    public String getId(){
        return id;
    }

    @Override
    public int getSrc() {
        return src;
    }

    @Override
    public int getDest() {
        return dest;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String s) {
        this.info= s;
    }

    @Override
    public int getTag() {
        return tag;
    }

    @Override
    public void setTag(int t) {
        this.tag= t;
    }


    public String toString(){
        return "Edge: src- "+src+ " dest- "+dest+" weight- "+weight;
    }
}
