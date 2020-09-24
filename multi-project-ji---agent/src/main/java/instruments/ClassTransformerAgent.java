package instruments;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class ClassTransformerAgent {

//	public static void premain(String arg, Instrumentation instrumentation) {
//		
//		System.out.println("Test Agent RUNNING!");
//
//		instrumentation.addTransformer(new ClassFileTransformer() {
//			@Override
//			public byte[] transform(Module 			 module,
//								    ClassLoader 	 loader,
//								    String			 className,
//								    Class<?>		 classBeingRedefined,
//								    ProtectionDomain protectionDomain,
//								    byte[] 			 classfileBuffer)
//				throws IllegalClassFormatException {
//				
//				System.out.println("Class was loaded: " + className);
//				System.out.println("Loader used: " + loader + "\n");
//				
//				return 	ClassFileTransformer.super.transform(module, loader, className, classBeingRedefined,
//						protectionDomain, classfileBuffer);
//			}
//
//		});
//
//	}
	
	public static void premain() {
		System.out.println("Test agent RUNNING");
	}

}
