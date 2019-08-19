public class CargoBO {
	public Cargo cargoDetails(String name,String desc,double length,double width) {
		return new Cargo(name,desc,length,width);
	}
}
