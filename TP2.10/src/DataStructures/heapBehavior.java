package DataStructures;

public interface heapBehavior<X> extends StructureBehavior<X> {
	public boolean isEmpty();
	public String toString();
	public X min();
}
