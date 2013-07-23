package org.jmanderson.ahs.common;

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static String getCookieValue(Cookie[] cookies, String cookieName, String defaultValue) {
		
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (cookieName.equals(cookie.getName())) {
				return cookie.getValue();
			}
		}
		
		return defaultValue;
	}

}
