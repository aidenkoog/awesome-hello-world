package java_awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldAidenKooG {

  public static void main(String[] args) {

    Frame frame = new Frame("Hello!");
    Label contentLabel = new Label("Hello World! AidenKooG!", Label.CENTER);

    frame.add(contentLabel);
    frame.setSize(300, 100);
    frame.setVisible(true);

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });

  }
}