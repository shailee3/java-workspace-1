public class Main{
	private int weight;
	private int distance;
	
	public Main() {
	}
	
	public Main(int weight,int distance) {
		this.weight = weight;
		this.distance = distance;
	}
   
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String computeDiscount() {
		if(weight<100||distance<500){
          return "Datex shipping offers discount";
        }else{
           return "Datex shipping offers no discount";
        }
	} 
	
}
