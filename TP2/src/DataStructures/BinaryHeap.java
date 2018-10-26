package DataStructures;

import java.util.Vector;

public class BinaryHeap <X extends Comparable<X>> implements heapBehavior<X> {
	/**
	 * ATTRIBUTES
	 */
	private Vector<X> vector;

	//GETTERS AND SETTERS
	public Vector<X> getVector() {
		return vector;
	}

	public void setVector(Vector<X> vector) {
		this.vector = vector;
	}
	
	public int getSize() {
		return this.vector.size();
	}

	/**
	 * NEW CONSTRUCTOR
	 */
	public BinaryHeap() {
		this.vector = new Vector<>();
	}

	
	/**
	 * FIXED VECTOR 
	 * @param nonOrderedVector
	 */
	public BinaryHeap(Vector<X> nonOrderedVector) {
		this.vector = nonOrderedVector;
		buildHeap();
	}

	/**
	 * CREATE NEW NODES
	 */
	@Override
	public void create(X element) {
		int i = vector.size();
		vector.add(element);
		int parent = parentRoot(i);
		while (parent != -1 && vector.get(i).compareTo(vector.get(parent))<0) {
			swapHeap(i, parent);
			i = parent;
			parent = parentRoot(i);
		}
	}

	/**
	 * EXTRACT FIRST NODE
	 */
	@Override
	public X extract() {
		if(isEmpty() ) {
			return null;
		}
		if(vector.size()==1) {
			return vector.remove(0);
		}
		X minValue = vector.get(0);
		X lastValue = vector.remove(vector.size()-1);
		vector.set(0, lastValue);
		heapSortVector(0);
		return minValue;
	}

	/**
	 * VERIFIES IF THE VECTOR IS EMPTY
	 */
	@Override
	public boolean isEmpty() {
		return vector.size()==0;
	}
	
	/**
	 * MAKES THE TO STRING
	 */
	@Override
	public String toString() {
		String msg = "";
		for (int i = 0; i < vector.size(); i++) {
			msg += vector.get(i).toString() + "\n";
		}
		return msg;
	}

	/**
	 * MINIMUM VALUE
	 */
	@Override
	public X min() {
        if (vector.size() == 0) {
            return null;
        }
        return vector.get(0);
	}

	/**
	 * CLEARS THE VECTOR
	 */
	@Override
	public void clear() {
		this.vector.clear();
	}
	
	/**
	 * ORDER THE HEAP TREE
	 */
    private void buildHeap() {
        for (int i = (int)(vector.size() / 2); i >= 0; i--) {
        	heapSortVector(i);
        }
    }
    
    /**
     * HEAP SORT ALGORITH
     * @param i
     */
    private void heapSortVector(int i) {
        int leftPosition = leftPosition(i);
        int rightPosition = rightPosition(i);
        int smallestNode = i;
        if (leftPosition < vector.size() && vector.get(leftPosition).compareTo(vector.get(i)) < 0) {
            smallestNode = leftPosition;
        }
        if (rightPosition < vector.size() && vector.get(rightPosition).compareTo(vector.get(smallestNode)) < 0) {
            smallestNode = rightPosition;
        }
        if (smallestNode != i) {
            swapHeap(i, smallestNode);
            heapSortVector(smallestNode);
        }
    }
    
    /**
     * INTERCHANGE VALUES INTO VECTOR
     * @param node1
     * @param node2
     */
    private void swapHeap(int node1, int node2) {
        X temp = vector.get(node1);
        vector.set(node1, vector.get(node2));
        vector.set(node2, temp);
    }

    /**
     * ROOT VALUE ON SORT
     * @param i
     * @return
     */
    private int parentRoot(int indexPosition) {
        if (indexPosition == 0) {
            return -1;
        }
        return (indexPosition - 1) / 2;
    }

    /**
     * MOVEMENT TO LEFT
     * @param i
     * @return
     */
    private int leftPosition(int indexPosition) {
        return 2 * indexPosition + 1;
    }

    /**
     * MOVEMENT TO RIGHT
     * @param i
     * @return
     */
    private int rightPosition(int indexPosition) {
        return 2 * indexPosition + 2;
    }

	
}
