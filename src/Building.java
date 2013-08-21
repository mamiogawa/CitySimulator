
public class Building {

	   BuildingKind kind;

	   int leftUpSideX ;
	   int leftUpSideY ; 
	   
	   int rightDownSideX; 
	   int rightDownSideY; 

	   
	   Building(int x, int y, BuildingKind kind){
		  this.leftUpSideX = x;
		  this.leftUpSideY = y;
		  
		  // ‚½‚ß‚µ‚É@3 * 3 ‚ÌŒš•¨‚ğ’è‹`
		  this.rightDownSideX = x + 2;
		  this.rightDownSideY = x + 2;
		  this.kind = kind;
		  
	   }
	   
}
