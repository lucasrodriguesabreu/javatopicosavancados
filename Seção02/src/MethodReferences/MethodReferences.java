package MethodReferences;
@FunctionalInterface
interface Figura2D{
    void desenha(Double largura, Double altura);
}
class Retangulo {
    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}

public class MethodReferences {
    
    public static void main(String[] args) {
        //Lambda expression
        Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de Largura: " + 1 + " e Altura: " + a);
        fig1.desenha(8.0, 1.5);
        
        // classe ou objeto :: método referenciado
        
        //Objeto específico
        Retangulo ret = new Retangulo();
        //Primeiro exemplo de method reference
        Figura2D fig2 = ret::desenhaRetangulo;
        
        fig2.desenha(10.5, 7.0);
    }
}