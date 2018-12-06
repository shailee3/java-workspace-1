import java.util.*;
class Main{
    public static void main(String args[]){
    	ShipmentBO shipmentBO = new ShipmentBO();
    	Scanner s=new Scanner(System.in);
        System.out.println("Enter the distance of port1 :");
        int port1=s.nextInt();
        System.out.println("Enter the distance of port2 :");
        int port2=s.nextInt();
        
        if(shipmentBO.findNearestPort(port1, port2) == 1){
            System.out.println("Port1 is closer than Port2");
        }else if(shipmentBO.findNearestPort(port1, port2) == -1){
            System.out.println("Port2 is closer than Port1");
        }else if(shipmentBO.findNearestPort(port1, port2) == 0){
            System.out.println("Both Port1 and Port2 are closer");
        }
        s.close();
    }
}