import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitClass {
	

	
		

	    @Test
	    public void test_JUnit() {
	        System.out.println("This is the testcase in this class");
	        String str1 = "This is the testcase in this class";
	        assertEquals("This is the testcase in this class", str1);
	    }
	   public static void main(String[] args) {
	    System.out.print("This is calculator");
	   }

}
