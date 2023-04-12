import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.pruebas.MyClass;
import org.junit.jupiter.api.Test;

class MyClassTestCase {

	@Test
    public void testConcatenate() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
	
	@Test
    public void testConcatenateWithEmpty() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concatenate("one", "");

        assertEquals("one", result);

    }
	
	@Test
    public void testConcatenateWithSecondParamNull() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concatenate("one", null);

        assertEquals("one", result);

    }
	
	@Test
    public void testConcatenateWithFirstParamNull() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concatenate(null, "two");

        assertEquals("two", result);

    }
	
	@Test
    public void testConcat() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concat("one", "two");

        assertEquals("onetwo", result);

    }
	
	@Test
    public void testConcatWithNull() {
        MyClass myUnit = new MyClass();
        
        assertThrows(NullPointerException.class, () -> {
        	myUnit.concat("one",null);
          });
    }
	
	@Test
    public void testConcatenateWithDash() {
        MyClass myUnit = new MyClass();

        String result = myUnit.concatenateWithDash("one", "two");

        assertEquals("one-two", result);

    }
	
	@Test
	public void testConcatenateWithDashEmpty() {
		MyClass myUnit = new MyClass();
		String result = myUnit.concatenateWithDash("hola", "");
		assertEquals("hola-", result);
	}
	
	@Test
	public void testConcatenateWithDashNull() {
		MyClass myUnit = new MyClass();
		String result = myUnit.concatenateWithDash("hola", null);
		assertEquals("hola-null", result);
	}
}
