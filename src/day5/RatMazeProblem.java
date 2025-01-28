package day5;

import java.util.Scanner;

public class RatMazeProblem {

	static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizr of the maze");
		N = sc.nextInt();
		
		int[][] maze = new int[N][N];
		
		System.out.println("Enter the input 1 and 0 for path selection and blocked");
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int[][] sol = new int[N][N];
		
		if(solveMaze(maze,sol,0,0)) {
			
			System.out.println("Solution found");
			displaySolution(sol);
		} else {
			System.out.println("No solutions due to blockage");
		}
		
	}

	private static void displaySolution(int[][] sol) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static boolean solveMaze(int[][] maze, int[][] sol, int x, int y) {
		// TODO Auto-generated method stub
		
		//if the rat reached its destination, mark the cell 1
		if(x==N-1&&y==N-1) {
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze,x,y)) {
			
			sol[x][y]=1;
			
			//Move to right(x,y+1)
			if(solveMaze(maze, sol, x, y+1)) 
					return true;   // recursive solution
			
			//Move to down (x+1,y)
			if(solveMaze(maze, sol, x+1, y)) 
				return true; // recursive solution
			
			sol[x][y]=0;
			return false;
		}
		return false;
	}

	private static boolean isSafe(int[][] maze, int x, int y) {
		// TODO Auto-generated method stub
		
		// if x and y are written boundaries -> x->0 to <N y -> 0 y<n
		return (x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);
	}

}
