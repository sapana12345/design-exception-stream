package corejavaproject;

  class student {

	void message()
	{
		System.out.println("welcome");
		
	}
	class student extends person{
		void message() {
			
		
		System.out.println("welcome to java");

	}
		void disaply() {
			
		
		message();
		super.message();


		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
s1.disaply();
	}

}
}
