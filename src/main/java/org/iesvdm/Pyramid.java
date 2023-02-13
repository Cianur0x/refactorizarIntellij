package org.iesvdm;
public class Pyramid {
    private int altura;
    private static int piramidesCreadas = 0;

    public Pyramid(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String resultado = "";
        int espacios = this.altura + 1;
        for (int i = 0; i < this.altura + 1; i++) {
            int asteriscos = (i * 2) - 1;
            for (int j = 0; j < espacios; j++) {
                resultado += " ";
            }
            for (int j = 0; j < asteriscos; j++) {
                resultado += "*";
            }
            espacios--;
            resultado += "\n";
        }
        return resultado;
    }

}
