package Variable;

public class Globalvariable {
	
	             int roll;
	             String name;  //Non static variable
	             
	             static String insitiuationname= "AKTU";  //static variable
	             

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Globalvariable abc = new Globalvariable();
		                abc.roll =21;
		                abc.name="Jhon";
		                
	System.out.println(abc.roll +","+abc.name +","+abc.insitiuationname);
	
		                
		
                        abc.roll =22;
                      abc.name="patric";
    
     System.out.println(abc.roll +","+abc.name +","+abc.insitiuationname);

		

	}

}
