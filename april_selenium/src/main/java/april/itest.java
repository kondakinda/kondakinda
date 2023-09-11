package april;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;

	public class EventListenerExample {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Event Listener Example");
	        JButton button = new JButton("Click Me!");

	        // Create an ActionListener to handle the button click event
	        ActionListener listener = new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Button clicked!");
	            }
	        };

	        // Attach the ActionListener to the button
	        button.addActionListener(listener);

	        frame.add(button);
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


