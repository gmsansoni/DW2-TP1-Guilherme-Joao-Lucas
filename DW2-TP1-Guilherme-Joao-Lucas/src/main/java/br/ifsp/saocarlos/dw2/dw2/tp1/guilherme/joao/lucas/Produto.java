
package br.ifsp.saocarlos.dw2.dw2.tp1.guilherme.joao.lucas;

/**
 *
 * @author Guilherme - João- Lucas
 */
public class Produto implements Comparable<Produto> {
    private int codigo;
    private String nome, url, descricao;
    private double preco, quant;

    public Produto() {
    }

    public Produto(int codigo, String nome, String url, String descricao, double preco, double quant) {
        this.codigo = codigo;
        this.nome = nome;
        this.url = url;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public int compareTo(Produto o) {
        if(this.codigo > o.getCodigo()){
            return 1;
        } else{
            if (this.codigo > o.getCodigo()){
                return -1;
            }else{
                return 0;
            }
        }
                
    }
    
    
}
