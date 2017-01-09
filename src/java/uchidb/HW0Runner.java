package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {
	private static Containers<Integer, String> container = null;

	private void SingleContainer() { }

	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if (container == null) {
			container = new SingleContainer<Integer, String>();
		}
		return container;
	}


	public static void main(String[] args){

	}
}
