package mydatatypes.entertainment;
public class Movie {
		// TODO Auto-generated method stub
		public char []movieName;
		public char []director;
		public char []hero;
		public char []producer;
		public char []heroine;
		public int noOfSongs;
		public double budget;
		public double duration;
		public void action()
		{
		}
		public void dance()
		{
		}
		public Movie(char []movieName1,char []director1,char []hero1,char []producer1,char []heroine1,
		int noOfSongs1,double budget1,double duration1)
		{
			char []movieName=movieName1;
			char []director=director1;
			char []hero=hero1;
			char []producer=producer1;
			char []heroine=heroine1;
			int noOfSongs=noOfSongs1;
			double budget=budget1;
			double duration=duration1;
		}
		public Movie()
		{
			//default
		}
	}


