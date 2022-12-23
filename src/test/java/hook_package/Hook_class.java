package hook_package;

import base_package.Luma_baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_class extends Luma_baseClass {
	
@Before	
public void setUp() {
	Luma_baseClass.Start();
	
}
@After
public void Teardown() {
	driver.quit();
	
}
}
