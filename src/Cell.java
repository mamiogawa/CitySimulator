import java.util.ArrayList;


public class Cell {

    int buildingNo ;
    
    int x;
    int y;
    ArrayList<Building> building;
    
    Cell(int x, int y,ArrayList<Building> building){
    	buildingNo = -1;
    	this.x = x;
    	this.y = y;
    	this.building = building;
    	
    }
	
    int getBuildingNo(){
		return buildingNo;
    }
    
    
    void buildBuilding(BuildingKind kind,int buildingNo){
    	
    	this.buildingNo = buildingNo;
    	 building.add(buildingNo, new Building(this.x,this.y,kind));
    	
    }
    
    
    BuildingKind getBuildingKind(){
		
    	if(buildingNo != -1){
    		
    		return building.get(buildingNo).kind;
    	}
    		return BuildingKind.None;
    }
    
}
