
public class LineAdapter implements Shape{

	private Line l;
	
	public LineAdapter(Line line)
	{
		this.l = line;
	}
	
	@Override
	public void draw(int x1, int y1,int x2,int y2) {
		l.draw(x1, y1, x2, y2);
	}
	
}
