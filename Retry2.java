package testngfullpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Retry2 implements IAnnotationTransformer {
	
	public void transform(
		      ITestAnnotation annotation,
		      Class testClass,
		      Constructor testConstructor,
		      Method testMethod,
		      Class<?> occurringClazz) {
		
		annotation.setRetryAnalyzer(retrytestannotation.class);
		    // not implemented
		  }
	

}
