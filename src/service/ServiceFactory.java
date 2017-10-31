package service;
import region.Region;

public class ServiceFactory {
	public static Service getService(String type, Region locationFrom,String number, Region locationTo, float value){
			if("Message".equalsIgnoreCase(type)){
				return new Message(locationFrom,number,locationTo,value);
			}
			else if("Call".equalsIgnoreCase(type)){
				return new Call(locationFrom,number,locationTo,value);
			}
			else 
				return new InternetUsage(locationFrom,number,value);
	}
}
