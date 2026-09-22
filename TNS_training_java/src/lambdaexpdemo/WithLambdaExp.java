package lambdaexpdemo;

public class WithLambdaExp {


	interface Drawable1
	{
		public void draw();
	}
	public class WithLambdaExp {

		public static void main(String[] args) {
			int width=10;
			Drawable1 obj=()->{
				System.out.println("Drawing a width"+width);
			};
			obj.draw();

		}

	}

}
