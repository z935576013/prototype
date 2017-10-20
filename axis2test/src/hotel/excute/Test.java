package hotel.excute;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.google.gson.Gson;

import hotel.gen.HandlerStub;
import hotel.gen.HandlerStub.Acknowledgement;
import hotel.gen.HandlerStub.ProcessRequest;
import hotel.gen.HandlerStub.ProcessRequestResponse;
import hotel.gen.Request;

public class Test {

	public static void main(String[] args) throws RemoteException {
//		HelloServiceStub stub = new HelloServiceStub();
//		SayHelloToPerson p = new SayHelloToPerson();
//		p.setName("SAONIMA");
//		SayHelloToPersonResponse response = stub.sayHelloToPerson(p);
//		String ret = response.get_return();
//		System.out.println(ret);
		
//		WeatherWSStub stup=new WeatherWSStub();
//		GetWeather getWeather=new GetWeather();
//		getWeather.setTheCityCode("南京");
//		GetWeatherResponse  response=stup.getWeather(getWeather);
//		ArrayOfString  as=response.getGetWeatherResult();
//		System.out.println(new Gson().toJson(as.getString()));		
		
		HandlerStub stub2=new HandlerStub();
		ProcessRequest processRequest=new ProcessRequest();
		Request param=new Request();
		param.setDocumentDate(Calendar.getInstance());
		processRequest.setRequest(param);
		ProcessRequestResponse response=stub2.processRequest(processRequest);
		Acknowledgement acknowledgement=response.getProcessRequestResult();
		System.out.println(new Gson().toJson(acknowledgement));
		
	}
}
