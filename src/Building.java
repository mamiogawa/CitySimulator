public class Building {

	   BuildingKind kind;

	   int leftUpSideX ;
	   int leftUpSideY ; 
	   
	   int rightDownSideX; 
	   int rightDownSideY; 

	   
	   Building(int x, int y, BuildingKind kind){
		  this.leftUpSideX = x;
		  this.leftUpSideY = y;
		  
		  // ���߂��Ɂ@3 * 3 �̌������`
		  this.rightDownSideX = x + 2;
		  this.rightDownSideY = y + 2;
		  this.kind = kind;
		  
	   }
	   
}
