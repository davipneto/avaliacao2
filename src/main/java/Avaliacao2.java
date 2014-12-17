
import utfpr.ct.dainf.if62c.avaliacao.Poligonal;
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.Ponto;
import utfpr.ct.dainf.if62c.avaliacao.Ponto2D;
import utfpr.ct.dainf.if62c.avaliacao.PontoXY;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;
import utfpr.ct.dainf.if62c.avaliacao.PontoYZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        PoligonalFechada p = new PoligonalFechada(3);
        PontoXZ p1 = new PontoXZ(-3,2);
        PontoXZ p2 = new PontoXZ(-3,6);
        PontoXZ p3 = new PontoXZ(0,2);
        p.set(0, (Ponto2D)p1);
        p.set(1, (Ponto2D)p2);
        p.set(2, (Ponto2D)p3);
        
        System.out.println("Comprimento da Poligonal = " + p.getComprimento());
                
    }
    
}
