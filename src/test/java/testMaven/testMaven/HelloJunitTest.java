package testMaven.testMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJunitTest {
	
    @Test
    public void case1() throws Exception {
    	
    	String message = doExecute(2,2,2);
    	String expected = "全て同じです。";
    	assertEquals(message,expected);
    	
    }
 
    @Test
    public void case2() throws Exception {
    	
    	String message = doExecute(5,3,1);
    	String expected = "これらの中で、最大値は5で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
 
    @Test
    public void case3() throws Exception {
    	
    	String message = doExecute(-1,-3,-6);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case4() throws Exception {
    	
    	String message = doExecute(0,-1,-2);
    	String expected = "これらの中で、最大値は0で、最小値は-2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case5() throws Exception {
    	
    	String message = doExecute(2,6,4);
    	String expected = "これらの中で、最大値は6で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case6() throws Exception {
    	
    	String message = doExecute(-6,-1,-2);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }

    @Test
    public void case7() throws Exception {
    	
    	String message = doExecute(-1,6,3);
    	String expected = "これらの中で、最大値は6で、最小値は-1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case8() throws Exception {
    	
    	String message = doExecute(3,1,6);
    	String expected = "これらの中で、最大値は6で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case9() throws Exception {
    	
    	String message = doExecute(-2,-6,-1);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case10() throws Exception {
    	
    	String message = doExecute(8,-1,11);
    	String expected = "これらの中で、最大値は11で、最小値は-1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case11() throws Exception {
    	
    	String message = doExecute(3,3,1);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case12() throws Exception {
    	
    	String message = doExecute(2,2,4);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case13() throws Exception {
    	
    	String message = doExecute(3,1,3);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case14() throws Exception {
    	
    	String message = doExecute(2,4,2);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case15() throws Exception {
    	
    	String message = doExecute(1,3,3);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case16() throws Exception {
    	
    	String message = doExecute(4,2,2);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    public String doExecute(Integer num1, Integer num2, Integer num3) {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(num1,num2,num3);
    	
    	return message;
    }
    
}
