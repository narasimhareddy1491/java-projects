
public class OOP{
	public static void main(String[] args){
		System.out.println("hello world");
		User u = new User();
		u.name= "reddy";
		u.membership= "Gold";
		User u2 = new User();
		u2.name= "narasimha";
		u2.membership= "silver";
		System.out.println("user name  is : " + " " + u.name + "user membership is :" + " " +  u.membership);
		System.out.println("user name  is : " + " " + u2.name + "user membership is :" + " " + u2.membership);
		u.setName("bhaskar");
		System.out.println(u.getName());



	}

}