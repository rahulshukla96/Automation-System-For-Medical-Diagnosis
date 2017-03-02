
import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;



public class aboutUs extends JPanel
{
	public JEditorPane editor;
	public aboutUs() 
	{
		this.setLayout(null);
		setSize(400,600);
		setBackground(Color.gray);
		launch();
		
	}
	
	public void launch()
		{
		try
		{
			URL url = null;
			try 
			{
				url = getClass().getResource("about.htm");
            } 
            catch (Exception e) 
            {
				System.err.println("Failed to open ");
				url = null;
            }
            
	            if(url != null) 
	            {
	                editor = new JEditorPane(url);
	                editor.setEditable(false);
	                JScrollPane scroller = new JScrollPane(editor);
	                scroller.setBackground(Color.gray);
	                editor.setBackground(Color.gray);
	                scroller.setBounds(0,0,400,600);
			        add(scroller);
			     }
		        
		   } 
		   catch (MalformedURLException e) 
		   {
		       System.out.println("Malformed URL: " + e);
		   } 
		   catch (IOException e) 
		   {
		       System.out.println("IOException: " + e);
		   }
		}
	
}
		
		
