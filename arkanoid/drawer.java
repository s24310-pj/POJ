package arkanoid;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class drawer extends logic{
	
	public static void drawing_window()
	{
		JFrame window = new JFrame();
				/*{
					@Override
					public void paintComponent(Graphic g)
					{
						Graphics2D g2 = (Graphics2D) g;
						Shape line = new Line2D.Double(3, 3, 303, 303);
					}
				}*/
		
		
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		JFrame window = new JFrame();  
        
		JButton button = new JButton("test dzialania");  
		button.setBounds(130, 100, 100, 40);//x, y, szerokosc, wysokosc
		          
		window.add(button);//adding button in JFrame
		
		
		System.out.println(x);
		
		window.setSize(400, 500);// wysokosc, serokosc  
		window.setLayout(null);
		window.setVisible(true);//making the frame visible
		
	}

}
