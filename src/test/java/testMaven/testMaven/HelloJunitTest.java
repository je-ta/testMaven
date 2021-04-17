package testMaven.testMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJunitTest {
	
    @Test
    public void case1() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(2,2,2);
    	String expected = "全て同じです。";
    	assertEquals(message,expected);
    	
    }
 
    @Test
    public void case2() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(5,3,1);
    	String expected = "これらの中で、最大値は5で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
 
    @Test
    public void case3() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(-1,-3,-6);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case4() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(0,-1,-2);
    	String expected = "これらの中で、最大値は0で、最小値は-2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case5() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(2,6,4);
    	String expected = "これらの中で、最大値は6で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case6() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(-6,-1,-2);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }

    @Test
    public void case7() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(-1,6,3);
    	String expected = "これらの中で、最大値は6で、最小値は-1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case8() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(3,1,6);
    	String expected = "これらの中で、最大値は6で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case9() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(-2,-6,-1);
    	String expected = "これらの中で、最大値は-1で、最小値は-6です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case10() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(8,-1,11);
    	String expected = "これらの中で、最大値は11で、最小値は-1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case11() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(3,3,1);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case12() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(2,2,4);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case13() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(3,1,3);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case14() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(2,4,2);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case15() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(1,3,3);
    	String expected = "これらの中で、最大値は3で、最小値は1です。";
    	assertEquals(message,expected);
    	
    }
    
    @Test
    public void case16() throws Exception {
    	
    	HelloJunit helloJunit = new HelloJunit();
    	String message = helloJunit.stringJunit(4,2,2);
    	String expected = "これらの中で、最大値は4で、最小値は2です。";
    	assertEquals(message,expected);
    	
    }
    
}
