package Lambda;

import java.util.ArrayList;
import java.util.List;

class Produto{
    private String nome;
    private Double preco;
    
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        
        List<Produto> lista = new ArrayList<Produto>();
        
        lista.add(new Produto("TV 42'", 2000.00));
        lista.add(new Produto("Geladeira 470L'", 3200.00));
        lista.add(new Produto("Fogão 4 Bocas", 900.00));
        lista.add(new Produto("Videogame", 1999.00));
        lista.add(new Produto("Microondas", 500.00));
        
        //lambda expression com um argumento
        lista.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
        
        lista.sort( (p1, p2) -> p1.getPreco().compareTo(p2.getPreco()) );
        
        //lista.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
        lista.forEach((p) -> {
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        });
    }
}