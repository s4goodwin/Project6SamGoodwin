package bsu.comp152;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {

    @Test
    public void testHitTrue(){
        int uLeftX=10;
        int uLeftY=10;
        int lRightX=10;
        int lRightY=10;
        Rectangle rectangle=new Rectangle(uLeftX,uLeftY,lRightX,lRightY);
        assert rectangle.doesHit(rectangle)==true;
    }

    @Test
    public void testHitFalse(){
        int uLeftX=20;
        int uLeftY=20;
        int lRightX=10;
        int lRightY=10;
        Rectangle rectangle=new Rectangle(uLeftX,uLeftY,lRightX,lRightY);
        assert rectangle.doesHit(rectangle)==false;
    }
}
