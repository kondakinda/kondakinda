package april;


	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;

	public class HookableProgram {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Hookable Program");
	        JButton button = new JButton("Click Me!");

	        // Create a hook (action listener) to intercept the button click event
	        ActionListener hook = new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Hooked! Button clicked.");
	            }
	        
	            
	            
	        }

	        // Attach the hook (action listener) to the button
	        button.addActionListener(hook);

	        frame.add(button);
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


	

