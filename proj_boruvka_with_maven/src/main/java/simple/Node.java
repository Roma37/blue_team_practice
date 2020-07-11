package simple;

public class Node {
	private int x = 30 , y = 30;
	public String name;
	
	public Node() {};
	public Node(String a) {
		name = a;
	}
	public Node(String myName, int myX, int myY) {
	    x = myX;
	    y = myY;
	    name = myName;
	}
	public void set(int x_, int y_) {
    	x = x_;
    	y = y_;
    }
	public int getX() {
        return x;
	}

    public int getY() {
        return y;
    }
    
    
}
