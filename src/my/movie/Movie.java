package my.movie;

public class Movie {

			public int cost;
			public String name;
			public double duration;
			public String[] cast_crew;
			public int rating;
			
			
			
			Movie(int cost,String name,int duration,String[] cast_crew,int rating)
			{
				this.cost=cost;
				this.name=name;
				this.duration=duration;
				this.cast_crew=cast_crew;
				this.rating=rating;
				
				
			}
			public Movie() {
				System.out.println("o-para");
			}
			public static void start(int id)
			{
				System.out.println("started");
			}

		}
	


