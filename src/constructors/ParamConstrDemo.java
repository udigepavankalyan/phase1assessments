package constructors;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}

	public class ParamConstrDemo {
	public static void main(String[] args) {

		Std std1=new Std(5,"Rohit");
		Std std2=new Std(11,"Pavan");
		std1.display();
		std2.display();
			}
	}

