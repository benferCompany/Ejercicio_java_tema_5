package clases;

public class Coche {
    String color;
    String marca;
    String tipo;

    public Coche(String color, String marca, String tipo) {
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
}
