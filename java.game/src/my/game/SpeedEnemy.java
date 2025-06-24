package my.game;

public class SpeedEnemy extends Enemy
{
	public SpeedEnemy(double x,double y, double vx,double vy)
	{
		super(x,y,vx,vy);
		life=5;
	}
	
	public void move()
	{
		super.move();
		vy=vy+0.9;
	}
	
	public void draw(MyFrame f)
	{
		f.setColor(255,0,0);
		f.fillRect(x, y+10,24,5);;
		f.setColor(255,0,0);
		f.fillRect(x+10,y,5,40);
	}
}
