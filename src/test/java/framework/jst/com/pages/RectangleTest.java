package framework.jst.com.pages;

import framework.jst.com.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    Rectangle myRect = new Rectangle(5,6);

    @Test
    public void testGetArea(){
        assertEquals(myRect.getArea(),30);
    }

    @Test
    public void testGetPerimeter(){
        assertEquals(myRect.getPerimeter(),22);
    }

    @Test
    public void testGetLength(){
        assertEquals(myRect.length,5);
    }

    @Test
    public void testGetWidth(){
        assertEquals(myRect.width,6);
    }
}
