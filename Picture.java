/**
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campo;
    private Person person;
    private Circle c_small;
    private Circle c_big;
    private Square tronco;
    private Square timer;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        campo = new Square();
        campo.moveHorizontal(-310);
        campo.moveVertical(135);
        campo.changeSize(500);
        campo.makeVisible();
        campo.changeColor("green");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void moveSun()
    {
        if (sun != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(124);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void movePerson()
    {
        if (wall != null)   // only if it's painted already...
        {
            person = new Person();
            person.moveHorizontal(-280);
            person.moveVertical(23);
            person.makeVisible();
            person.slowMoveHorizontal(150);
        }
    }
        
    /**
     * Change this picture to use color display
     */
    public void createFigure()
    {
        if (wall != null)   // only if it's painted already...
        {
            c_small = new Circle();
            c_small.changeSize(40);
            c_small.moveHorizontal(105);
            c_small.moveVertical(60);
            c_small.changeColor("green");
            c_small.makeVisible();
            
            tronco = new Square();
            tronco.changeSize(20);
            tronco.moveVertical(118);
            tronco.moveHorizontal(35);
            tronco.changeColor("black");
            tronco.makeVisible();
            
            c_big = new Circle();
            c_big.changeSize(60);
            c_big.moveHorizontal(95);
            c_big.moveVertical(90);
            c_big.changeColor("green");
            c_big.makeVisible();
            
            timer = new Square();
        }
    
}

 /**
     * Change this picture to use color display
     */
    public void moveFigure()
    {
        if (tronco != null)   // only if it's painted already...
        {
            c_small.slowMoveVertical(2);
            c_small.slowMoveHorizontal(5);
            c_big.slowMoveVertical(2);
            c_small.slowMoveVertical(1);
            c_small.slowMoveHorizontal(5);
            c_big.slowMoveHorizontal(4);
            c_small.slowMoveVertical(1);
            c_small.slowMoveHorizontal(5);
            c_big.slowMoveVertical(2);
            c_small.slowMoveVertical(1);
            c_small.slowMoveHorizontal(5);
            c_big.slowMoveHorizontal(4);
            //Timer para deshacer cambios
            timer.changeSize(0);
            timer.changeColor("black");
            timer.makeVisible();
            timer.slowMoveHorizontal(100);
            timer.makeInvisible();
            //Volver al principio
            c_small.slowMoveVertical(-2);
            c_small.slowMoveHorizontal(-5);
            c_big.slowMoveVertical(-2);
            c_small.slowMoveVertical(-1);
            c_small.slowMoveHorizontal(-5);
            c_big.slowMoveHorizontal(-4);
            c_small.slowMoveVertical(-1);
            c_small.slowMoveHorizontal(-5);
            c_big.slowMoveVertical(-2);
            c_small.slowMoveVertical(-1);
            c_small.slowMoveHorizontal(-5);
            c_big.slowMoveHorizontal(-4);
            
           
            
        }
    
}
}
