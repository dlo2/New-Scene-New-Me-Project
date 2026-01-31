import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  private String[] goals;

  /**
   * No-argument constructor.
   * Sets up the default goals for 2026.
   */
  public ThisYear() {
    goals = new String[] {
      "Get better grades",
      "Work out consistently",
      "Save money",
      "Get better at baseball"
    };
  }

  /**
   * Parameterized constructor.
   * Allows a custom list of goals to be passed in.
   */
  public ThisYear(String[] goals) {
    this.goals = goals;
  }

  /**
   * Draws the 2026 goals scene.
   * Displays a title image and a caption box with goals.
   */
  public void drawScene() {

    // Clears the screen for a new scene
    setFillColor("white");
    drawRectangle(0, 0, 400, 400);

    // Plays sound and draws the goal title image
    playSound("peaceful-ambiance-theme-8734.wav");
    drawImage("goal.png", 100, 100, 200);
    playSound("pop-402324.wav");
    pause(1);

    // Draws the caption box with the goals inside
    drawCaptionBox(25, 260, 350, 120);
    pause(3);
  }

  /**
   * Draws a caption box and writes each goal on a new line.
   */
  public void drawCaptionBox(int xPos, int yPos, int width, int height) {

    // Shadow rectangle behind the box
    setFillColor("black");
    drawRectangle(xPos + 5, yPos + 5, width, height);

    // Main white box
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);

    // Sets the text style for goals
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    setTextColor("black");
    int fontSize = 22;
    setTextHeight(fontSize);

    int xLinePos = xPos + 10;
    int yLinePos = yPos + fontSize;

    // Loop through the goals array and display each one
    for (String line : goals) {
      drawText(line, xLinePos, yLinePos);
      yLinePos += fontSize;
    }
  }
}
