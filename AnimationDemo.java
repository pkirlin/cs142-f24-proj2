import java.awt.*;

public class AnimationDemo {
    public static void main(String[] args) {
        SimpleCanvas canv = new SimpleCanvas(320, 100);
        canv.show();

        // set up variables that determine where the ball is drawn
        int centerX = 20, centerY = 50;
        int radius = 20;

        while (true) {
            canv.clear();  // clear canvas
            canv.drawFilledCircle(centerX, centerY, radius); // draw ball
            canv.update(); // update the canvas to make the updated ball visible

            // pause so there's time for the user to see the ball before
            // we move it and re-draw it.  Use a bigger number to slow down
            // the animation, and a smaller number to make it faster.
            canv.pause(250);

            // "Move" the ball.  Note that updating the variable doesn't
            // actually move it, not until the loop goes back to the top
            // and we re-draw it at the updated location.
            centerX += 40;
            if (centerX > canv.getWidth()) {
                centerX = 20;
            }
        }
    }
}
