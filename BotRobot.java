import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotRobot {
static void next_move(int posr, int posc, int dimh, int dimw, String[] board){
    
    int gridofbot=posr;
        int posofbot=posc;
        int posofdirt=0;
        int gd=0;
        int pd=0;
        int pos=0;
        int pos1=100;
        int getgrid=0;
        int getpos=0;
        for(int j=0;j<board.length;j++)
        {
        for(int k=0;k<board[j].length();k++)
        {
			
			if(board[j].charAt(k)=='d')
			{
				gd=Math.abs(posr-j);
				pd=Math.abs(posc-k);
				pos=gd+pd;
				if(pos<pos1)
				{
					int min=pos;
					getgrid=j;
					getpos=k;
					//System.out.println(min+" "+j+" "+k);
					pos1=min;
				}
				
				//System.out.println(pos1);
			}
			
		}
	}
	if(getgrid==gridofbot && getpos==posofbot)
	{
		System.out.println("CLEAN");
	}
	else if(getgrid==gridofbot && getpos!=posofbot)
	{
		if(posofbot<getpos)
		{
			System.out.println("RIGHT");
		}
		else if(posofbot>getpos)
		{
			System.out.println("LEFT");
		}
	}
	else if(getgrid!=gridofbot)
	{
		if(gridofbot<getgrid)
		{
			System.out.println("DOWN");
		}
		else if(gridofbot>getgrid)
		{
			System.out.println("UP");
		}
	}
    
    
    
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        next_move(pos[0], pos[1], dim[0], dim[1], board);
    }
}
