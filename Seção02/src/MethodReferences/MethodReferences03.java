package MethodReferences;

@FunctionalInterface
interface Figura2D{
    Retangulo desenha(Double largura, Double altura);
}

class Retangulo{
    public Retangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}

public class MethodReferences03 {
    
    public static void main(String[] args) {
        Figura2D fig1 = Retangulo::new;
        
        fig1.desenha(10.0, 2.5);
    }
}
/*
5. Pacote Stream
*/