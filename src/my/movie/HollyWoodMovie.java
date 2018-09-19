package my.movie;

public class HollyWoodMovie extends Movie {

			public int H_id;
			public HollyWoodMovie(int cost, String name, int duration,String[] cast_crew, int rating, int h_id) 
			{
				super(cost, name, duration, cast_crew, rating);
				this.H_id = H_id;
				
				
			}
			public static void start(int id)
			 {
				 System.out.println("h_movie Started");
			 }
			 public static void endMovie()
			 {
				 System.out.println("end movie");
			 }
			 public static void watch()
			 {
				 System.out.println("watch movie");
			 }
			public HollyWoodMovie()
			 {
			 
			 }
	}

