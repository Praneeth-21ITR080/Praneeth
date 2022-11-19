import java.awt.*; 
import java.awt.event.*;       
import java.awt.event.WindowEvent.*;    
import java.awt.event.WindowListener.*; 
class awt{    
    //21itr080
   awt() {  
  
      Frame f = new Frame();  
      Label l = new Label("Enter the Amount of water used:");   
      Button b = new Button("Submit");  
      TextField t = new TextField(); 
       Label l1=new Label("Enter Amount of electricity used:");
       Button b1=new Button("Submit");
       TextField t1= new TextField(); 

      Label addl = new Label("Enter Recipient address");   
      Button addb = new Button("Submit");  
      TextField addt = new TextField(); 
      Label namel=new Label("Enter Recipient's name");
      TextField namet=new TextField();
      Choice c1=new Choice();
      Label pay=new Label("Select your mode of payment");
      Label finwat=new Label();
      Label finele=new Label();
      Label finadd=new Label();
      Label finname=new Label();
      //Label finadd=new Label();
      Label finpay=new Label();
	   



      /*final TextField finwat = new TextField(6);
      final TextField finele = new TextField(6);
      final TextField addt = new TextField(6);
*/

       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Name:" + namet.getText();
            finname.setText(data);   
         }
       });
       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Address: " + addt.getText();
            finadd.setText(data);   
         }
       }); 
       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Water used: " + t.getText();
            finwat.setText(data);   
         }
       }); 
       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Electricity Used: " + t1.getText();
            finele.setText(data);   
         }
       }); 
       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Payment: " + c1.getItem(c1.getSelectedIndex());
            finpay.setText(data);   
         }
       });     
      
      // setting position of above components in the frame  
      namel.setBounds(20, 70, 180, 30);  
      namet.setBounds(20, 100, 180, 20);
      addl.setBounds(20, 130, 180, 30);  
      addt.setBounds(20, 160, 180, 100);  
      addb.setBounds(50, 405, 80, 20);
      l.setBounds(20, 260, 180, 30);  
      t.setBounds(20, 290, 180, 20);  
      //b.setBounds(100, 290, 80, 20);  
      l1.setBounds(20, 310, 180, 30); 
      t1.setBounds(20, 340, 180, 20);
     // b1.setBounds(100, 340, 180, 20); 
       c1.setBounds(20,380,180,30);
      pay.setBounds(20,360,180,20);
      finname.setBounds(20,430,180,20); 
      finadd.setBounds(20,450,180,20);
      finwat.setBounds(20,500,180,20);
      finele.setBounds(20,530,180,20);
      finpay.setBounds(20,560,180,20);      
    


   
   c1.add("UPI");
	c1.add("CASH");
	c1.add("NET BANKING");
      //f.add(b);  
      f.add(l);  
      f.add(t);  
      f.add(l1);  
      f.add(t1);  
     // f.add(b1);  
      f.add(finwat);
      f.add(finele);
      f.add(addb);  
      f.add(addl);  
      f.add(addt);
      f.add(finadd);
      f.add(namel);
      f.add(namet);
      f.add(c1);
      f.add(pay);
      f.add(finname);
      f.add(finpay);

    
      f.setSize(400,600);  
      f.setTitle("Bill Calculator");   
      f.setLayout(null);   
      f.setVisible(true);  

/*      b.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {    
            t1.setText("Welcome to Javatpoint."); 
    }
      });
*/
//addt.setBackground (Color.GRAY);    
        //setSize(400, 600); 



        


f.addWindowListener(new WindowAdapter() 
{
	@Override
	public void windowClosing(WindowEvent e) 
   {
		System.exit(0);
	}
});

  
}  

public static void main(String args[]) {   
awt awt_obj = new awt(); 

}  
} 
    
