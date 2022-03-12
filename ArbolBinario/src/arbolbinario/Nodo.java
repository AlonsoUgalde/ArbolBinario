/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author hp
 */
public class Nodo {
    private int value;
    private Nodo left;
    private Nodo right;
    
    public Nodo () {
}

public Nodo(int value){
    this.value = value;
}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

public Nodo(int value, Nodo left, Nodo right){
    this.value = value;
    this.left = left;
    this.right = right;
}
}
