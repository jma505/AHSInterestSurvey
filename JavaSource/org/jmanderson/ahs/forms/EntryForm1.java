package org.jmanderson.ahs.forms;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.CheckBoxes1;
import org.jmanderson.ahs.dataobjects.StudentBean;

public final class EntryForm1 extends ActionForm {

	/**
	 * used to keep track of which screen "page" we're on
	 */
	private int pageNumber = -1;

	private int jumpPageNumber;
	
	// indicator that the form is being edited
	private boolean edit = false;
	// if editing, we need to know the studentid for later
	private int studentId = 0;
	
	public void setJumpPageNumber(int i) { jumpPageNumber = i; }
	public int getJumpPageNumber() { return jumpPageNumber; }
	
	public int getStudentId() { return studentId; }

	public boolean isEdit() {
		return edit;
	}

	public String getEdit() {
		if (edit)
			return "true";
		else
			return "false";
	}

	public void setEdit(boolean b) {
		edit = b;
	}

	//	private boolean restricted = false;

	public int getLastPageNumber() {
		return 35;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	//	public boolean getRestricted() {
	//		return restricted;
	//	}

	public void setPageNumber(int i) {
		pageNumber = i;
	}

	//	public void setRestricted(boolean b) {
	//		restricted = b;
	//	}

	/**
	 * Page 0
	 */
	private String studentFirstName;

	private String studentLastName;

	private int teacherId;

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public String getStudentFullName() {
		return studentFirstName + " " + studentLastName;
	}

	public void setStudentFirstName(String s) {
		studentFirstName = s;
	}

	public void setStudentLastName(String s) {
		studentLastName = s;
	}

	public void setTeacherId(int i) {
		teacherId = i;
	}

	/**
	 * Page 1
	 */
	private boolean an100;

	private boolean an101;

	private boolean an102;

	private boolean an103;

	private boolean an104;

	private boolean an105;

	private boolean an106;

	private boolean an107;

	private boolean an108;

	private boolean an109;

	private boolean an110;

	private boolean an111;

	private boolean an112;

	/**
	 * Page 2
	 */
	private boolean at100;

	private boolean at101;

	private boolean at102;

	private boolean at103;

	private boolean at104;

	private boolean at105;

	private boolean at106;

	private boolean at107;

	private boolean at108;

	private boolean at109;

	private boolean at110;

	private boolean at111;

	private boolean at112;

	private boolean at113;

	/**
	 * Page 3
	 */
	private boolean bu100;

	private boolean bu101;

	private boolean bu102;

	private boolean bu103;

	private boolean bu104;

	/**
	 * Page 4
	 */
	private boolean ch100;

	private boolean ch101;

	private boolean ch102;

	private boolean ch103;

	private boolean ch104;

	/**
	 * Page 5
	 */
	private boolean cl100;

	private boolean cl101;

	private boolean cl102;

	private boolean cl103;

	private boolean cl104;

	public boolean getAn100() {
		return an100;
	}

	public boolean getAn101() {
		return an101;
	}

	public boolean getAn102() {
		return an102;
	}

	public boolean getAn103() {
		return an103;
	}

	public boolean getAn104() {
		return an104;
	}

	public boolean getAn105() {
		return an105;
	}

	public boolean getAn106() {
		return an106;
	}

	public boolean getAn107() {
		return an107;
	}

	public boolean getAn108() {
		return an108;
	}

	public boolean getAn109() {
		return an109;
	}

	public boolean getAn110() {
		return an110;
	}

	public boolean getAn111() {
		return an111;
	}

	public boolean getAn112() {
		return an112;
	}

	public boolean getAt100() {
		return at100;
	}

	public boolean getAt101() {
		return at101;
	}

	public boolean getAt102() {
		return at102;
	}

	public boolean getAt103() {
		return at103;
	}

	public boolean getAt104() {
		return at104;
	}

	public boolean getAt105() {
		return at105;
	}

	public boolean getAt106() {
		return at106;
	}

	public boolean getAt107() {
		return at107;
	}

	public boolean getAt108() {
		return at108;
	}

	public boolean getAt109() {
		return at109;
	}

	public boolean getAt110() {
		return at110;
	}

	public boolean getAt111() {
		return at111;
	}

	public boolean getAt112() {
		return at112;
	}

	public boolean getAt113() {
		return at113;
	}

	public boolean getBu100() {
		return bu100;
	}

	public boolean getBu101() {
		return bu101;
	}

	public boolean getBu102() {
		return bu102;
	}

	public boolean getBu103() {
		return bu103;
	}

	public boolean getBu104() {
		return bu104;
	}

	public boolean getCh100() {
		return ch100;
	}

	public boolean getCh101() {
		return ch101;
	}

	public boolean getCh102() {
		return ch102;
	}

	public boolean getCh103() {
		return ch103;
	}

	public boolean getCh104() {
		return ch104;
	}

	public boolean getCl100() {
		return cl100;
	}

	public boolean getCl101() {
		return cl101;
	}

	public boolean getCl102() {
		return cl102;
	}

	public boolean getCl103() {
		return cl103;
	}

	public boolean getCl104() {
		return cl104;
	}

	public void setAn100(boolean b) {
		an100 = b;
	}

	public void setAn101(boolean b) {
		an101 = b;
	}

	public void setAn102(boolean b) {
		an102 = b;
	}

	public void setAn103(boolean b) {
		an103 = b;
	}

	public void setAn104(boolean b) {
		an104 = b;
	}

	public void setAn105(boolean b) {
		an105 = b;
	}

	public void setAn106(boolean b) {
		an106 = b;
	}

	public void setAn107(boolean b) {
		an107 = b;
	}

	public void setAn108(boolean b) {
		an108 = b;
	}

	public void setAn109(boolean b) {
		an109 = b;
	}

	public void setAn110(boolean b) {
		an110 = b;
	}

	public void setAn111(boolean b) {
		an111 = b;
	}

	public void setAn112(boolean b) {
		an112 = b;
	}

	public void setAt100(boolean b) {
		at100 = b;
	}

	public void setAt101(boolean b) {
		at101 = b;
	}

	public void setAt102(boolean b) {
		at102 = b;
	}

	public void setAt103(boolean b) {
		at103 = b;
	}

	public void setAt104(boolean b) {
		at104 = b;
	}

	public void setAt105(boolean b) {
		at105 = b;
	}

	public void setAt106(boolean b) {
		at106 = b;
	}

	public void setAt107(boolean b) {
		at107 = b;
	}

	public void setAt108(boolean b) {
		at108 = b;
	}

	public void setAt109(boolean b) {
		at109 = b;
	}

	public void setAt110(boolean b) {
		at110 = b;
	}

	public void setAt111(boolean b) {
		at111 = b;
	}

	public void setAt112(boolean b) {
		at112 = b;
	}

	public void setAt113(boolean b) {
		at113 = b;
	}

	public void setBu100(boolean b) {
		bu100 = b;
	}

	public void setBu101(boolean b) {
		bu101 = b;
	}

	public void setBu102(boolean b) {
		bu102 = b;
	}

	public void setBu103(boolean b) {
		bu103 = b;
	}

	public void setBu104(boolean b) {
		bu104 = b;
	}

	public void setCh100(boolean b) {
		ch100 = b;
	}

	public void setCh101(boolean b) {
		ch101 = b;
	}

	public void setCh102(boolean b) {
		ch102 = b;
	}

	public void setCh103(boolean b) {
		ch103 = b;
	}

	public void setCh104(boolean b) {
		ch104 = b;
	}

	public void setCl100(boolean b) {
		cl100 = b;
	}

	public void setCl101(boolean b) {
		cl101 = b;
	}

	public void setCl102(boolean b) {
		cl102 = b;
	}

	public void setCl103(boolean b) {
		cl103 = b;
	}

	public void setCl104(boolean b) {
		cl104 = b;
	}

	/**
	 * Page 6
	 */
	private boolean co100;

	private boolean co101;

	private boolean co102;

	private boolean co103;

	private boolean co104;

	/*
	 * Page 7
	 */
	private boolean cm100;

	private boolean cm101;

	private boolean cm102;

	private boolean cm103;

	private boolean cm104;

	/*
	 * Page 8
	 */
	private boolean cr100;

	private boolean cr101;

	private boolean cr102;

	private boolean cr103;

	private boolean cr104;

	/*
	 * Page 9
	 */
	private boolean fa100;

	private boolean fa101;

	private boolean fa102;

	private boolean fa103;

	private boolean fa104;

	/*
	 * Page 10
	 */
	private boolean fo100;

	private boolean fo101;

	private boolean fo102;

	private boolean fo103;

	/*
	 * Page 11
	 */
	private boolean ga100;

	private boolean ga101;

	private boolean ga102;

	private boolean ga103;

	private boolean ga104;

	private boolean ga105;

	/*
	 * Page 12
	 */
	private boolean hi100;

	private boolean hi101;

	private boolean hi102;

	private boolean hi103;

	private boolean hi104;

	private boolean hi105;

	private boolean hi106;

	private boolean hi107;

	private boolean hi108;

	private boolean hi109;

	private boolean hi110;

	private boolean hi111;

	private boolean hi112;

	private boolean hi113;

	private boolean hi114;

	public boolean getCo100() {
		return co100;
	}

	public boolean getCo101() {
		return co101;
	}

	public boolean getCo102() {
		return co102;
	}

	public boolean getCo103() {
		return co103;
	}

	public boolean getCo104() {
		return co104;
	}

	public boolean getCm100() {
		return cm100;
	}

	public boolean getCm101() {
		return cm101;
	}

	public boolean getCm102() {
		return cm102;
	}

	public boolean getCm103() {
		return cm103;
	}

	public boolean getCm104() {
		return cm104;
	}

	public boolean getCr100() {
		return cr100;
	}

	public boolean getCr101() {
		return cr101;
	}

	public boolean getCr102() {
		return cr102;
	}

	public boolean getCr103() {
		return cr103;
	}

	public boolean getCr104() {
		return cr104;
	}

	public boolean getFa100() {
		return fa100;
	}

	public boolean getFa101() {
		return fa101;
	}

	public boolean getFa102() {
		return fa102;
	}

	public boolean getFa103() {
		return fa103;
	}

	public boolean getFa104() {
		return fa104;
	}

	public boolean getFo100() {
		return fo100;
	}

	public boolean getFo101() {
		return fo101;
	}

	public boolean getFo102() {
		return fo102;
	}

	public boolean getFo103() {
		return fo103;
	}

	public boolean getGa100() {
		return ga100;
	}

	public boolean getGa101() {
		return ga101;
	}

	public boolean getGa102() {
		return ga102;
	}

	public boolean getGa103() {
		return ga103;
	}

	public boolean getGa104() {
		return ga104;
	}

	public boolean getGa105() {
		return ga105;
	}

	public boolean getHi100() {
		return hi100;
	}

	public boolean getHi101() {
		return hi101;
	}

	public boolean getHi102() {
		return hi102;
	}

	public boolean getHi103() {
		return hi103;
	}

	public boolean getHi104() {
		return hi104;
	}

	public boolean getHi105() {
		return hi105;
	}

	public boolean getHi106() {
		return hi106;
	}

	public boolean getHi107() {
		return hi107;
	}

	public boolean getHi108() {
		return hi108;
	}

	public boolean getHi109() {
		return hi109;
	}

	public boolean getHi110() {
		return hi110;
	}

	public boolean getHi111() {
		return hi111;
	}

	public boolean getHi112() {
		return hi112;
	}

	public boolean getHi113() {
		return hi113;
	}

	public boolean getHi114() {
		return hi114;
	}

	public void setCm100(boolean b) {
		cm100 = b;
	}

	public void setCm101(boolean b) {
		cm101 = b;
	}

	public void setCm102(boolean b) {
		cm102 = b;
	}

	public void setCm103(boolean b) {
		cm103 = b;
	}

	public void setCm104(boolean b) {
		cm104 = b;
	}

	public void setCo100(boolean b) {
		co100 = b;
	}

	public void setCo101(boolean b) {
		co101 = b;
	}

	public void setCo102(boolean b) {
		co102 = b;
	}

	public void setCo103(boolean b) {
		co103 = b;
	}

	public void setCo104(boolean b) {
		co104 = b;
	}

	public void setCr100(boolean b) {
		cr100 = b;
	}

	public void setCr101(boolean b) {
		cr101 = b;
	}

	public void setCr102(boolean b) {
		cr102 = b;
	}

	public void setCr103(boolean b) {
		cr103 = b;
	}

	public void setCr104(boolean b) {
		cr104 = b;
	}

	public void setFa100(boolean b) {
		fa100 = b;
	}

	public void setFa101(boolean b) {
		fa101 = b;
	}

	public void setFa102(boolean b) {
		fa102 = b;
	}

	public void setFa103(boolean b) {
		fa103 = b;
	}

	public void setFa104(boolean b) {
		fa104 = b;
	}

	public void setFo100(boolean b) {
		fo100 = b;
	}

	public void setFo101(boolean b) {
		fo101 = b;
	}

	public void setFo102(boolean b) {
		fo102 = b;
	}

	public void setFo103(boolean b) {
		fo103 = b;
	}

	public void setGa100(boolean b) {
		ga100 = b;
	}

	public void setGa101(boolean b) {
		ga101 = b;
	}

	public void setGa102(boolean b) {
		ga102 = b;
	}

	public void setGa103(boolean b) {
		ga103 = b;
	}

	public void setGa104(boolean b) {
		ga104 = b;
	}

	public void setGa105(boolean b) {
		ga105 = b;
	}

	public void setHi100(boolean b) {
		hi100 = b;
	}

	public void setHi101(boolean b) {
		hi101 = b;
	}

	public void setHi102(boolean b) {
		hi102 = b;
	}

	public void setHi103(boolean b) {
		hi103 = b;
	}

	public void setHi104(boolean b) {
		hi104 = b;
	}

	public void setHi105(boolean b) {
		hi105 = b;
	}

	public void setHi106(boolean b) {
		hi106 = b;
	}

	public void setHi107(boolean b) {
		hi107 = b;
	}

	public void setHi108(boolean b) {
		hi108 = b;
	}

	public void setHi109(boolean b) {
		hi109 = b;
	}

	public void setHi110(boolean b) {
		hi110 = b;
	}

	public void setHi111(boolean b) {
		hi111 = b;
	}

	public void setHi112(boolean b) {
		hi112 = b;
	}

	public void setHi113(boolean b) {
		hi113 = b;
	}

	public void setHi114(boolean b) {
		hi114 = b;
	}

	/**
	 * Page 13
	 */
	private boolean hi115;

	private boolean hi116;

	private boolean hi117;

	private boolean hi118;

	private boolean hi119;

	private boolean hi120;

	private boolean hi121;

	private boolean hi122;

	private boolean hi123;

	private boolean hi124;

	private boolean hi125;

	private boolean hi126;

	private boolean hi127;

	private boolean hi128;

	/*
	 * Page 14
	 */
	private boolean hu100;

	private boolean hu101;

	private boolean hu102;

	private boolean hu103;

	private boolean hu104;

	/*
	 * Page 15
	 */
	private boolean fl100;

	private boolean fl101;

	private boolean fl102;

	private boolean fl103;

	private boolean fl104;

	private boolean fl105;

	private boolean fl106;

	private boolean fl107;

	private boolean fl108;

	private boolean fl109;

	private boolean fl110;

	private boolean fl111;

	private boolean fl112;

	private boolean fl113;

	private boolean fl114;

	private boolean fl115;

	/*
	 * Page 16
	 */
	private boolean la100;

	private boolean la101;

	private boolean la102;

	private boolean la103;

	private boolean la104;

	public boolean getHi115() {
		return hi115;
	}

	public boolean getHi116() {
		return hi116;
	}

	public boolean getHi117() {
		return hi117;
	}

	public boolean getHi118() {
		return hi118;
	}

	public boolean getHi119() {
		return hi119;
	}

	public boolean getHi120() {
		return hi120;
	}

	public boolean getHi121() {
		return hi121;
	}

	public boolean getHi122() {
		return hi122;
	}

	public boolean getHi123() {
		return hi123;
	}

	public boolean getHi124() {
		return hi124;
	}

	public boolean getHi125() {
		return hi125;
	}

	public boolean getHi126() {
		return hi126;
	}

	public boolean getHi127() {
		return hi127;
	}

	public boolean getHi128() {
		return hi128;
	}

	public boolean getHu100() {
		return hu100;
	}

	public boolean getHu101() {
		return hu101;
	}

	public boolean getHu102() {
		return hu102;
	}

	public boolean getHu103() {
		return hu103;
	}

	public boolean getHu104() {
		return hu104;
	}

	public boolean getFl100() {
		return fl100;
	}

	public boolean getFl101() {
		return fl101;
	}

	public boolean getFl102() {
		return fl102;
	}

	public boolean getFl103() {
		return fl103;
	}

	public boolean getFl104() {
		return fl104;
	}

	public boolean getFl105() {
		return fl105;
	}

	public boolean getFl106() {
		return fl106;
	}

	public boolean getFl107() {
		return fl107;
	}

	public boolean getFl108() {
		return fl108;
	}

	public boolean getFl109() {
		return fl109;
	}

	public boolean getFl110() {
		return fl110;
	}

	public boolean getFl111() {
		return fl111;
	}

	public boolean getFl112() {
		return fl112;
	}

	public boolean getFl113() {
		return fl113;
	}

	public boolean getFl114() {
		return fl114;
	}

	public boolean getFl115() {
		return fl115;
	}

	public boolean getLa100() {
		return la100;
	}

	public boolean getLa101() {
		return la101;
	}

	public boolean getLa102() {
		return la102;
	}

	public boolean getLa103() {
		return la103;
	}

	public boolean getLa104() {
		return la104;
	}

	public void setHi115(boolean b) {
		hi115 = b;
	}

	public void setHi116(boolean b) {
		hi116 = b;
	}

	public void setHi117(boolean b) {
		hi117 = b;
	}

	public void setHi118(boolean b) {
		hi118 = b;
	}

	public void setHi119(boolean b) {
		hi119 = b;
	}

	public void setHi120(boolean b) {
		hi120 = b;
	}

	public void setHi121(boolean b) {
		hi121 = b;
	}

	public void setHi122(boolean b) {
		hi122 = b;
	}

	public void setHi123(boolean b) {
		hi123 = b;
	}

	public void setHi124(boolean b) {
		hi124 = b;
	}

	public void setHi125(boolean b) {
		hi125 = b;
	}

	public void setHi126(boolean b) {
		hi126 = b;
	}

	public void setHi127(boolean b) {
		hi127 = b;
	}

	public void setHi128(boolean b) {
		hi128 = b;
	}

	public void setHu100(boolean b) {
		hu100 = b;
	}

	public void setHu101(boolean b) {
		hu101 = b;
	}

	public void setHu102(boolean b) {
		hu102 = b;
	}

	public void setHu103(boolean b) {
		hu103 = b;
	}

	public void setHu104(boolean b) {
		hu104 = b;
	}

	public void setFl100(boolean b) {
		fl100 = b;
	}

	public void setFl101(boolean b) {
		fl101 = b;
	}

	public void setFl102(boolean b) {
		fl102 = b;
	}

	public void setFl103(boolean b) {
		fl103 = b;
	}

	public void setFl104(boolean b) {
		fl104 = b;
	}

	public void setFl105(boolean b) {
		fl105 = b;
	}

	public void setFl106(boolean b) {
		fl106 = b;
	}

	public void setFl107(boolean b) {
		fl107 = b;
	}

	public void setFl108(boolean b) {
		fl108 = b;
	}

	public void setFl109(boolean b) {
		fl109 = b;
	}

	public void setFl110(boolean b) {
		fl110 = b;
	}

	public void setFl111(boolean b) {
		fl111 = b;
	}

	public void setFl112(boolean b) {
		fl112 = b;
	}

	public void setFl113(boolean b) {
		fl113 = b;
	}

	public void setFl114(boolean b) {
		fl114 = b;
	}

	public void setFl115(boolean b) {
		fl115 = b;
	}

	public void setLa100(boolean b) {
		la100 = b;
	}

	public void setLa101(boolean b) {
		la101 = b;
	}

	public void setLa102(boolean b) {
		la102 = b;
	}

	public void setLa103(boolean b) {
		la103 = b;
	}

	public void setLa104(boolean b) {
		la104 = b;
	}

	/**
	 * Page 17
	 */
	private boolean ss100;

	private boolean ss101;

	private boolean ss102;

	private boolean ss103;

	private boolean ss104;

	private boolean ss105;

	private boolean ss106;

	private boolean ss107;

	private boolean ss108;

	private boolean ss109;

	private boolean ss110;

	/*
	 * Page 18
	 */
	private boolean me100;

	private boolean me101;

	private boolean me102;

	private boolean me103;

	private boolean me104;

	private boolean me105;

	private boolean me106;

	private boolean me107;

	private boolean me108;

	private boolean me109;

	private boolean me110;

	private boolean me111;

	private boolean me112;

	private boolean me113;

	private boolean me114;

	private boolean me115;

	/*
	 * Page 19
	 */
	private boolean me116;

	private boolean me117;

	private boolean me118;

	private boolean me119;

	private boolean me120;

	private boolean me121;

	private boolean me122;

	private boolean me123;

	private boolean me124;

	/*
	 * Page 20
	 */
	private boolean me125;

	private boolean me126;

	private boolean me127;

	private boolean me128;

	private boolean me129;

	private boolean me130;

	private boolean me131;

	private boolean me132;

	private boolean me133;

	private boolean me134;

	private boolean me135;

	private boolean me136;

	private boolean me137;

	private boolean me138;

	private boolean me139;

	private boolean me140;

	/*
	 * Page 21
	 */
	private boolean md100;

	private boolean md101;

	private boolean md102;

	private boolean md103;

	private boolean md104;

	public boolean getSs100() {
		return ss100;
	}

	public boolean getSs101() {
		return ss101;
	}

	public boolean getSs102() {
		return ss102;
	}

	public boolean getSs103() {
		return ss103;
	}

	public boolean getSs104() {
		return ss104;
	}

	public boolean getSs105() {
		return ss105;
	}

	public boolean getSs106() {
		return ss106;
	}

	public boolean getSs107() {
		return ss107;
	}

	public boolean getSs108() {
		return ss108;
	}

	public boolean getSs109() {
		return ss109;
	}

	public boolean getSs110() {
		return ss110;
	}

	public boolean getMe100() {
		return me100;
	}

	public boolean getMe101() {
		return me101;
	}

	public boolean getMe102() {
		return me102;
	}

	public boolean getMe103() {
		return me103;
	}

	public boolean getMe104() {
		return me104;
	}

	public boolean getMe105() {
		return me105;
	}

	public boolean getMe106() {
		return me106;
	}

	public boolean getMe107() {
		return me107;
	}

	public boolean getMe108() {
		return me108;
	}

	public boolean getMe109() {
		return me109;
	}

	public boolean getMe110() {
		return me110;
	}

	public boolean getMe111() {
		return me111;
	}

	public boolean getMe112() {
		return me112;
	}

	public boolean getMe113() {
		return me113;
	}

	public boolean getMe114() {
		return me114;
	}

	public boolean getMe115() {
		return me115;
	}

	public boolean getMe116() {
		return me116;
	}

	public boolean getMe117() {
		return me117;
	}

	public boolean getMe118() {
		return me118;
	}

	public boolean getMe119() {
		return me119;
	}

	public boolean getMe120() {
		return me120;
	}

	public boolean getMe121() {
		return me121;
	}

	public boolean getMe122() {
		return me122;
	}

	public boolean getMe123() {
		return me123;
	}

	public boolean getMe124() {
		return me124;
	}

	public boolean getMe125() {
		return me125;
	}

	public boolean getMe126() {
		return me126;
	}

	public boolean getMe127() {
		return me127;
	}

	public boolean getMe128() {
		return me128;
	}

	public boolean getMe129() {
		return me129;
	}

	public boolean getMe130() {
		return me130;
	}

	public boolean getMe131() {
		return me131;
	}

	public boolean getMe132() {
		return me132;
	}

	public boolean getMe133() {
		return me133;
	}

	public boolean getMe134() {
		return me134;
	}

	public boolean getMe135() {
		return me135;
	}

	public boolean getMe136() {
		return me136;
	}

	public boolean getMe137() {
		return me137;
	}

	public boolean getMe138() {
		return me138;
	}

	public boolean getMe139() {
		return me139;
	}

	public boolean getMe140() {
		return me140;
	}

	public boolean getMd100() {
		return md100;
	}

	public boolean getMd101() {
		return md101;
	}

	public boolean getMd102() {
		return md102;
	}

	public boolean getMd103() {
		return md103;
	}

	public boolean getMd104() {
		return md104;
	}

	public void setSs100(boolean b) {
		ss100 = b;
	}

	public void setSs101(boolean b) {
		ss101 = b;
	}

	public void setSs102(boolean b) {
		ss102 = b;
	}

	public void setSs103(boolean b) {
		ss103 = b;
	}

	public void setSs104(boolean b) {
		ss104 = b;
	}

	public void setSs105(boolean b) {
		ss105 = b;
	}

	public void setSs106(boolean b) {
		ss106 = b;
	}

	public void setSs107(boolean b) {
		ss107 = b;
	}

	public void setSs108(boolean b) {
		ss108 = b;
	}

	public void setSs109(boolean b) {
		ss109 = b;
	}

	public void setSs110(boolean b) {
		ss110 = b;
	}

	public void setMe100(boolean b) {
		me100 = b;
	}

	public void setMe101(boolean b) {
		me101 = b;
	}

	public void setMe102(boolean b) {
		me102 = b;
	}

	public void setMe103(boolean b) {
		me103 = b;
	}

	public void setMe104(boolean b) {
		me104 = b;
	}

	public void setMe105(boolean b) {
		me105 = b;
	}

	public void setMe106(boolean b) {
		me106 = b;
	}

	public void setMe107(boolean b) {
		me107 = b;
	}

	public void setMe108(boolean b) {
		me108 = b;
	}

	public void setMe109(boolean b) {
		me109 = b;
	}

	public void setMe110(boolean b) {
		me110 = b;
	}

	public void setMe111(boolean b) {
		me111 = b;
	}

	public void setMe112(boolean b) {
		me112 = b;
	}

	public void setMe113(boolean b) {
		me113 = b;
	}

	public void setMe114(boolean b) {
		me114 = b;
	}

	public void setMe115(boolean b) {
		me115 = b;
	}

	public void setMe116(boolean b) {
		me116 = b;
	}

	public void setMe117(boolean b) {
		me117 = b;
	}

	public void setMe118(boolean b) {
		me118 = b;
	}

	public void setMe119(boolean b) {
		me119 = b;
	}

	public void setMe120(boolean b) {
		me120 = b;
	}

	public void setMe121(boolean b) {
		me121 = b;
	}

	public void setMe122(boolean b) {
		me122 = b;
	}

	public void setMe123(boolean b) {
		me123 = b;
	}

	public void setMe124(boolean b) {
		me124 = b;
	}

	public void setMe125(boolean b) {
		me125 = b;
	}

	public void setMe126(boolean b) {
		me126 = b;
	}

	public void setMe127(boolean b) {
		me127 = b;
	}

	public void setMe128(boolean b) {
		me128 = b;
	}

	public void setMe129(boolean b) {
		me129 = b;
	}

	public void setMe130(boolean b) {
		me130 = b;
	}

	public void setMe131(boolean b) {
		me131 = b;
	}

	public void setMe132(boolean b) {
		me132 = b;
	}

	public void setMe133(boolean b) {
		me133 = b;
	}

	public void setMe134(boolean b) {
		me134 = b;
	}

	public void setMe135(boolean b) {
		me135 = b;
	}

	public void setMe136(boolean b) {
		me136 = b;
	}

	public void setMe137(boolean b) {
		me137 = b;
	}

	public void setMe138(boolean b) {
		me138 = b;
	}

	public void setMe139(boolean b) {
		me139 = b;
	}

	public void setMe140(boolean b) {
		me140 = b;
	}

	public void setMd100(boolean b) {
		md100 = b;
	}

	public void setMd101(boolean b) {
		md101 = b;
	}

	public void setMd102(boolean b) {
		md102 = b;
	}

	public void setMd103(boolean b) {
		md103 = b;
	}

	public void setMd104(boolean b) {
		md104 = b;
	}

	/**
	 * Page 22
	 */
	private boolean mu100;

	private boolean mu101;

	private boolean mu102;

	private boolean mu103;

	private boolean mu104;

	private boolean mu105;

	private boolean mu106;

	private boolean mu107;

	private boolean mu108;

	private boolean mu109;

	private boolean mu110;

	private boolean mu111;

	private boolean mu112;

	/*
	 * Page 23
	 */
	private boolean na100;

	private boolean na101;

	private boolean na102;

	private boolean na103;

	private boolean na104;

	private boolean na105;

	private boolean na106;

	/*
	 * Page 24
	 */
	private boolean pa100;

	private boolean pa101;

	private boolean pa102;

	private boolean pa103;

	private boolean pa104;

	private boolean pa105;

	/*
	 * Page 25
	 */
	private boolean po100;

	private boolean po101;

	private boolean po102;

	private boolean po103;

	private boolean po104;

	/*
	 * Page 26
	 */
	private boolean ps100;

	private boolean ps101;

	private boolean ps102;

	private boolean ps103;

	private boolean ps104;

	private boolean ps105;

	public boolean getMu100() {
		return mu100;
	}

	public boolean getMu101() {
		return mu101;
	}

	public boolean getMu102() {
		return mu102;
	}

	public boolean getMu103() {
		return mu103;
	}

	public boolean getMu104() {
		return mu104;
	}

	public boolean getMu105() {
		return mu105;
	}

	public boolean getMu106() {
		return mu106;
	}

	public boolean getMu107() {
		return mu107;
	}

	public boolean getMu108() {
		return mu108;
	}

	public boolean getMu109() {
		return mu109;
	}

	public boolean getMu110() {
		return mu110;
	}

	public boolean getMu111() {
		return mu111;
	}

	public boolean getMu112() {
		return mu112;
	}

	public boolean getNa100() {
		return na100;
	}

	public boolean getNa101() {
		return na101;
	}

	public boolean getNa102() {
		return na102;
	}

	public boolean getNa103() {
		return na103;
	}

	public boolean getNa104() {
		return na104;
	}

	public boolean getNa105() {
		return na105;
	}

	public boolean getNa106() {
		return na106;
	}

	public boolean getPa100() {
		return pa100;
	}

	public boolean getPa101() {
		return pa101;
	}

	public boolean getPa102() {
		return pa102;
	}

	public boolean getPa103() {
		return pa103;
	}

	public boolean getPa104() {
		return pa104;
	}

	public boolean getPa105() {
		return pa105;
	}

	public boolean getPo100() {
		return po100;
	}

	public boolean getPo101() {
		return po101;
	}

	public boolean getPo102() {
		return po102;
	}

	public boolean getPo103() {
		return po103;
	}

	public boolean getPo104() {
		return po104;
	}

	public boolean getPs100() {
		return ps100;
	}

	public boolean getPs101() {
		return ps101;
	}

	public boolean getPs102() {
		return ps102;
	}

	public boolean getPs103() {
		return ps103;
	}

	public boolean getPs104() {
		return ps104;
	}

	public boolean getPs105() {
		return ps105;
	}

	public void setMu100(boolean b) {
		mu100 = b;
	}

	public void setMu101(boolean b) {
		mu101 = b;
	}

	public void setMu102(boolean b) {
		mu102 = b;
	}

	public void setMu103(boolean b) {
		mu103 = b;
	}

	public void setMu104(boolean b) {
		mu104 = b;
	}

	public void setMu105(boolean b) {
		mu105 = b;
	}

	public void setMu106(boolean b) {
		mu106 = b;
	}

	public void setMu107(boolean b) {
		mu107 = b;
	}

	public void setMu108(boolean b) {
		mu108 = b;
	}

	public void setMu109(boolean b) {
		mu109 = b;
	}

	public void setMu110(boolean b) {
		mu110 = b;
	}

	public void setMu111(boolean b) {
		mu111 = b;
	}

	public void setMu112(boolean b) {
		mu112 = b;
	}

	public void setNa100(boolean b) {
		na100 = b;
	}

	public void setNa101(boolean b) {
		na101 = b;
	}

	public void setNa102(boolean b) {
		na102 = b;
	}

	public void setNa103(boolean b) {
		na103 = b;
	}

	public void setNa104(boolean b) {
		na104 = b;
	}

	public void setNa105(boolean b) {
		na105 = b;
	}

	public void setNa106(boolean b) {
		na106 = b;
	}

	public void setPa100(boolean b) {
		pa100 = b;
	}

	public void setPa101(boolean b) {
		pa101 = b;
	}

	public void setPa102(boolean b) {
		pa102 = b;
	}

	public void setPa103(boolean b) {
		pa103 = b;
	}

	public void setPa104(boolean b) {
		pa104 = b;
	}

	public void setPa105(boolean b) {
		pa105 = b;
	}

	public void setPo100(boolean b) {
		po100 = b;
	}

	public void setPo101(boolean b) {
		po101 = b;
	}

	public void setPo102(boolean b) {
		po102 = b;
	}

	public void setPo103(boolean b) {
		po103 = b;
	}

	public void setPo104(boolean b) {
		po104 = b;
	}

	public void setPs100(boolean b) {
		ps100 = b;
	}

	public void setPs101(boolean b) {
		ps101 = b;
	}

	public void setPs102(boolean b) {
		ps102 = b;
	}

	public void setPs103(boolean b) {
		ps103 = b;
	}

	public void setPs104(boolean b) {
		ps104 = b;
	}

	public void setPs105(boolean b) {
		ps105 = b;
	}

	/**
	 * Page 27
	 */
	private boolean re100;

	private boolean re101;

	private boolean re102;

	private boolean re103;

	private boolean re104;

	private boolean re105;

	private boolean re106;

	private boolean re107;

	private boolean re108;

	/*
	 * Page 28
	 */
	private boolean rl100;

	private boolean rl101;

	private boolean rl102;

	private boolean rl103;

	private boolean rl104;

	private boolean rl105;

	/*
	 * Page 29
	 */
	private boolean sc100;

	private boolean sc101;

	private boolean sc102;

	private boolean sc103;

	private boolean sc104;

	private boolean sc105;

	private boolean sc106;

	private boolean sc107;

	private boolean sc108;

	private boolean sc109;

	private boolean sc110;

	private boolean sc111;

	private boolean sc112;

	private boolean sc113;

	private boolean sc114;

	private boolean sc115;

	private boolean sc116;

	private boolean sc117;

	private boolean sc118;

	private boolean sc119;

	private boolean sc120;

	private boolean sc121;

	private boolean sc122;

	private boolean sc123;

	private boolean sc124;

	private boolean sc125;

	public boolean getRe100() {
		return re100;
	}

	public boolean getRe101() {
		return re101;
	}

	public boolean getRe102() {
		return re102;
	}

	public boolean getRe103() {
		return re103;
	}

	public boolean getRe104() {
		return re104;
	}

	public boolean getRe105() {
		return re105;
	}

	public boolean getRe106() {
		return re106;
	}

	public boolean getRe107() {
		return re107;
	}

	public boolean getRe108() {
		return re108;
	}

	public boolean getRl100() {
		return rl100;
	}

	public boolean getRl101() {
		return rl101;
	}

	public boolean getRl102() {
		return rl102;
	}

	public boolean getRl103() {
		return rl103;
	}

	public boolean getRl104() {
		return rl104;
	}

	public boolean getRl105() {
		return rl105;
	}

	public boolean getSc100() {
		return sc100;
	}

	public boolean getSc101() {
		return sc101;
	}

	public boolean getSc102() {
		return sc102;
	}

	public boolean getSc103() {
		return sc103;
	}

	public boolean getSc104() {
		return sc104;
	}

	public boolean getSc105() {
		return sc105;
	}

	public boolean getSc106() {
		return sc106;
	}

	public boolean getSc107() {
		return sc107;
	}

	public boolean getSc108() {
		return sc108;
	}

	public boolean getSc109() {
		return sc109;
	}

	public boolean getSc110() {
		return sc110;
	}

	public boolean getSc111() {
		return sc111;
	}

	public boolean getSc112() {
		return sc112;
	}

	public boolean getSc113() {
		return sc113;
	}

	public boolean getSc114() {
		return sc114;
	}

	public boolean getSc115() {
		return sc115;
	}

	public boolean getSc116() {
		return sc116;
	}

	public boolean getSc117() {
		return sc117;
	}

	public boolean getSc118() {
		return sc118;
	}

	public boolean getSc119() {
		return sc119;
	}

	public boolean getSc120() {
		return sc120;
	}

	public boolean getSc121() {
		return sc121;
	}

	public boolean getSc122() {
		return sc122;
	}

	public boolean getSc123() {
		return sc123;
	}

	public boolean getSc124() {
		return sc124;
	}

	public boolean getSc125() {
		return sc125;
	}

	public void setRe100(boolean b) {
		re100 = b;
	}

	public void setRe101(boolean b) {
		re101 = b;
	}

	public void setRe102(boolean b) {
		re102 = b;
	}

	public void setRe103(boolean b) {
		re103 = b;
	}

	public void setRe104(boolean b) {
		re104 = b;
	}

	public void setRe105(boolean b) {
		re105 = b;
	}

	public void setRe106(boolean b) {
		re106 = b;
	}

	public void setRe107(boolean b) {
		re107 = b;
	}

	public void setRe108(boolean b) {
		re108 = b;
	}

	public void setRl100(boolean b) {
		rl100 = b;
	}

	public void setRl101(boolean b) {
		rl101 = b;
	}

	public void setRl102(boolean b) {
		rl102 = b;
	}

	public void setRl103(boolean b) {
		rl103 = b;
	}

	public void setRl104(boolean b) {
		rl104 = b;
	}

	public void setRl105(boolean b) {
		rl105 = b;
	}

	public void setSc100(boolean b) {
		sc100 = b;
	}

	public void setSc101(boolean b) {
		sc101 = b;
	}

	public void setSc102(boolean b) {
		sc102 = b;
	}

	public void setSc103(boolean b) {
		sc103 = b;
	}

	public void setSc104(boolean b) {
		sc104 = b;
	}

	public void setSc105(boolean b) {
		sc105 = b;
	}

	public void setSc106(boolean b) {
		sc106 = b;
	}

	public void setSc107(boolean b) {
		sc107 = b;
	}

	public void setSc108(boolean b) {
		sc108 = b;
	}

	public void setSc109(boolean b) {
		sc109 = b;
	}

	public void setSc110(boolean b) {
		sc110 = b;
	}

	public void setSc111(boolean b) {
		sc111 = b;
	}

	public void setSc112(boolean b) {
		sc112 = b;
	}

	public void setSc113(boolean b) {
		sc113 = b;
	}

	public void setSc114(boolean b) {
		sc114 = b;
	}

	public void setSc115(boolean b) {
		sc115 = b;
	}

	public void setSc116(boolean b) {
		sc116 = b;
	}

	public void setSc117(boolean b) {
		sc117 = b;
	}

	public void setSc118(boolean b) {
		sc118 = b;
	}

	public void setSc119(boolean b) {
		sc119 = b;
	}

	public void setSc120(boolean b) {
		sc120 = b;
	}

	public void setSc121(boolean b) {
		sc121 = b;
	}

	public void setSc122(boolean b) {
		sc122 = b;
	}

	public void setSc123(boolean b) {
		sc123 = b;
	}

	public void setSc124(boolean b) {
		sc124 = b;
	}

	public void setSc125(boolean b) {
		sc125 = b;
	}

	/**
	 * Page 30
	 */
	private boolean sa100;

	private boolean sa101;

	private boolean sa102;

	private boolean sa103;

	private boolean sa104;

	private boolean sa105;

	private boolean sa106;

	private boolean sa107;

	private boolean sa108;

	/*
	 * Page 31
	 */
	private boolean to100;

	private boolean to101;

	private boolean to102;

	private boolean to103;

	private boolean to104;

	private boolean to105;

	private boolean to106;

	private boolean to107;

	private boolean to108;

	private boolean to109;

	private boolean to110;

	private boolean to111;

	private boolean to112;

	private boolean to113;

	private boolean to114;

	private boolean to115;

	private boolean to116;

	private boolean to117;

	/*
	 * Page 32
	 */
	private boolean te100;

	private boolean te101;

	private boolean te102;

	private boolean te103;

	private boolean te104;

	/*
	 * Page 33
	 */
	private boolean tr100;

	private boolean tr101;

	private boolean tr102;

	private boolean tr103;

	public boolean getSa100() {
		return sa100;
	}

	public boolean getSa101() {
		return sa101;
	}

	public boolean getSa102() {
		return sa102;
	}

	public boolean getSa103() {
		return sa103;
	}

	public boolean getSa104() {
		return sa104;
	}

	public boolean getSa105() {
		return sa105;
	}

	public boolean getSa106() {
		return sa106;
	}

	public boolean getSa107() {
		return sa107;
	}

	public boolean getSa108() {
		return sa108;
	}

	public boolean getTo100() {
		return to100;
	}

	public boolean getTo101() {
		return to101;
	}

	public boolean getTo102() {
		return to102;
	}

	public boolean getTo103() {
		return to103;
	}

	public boolean getTo104() {
		return to104;
	}

	public boolean getTo105() {
		return to105;
	}

	public boolean getTo106() {
		return to106;
	}

	public boolean getTo107() {
		return to107;
	}

	public boolean getTo108() {
		return to108;
	}

	public boolean getTo109() {
		return to109;
	}

	public boolean getTo110() {
		return to110;
	}

	public boolean getTo111() {
		return to111;
	}

	public boolean getTo112() {
		return to112;
	}

	public boolean getTo113() {
		return to113;
	}

	public boolean getTo114() {
		return to114;
	}

	public boolean getTo115() {
		return to115;
	}

	public boolean getTo116() {
		return to116;
	}

	public boolean getTo117() {
		return to117;
	}

	public boolean getTe100() {
		return te100;
	}

	public boolean getTe101() {
		return te101;
	}

	public boolean getTe102() {
		return te102;
	}

	public boolean getTe103() {
		return te103;
	}

	public boolean getTe104() {
		return te104;
	}

	public boolean getTr100() {
		return tr100;
	}

	public boolean getTr101() {
		return tr101;
	}

	public boolean getTr102() {
		return tr102;
	}

	public boolean getTr103() {
		return tr103;
	}

	public void setSa100(boolean b) {
		sa100 = b;
	}

	public void setSa101(boolean b) {
		sa101 = b;
	}

	public void setSa102(boolean b) {
		sa102 = b;
	}

	public void setSa103(boolean b) {
		sa103 = b;
	}

	public void setSa104(boolean b) {
		sa104 = b;
	}

	public void setSa105(boolean b) {
		sa105 = b;
	}

	public void setSa106(boolean b) {
		sa106 = b;
	}

	public void setSa107(boolean b) {
		sa107 = b;
	}

	public void setSa108(boolean b) {
		sa108 = b;
	}

	public void setTo100(boolean b) {
		to100 = b;
	}

	public void setTo101(boolean b) {
		to101 = b;
	}

	public void setTo102(boolean b) {
		to102 = b;
	}

	public void setTo103(boolean b) {
		to103 = b;
	}

	public void setTo104(boolean b) {
		to104 = b;
	}

	public void setTo105(boolean b) {
		to105 = b;
	}

	public void setTo106(boolean b) {
		to106 = b;
	}

	public void setTo107(boolean b) {
		to107 = b;
	}

	public void setTo108(boolean b) {
		to108 = b;
	}

	public void setTo109(boolean b) {
		to109 = b;
	}

	public void setTo110(boolean b) {
		to110 = b;
	}

	public void setTo111(boolean b) {
		to111 = b;
	}

	public void setTo112(boolean b) {
		to112 = b;
	}

	public void setTo113(boolean b) {
		to113 = b;
	}

	public void setTo114(boolean b) {
		to114 = b;
	}

	public void setTo115(boolean b) {
		to115 = b;
	}

	public void setTo116(boolean b) {
		to116 = b;
	}

	public void setTo117(boolean b) {
		to117 = b;
	}

	public void setTe100(boolean b) {
		te100 = b;
	}

	public void setTe101(boolean b) {
		te101 = b;
	}

	public void setTe102(boolean b) {
		te102 = b;
	}

	public void setTe103(boolean b) {
		te103 = b;
	}

	public void setTe104(boolean b) {
		te104 = b;
	}

	public void setTr100(boolean b) {
		tr100 = b;
	}

	public void setTr101(boolean b) {
		tr101 = b;
	}

	public void setTr102(boolean b) {
		tr102 = b;
	}

	public void setTr103(boolean b) {
		tr103 = b;
	}

	private boolean tr104;

	private boolean tr105;

	private boolean tr106;

	/*
	 * Page 34
	 */
	private boolean ve100;

	private boolean ve101;

	private boolean ve102;

	private boolean ve103;

	private boolean ve104;

	private boolean ve105;

	private boolean ve106;

	private boolean ve107;

	private boolean ve108;

	private boolean ve109;

	private boolean ve110;

	private boolean ve111;

	private boolean ve112;

	private boolean ve113;

	private boolean ve114;

	private boolean ve115;

	private boolean ve116;

	private boolean ve117;

	/*
	 * Page 35
	 */
	private boolean we100;

	private boolean we101;

	private boolean we102;

	private boolean we103;

	private boolean we104;

	private boolean we105;

	private boolean we106;

	private boolean we107;

	/*
	 * Page 36
	 */
	private boolean wr100;

	private boolean wr101;

	private boolean wr102;

	private boolean wr103;

	private boolean wr104;

	private boolean wr105;

	public boolean getTr104() {
		return tr104;
	}

	public boolean getTr105() {
		return tr105;
	}

	public boolean getTr106() {
		return tr106;
	}

	public boolean getVe100() {
		return ve100;
	}

	public boolean getVe101() {
		return ve101;
	}

	public boolean getVe102() {
		return ve102;
	}

	public boolean getVe103() {
		return ve103;
	}

	public boolean getVe104() {
		return ve104;
	}

	public boolean getVe105() {
		return ve105;
	}

	public boolean getVe106() {
		return ve106;
	}

	public boolean getVe107() {
		return ve107;
	}

	public boolean getVe108() {
		return ve108;
	}

	public boolean getVe109() {
		return ve109;
	}

	public boolean getVe110() {
		return ve110;
	}

	public boolean getVe111() {
		return ve111;
	}

	public boolean getVe112() {
		return ve112;
	}

	public boolean getVe113() {
		return ve113;
	}

	public boolean getVe114() {
		return ve114;
	}

	public boolean getVe115() {
		return ve115;
	}

	public boolean getVe116() {
		return ve116;
	}

	public boolean getVe117() {
		return ve117;
	}

	public boolean getWe100() {
		return we100;
	}

	public boolean getWe101() {
		return we101;
	}

	public boolean getWe102() {
		return we102;
	}

	public boolean getWe103() {
		return we103;
	}

	public boolean getWe104() {
		return we104;
	}

	public boolean getWe105() {
		return we105;
	}

	public boolean getWe106() {
		return we106;
	}

	public boolean getWe107() {
		return we107;
	}

	public boolean getWr100() {
		return wr100;
	}

	public boolean getWr101() {
		return wr101;
	}

	public boolean getWr102() {
		return wr102;
	}

	public boolean getWr103() {
		return wr103;
	}

	public boolean getWr104() {
		return wr104;
	}

	public boolean getWr105() {
		return wr105;
	}

	public void setTr104(boolean b) {
		tr104 = b;
	}

	public void setTr105(boolean b) {
		tr105 = b;
	}

	public void setTr106(boolean b) {
		tr106 = b;
	}

	public void setVe100(boolean b) {
		ve100 = b;
	}

	public void setVe101(boolean b) {
		ve101 = b;
	}

	public void setVe102(boolean b) {
		ve102 = b;
	}

	public void setVe103(boolean b) {
		ve103 = b;
	}

	public void setVe104(boolean b) {
		ve104 = b;
	}

	public void setVe105(boolean b) {
		ve105 = b;
	}

	public void setVe106(boolean b) {
		ve106 = b;
	}

	public void setVe107(boolean b) {
		ve107 = b;
	}

	public void setVe108(boolean b) {
		ve108 = b;
	}

	public void setVe109(boolean b) {
		ve109 = b;
	}

	public void setVe110(boolean b) {
		ve110 = b;
	}

	public void setVe111(boolean b) {
		ve111 = b;
	}

	public void setVe112(boolean b) {
		ve112 = b;
	}

	public void setVe113(boolean b) {
		ve113 = b;
	}

	public void setVe114(boolean b) {
		ve114 = b;
	}

	public void setVe115(boolean b) {
		ve115 = b;
	}

	public void setVe116(boolean b) {
		ve116 = b;
	}

	public void setVe117(boolean b) {
		ve117 = b;
	}

	public void setWe100(boolean b) {
		we100 = b;
	}

	public void setWe101(boolean b) {
		we101 = b;
	}

	public void setWe102(boolean b) {
		we102 = b;
	}

	public void setWe103(boolean b) {
		we103 = b;
	}

	public void setWe104(boolean b) {
		we104 = b;
	}

	public void setWe105(boolean b) {
		we105 = b;
	}

	public void setWe106(boolean b) {
		we106 = b;
	}

	public void setWe107(boolean b) {
		we107 = b;
	}

	public void setWr100(boolean b) {
		wr100 = b;
	}

	public void setWr101(boolean b) {
		wr101 = b;
	}

	public void setWr102(boolean b) {
		wr102 = b;
	}

	public void setWr103(boolean b) {
		wr103 = b;
	}

	public void setWr104(boolean b) {
		wr104 = b;
	}

	public void setWr105(boolean b) {
		wr105 = b;
	}

	public void fullReset(ActionMapping mapping, HttpServletRequest request) {
		for (int i = 0, j = getLastPageNumber(); i <= j; i++) {
			pageReset(i);
		}
	}

	public void pageReset(int page) {
		switch (page) {
		case 0:
			studentFirstName = null;
			studentLastName = null;
			//		if (!restricted) {
			teacherId = 0;
			//		}
			edit = false;
			pageNumber = -1;
			break;
		case 1:
			an100 = false;
			an101 = false;
			an102 = false;
			an103 = false;
			an104 = false;
			an105 = false;
			an106 = false;
			an107 = false;
			an108 = false;
			an109 = false;
			an110 = false;
			an111 = false;
			an112 = false;
			break;
		case 2:
			at100 = false;
			at101 = false;
			at102 = false;
			at103 = false;
			at104 = false;
			at105 = false;
			at106 = false;
			at107 = false;
			at108 = false;
			at109 = false;
			at110 = false;
			at111 = false;
			at112 = false;
			at113 = false;
			break;
		case 3:
			bu100 = false;
			bu101 = false;
			bu102 = false;
			bu103 = false;
			bu104 = false;
			break;
		case 4:
			ch100 = false;
			ch101 = false;
			ch102 = false;
			ch103 = false;
			ch104 = false;
			break;
		case 5:
			cl100 = false;
			cl101 = false;
			cl102 = false;
			cl103 = false;
			cl104 = false;
			break;
		case 6:
			co100 = false;
			co101 = false;
			co102 = false;
			co103 = false;
			co104 = false;
			break;
		case 7:
			cm100 = false;
			cm101 = false;
			cm102 = false;
			cm103 = false;
			cm104 = false;
			break;
		case 8:
			cr100 = false;
			cr101 = false;
			cr102 = false;
			cr103 = false;
			cr104 = false;
			break;
		case 9:
			fa100 = false;
			fa101 = false;
			fa102 = false;
			fa103 = false;
			fa104 = false;
			break;
		case 10:
			fo100 = false;
			fo101 = false;
			fo102 = false;
			fo103 = false;
			break;
		case 11:
			ga100 = false;
			ga101 = false;
			ga102 = false;
			ga103 = false;
			ga104 = false;
			ga105 = false;
			break;
		case 12:
			hi100 = false;
			hi101 = false;
			hi102 = false;
			hi103 = false;
			hi104 = false;
			hi105 = false;
			hi106 = false;
			hi107 = false;
			hi108 = false;
			hi109 = false;
			hi110 = false;
			hi111 = false;
			hi112 = false;
			hi113 = false;
			hi114 = false;
			hi115 = false;
			hi116 = false;
			hi117 = false;
			hi118 = false;
			hi119 = false;
			hi120 = false;
			hi121 = false;
			hi122 = false;
			hi123 = false;
			hi124 = false;
			hi125 = false;
			hi126 = false;
			hi127 = false;
			hi128 = false;
			break;
		case 13:
			hu100 = false;
			hu101 = false;
			hu102 = false;
			hu103 = false;
			hu104 = false;
			break;
		case 14:
			fl100 = false;
			fl101 = false;
			fl102 = false;
			fl103 = false;
			fl104 = false;
			fl105 = false;
			fl106 = false;
			fl107 = false;
			fl108 = false;
			fl109 = false;
			fl110 = false;
			fl111 = false;
			fl112 = false;
			fl113 = false;
			fl114 = false;
			fl115 = false;
			break;
		case 15:
			la100 = false;
			la101 = false;
			la102 = false;
			la103 = false;
			la104 = false;
			break;
		case 16:
			ss100 = false;
			ss101 = false;
			ss102 = false;
			ss103 = false;
			ss104 = false;
			ss105 = false;
			ss106 = false;
			ss107 = false;
			ss108 = false;
			ss109 = false;
			ss110 = false;
			break;
		case 17:
			me100 = false;
			me101 = false;
			me102 = false;
			me103 = false;
			me104 = false;
			me105 = false;
			me106 = false;
			me107 = false;
			me108 = false;
			me109 = false;
			me110 = false;
			me111 = false;
			me112 = false;
			me113 = false;
			me114 = false;
			me115 = false;
			break;
		case 18:
			me116 = false;
			me117 = false;
			me118 = false;
			me119 = false;
			me120 = false;
			me121 = false;
			me122 = false;
			me123 = false;
			me124 = false;
			me137 = false;
			me138 = false;
			break;
		case 19:
			me125 = false;
			me126 = false;
			me127 = false;
			me128 = false;
			me129 = false;
			me130 = false;
			me131 = false;
			me132 = false;
			me133 = false;
			me134 = false;
			me135 = false;
			me136 = false;
			me139 = false;
			me140 = false;
			break;
		case 20:
			md100 = false;
			md101 = false;
			md102 = false;
			md103 = false;
			md104 = false;
			break;
		case 21:
			mu100 = false;
			mu101 = false;
			mu102 = false;
			mu103 = false;
			mu104 = false;
			mu105 = false;
			mu106 = false;
			mu107 = false;
			mu108 = false;
			mu109 = false;
			mu110 = false;
			mu111 = false;
			mu112 = false;
			break;
		case 22:
			na100 = false;
			na101 = false;
			na102 = false;
			na103 = false;
			na104 = false;
			na105 = false;
			na106 = false;
			break;
		case 23:
			pa100 = false;
			pa101 = false;
			pa102 = false;
			pa103 = false;
			pa104 = false;
			pa105 = false;
			break;
		case 24:
			po100 = false;
			po101 = false;
			po102 = false;
			po103 = false;
			po104 = false;
			break;
		case 25:
			ps100 = false;
			ps101 = false;
			ps102 = false;
			ps103 = false;
			ps104 = false;
			ps105 = false;
			break;
		case 26:
			re100 = false;
			re101 = false;
			re102 = false;
			re103 = false;
			re104 = false;
			re105 = false;
			re106 = false;
			re107 = false;
			re108 = false;
			break;
		case 27:
			rl100 = false;
			rl101 = false;
			rl102 = false;
			rl103 = false;
			rl104 = false;
			rl105 = false;
			break;
		case 28:
			sc100 = false;
			sc101 = false;
			sc102 = false;
			sc103 = false;
			sc104 = false;
			sc105 = false;
			sc106 = false;
			sc107 = false;
			sc108 = false;
			sc109 = false;
			sc110 = false;
			sc111 = false;
			sc112 = false;
			sc113 = false;
			sc114 = false;
			sc115 = false;
			sc116 = false;
			sc117 = false;
			sc118 = false;
			sc119 = false;
			sc120 = false;
			sc121 = false;
			sc122 = false;
			sc123 = false;
			sc124 = false;
			sc125 = false;
			break;
		case 29:
			sa100 = false;
			sa101 = false;
			sa102 = false;
			sa103 = false;
			sa104 = false;
			sa105 = false;
			sa106 = false;
			sa107 = false;
			sa108 = false;
			break;
		case 30:
			to100 = false;
			to101 = false;
			to102 = false;
			to103 = false;
			to104 = false;
			to105 = false;
			to106 = false;
			to107 = false;
			to108 = false;
			to109 = false;
			to110 = false;
			to111 = false;
			to112 = false;
			to113 = false;
			to114 = false;
			to115 = false;
			to116 = false;
			to117 = false;
			break;
		case 31:
			te100 = false;
			te101 = false;
			te102 = false;
			te103 = false;
			te104 = false;
			break;
		case 32:
			tr100 = false;
			tr101 = false;
			tr102 = false;
			tr103 = false;
			tr104 = false;
			tr105 = false;
			tr106 = false;
			break;
		case 33:
			ve100 = false;
			ve101 = false;
			ve102 = false;
			ve103 = false;
			ve104 = false;
			ve105 = false;
			ve106 = false;
			ve107 = false;
			ve108 = false;
			ve109 = false;
			ve110 = false;
			ve111 = false;
			ve112 = false;
			ve113 = false;
			ve114 = false;
			ve115 = false;
			ve116 = false;
			ve117 = false;
			break;
		case 34:
			we100 = false;
			we101 = false;
			we102 = false;
			we103 = false;
			we104 = false;
			we105 = false;
			we106 = false;
			we107 = false;
			break;
		case 35:
			wr100 = false;
			wr101 = false;
			wr102 = false;
			wr103 = false;
			wr104 = false;
			wr105 = false;
			break;
		}
	}

	private boolean hasInvalidCharacter(String s) {
		if (s != null) {
			if ((s.indexOf('\'') != -1) || (s.indexOf('\\') != -1))
				return true;
		}
		return false;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		/**
		 * Page 1 validation: student name and teacher required
		 */

		switch (pageNumber) {
		case 0:
			if ((studentFirstName == null) || (studentFirstName.length() < 1)) {
				errors.add("studentFirstName", new ActionError(
						"error.studentFirstName.required"));
				pageNumber = 0;
			} else {
				StringBuffer sb = new StringBuffer();
				sb.append(studentFirstName.substring(0, 1).toUpperCase());
				sb.append(studentFirstName.substring(1).toLowerCase());
				studentFirstName = sb.toString();
			}
			if (hasInvalidCharacter(studentFirstName)) {
				errors.add("studentFirstName", new ActionError(
						"error.invalid.character"));
				pageNumber = 0;
			}
			if ((studentLastName == null) || (studentLastName.length() < 1)) {
				errors.add("studentLastName", new ActionError(
						"error.studentLastName.required"));
				pageNumber = 0;
			} else {
				StringBuffer sb = new StringBuffer();
				sb.append(studentLastName.substring(0, 1).toUpperCase());
				sb.append(studentLastName.substring(1).toLowerCase());
				studentLastName = sb.toString();
			}
			if (hasInvalidCharacter(studentLastName)) {
				errors.add("studentLastName", new ActionError(
						"error.invalid.character"));
				pageNumber = 0;
			}
			if (teacherId == 0) {
				errors.add("teacherId", new ActionError(
						"error.teacher.required"));
				pageNumber = 0;
			}
			if (!edit) {
				checkForEdit(errors, request);
			}
			break;

		/**
		 * Page 1 validation: an104 through an112: one only
		 */

		case 1:
			int i = 0;
			if (an104) {
				i++;
			}
			;
			if (an105) {
				i++;
			}
			;
			if (an106) {
				i++;
			}
			;
			if (an107) {
				i++;
			}
			;
			if (an108) {
				i++;
			}
			;
			if (an109) {
				i++;
			}
			;
			if (an110) {
				i++;
			}
			;
			if (an111) {
				i++;
			}
			if (an112) {
				i++;
			}
			if (i > 1) {
				errors.add("Animals", new ActionError("error.animals.only1"));
				an104 = false;
				an105 = false;
				an106 = false;
				an107 = false;
				an108 = false;
				an109 = false;
				an110 = false;
				an111 = false;
				an112 = false;
			}
			break;

		/*
		 * Page 2 Validation: at102-at107 and at110-at113: max two
		 */
		case 2:
			i = 0;
			if (at102) {
				i++;
			}
			if (at103) {
				i++;
			}
			if (at104) {
				i++;
			}
			if (at105) {
				i++;
			}
			if (at106) {
				i++;
			}
			if (at107) {
				i++;
			}
			if (at110) {
				i++;
			}
			if (at111) {
				i++;
			}
			if (at112) {
				i++;
			}
			if (at113) {
				i++;
			}
			if (i > 2) {
				errors
						.add("Athletics", new ActionError(
								"error.athletics.max2"));
				at102 = false;
				at103 = false;
				at104 = false;
				at105 = false;
				at106 = false;
				at107 = false;
				at110 = false;
				at111 = false;
				at112 = false;
				at113 = false;
			}
			break;
		/**
		 * Page 12 Validation: hi101 through hi114: one only
		 */

		case 12:
			i = 0;
			if (hi101) {
				i++;
			}
			if (hi102) {
				i++;
			}
			if (hi103) {
				i++;
			}
			if (hi104) {
				i++;
			}
			if (hi105) {
				i++;
			}
			if (hi106) {
				i++;
			}
			if (hi107) {
				i++;
			}
			if (hi108) {
				i++;
			}
			if (hi109) {
				i++;
			}
			if (hi110) {
				i++;
			}
			if (hi111) {
				i++;
			}
			if (hi112) {
				i++;
			}
			if (hi113) {
				i++;
			}
			if (hi114) {
				i++;
			}
			if (i > 2) {
				errors.add("History", new ActionError("error.history.max2"));
				hi101 = false;
				hi102 = false;
				hi103 = false;
				hi104 = false;
				hi105 = false;
				hi106 = false;
				hi107 = false;
				hi108 = false;
				hi109 = false;
				hi110 = false;
				hi111 = false;
				hi112 = false;
				hi113 = false;
				hi114 = false;
			}
			break;

		/**
		 * Page 18 validation: me101 through me115: max 3 Page 19 validation:
		 * me117 through me124: max 3 Page 20 validation: me126 through me134:
		 * max 3
		 */

		case 18:
			i = 0;
			if (me101) {
				i++;
			}
			if (me102) {
				i++;
			}
			if (me103) {
				i++;
			}
			if (me104) {
				i++;
			}
			if (me105) {
				i++;
			}
			if (me106) {
				i++;
			}
			if (me107) {
				i++;
			}
			if (me108) {
				i++;
			}
			if (me109) {
				i++;
			}
			if (me110) {
				i++;
			}
			if (me111) {
				i++;
			}
			if (me112) {
				i++;
			}
			if (me113) {
				i++;
			}
			if (me114) {
				i++;
			}
			if (me115) {
				i++;
			}
			if (i > 3) {
				errors.add("TV", new ActionError("error.tv.max3"));
				me101 = false;
				me102 = false;
				me103 = false;
				me104 = false;
				me105 = false;
				me106 = false;
				me107 = false;
				me108 = false;
				me109 = false;
				me110 = false;
				me111 = false;
				me112 = false;
				me113 = false;
				me114 = false;
				me115 = false;
			}
			break;
		case 19:
			i = 0;
			if (me117) {
				i++;
			}
			if (me118) {
				i++;
			}
			if (me119) {
				i++;
			}
			if (me120) {
				i++;
			}
			if (me121) {
				i++;
			}
			if (me122) {
				i++;
			}
			if (me123) {
				i++;
			}
			if (me124) {
				i++;
			}
			if (me137) {
				i++;
			}
			if (me138) {
				i++;
			}
			if (i > 3) {
				errors.add("Radio", new ActionError("error.radio.max3"));
				me117 = false;
				me118 = false;
				me119 = false;
				me120 = false;
				me121 = false;
				me122 = false;
				me123 = false;
				me124 = false;
				me137 = false;
				me138 = false;
			}
			break;
		case 20:
			i = 0;
			if (me126) {
				i++;
			}
			if (me127) {
				i++;
			}
			if (me128) {
				i++;
			}
			if (me129) {
				i++;
			}
			if (me130) {
				i++;
			}
			if (me131) {
				i++;
			}
			if (me132) {
				i++;
			}
			if (me133) {
				i++;
			}
			if (me134) {
				i++;
			}
			if (i > 3) {
				errors.add("Movies", new ActionError("error.movies.max3"));
				me126 = false;
				me127 = false;
				me128 = false;
				me129 = false;
				me130 = false;
				me131 = false;
				me132 = false;
				me133 = false;
				me134 = false;
			}
			break;
		case 28:
			i = 0;
			if (sc100) {
				i++;
			}
			if (sc101) {
				i++;
			}
			if (sc102) {
				i++;
			}
			if (sc103) {
				i++;
			}
			if (sc104) {
				i++;
			}
			if (sc105) {
				i++;
			}
			if (sc106) {
				i++;
			}
			if (sc107) {
				i++;
			}
			if (sc108) {
				i++;
			}
			if (sc109) {
				i++;
			}
			if (sc110) {
				i++;
			}
			if (sc111) {
				i++;
			}
			if (sc112) {
				i++;
			}
			if (sc113) {
				i++;
			}
			if (sc114) {
				i++;
			}
			if (sc115) {
				i++;
			}
			if (sc116) {
				i++;
			}
			if (sc117) {
				i++;
			}
			if (sc118) {
				i++;
			}
			if (sc119) {
				i++;
			}
			if (sc120) {
				i++;
			}
			if (sc121) {
				i++;
			}
			if (sc122) {
				i++;
			}
			if (sc123) {
				i++;
			}
			if (sc124) {
				i++;
			}
			if (sc125) {
				i++;
			}
			if (i > 3) {
				errors.add("Science", new ActionError("error.science.max3"));
				sc100 = false;
				sc101 = false;
				sc102 = false;
				sc103 = false;
				sc104 = false;
				sc105 = false;
				sc106 = false;
				sc107 = false;
				sc108 = false;
				sc109 = false;
				sc110 = false;
				sc111 = false;
				sc112 = false;
				sc113 = false;
				sc114 = false;
				sc115 = false;
				sc116 = false;
				sc117 = false;
				sc118 = false;
				sc119 = false;
				sc120 = false;
				sc121 = false;
				sc122 = false;
				sc123 = false;
				sc124 = false;
				sc125 = false;
			}
			break;
		case 30:
			i = 0;
			if (to100)
				i++;
			if (to101)
				i++;
			if (to102)
				i++;
			if (to103)
				i++;
			if (to104)
				i++;
			if (to105)
				i++;
			if (to106)
				i++;
			if (to107)
				i++;
			if (to108)
				i++;
			if (to109)
				i++;
			if (to110)
				i++;
			if (to111)
				i++;
			if (to112)
				i++;
			if (to113)
				i++;
			if (to114)
				i++;
			if (to115)
				i++;
			if (to116)
				i++;
			if (to117)
				i++;
			if (i > 3) {
				errors.add("Toys", new ActionError("error.toys.max3"));
				to100 = false;
				to101 = false;
				to102 = false;
				to103 = false;
				to104 = false;
				to105 = false;
				to106 = false;
				to107 = false;
				to108 = false;
				to109 = false;
				to110 = false;
				to111 = false;
				to112 = false;
				to113 = false;
				to114 = false;
				to115 = false;
				to116 = false;
				to117 = false;
			}
			break;
		}

		return errors;

	}

	private void checkForEdit(ActionErrors errors, HttpServletRequest request) {
		DataSource ds = (DataSource) servlet.getServletContext().getAttribute(
				"cloverDB");
		StudentsDA sda = new StudentsDA(ds);
		this.studentId = 0;
		try {
			int studentId = sda.exists(studentLastName, studentFirstName,
					teacherId);
			if (studentId > 0) {
				edit = true;
				this.studentId = studentId;
				pageNumber = 0;
				StudentBean student = sda.getStudent(studentId);
				CheckBoxes1 cb1 = (CheckBoxes1) student.getCheckBoxes();
				cb1.loadToEntryForm(this);
			}
		} catch (Exception e) {
		}
	}

}