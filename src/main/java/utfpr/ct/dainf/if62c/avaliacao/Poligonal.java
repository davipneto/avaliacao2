/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author davip_000
 */
public class Poligonal {
    private Ponto2D[] vertices;
    private Ponto2D plano = null;
    
    public Poligonal(int v){
        if(v<2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        vertices = new Ponto2D[v];
    }
    
    public int getN(){
        return vertices.length;
    }
    
    public Ponto2D get(int n){
        Ponto2D p = null;
        if(n>=0 && n<vertices.length)
            p=vertices[n];
        return p;
    }
    
    public void set(int n, Ponto2D p){
        if(plano == null){
            plano = p;
        }
        if(plano.getClass()!=p.getClass()){
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        }
        if(n>=0 && n<vertices.length)
            vertices[n] = p;
    }
    
    public double getComprimento(){
        double compr=0;
        int n;
        for(n=0;n<getN()-1;n++){
            compr+=vertices[n].dist(vertices[n+1]);
        }
        return compr;
    }
    
}
