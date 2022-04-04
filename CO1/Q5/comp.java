class cpu{
	int price;
	public void show() {
		System.out.print(".");
	}
	class processor{
		int core;
		String manufact;
		processor(int cr,String manufacturer){
			core = cr;
			manufact = manufacturer;
		}
		public void display() {
			System.out.println("Processor: Core-"+core+"Manufacturer-"+manufact);
		}
		
	}
	class ram{
		int mem;
		String manu;
		ram(int memory,String manufactr){
			mem = memory;
			manu = manufactr;
		}
		void display() {
			
		}
	}
}
public class comp{
	public static void main(String[] args) {
		cpu obj = new cpu();
		obj.show();
		cpu.processor obj1 = obj.new processor(1,"Samsung");
		obj1.display();
		cpu.ram obj2 = obj.new ram(2,"intel");
		obj2.display();
	}
}

