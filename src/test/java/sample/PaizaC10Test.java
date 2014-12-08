package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaizaC10Test {

    

    @Test
    public void testCheck1() {
        
        PaizaC10.Work work = new PaizaC10.Work(20, 10, 10);
        
        assertEquals("noisy", work.check(25, 10));
        assertEquals("noisy", work.check(20, 15));
        assertEquals("silent", work.check(70, 70));
    }
    
    @Test
    public void testCheck2() {
        
        PaizaC10.Work work = new PaizaC10.Work(50, 50, 100);
        
        assertEquals("noisy", work.check(0, 0));
        
        assertEquals("noisy", work.check(0, 0));
    }

}
