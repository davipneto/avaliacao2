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
public class PoligonalFechada extends Poligonal {
    
    public PoligonalFechada(int v){
        super(v);
    }
    
    @Override
    public double getComprimento(){
        int tam = getN();
        double compr1 = super.getComprimento();
        double compr2 = get(tam-1).dist(get(0));
        return compr1+compr2;
    }
}
