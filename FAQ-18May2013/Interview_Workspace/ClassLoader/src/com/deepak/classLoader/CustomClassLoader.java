/**
 * 
 */
package com.deepak.classLoader;

/**
 * @author kumadeep
 *
 */
public class CustomClassLoader extends ClassLoader{

	public CustomClassLoader() {
		super();
	}

	public CustomClassLoader(ClassLoader parent) {
		super(parent);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.findClass(name);
	}
	
	@Override
	protected Object getClassLoadingLock(String className) {
		// TODO Auto-generated method stub
		
		return super.getClassLoadingLock(className);
	}
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.loadClass(name);
	}
	
}
