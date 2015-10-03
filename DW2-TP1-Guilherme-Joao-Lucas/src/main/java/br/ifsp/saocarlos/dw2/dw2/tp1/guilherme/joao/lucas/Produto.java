
package br.ifsp.saocarlos.dw2.dw2.tp1.guilherme.joao.lucas;

/**
 *
 * @author Guilherme - João- Lucas
 */
public class Produto {
    private String nome, url, descricao;
    private double preco, quant;

    public Produto() {
    }

    public Produto(String nome, String url, String descricao, double preco, double quant) {
        this.nome = nome;
        this.url = url;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    
    
    
}
