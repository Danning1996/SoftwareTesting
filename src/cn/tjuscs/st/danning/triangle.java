package cn.tjuscs.st.danning;

public class triangle {
	public int triangleJudge(int a,int b,int c){
		
		int kindOfTrg;
		//The number is right
		if(a > 0 && b > 0 && c > 0){
			
			//equilateral
			if(a == b && a == c){
				return kindOfTrg = 2;
			}
			//scalene
			else if(a != b && a != c && b != c){
				return kindOfTrg= 0;
			}
			//isosceles
			else{ 
				return kindOfTrg = 1;
			}
			
		}
		//Can not be a triangle
		else {
			return kindOfTrg = -1;
		}
			
	}
}