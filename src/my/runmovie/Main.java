package my.runmovie;

import my.movie.HollyWoodMovie;
import my.movie.Movie;
import my.movie.TollyWoodMovie;
import my.movie.BollyWoodMovie;

class Main {
public static void main(String[] args)
{
		Movie m=new Movie();
		TollyWoodMovie t=new TollyWoodMovie();
		BollyWoodMovie b=new BollyWoodMovie();
		HollyWoodMovie h=new HollyWoodMovie();
	
		System.out.println("TOLLYWOODMOVIE movie");
		System.out.println(t.t_id=111);
		System.out.println(t.cost=120);
		System.out.println(t.name="bahubali");
		System.out.println(t.duration=2.0);
		
		t.cast_crew=new String[]{"director:rajamouli","hero:prabas","heroin:anushka"};
		for(int i=0;i<t.cast_crew.length;i++)
		{
		System.out.println(t.cast_crew[i]);
		}
		System.out.println(t.rating=4);
		t.start(10);
		
		System.out.println("BOLLYWOODMOVIE");
		System.out.println(b.B_id=222);
		System.out.println(b.cost=250);
		System.out.println(b.name="dhadak");
		System.out.println(b.duration=2.30);
		b.cast_crew=new String[]{"director:trivikram"," ","hero:ram"," ","heroin:kajal"};
		for(int j=0;j<b.cast_crew.length;j++)
		{
		System.out.println(b.cast_crew[j]);
		}
		System.out.println(b.rating=4);
		b.start(10);
		b.endMovie();
		
		System.out.println("HOLLYWOODMOVIE movie");
		System.out.println(h.H_id);
		System.out.println(h.cost=300);
		System.out.println(h.name="iceage");
		System.out.println(h.duration=3.0);
		h.cast_crew=new String[]{"director:sudheer,hero:kalyan,heroin:teju"};
		for(int k=0;k<h.cast_crew.length;k++)
		{
		System.out.println(h.cast_crew[k]);
		}
		System.out.println(h.rating=4);
		h.start(10);
		h.endMovie();
		h.watch();
		
		

}
}
