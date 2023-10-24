/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class LoungeCushion extends Cushion {
    // EE (2)
    private int width;
    private int length;
    private int depth;
    
    public LoungeCushion(String id, String brand, double price, int quantity, int width, int length, int depth) {
        super(id, brand, price, quantity);
        this.width = width;
        this.length = length;
        this.depth = depth;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + " inch\nLength: " + length + " inch\nDepth: " + depth + " inch";
    }
}
