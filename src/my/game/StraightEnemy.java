package my.game;

public class StraightEnemy extends Enemy
{
	public StraightEnemy(double x,double y, double vx,double vy)
	{
		super(x,y,vx,vy);
		life=4;
		score=4;
	}
	
	public void draw(MyFrame f)
	{
		f.setColor(255,255,0);
		f.fillRect(x+8,y-15,14,15);;
		f.setColor(255,255,0);
		f.fillRect(x+10,y,10,15);
	}
}
