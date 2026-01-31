import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  private String[] categories;
  private String[] photos;

  /**
   * No-argument constructor.
   * Sets up the categories and reads the photo list from the text file.
   */
  public LastYear() {
    categories = new String[] {"Family", "Places", "Baseball"};
    photos = FileReader.toStringArray("lastYearImages.txt");
  }

  /**
   * Parameterized constructor.
   * Reads photos from a file name that is passed in.
   */
  public LastYear(String photoFile) {
    categories = new String[] {"Family", "Places", "Baseball"};
    photos = FileReader.toStringArray(photoFile);
  }

  /**
   * Draws the 2025 recap scene.
   * Shows category words and displays 3 photos for each category.
   */
  public void drawScene() {

    // Clears the screen with a white background
    setFillColor("white");
    drawRectangle(0, 0, 400, 400);

    // Plays background sound and title image
    playSound("peaceful-ambiance-theme-8734.wav");
    drawImage("recap.png", 180, 20, 120);
    playSound("pop-402324.wav");
    pause(1);

    int index = 0; // Keeps track of which photo is next

    // Loop through each category
    for (int i = 0; i < categories.length; i++) {

      // Draw category label on the left
      drawText(categories[i], 20, 120 + i * 30);
      pause(0.5);

      // Draw 3 photos for this category
      for (int j = 0; j < 3; j++) {
        drawImage(photos[index], 145 + j * 10, 95 + j * 10, 220);
        pause(2);
        index++;
      }

      pause(0.5);
    }
  }
}
