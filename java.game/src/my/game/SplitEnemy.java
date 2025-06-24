package my.game;

import java.util.Vector;

public class SplitEnemy extends Enemy
{
	 private int generation; // 分裂回数を制御するための世代数
	
	public SplitEnemy(double x,double y, double vx,double vy, int generation)
	{
		super(x,y,vx,vy);
		this.generation = generation;
		life=2;
		score=2;
	}
	
	
	
	public void draw(MyFrame f)
	{
		f.setColor(0,255,255);
		f.fillOval(x,y,20,20);;
	
	}
	
	// 分裂処理（小型敵を2体追加）
    public void split(Vector<Enemy> enemies) 
    {
    	if (generation >= 2) return; 
    	
		GameWorld.enemies.add(new SplitEnemy(x - 20, y, -Math.abs(vx), vy,generation + 1));
		GameWorld.enemies.add(new SplitEnemy(x + 20, y, Math.abs(vx), vy,generation + 1));
    }
}
