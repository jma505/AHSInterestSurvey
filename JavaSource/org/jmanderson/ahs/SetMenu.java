package org.jmanderson.ahs;

public class SetMenu {
	private static final String[] side_menu =
		{
			"",
			"MENU/menu_side_array1.js",
			"MENU/menu_side_array2.js",
			"MENU/menu_side_array3.js",
			"MENU/menu_side_array4.js",
			"MENU/menu_side_array4.js" };

	private static final String[] main_menu = { "", "", "", "", "MENU/menu_main_array4.js", "MENU/menu_main_array4.js" };

	private static final String part1 =
		"<script>\n/*\nMilonic DHTML Website Navigation Menu - Version 3.4\n"
			+ "Written by Andy Woolley - Copyright 2002 (c) Milonic Solutions Limited. All Rights Reserved.\n"
			+ "Please visit http://www.milonic.co.uk/menu or e-mail menu3@milonic.com for more information.\n"
			+ "\n"
			+ "The Free use of this menu is only available to Non-Profit, Educational & Personal web sites.\n"
			+ "Commercial and Corporate licenses  are available for use on all other web sites & Intranets.\n"
			+ "All Copyright notices MUST remain in place at ALL times and, please keep us informed of your \n"
			+ "intentions to use the menu and send us your URL.\n*/\n</script>\n"
			+ "<script language='JavaScript' src='";

	private static final String part2 =
		"' type='text/javascript'></script>\n" + "<script language=JavaScript src='MENU/mmenu.js' type=text/javascript></script>";

	public static String setMainMenu(int security_level) {
		String s;

		try {
			s = main_menu[security_level];
		} catch (ArrayIndexOutOfBoundsException e) {
			s = "";
		}

		if (!s.equals("")) {
			StringBuffer sb = new StringBuffer();
			sb.append(part1).append(s).append(part2);
			return sb.toString();
		}

		return "";
	}

	public static String setSideMenu(int security_level) {
		String s;

		try {
			s = side_menu[security_level];
		} catch (ArrayIndexOutOfBoundsException e) {
			s = "";
		}

		if (!s.equals("")) {
			StringBuffer sb = new StringBuffer();
			sb.append(part1).append(s).append(part2);
			return sb.toString();
		}

		return "";
	}

}
