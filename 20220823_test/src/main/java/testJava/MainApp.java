package testJava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//API를 context라고 명명, 추상클래스나 인터페이스는 자기 자신을 초기화할 수 없음			생성한 xml파일명(리소스파일)을 적으면 됨
		//지금까지 컨테이너 생성
		
//		TV tv = (TV) context.getBean("samsungTV");
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		LGTV tv1 = (LGTV) context.getBean("lgTV");
		tv1.getTv().powerOff();
		
//		LGTV tv2 = new LGTV((TV) context.getBean("samsungTV"));
		
	}

}
