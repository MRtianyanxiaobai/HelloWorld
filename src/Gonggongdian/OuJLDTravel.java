package Gonggongdian;

 

public class OuJLDTravel {
	
	public static void Print(double map[][]) {
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				System.out.printf("%.2f ", map[i][j]);
			}
			System.out.println("");
		}
	}
	public static double FindDist(Point p1,Point p2)
	{
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
	}
	public static void main(String[] args) {
		Point[] point = {
			new Point(0, 0),
			new Point(1,6),
			new Point(2,3),
			new Point(5,2),
			new Point(6,5),
			new Point(7,1),
			new Point(8,4)
			};
		double[][] s =  new double[point.length][point.length];
		s[0][0] = 0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i;j<s[0].length;j++)
			{
				if(i<=j  && i!=j-1 && j!=0)
				{
					s[i][j] = s[i][j-1]+FindDist(point[j-1],point[j]);
					s[j][i] = s[i][j]; 
				}
				else if(i<=j && i==j-1)
				{
					double min = Double.MAX_EXPONENT;
					for(int k=0;k<j;k++)
					{
						if(min>s[i][k]+FindDist(point[k], point[j]))
						{
							min  = s[i][k]+FindDist(point[k], point[j]);
						}
					}
					s[i][j] = min;
					s[j][i] = min;
				}
			}
		}
		Print(s);
	}

}
class Point{
	public int x;
	public int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
}
