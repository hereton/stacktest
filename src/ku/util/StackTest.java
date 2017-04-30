package ku.util;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test to check each method are correct or not.
 * 
 * @author Totsapon Menkul.
 *
 */
public class StackTest {
	// not a Stack of java.util.
	private ku.util.Stack<String> stack;
	private int CAPACITY = 5;

	@SuppressWarnings("unchecked") // don't know what is this for
	@Before
	public void setUp() {
		StackFactory.setStackType(0);
		stack = StackFactory.makeStack(CAPACITY);
	}

	@After
	public void tearDown() {
		stack = null;
	}

	@Test
	public void testCapacity() {
		assertEquals(CAPACITY, stack.capacity());
	}

	@Test
	public void testEmptyStack() {
		assertTrue(stack.isEmpty());
		assertFalse(stack.isFull());
		assertEquals(0, stack.size());
	}

	@Test
	public void testIsFullStack() {
		// when create stack
		assertFalse(stack.isFull());
		// when reach the capacity
		for (int i = 0; i <= stack.capacity(); i++) {
			stack.push("Need to rest");
		}
		assertTrue(stack.isFull());
		stack.pop();
		assertFalse(stack.isFull());
	}

	@Test
	public void testPeekStack() {
		// when stack is empty.
		assertEquals(null, stack.peek());
		// when push and pop.
		stack.push("malang one");
		assertEquals("malang one", stack.peek());
		stack.push("tom");
		assertEquals("tom", stack.peek());
		stack.pop();
		assertEquals("malang one", stack.peek());
		assertEquals("malang one", stack.peek());

	}

	@Test(expected = java.util.EmptyStackException.class)
	public void testPopEmptyStack() {
		assertEquals(0, stack.size());
		stack.pop();
	}

	@Test
	public void testPopStack() {
		stack.push("tom tom");
		stack.push("where you go last nigth ?");
		stack.pop();
		assertEquals("tom tom", stack.peek());
		stack.pop();
		assertEquals(null, stack.peek());
	}

	@Test(expected = java.lang.IllegalStateException.class)
	public void testPushOverStackCapacity() {
		for (int i = 0; i <= stack.capacity(); i++) {
			stack.push("YOLO");
		}
		stack.push("OK");
	}

	@Test
	public void testSizeStack() {
		assertEquals(0, stack.size());
		stack.push("a");
		assertEquals(1, stack.size());
		stack.push("b");
		assertEquals(2, stack.size());
		stack.push("cat");
		stack.push("SAWADDEE");
		assertEquals(4, stack.size());
		stack.pop();
		assertEquals(3, stack.size());
	}
}
