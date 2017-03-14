package cn.tjuscs.st.danning;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class triangleTest {
	
	private int a;
	private int b;
	private int c;
	private int expected;
	private static triangle triTest;
	
	public triangleTest(int a,int b,int c,int expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	@Before
	public void setUp() throws Exception {
		triTest = new triangle();
	}
	@After
    public void tearDown() throws Exception {
    }
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{0,2,3,-1},
			{2,2,3,1},
			{2,2,2,2},
			{5,4,3,0}
		});
	}
	@Test
	public void test(){
		assertEquals(this.expected,triTest.triangleJudge(this.a,this.b,this.c));
	}
	

}
