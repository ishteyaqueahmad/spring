 class Parent {

	public void show() {
		System.out.println("Parent Show");
	}
	
	public void show(int i) {
		System.out.println("Parametrised");
	}
//	
//
	
}
 class Child extends Parent{
	@Override
		public void show() {
		super.show();
		System.out.println("In child");
		}
	public static void main(String[] args) {
		Parent p=new Child();
		p.show();
		p.show(60);
		
	}
	
}
