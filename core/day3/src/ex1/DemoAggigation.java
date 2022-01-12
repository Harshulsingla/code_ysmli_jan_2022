package ex1;
//aggigation
//MusicGroup<>------Musician
class Musician {
	private String musicianName;
	private String musicInstument;
	private int rating;

	public Musician(String musicianName, String musicInstument, int rating) {
		super();
		this.musicianName = musicianName;
		this.musicInstument = musicInstument;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void printMusicianDetails() {
		System.out.println("----------------------------");
		System.out.println("musicianName: " + musicianName);
		System.out.println("musicInstument: " + musicInstument);
		System.out.println("rating: " + rating);
		System.out.println("----------------------------");
	}

	public void perform() {
		System.out.println("sa re ga ma ..."+ musicInstument);
	}

}

class MusicGroup{
	
	private String musicGroupName;
	private String musicGroupAddress;
	
	private Musician musician;
	
	public MusicGroup(String musicGroupName, String musicGroupAddress) {
		this.musicGroupName = musicGroupName;
		this.musicGroupAddress = musicGroupAddress;
	}

	public void hireAnMusician(Musician musician) {
		this.musician=musician;
	}
	
	public void program() {
		System.out.println("musicGroupName: "+ musicGroupName);
		System.out.println("musicGroupAddress: "+ musicGroupAddress);
		musician.perform();
	}
	
}
public class DemoAggigation {

	public static void main(String[] args) {

		Musician musician=new Musician("amit", "flute", 2);
		
		MusicGroup group=new MusicGroup("t series", "Mumbai");
		
		MusicGroup group2=new MusicGroup("p series", "Mumbai");
		
		group2.hireAnMusician(musician);
		group.hireAnMusician(musician);
		
		group.program();
		group2.program();
		
		group=null;
		group2=null;
		
		musician.perform();
	}

}
