import java.util.ArrayList;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CELL_X_MAX = 20;
		final int CELL_Y_MAX = 20;

		int buildingNo = 0;
		
		Cell[][] cell = new Cell[CELL_X_MAX][CELL_Y_MAX] ;
		ArrayList<Building> building = new ArrayList<Building>();
		
		  for (int i=0; i < CELL_X_MAX;i++) {    
			  for (int j=0; j < CELL_X_MAX;j++) {    
					cell[i][j] = new Cell(i,j,building);
				}	
		  }
	  
		  for (int i=0; i < CELL_X_MAX;i++) {    
			  for (int j=0; j < CELL_Y_MAX;j++) {    
					
					if(cell[i][j].getBuildingNo() == -1){
						System.out.print(" ");
					}
					
				}	
			  System.out.print("\n");
		  }

		  //cell[1][1].buildBuilding(BuildingKind.Residential);
		  cell[1][1].buildBuilding(BuildingKind.Residential,buildingNo);
		 // building.add(new Building(1,1,BuildingKind.Residential));
		  buildingNo +=1 ;
		  
		  System.out.print(cell[2][1].getBuildingKind());
}

	
}