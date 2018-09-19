package my.movie;

public class TollyWoodMovie extends Movie {

	 public int t_id;
	 
	
	public TollyWoodMovie(int cost, String name, int duration,String[] cast_crew, int rating, int t_id) 
	{
		super(cost, name, duration, cast_crew, rating);
		this.t_id = t_id;
		
		
	}

	public TollyWoodMovie() {
	}

	public static void start(int id) 
	{
		System.out.println("t_Started");
	}
	 
		
	}
	
