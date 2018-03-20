package GuiBing;

public class INT implements Comparable<INT>{
	int x;
	int index;
	public INT(int x,int index)
	{
		this.x =x;
		this.index = index;
	}
	@Override
	public int compareTo(INT o) {
		INT b = (INT) o;
		if(Math.abs(b.x)==Math.abs(this.x))
			return 0;
		else if(Math.abs(this.x)<Math.abs(b.x))
			return 1;
		else 
			return -1;
		
		
}}
