package Pizzeria;

import Espacio.Tipo;

public class Pizza {
    private Tamanio tamanio;
    private Ingredientes ingredientes1;
    private Ingredientes ingredientes2;
    private Ingredientes ingredientes3;

    public Pizza(Tamanio tamanio, Ingredientes ingredientes1, Ingredientes ingredientes2, Ingredientes ingredientes3) {
        this.tamanio = tamanio;
        this.ingredientes1 = ingredientes1;
        this.ingredientes2 = ingredientes2;
        this.ingredientes3 = ingredientes3;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Ingredientes getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(Ingredientes ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public Ingredientes getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(Ingredientes ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public Ingredientes getIngredientes3() {
        return ingredientes3;
    }

    public void setIngredientes3(Ingredientes ingredientes3) {
        this.ingredientes3 = ingredientes3;
    }

    public double calcularPrecio() {
        double resultado = 0;
        if (tamanio == Tamanio.pequenia) {
            resultado += 5;
        } else if (tamanio == Tamanio.mediana) {
            resultado += 7;
        } else {
            resultado += 10;
        }
        if (ingredientes1 == Ingredientes.pollo || ingredientes1 == Ingredientes.huevo) {
            resultado += 1.5;
        } else {
            resultado += 1.0;
        }
        if (ingredientes2 == Ingredientes.pollo || ingredientes2 == Ingredientes.huevo) {
            resultado += 1.5;
        } else {
            resultado += 1.0;
        }
        if (ingredientes3 == Ingredientes.pollo || ingredientes3 == Ingredientes.huevo) {
            resultado += 1.5;
        } else {
            resultado += 1.0;
        }
        return resultado;
    }

}
