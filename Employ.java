package apjfsa;

public class Employ {

      //Method Overriding
		//Parent class


			 String Name;
		     int id;
			
			//constructor using id and name
			Employ(int id,String string){
				this.id=id;
				this.Name=string;
				
				
	
			}
			public Employ(int id2, java.lang.String string) {
				// TODO Auto-generated constructor stub
			}
			void details() {
				System.out.println("Details of employee");
			}
			
			void TotalSal(float salary) {
				System.out.println("Salary of employee");
		
			}
	public static void main(String[] args) {
		Employ e = new Employ(4356,"Anusha");
		e.Employ();
		
	}


	private void Employ() {
		System.out.println("print Emply details");

		
	}


	//child class inherits parent class
	public class PermanentEmployee extends Employ
	{
		 
			
			
			
			String Type;
			//constructor of child class(permanentEmp) and extending features from parent class(Employ)

			PermanentEmployee(int id,String Name,String Type){
				super(id, Type);
				this.Type=Type;
			}
			
			//overriding the parent class method details()
			@Override
			void details() {
				System.out.println(" Employee Name:"+Name);
				String id = null;
				System.out.println(" Employee id:"+id);
				System.out.println(" Employee Type:"+Type);
				
			}
			//overriding the parent class method totalsal()
			@Override
			void TotalSal(float salary) {
				System.out.println("Salary:"+salary);
			}
			public static void main(String[] args) {
				PermanentEmployee p=new PermanentEmployee(7895,"Karhik","Permanent");
				p.details();
				p.TotalSal(45000);
			}	

	public class ContractEmployee extends Employ{

			
			String Type;
			//constructor of child class(contractEmp) and extending features from parent class(Emp)
			 ContractEmployee(int id,java.lang.String string,java.lang.String string2){
				super(id, string2);
				this.Type=string2;
			}
			
			//overriding the parent class method details()
			 @Override
			void details() {
				
				String id = null;
				System.out.println(" Employee id:"+id);
				System.out.println(" Employee Name:"+Name);
				System.out.println(" Employee Type:"+Type);
				
			}
			
			//overriding the parent class method totalsal()
			 @Override
			void TotalSal(float salary) {
				System.out.println("Salary:"+salary);
			}
			public static void main(String[] args) {
				String contract = null;
				String Sowmya;
				ContractEmployee c=new ContractEmployee(6784,"Sowmya","contract");
				c.details();
				c.TotalSal(80000);
			  

	}
	}
	}
	}
		

		
		


