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
public class PontoXZ extends Ponto2D {
    
    public PontoXZ(){
        super();
    }
    
    public PontoXZ(double x, double z){
        super(x,0,z);
    }
    
    @Override
    public String toString(){
        return String.format(getNome() + "(%f,%f)",getX(),getZ());
    }
}
