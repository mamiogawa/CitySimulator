
public class Building {

	   BuildingKind kind;

	   int leftUpSideX ;
	   int leftUpSideY ; 
	   
	   int rightDownSideX; 
	   int rightDownSideY; 

	   
	   Building(int x, int y, BuildingKind kind){
		  this.leftUpSideX = x;
		  this.leftUpSideY = y;
		  
		  // ためしに　3 * 3 の建物を定義
		  this.rightDownSideX = x + 2;
		  this.rightDownSideY = x + 2;
		  this.kind = kind;
		  
	   }
	   
}
