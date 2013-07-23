/*
 * Created on Sep 22, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.jmanderson.ahs;


/**
 * @author root
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public aspect ErrorCatcher {

	pointcut catchError() :
		call (org.jmanderson.ahs..*.*(..));
	
	after catchError() throwing Error:
		System.out.println("CAUGHT ERROR IN POINTCUT");
}
