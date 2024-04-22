package modelo;

public abstract class FiguraGeometrica implements CalculoFigura {

    private String cor;

    public FiguraGeometrica() {
        this("");
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
