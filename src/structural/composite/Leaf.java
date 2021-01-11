package structural.composite;

/**
 * 리프 노드에 해당.
 * @author cgw981
 *
 */
public class Leaf implements Component{

	@Override
	public void print() {
		System.out.println("It is Leaf");
	}
	
}
