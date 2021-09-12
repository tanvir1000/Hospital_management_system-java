import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
//java api documentation
class First extends Frame implements ActionListener, WindowListener{
	
	public DoctorSignup sign;
	public StaffSignup signs;
	public PatientSignup signp;
	
	
	public Start fi;

	public First(Start f){
		super("Admin Page");
		fi=f;
		sign=new DoctorSignup(this);
		signs=new StaffSignup(this);
		signp=new PatientSignup(this);
		
		Button l=new Button("DoctorSignup");
		Button s=new Button("StaffSignup");
		Button c=new Button("PatientSignup");
		
		Button w=new Button("Back");
		
		add(l);add(s);add(c);add(w);
		l.setBounds(30,40,90,30);
		s.setBounds(140,40,90,30);
		c.setBounds(250,40,90,30);
		w.setBounds(140,260,110,30);
	
		l.addActionListener(this);
		s.addActionListener(this);
		c.addActionListener(this);
		w.addActionListener(this);
		
		
		addWindowListener(this);
		setLayout(null);
		setSize(500,400);
		setLocation(500,200);
		
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		
	 if(s.equals("DoctorSignup")){
			sign.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		else if(s.equals("StaffSignup")){
			signs.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		    else if(s.equals("PatientSignup")){
			signp.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
	
		 else if(s.equals("Back")){
			fi.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		

	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		//this.setVisible(false);
		System.exit(0);
		//System.out.println("Window closing");
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}