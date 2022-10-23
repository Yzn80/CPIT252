/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

    private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

    public ImageElement getFlyweight(String n) {
        // return a flyweight if it already exists, otherwise, put it in the map.
        ImageElement element = flyweights.get(n);
        if (!flyweights.containsKey(n)) {
            element = new ImageElement(n);
            flyweights.put(n, element);

        }
        return element;
    }

    public int numberOfFlyweights() {
        // return the size of the HashMap

        return flyweights.size();
    }

}
