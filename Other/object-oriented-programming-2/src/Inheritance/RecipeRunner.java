package Inheritance;

public class RecipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		System.out.println();
		RecipeWithMicrowave recipe2 = new RecipeWithMicrowave();
		recipe2.execute();
	}

}
