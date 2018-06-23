import com.backbase.services.ApplicationService;
import com.backbase.services.ApplicationServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationService applicationService = new ApplicationServiceImpl();
		System.out.println(applicationService.dummyMethod());

	}

}
