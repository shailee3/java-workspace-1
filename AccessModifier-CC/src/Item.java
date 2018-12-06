
public class Item {   

   Integer id;
   String name;
   Double price;
    
    Item(Integer id,String name,Double price){
        this.id = id;
        this.name = name;
        this.price = price;        
    }
    
    
    void setId(Integer id){
        this.id = id;
    }
    Integer getId(){
        return id;
    }
    
     void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    
    void setPrice(Double price){
        this.price = price;
    }
    Double getPrice(){
        return price;
    }
    
}
