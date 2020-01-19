package kr.or.connect.daoexam.main;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import kr.or.connect.daoexam.config.ApplicationConfig;

public class DataSourceTest {
	public static void main(String[] args) {
		// ApplicationConfig.clss에 정의되어있는 설정 파일을 읽어서 ApplicationContext를 생성
 
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// ApplicationContext가 IoC/DI 컨테이너이므로 getBean() 함수를 이용해서 DataSource를 구현하고 있는 객체를 나한테 리턴
		// 따라서 DataSource를 구현하고 있는 실제 객체를 얻어낸다
		DataSource ds = ac.getBean(DataSource.class);
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			if(conn != null) {
				System.out.println("접속 성공");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
