package br.com.henrique.appcomprafmu.model;

public class Produto {
    int imgProduto;
    String produtoName;
    String produtoDescription;
    String price;

    public Produto(int imgProduto, String produtoName, String produtoDescription, String price) {
        this.imgProduto = imgProduto;
        this.produtoName = produtoName;
        this.produtoDescription = produtoDescription;
        this.price = price;

    }

    public int getImgProduto() {
        return imgProduto;
    }

    public String getProdutoName() {
        return produtoName;
    }

    public String getProdutoDescription() {
        return produtoDescription;
    }

    public void setProdutoDescription(String produtoDescription) {
        this.produtoDescription = produtoDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
