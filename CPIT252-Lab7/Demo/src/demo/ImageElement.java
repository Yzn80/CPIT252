/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import javax.swing.ImageIcon;

public class ImageElement {

    private String name;
    public ImageElement(String name) {
        this.name = name;
    }

    public String myPosition(int position) {
        return "" + position + " " + this.name + ": " + this;
    }

    public ImageIcon getImageElement() {
        try {
            return new ImageIcon(Paths.get("images", this.name).toString());
        }
        catch(InvalidPathException e){
            System.out.println("Invalid Path");
        }
        return null;
    }
}
