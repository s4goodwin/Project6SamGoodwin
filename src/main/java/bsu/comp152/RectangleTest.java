package bsu.comp152;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {

    @Test
    public void testDoesHit(){
        int uLeftX=10;
        int uLeftY=10;
        int lRightX=10;
        int lRightY=10;
        boolean ans=true;
        Rectangle rectangle=new Rectangle(uLeftX,uLeftY,lRightX,lRightY);
        assert rectangle.doesHit(rectangle)==true;



    }
}
