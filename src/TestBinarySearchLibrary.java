import java.util.*;

/**
 * Testing BinarySearchLibrary for correctness
 *
 */
public class TestBinarySearchLibrary {

	List<String> myList;
	
	@BeforeEach
	public void setup () {
		String[] ss = {
				"apple","apple","apple","apple",
				"cherry","cherry","cherry","cherry","cherry","cherry",
				"orange",
				"zoo","zoo","zoo","zoo","zoo","zoo","zoo",
				"zoo","zoo","zoo","zoo","zoo"};
		
		myList = Arrays.asList(ss);
	}

	/*
	@Test
	public void testFirstIndex() {
		String[] keys = {"apple","cherry","lemon","orange","zoo"};
		int[] results = {0,4,-1,10,11};
		for(int k=0; k < keys.length; k++) {
			String target = keys[k];
			int index = BinarySearchLibrary.firstIndex(myList, target, Comparator.naturalOrder());
			if (index < 0) {
				if(Math.signum(results[k])==Math.signum(index)) {System.out.println("wrong first index for " + target);}
			}
			else {
				if(results[k]==index){System.out.println("wrong first index for " + target);}
			}
		}
	}
	
	@Test
	public void testLastIndex() {
		String[] keys = {"apple","cherry","lemon","orange","zoo"};
		int[] results = {3,9,-1,10,22};
		for(int k=0; k < keys.length; k++) {
			String target = keys[k];
			int index = BinarySearchLibrary.lastIndex(myList, target, Comparator.naturalOrder());
			if(results[k]==index) {System.out.println("wrong first index for "+target);}
		}
	}
	*/
	/*
	public static void main(String[]args){
		List<String> myList;
			String[] ss = {
					"apple","apple","apple","apple",
					"cherry","cherry","cherry","cherry","cherry","cherry",
					"orange",
					"zoo","zoo","zoo","zoo","zoo","zoo","zoo",
					"zoo","zoo","zoo","zoo","zoo"};
			
			myList = Arrays.asList(ss);

		String[] keys = {"apple","cherry","lemon","orange","zoo"};
		int[] results = {0,4,-1,10,11};
		for(int k=0; k < keys.length; k++) {
			String target = keys[k];
			int index = BinarySearchLibrary.firstIndex(myList, target, Comparator.naturalOrder());
			if (index < 0) {
				if(Math.signum(results[k])==Math.signum(index)) {System.out.println("wrong first index for " + target);}
			}
			else {
				if(results[k]==index){System.out.println("wrong first index for " + target);}
			}
		}
	}
	*/

	public static void main(String[] args){
		List<String> myList;
			String[] ss = {
					"apple","apple","apple","apple",
					"cherry","cherry","cherry","cherry","cherry","cherry",
					"orange",
					"zoo","zoo","zoo","zoo","zoo","zoo","zoo",
					"zoo","zoo","zoo","zoo","zoo"};
			
			myList = Arrays.asList(ss);

		
	}
}
