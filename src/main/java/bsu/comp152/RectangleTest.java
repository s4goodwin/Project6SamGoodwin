package bsu.comp152;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;

//SamGoodwin
//I was able to get done two methods, and every bullet point prior.
//One method to test if doesHit returned true, and another to see if it returned false

//I was not able to two additional methods, or identify or fix the 'production code'

public class RectangleTest {

    @Test
    public void testHitTrue(){
        int uLeftX=10;          //creates int variables to create a rectange object
        int uLeftY=10;
        int lRightX=10;
        int lRightY=10;
        Rectangle rectangle=new Rectangle(uLeftX,uLeftY,lRightX,lRightY);  //creates a rectangle object
        assert rectangle.doesHit(rectangle)==true;      //checks if the method from the rectange class returns true
    }                                                   //when each int is the same

    @Test
    public void testHitFalse(){
        int uLeftX=20;              //creates int variables to create a rectange object
        int uLeftY=20;
        int lRightX=10;
        int lRightY=10;
        Rectangle rectangle=new Rectangle(uLeftX,uLeftY,lRightX,lRightY);//creates a rectangle object
        assert rectangle.doesHit(rectangle)==false;     //checks if the method returns false when the upperleft ints
    }                                                   //are larger than the others
}
