package my.movie;

public class BollyWoodMovie extends Movie
{

			public int B_id;
			
			public BollyWoodMovie(int cost, String name, int duration,String[] cast_crew, int rating, int b_id)
			{
				super(cost, name, duration, cast_crew, rating);
				this.B_id = B_id;
				
				
			}
			public static void start(int id)
			 {
				 System.out.println("b_movie Started");
			 }
			 public static void endMovie()
			 {
				 System.out.println("end movie");
			 }
			 public BollyWoodMovie()
			 {

			 }
	}