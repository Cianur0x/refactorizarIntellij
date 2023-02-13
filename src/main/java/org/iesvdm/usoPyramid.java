package org.iesvdm;

public class usoPyramid {
    public static void main(String[] args) {
        Pyramid p = new Pyramid(5);
        System.out.println(p);
        System.out.println("Epidermises creases: " + Pyramid.getPiramidesCreadas());
    }
}
