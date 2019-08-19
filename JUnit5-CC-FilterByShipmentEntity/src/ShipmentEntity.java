import java.util.Objects;


public class ShipmentEntity {
	private Integer id;
	private String name;
	private String accountNumber;
	private Long creditLimit;
	private String type;
	public ShipmentEntity(){
	}
	public ShipmentEntity(Integer id, String name, String accountNumber, Long creditLimit, String type) {
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.creditLimit = creditLimit;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentEntity shipmentEntity = (ShipmentEntity) o;
        return Objects.equals(id , shipmentEntity.id) &&
                Objects.equals(name, shipmentEntity.name) && 
                accountNumber.equals(shipmentEntity.accountNumber) && 
                Objects.equals(creditLimit, shipmentEntity.creditLimit) &&
                type.equals(shipmentEntity.type)
                ;
    }
	@Override
    public int hashCode() {
        return Objects.hash(id, name,accountNumber,creditLimit,type);
    }
	
}