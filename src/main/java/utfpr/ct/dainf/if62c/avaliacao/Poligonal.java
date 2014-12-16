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
    private String plano;
    private boolean a = false;
    
    public Poligonal(int v){
        if(v<2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        vertices = new Ponto2D[v];
    }
    
    public int getN(){
        return vertices.length+1;
    }
    
    public Ponto2D get(int n){
        return vertices[n];
    }
    
    public void set(int n, Ponto2D p){
        if(n<getN())
            return;
        if(a==false){
            plano = p.getNome();
            a=true;
        }
        else if(plano.equals(p.getNome())){
            vertices[n] = p;
        }
        else
           throw new RuntimeException("Vértices devem estar no mesmo plano");
    }
    
    public double getComprimento(){
        double compr=0;
        for(int n=0;n<getN()-2;n++){
            compr+=vertices[n].dist(vertices[n+1]);
        }
        return compr;
    }
    
}
