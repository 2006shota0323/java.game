
package my.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;;

public class Player extends Character implements KeyListener
{
	public void draw(MyFrame f)
	{
		f.setColor(256,0,0);
		f.fillRect(x, y+20, 30, 10);;
		f.setColor(0,0,0);
		f.fillRect(x+10, y, 10, 30);
	}
	
	
	public Player(double x,double y, double vx,double vy)
	{
		super(x,y,vx,vy);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT )
		{
			vx=-5;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT )
		{
			vx=5;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE)
		{
			 int maxBullets = 30; // 最大弾数を10に制限
			 
			 if(GameWorld.playerBullets.size() < maxBullets)
			 {
				 GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));

				 GameWorld.playerBullets.add(new PlayerBullet(x-10,y,-2,-10));


				 GameWorld.playerBullets.add(new PlayerBullet(x+10,y,2,-10));

				 System.out.println("弾の数="+ GameWorld.playerBullets.size());
			}
			 }
			
		     
		else
		{
			 System.out.println("弾の数が最大です");
		}
		
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			System.out.println("Enterキーが押されました");
			GameWorld.enterPressed=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT )
		{
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT )
		{
			vx=0;
		}
	}
	
	public void move()
	{
		super.move();
		if(x<0) x=0;
		if(x>370) x=370;
	}
}
