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
public class PontoXY extends Ponto2D {
    
    public PontoXY(){
        super();
    }
    
    public PontoXY(double x, double y){
        super(x,y,0);
    }
    
    @Override
    public String toString(){
        return String.format(getNome() + "(%f,%f)",getX(),getY());
    }
}
