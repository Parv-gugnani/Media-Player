import javax.swing.*;
import javax.media.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMediaPlayer extends JFrame {
    private Player player;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;

    public SimpleMediaPlayer() {
        super("Simple Media Player");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create UI components
        playButton = new JButton("Play");
        pauseButton = new JButton("Pause");
        stopButton = new JButton("Stop");

        // Add action listeners
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playMedia();
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pauseMedia();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopMedia();
                // 
                // 
                // 
                // 
                // 
                // 
                
                // 
                // 
                // 
                // 
                // 
                // 
                // 

            }
        });

        // Add components to the frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Display the frame
        setVisible(true);
    }

    private void playMedia() {
        try {
            MediaLocator mediaLocator = new MediaLocator("file:/path/to/your/media/file.mp3"); // Change this to the path of your media file
            player = Manager.createRealizedPlayer(mediaLocator);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pauseMedia() {
        if (player != null) {
            player.stop();
        }
    }

    private void stopMedia() {
        if (player != null) {
            player.stop();
            player.close();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleMediaPlayer();
            }
        });
    }
}
