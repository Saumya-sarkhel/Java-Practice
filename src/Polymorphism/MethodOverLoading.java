class OverLoad{

    // same method name with different parameters
    public void show(){
		System.out.println("In show 1");
	}

	public void show(int x){
		System.out.println("In show 2");
	}

	public void show(int x,float y){
		System.out.println("In show 3");
	}

	public void show(float y){
		System.out.println("In show 4");
	}

	public void show(float y,int x){
		System.out.println("In show 5");
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {

		OverLoad ob = new OverLoad();

		ob.show();  // show 1

		ob.show(5);  // show 2

		ob.show(5.5f,6); // show 3

		ob.show(9.5f);  // show 4

		ob.show(5,6.5f);  // show 5

	}

}
