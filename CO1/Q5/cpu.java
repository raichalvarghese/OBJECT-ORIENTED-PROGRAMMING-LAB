public class CPU{
	int price;
	
	class processor{
		int cores;
		String manufact;
		processor(int cr,String manufacturer){
			cores = cr;
			manufact = manufacturer;
		}
		void display(){
			System.out.println("Number of cores:"+cores);
			System.out.println("Manufacturer:"+ manufact);
		}
	}
	static class ram{
		int mem;
		String manu;
		ram(int memory,String manufactr){
			mem= memory;
			manu = manufactr;
		}
		void display(){
			System.out.println("Memory:"+mem);
			System.out.println("Manufacturer:"+ manu);
		}
	}
	public static void main(String[] args){
		CPU.ram obj1 = new CPU.ram(8,"INTEL");
		CPU obj2=new CPU();
		obj1.display();
		CPU.processor obj3 = obj2.new processor(1,"Samsung");
		obj3.display();
	}
}
