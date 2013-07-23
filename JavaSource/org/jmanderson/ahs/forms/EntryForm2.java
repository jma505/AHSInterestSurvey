package org.jmanderson.ahs.forms;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.CheckBoxes2;
import org.jmanderson.ahs.dataobjects.StudentBean;

public final class EntryForm2 extends ActionForm {

	/**
	 * used to keep track of which screen "page" we're on
	 */
	private int pageNumber = -1;

	//	private boolean restricted = false;

	// indicator that the form is being edited
	private boolean edit = false;
	
	private int studentId = 0;
	
	public int getStudentId() {
		return studentId;
	}

	public boolean isEdit() {
		return edit;
	}

	public String getEdit() {
		if (edit) {
			return "true";
		} else {
			return "false";
		}
	}

	public void setEdit(boolean b) {
		edit = b;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getLastPageNumber() {
		return 3;
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
	 * Page 1
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
	 * Page 2
	 */
	private boolean an200;

	private boolean an201;

	private boolean an202;

	private boolean an203;

	private boolean sc200;

	private boolean sc201;

	private boolean sc202;

	private boolean sc203;

	private boolean sc204;

	private boolean sc205;

	private boolean at200;

	private boolean at201;

	private boolean at202;

	private boolean at203;

	private boolean at204;

	private boolean at205;

	private boolean at206;

	private boolean ch200;

	private boolean cl200;

	private boolean co200;

	private boolean cm200;

	private boolean cr200;

	private boolean fa200;

	private boolean fa201;

	private boolean fo200;

	private boolean ga200;

	private boolean hi200;

	private boolean hi201;

	private boolean hi202;

	private boolean hi203;

	private boolean hu200;

	private boolean fl200;

	private boolean fl201;

	private boolean la200;

	private boolean la201;

	public boolean getAn200() {
		return an200;
	}

	public boolean getAn201() {
		return an201;
	}

	public boolean getAn202() {
		return an202;
	}

	public boolean getAn203() {
		return an203;
	}

	public boolean getSc200() {
		return sc200;
	}

	public boolean getSc201() {
		return sc201;
	}

	public boolean getSc202() {
		return sc202;
	}

	public boolean getSc203() {
		return sc203;
	}

	public boolean getSc204() {
		return sc204;
	}

	public boolean getSc205() {
		return sc205;
	}

	public boolean getAt200() {
		return at200;
	}

	public boolean getAt201() {
		return at201;
	}

	public boolean getAt202() {
		return at202;
	}

	public boolean getAt203() {
		return at203;
	}

	public boolean getAt204() {
		return at204;
	}

	public boolean getAt205() {
		return at205;
	}

	public boolean getAt206() {
		return at206;
	}

	public boolean getCh200() {
		return ch200;
	}

	public boolean getCl200() {
		return cl200;
	}

	public boolean getCo200() {
		return co200;
	}

	public boolean getCm200() {
		return cm200;
	}

	public boolean getCr200() {
		return cr200;
	}

	public boolean getFa200() {
		return fa200;
	}

	public boolean getFa201() {
		return fa201;
	}

	public boolean getFo200() {
		return fo200;
	}

	public boolean getGa200() {
		return ga200;
	}

	public boolean getHi200() {
		return hi200;
	}

	public boolean getHi201() {
		return hi201;
	}

	public boolean getHi202() {
		return hi202;
	}

	public boolean getHi203() {
		return hi203;
	}

	public boolean getHu200() {
		return hu200;
	}

	public boolean getFl200() {
		return fl200;
	}

	public boolean getFl201() {
		return fl201;
	}

	public boolean getLa200() {
		return la200;
	}

	public boolean getLa201() {
		return la201;
	}

	public void setAn200(boolean b) {
		an200 = b;
	}

	public void setAn201(boolean b) {
		an201 = b;
	}

	public void setAn202(boolean b) {
		an202 = b;
	}

	public void setAn203(boolean b) {
		an203 = b;
	}

	public void setSc200(boolean b) {
		sc200 = b;
	}

	public void setSc201(boolean b) {
		sc201 = b;
	}

	public void setSc202(boolean b) {
		sc202 = b;
	}

	public void setSc203(boolean b) {
		sc203 = b;
	}

	public void setSc204(boolean b) {
		sc204 = b;
	}

	public void setSc205(boolean b) {
		sc205 = b;
	}

	public void setAt200(boolean b) {
		at200 = b;
	}

	public void setAt201(boolean b) {
		at201 = b;
	}

	public void setAt202(boolean b) {
		at202 = b;
	}

	public void setAt203(boolean b) {
		at203 = b;
	}

	public void setAt204(boolean b) {
		at204 = b;
	}

	public void setAt205(boolean b) {
		at205 = b;
	}

	public void setAt206(boolean b) {
		at206 = b;
	}

	public void setCh200(boolean b) {
		ch200 = b;
	}

	public void setCl200(boolean b) {
		cl200 = b;
	}

	public void setCo200(boolean b) {
		co200 = b;
	}

	public void setCm200(boolean b) {
		cm200 = b;
	}

	public void setCr200(boolean b) {
		cr200 = b;
	}

	public void setFa200(boolean b) {
		fa200 = b;
	}

	public void setFa201(boolean b) {
		fa201 = b;
	}

	public void setFo200(boolean b) {
		fo200 = b;
	}

	public void setGa200(boolean b) {
		ga200 = b;
	}

	public void setHi200(boolean b) {
		hi200 = b;
	}

	public void setHi201(boolean b) {
		hi201 = b;
	}

	public void setHi202(boolean b) {
		hi202 = b;
	}

	public void setHi203(boolean b) {
		hi203 = b;
	}

	public void setHu200(boolean b) {
		hu200 = b;
	}

	public void setFl200(boolean b) {
		fl200 = b;
	}

	public void setFl201(boolean b) {
		fl201 = b;
	}

	public void setLa200(boolean b) {
		la200 = b;
	}

	public void setLa201(boolean b) {
		la201 = b;
	}

	/**
	 * Page 3
	 */
	private boolean ss200;

	private boolean ss201;

	private boolean ss202;

	private boolean ss203;

	private boolean ss204;

	private boolean ss205;

	private boolean ss206;

	private boolean ss207;

	private boolean me200;

	private boolean me201;

	private boolean me202;

	private boolean me203;

	private boolean me204;

	private boolean me205;

	private boolean me206;

	private boolean me207;

	private boolean me208;

	private boolean me209;

	private boolean me210;

	private boolean me211;

	private boolean me212;

	private boolean me213;

	private boolean me214;

	private boolean me215;

	private boolean me216;

	private boolean me217;

	private boolean me218;

	private boolean me219;

	private boolean me220;

	private boolean me221;

	private boolean me222;

	private boolean me223;

	private boolean me224;

	private boolean me225;

	private boolean me226;

	private boolean me227;

	private boolean me228;

	private boolean me229;

	private boolean me230;

	private boolean me231;

	private boolean mu200;

	private boolean mu201;

	private boolean mu202;

	private boolean mu203;

	private boolean mu204;

	private boolean mu205;

	private boolean mu206;

	private boolean mu207;

	private boolean mu208;

	private boolean mu209;

	private boolean na200;

	private boolean na201;

	private boolean pa200;

	private boolean pa201;

	private boolean pa202;

	private boolean pa203;

	private boolean po200;

	private boolean po201;

	private boolean md200;

	public boolean getSs200() {
		return ss200;
	}

	public boolean getSs201() {
		return ss201;
	}

	public boolean getSs202() {
		return ss202;
	}

	public boolean getSs203() {
		return ss203;
	}

	public boolean getSs204() {
		return ss204;
	}

	public boolean getSs205() {
		return ss205;
	}

	public boolean getSs206() {
		return ss206;
	}

	public boolean getSs207() {
		return ss207;
	}

	public boolean getMe200() {
		return me200;
	}

	public boolean getMe201() {
		return me201;
	}

	public boolean getMe202() {
		return me202;
	}

	public boolean getMe203() {
		return me203;
	}

	public boolean getMe204() {
		return me204;
	}

	public boolean getMe205() {
		return me205;
	}

	public boolean getMe206() {
		return me206;
	}

	public boolean getMe207() {
		return me207;
	}

	public boolean getMe208() {
		return me208;
	}

	public boolean getMe209() {
		return me209;
	}

	public boolean getMe210() {
		return me210;
	}

	public boolean getMe211() {
		return me211;
	}

	public boolean getMe212() {
		return me212;
	}

	public boolean getMe213() {
		return me213;
	}

	public boolean getMe214() {
		return me214;
	}

	public boolean getMe215() {
		return me215;
	}

	public boolean getMe216() {
		return me216;
	}

	public boolean getMe217() {
		return me217;
	}

	public boolean getMe218() {
		return me218;
	}

	public boolean getMe219() {
		return me219;
	}

	public boolean getMe220() {
		return me220;
	}

	public boolean getMe221() {
		return me221;
	}

	public boolean getMe222() {
		return me222;
	}

	public boolean getMe223() {
		return me223;
	}

	public boolean getMe224() {
		return me224;
	}

	public boolean getMe225() {
		return me225;
	}

	public boolean getMe226() {
		return me226;
	}

	public boolean getMe227() {
		return me227;
	}

	public boolean getMe228() {
		return me228;
	}

	public boolean getMe229() {
		return me229;
	}

	public boolean getMe230() {
		return me230;
	}

	public boolean getMe231() {
		return me231;
	}

	public boolean getMu200() {
		return mu200;
	}

	public boolean getMu201() {
		return mu201;
	}

	public boolean getMu202() {
		return mu202;
	}

	public boolean getMu203() {
		return mu203;
	}

	public boolean getMu204() {
		return mu204;
	}

	public boolean getMu205() {
		return mu205;
	}

	public boolean getMu206() {
		return mu206;
	}

	public boolean getMu207() {
		return mu207;
	}

	public boolean getMu208() {
		return mu208;
	}

	public boolean getMu209() {
		return mu209;
	}

	public boolean getNa200() {
		return na200;
	}

	public boolean getNa201() {
		return na201;
	}

	public boolean getPa200() {
		return pa200;
	}

	public boolean getPa201() {
		return pa201;
	}

	public boolean getPa202() {
		return pa202;
	}

	public boolean getPa203() {
		return pa203;
	}

	public boolean getPo200() {
		return po200;
	}

	public boolean getPo201() {
		return po201;
	}

	public boolean getMd200() {
		return md200;
	}

	public void setSs200(boolean b) {
		ss200 = b;
	}

	public void setSs201(boolean b) {
		ss201 = b;
	}

	public void setSs202(boolean b) {
		ss202 = b;
	}

	public void setSs203(boolean b) {
		ss203 = b;
	}

	public void setSs204(boolean b) {
		ss204 = b;
	}

	public void setSs205(boolean b) {
		ss205 = b;
	}

	public void setSs206(boolean b) {
		ss206 = b;
	}

	public void setSs207(boolean b) {
		ss207 = b;
	}

	public void setMe200(boolean b) {
		me200 = b;
	}

	public void setMe201(boolean b) {
		me201 = b;
	}

	public void setMe202(boolean b) {
		me202 = b;
	}

	public void setMe203(boolean b) {
		me203 = b;
	}

	public void setMe204(boolean b) {
		me204 = b;
	}

	public void setMe205(boolean b) {
		me205 = b;
	}

	public void setMe206(boolean b) {
		me206 = b;
	}

	public void setMe207(boolean b) {
		me207 = b;
	}

	public void setMe208(boolean b) {
		me208 = b;
	}

	public void setMe209(boolean b) {
		me209 = b;
	}

	public void setMe210(boolean b) {
		me210 = b;
	}

	public void setMe211(boolean b) {
		me211 = b;
	}

	public void setMe212(boolean b) {
		me212 = b;
	}

	public void setMe213(boolean b) {
		me213 = b;
	}

	public void setMe214(boolean b) {
		me214 = b;
	}

	public void setMe215(boolean b) {
		me215 = b;
	}

	public void setMe216(boolean b) {
		me216 = b;
	}

	public void setMe217(boolean b) {
		me217 = b;
	}

	public void setMe218(boolean b) {
		me218 = b;
	}

	public void setMe219(boolean b) {
		me219 = b;
	}

	public void setMe220(boolean b) {
		me220 = b;
	}

	public void setMe221(boolean b) {
		me221 = b;
	}

	public void setMe222(boolean b) {
		me222 = b;
	}

	public void setMe223(boolean b) {
		me223 = b;
	}

	public void setMe224(boolean b) {
		me224 = b;
	}

	public void setMe225(boolean b) {
		me225 = b;
	}

	public void setMe226(boolean b) {
		me226 = b;
	}

	public void setMe227(boolean b) {
		me227 = b;
	}

	public void setMe228(boolean b) {
		me228 = b;
	}

	public void setMe229(boolean b) {
		me229 = b;
	}

	public void setMe230(boolean b) {
		me230 = b;
	}

	public void setMe231(boolean b) {
		me231 = b;
	}

	public void setMu200(boolean b) {
		mu200 = b;
	}

	public void setMu201(boolean b) {
		mu201 = b;
	}

	public void setMu202(boolean b) {
		mu202 = b;
	}

	public void setMu203(boolean b) {
		mu203 = b;
	}

	public void setMu204(boolean b) {
		mu204 = b;
	}

	public void setMu205(boolean b) {
		mu205 = b;
	}

	public void setMu206(boolean b) {
		mu206 = b;
	}

	public void setMu207(boolean b) {
		mu207 = b;
	}

	public void setMu208(boolean b) {
		mu208 = b;
	}

	public void setMu209(boolean b) {
		mu209 = b;
	}

	public void setNa200(boolean b) {
		na200 = b;
	}

	public void setNa201(boolean b) {
		na201 = b;
	}

	public void setPa200(boolean b) {
		pa200 = b;
	}

	public void setPa201(boolean b) {
		pa201 = b;
	}

	public void setPa202(boolean b) {
		pa202 = b;
	}

	public void setPa203(boolean b) {
		pa203 = b;
	}

	public void setPo200(boolean b) {
		po200 = b;
	}

	public void setPo201(boolean b) {
		po201 = b;
	}

	public void setMd200(boolean b) {
		md200 = b;
	}

	/**
	 * Page 4
	 */
	public boolean ps200;

	public boolean ps201;

	public boolean ps202;

	public boolean ps203;

	public boolean ps204;

	public boolean ps205;

	public boolean re200;

	public boolean to200;

	public boolean to201;

	public boolean to202;

	public boolean to203;

	public boolean to204;

	public boolean to205;

	public boolean to206;

	public boolean to207;

	public boolean to208;

	public boolean to209;

	public boolean to210;

	public boolean to211;

	public boolean to212;

	public boolean to213;

	public boolean to214;

	public boolean to215;

	public boolean to216;

	public boolean to217;

	public boolean to218;

	public boolean to219;

	public boolean te200;

	public boolean tr200;

	public boolean rl200;

	public boolean rl201;

	public boolean rl202;

	public boolean rl203;

	public boolean sa200;

	public boolean sa201;

	public boolean sa202;

	public boolean ve200;

	public boolean ve201;

	public boolean ve202;

	public boolean ve203;

	public boolean ve204;

	public boolean ve205;

	public boolean ve206;

	public boolean ve207;

	public boolean we200;

	public boolean we201;

	public boolean we202;

	public boolean wr200;

	public boolean wr201;

	public boolean getPs200() {
		return ps200;
	}

	public boolean getPs201() {
		return ps201;
	}

	public boolean getPs202() {
		return ps202;
	}

	public boolean getPs203() {
		return ps203;
	}

	public boolean getPs204() {
		return ps204;
	}

	public boolean getPs205() {
		return ps205;
	}

	public boolean getRe200() {
		return re200;
	}

	public boolean getTo200() {
		return to200;
	}

	public boolean getTo201() {
		return to201;
	}

	public boolean getTo202() {
		return to202;
	}

	public boolean getTo203() {
		return to203;
	}

	public boolean getTo204() {
		return to204;
	}

	public boolean getTo205() {
		return to205;
	}

	public boolean getTo206() {
		return to206;
	}

	public boolean getTo207() {
		return to207;
	}

	public boolean getTo208() {
		return to208;
	}

	public boolean getTo209() {
		return to209;
	}

	public boolean getTo210() {
		return to210;
	}

	public boolean getTo211() {
		return to211;
	}

	public boolean getTo212() {
		return to212;
	}

	public boolean getTo213() {
		return to213;
	}

	public boolean getTo214() {
		return to214;
	}

	public boolean getTo215() {
		return to215;
	}

	public boolean getTo216() {
		return to216;
	}

	public boolean getTo217() {
		return to217;
	}

	public boolean getTo218() {
		return to218;
	}

	public boolean getTo219() {
		return to219;
	}

	public boolean getTe200() {
		return te200;
	}

	public boolean getTr200() {
		return tr200;
	}

	public boolean getRl200() {
		return rl200;
	}

	public boolean getRl201() {
		return rl201;
	}

	public boolean getRl202() {
		return rl202;
	}

	public boolean getRl203() {
		return rl203;
	}

	public boolean getSa200() {
		return sa200;
	}

	public boolean getSa201() {
		return sa201;
	}

	public boolean getSa202() {
		return sa202;
	}

	public boolean getVe200() {
		return ve200;
	}

	public boolean getVe201() {
		return ve201;
	}

	public boolean getVe202() {
		return ve202;
	}

	public boolean getVe203() {
		return ve203;
	}

	public boolean getVe204() {
		return ve204;
	}

	public boolean getVe205() {
		return ve205;
	}

	public boolean getVe206() {
		return ve206;
	}

	public boolean getVe207() {
		return ve207;
	}

	public boolean getWe200() {
		return we200;
	}

	public boolean getWe201() {
		return we201;
	}

	public boolean getWe202() {
		return we202;
	}

	public boolean getWr200() {
		return wr200;
	}

	public boolean getWr201() {
		return wr201;
	}

	public void setPs200(boolean b) {
		ps200 = b;
	}

	public void setPs201(boolean b) {
		ps201 = b;
	}

	public void setPs202(boolean b) {
		ps202 = b;
	}

	public void setPs203(boolean b) {
		ps203 = b;
	}

	public void setPs204(boolean b) {
		ps204 = b;
	}

	public void setPs205(boolean b) {
		ps205 = b;
	}

	public void setRe200(boolean b) {
		re200 = b;
	}

	public void setTo200(boolean b) {
		to200 = b;
	}

	public void setTo201(boolean b) {
		to201 = b;
	}

	public void setTo202(boolean b) {
		to202 = b;
	}

	public void setTo203(boolean b) {
		to203 = b;
	}

	public void setTo204(boolean b) {
		to204 = b;
	}

	public void setTo205(boolean b) {
		to205 = b;
	}

	public void setTo206(boolean b) {
		to206 = b;
	}

	public void setTo207(boolean b) {
		to207 = b;
	}

	public void setTo208(boolean b) {
		to208 = b;
	}

	public void setTo209(boolean b) {
		to209 = b;
	}

	public void setTo210(boolean b) {
		to210 = b;
	}

	public void setTo211(boolean b) {
		to211 = b;
	}

	public void setTo212(boolean b) {
		to212 = b;
	}

	public void setTo213(boolean b) {
		to213 = b;
	}

	public void setTo214(boolean b) {
		to214 = b;
	}

	public void setTo215(boolean b) {
		to215 = b;
	}

	public void setTo216(boolean b) {
		to216 = b;
	}

	public void setTo217(boolean b) {
		to217 = b;
	}

	public void setTo218(boolean b) {
		to218 = b;
	}

	public void setTo219(boolean b) {
		to219 = b;
	}

	public void setTe200(boolean b) {
		te200 = b;
	}

	public void setTr200(boolean b) {
		tr200 = b;
	}

	public void setRl200(boolean b) {
		rl200 = b;
	}

	public void setRl201(boolean b) {
		rl201 = b;
	}

	public void setRl202(boolean b) {
		rl202 = b;
	}

	public void setRl203(boolean b) {
		rl203 = b;
	}

	public void setSa200(boolean b) {
		sa200 = b;
	}

	public void setSa201(boolean b) {
		sa201 = b;
	}

	public void setSa202(boolean b) {
		sa202 = b;
	}

	public void setVe200(boolean b) {
		ve200 = b;
	}

	public void setVe201(boolean b) {
		ve201 = b;
	}

	public void setVe202(boolean b) {
		ve202 = b;
	}

	public void setVe203(boolean b) {
		ve203 = b;
	}

	public void setVe204(boolean b) {
		ve204 = b;
	}

	public void setVe205(boolean b) {
		ve205 = b;
	}

	public void setVe206(boolean b) {
		ve206 = b;
	}

	public void setVe207(boolean b) {
		ve207 = b;
	}

	public void setWe200(boolean b) {
		we200 = b;
	}

	public void setWe201(boolean b) {
		we201 = b;
	}

	public void setWe202(boolean b) {
		we202 = b;
	}

	public void setWr200(boolean b) {
		wr200 = b;
	}

	public void setWr201(boolean b) {
		wr201 = b;
	}

	public void fullReset(ActionMapping mapping, HttpServletRequest request) {
		for (int i = 0, j = this.getLastPageNumber(); i <= j; i++) {
			pageReset(i);
		}
	}

	public void pageReset(int page) {
		switch (page) {
		case 0:
			pageNumber = -1;
			studentFirstName = null;
			studentLastName = null;
			edit = false;
			teacherId = 0;
			break;
		case 1:
			an200 = false;
			an201 = false;
			an202 = false;
			an203 = false;
			sc200 = false;
			sc201 = false;
			sc202 = false;
			sc203 = false;
			sc204 = false;
			sc205 = false;
			at200 = false;
			at201 = false;
			at202 = false;
			at203 = false;
			at204 = false;
			at205 = false;
			at206 = false;
			ch200 = false;
			cl200 = false;
			co200 = false;
			cm200 = false;
			cr200 = false;
			fa200 = false;
			fa201 = false;
			fo200 = false;
			ga200 = false;
			hi200 = false;
			hi201 = false;
			hi202 = false;
			hi203 = false;
			hu200 = false;
			fl200 = false;
			fl201 = false;
			la200 = false;
			la201 = false;
			break;
		case 2:
			ss200 = false;
			ss201 = false;
			ss202 = false;
			ss203 = false;
			ss204 = false;
			ss205 = false;
			ss206 = false;
			ss207 = false;
			me200 = false;
			me201 = false;
			me202 = false;
			me203 = false;
			me204 = false;
			me205 = false;
			me206 = false;
			me207 = false;
			me208 = false;
			me209 = false;
			me210 = false;
			me211 = false;
			me212 = false;
			me213 = false;
			me214 = false;
			me215 = false;
			me216 = false;
			me217 = false;
			me218 = false;
			me219 = false;
			me220 = false;
			me221 = false;
			me222 = false;
			me223 = false;
			me224 = false;
			me225 = false;
			me226 = false;
			me227 = false;
			me228 = false;
			me229 = false;
			me230 = false;
			me231 = false;
			mu200 = false;
			mu201 = false;
			mu202 = false;
			mu203 = false;
			mu204 = false;
			mu205 = false;
			mu206 = false;
			mu207 = false;
			mu208 = false;
			mu209 = false;
			na200 = false;
			na201 = false;
			pa200 = false;
			pa201 = false;
			pa202 = false;
			pa203 = false;
			po200 = false;
			po201 = false;
			md200 = false;
			break;
		case 3:
			ps200 = false;
			ps201 = false;
			ps202 = false;
			ps203 = false;
			ps204 = false;
			ps205 = false;
			re200 = false;
			to200 = false;
			to201 = false;
			to202 = false;
			to203 = false;
			to204 = false;
			to205 = false;
			to206 = false;
			to207 = false;
			to208 = false;
			to209 = false;
			to210 = false;
			to211 = false;
			to212 = false;
			to213 = false;
			to214 = false;
			to215 = false;
			to216 = false;
			to217 = false;
			to218 = false;
			to219 = false;
			te200 = false;
			tr200 = false;
			rl200 = false;
			rl201 = false;
			rl202 = false;
			rl203 = false;
			sa200 = false;
			sa201 = false;
			sa202 = false;
			ve200 = false;
			ve201 = false;
			ve202 = false;
			ve203 = false;
			ve204 = false;
			ve205 = false;
			ve206 = false;
			ve207 = false;
			we200 = false;
			we201 = false;
			we202 = false;
			wr200 = false;
			wr201 = false;
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
			} else {
				StringBuffer sb = new StringBuffer();
				sb.append(studentFirstName.substring(0, 1).toUpperCase());
				sb.append(studentFirstName.substring(1).toLowerCase());
				studentFirstName = sb.toString();
			}
			if (hasInvalidCharacter(studentFirstName)) {
				errors.add("studentFirstName", new ActionError(
						"error.invalid.character"));
			}
			if ((studentLastName == null) || (studentLastName.length() < 1)) {
				errors.add("studentLastName", new ActionError(
						"error.studentLastName.required"));
			} else {
				StringBuffer sb = new StringBuffer();
				sb.append(studentLastName.substring(0, 1).toUpperCase());
				sb.append(studentLastName.substring(1).toLowerCase());
				studentLastName = sb.toString();
			}
			if (hasInvalidCharacter(studentLastName)) {
				errors.add("studentLastName", new ActionError(
						"error.invalid.character"));
			}
			if (teacherId == 0) {
				errors.add("teacherId", new ActionError(
						"error.teacher.required"));
			}
			checkForEdit(errors, request);

			/**
			 * Page 2 validation: at201 through at206: one only
			 */

			break;
		case 1:
			int i = 0;
			if (at201) {
				i++;
			}
			if (at202) {
				i++;
			}
			if (at203) {
				i++;
			}
			if (at204) {
				i++;
			}
			if (at205) {
				i++;
			}
			if (at206) {
				i++;
			}
			if (i > 1) {
				errors.add("Sports", new ActionError("error.sports.only1"));
				pageNumber = 1;
				at201 = false;
				at202 = false;
				at203 = false;
				at204 = false;
				at205 = false;
				at206 = false;
			}

			/**
			 * Page 3 Validation: me200 through me214: one only me215 through
			 * me222: one only me223 through me231: one only
			 */

			break;
		case 2:
			i = 0;
			if (me200) {
				i++;
			}
			if (me201) {
				i++;
			}
			if (me202) {
				i++;
			}
			if (me203) {
				i++;
			}
			if (me204) {
				i++;
			}
			if (me205) {
				i++;
			}
			if (me206) {
				i++;
			}
			if (me207) {
				i++;
			}
			if (me208) {
				i++;
			}
			if (me209) {
				i++;
			}
			if (me210) {
				i++;
			}
			if (me211) {
				i++;
			}
			if (me212) {
				i++;
			}
			if (me213) {
				i++;
			}
			if (me214) {
				i++;
			}
			if (i > 1) {
				errors.add("TV", new ActionError("error.tv.only1"));
				pageNumber = 2;
				me200 = false;
				me201 = false;
				me202 = false;
				me203 = false;
				me204 = false;
				me205 = false;
				me206 = false;
				me207 = false;
				me208 = false;
				me209 = false;
				me210 = false;
				me211 = false;
				me212 = false;
				me213 = false;
				me214 = false;
			}
			i = 0;
			if (me215) {
				i++;
			}
			if (me216) {
				i++;
			}
			if (me217) {
				i++;
			}
			if (me218) {
				i++;
			}
			if (me219) {
				i++;
			}
			if (me220) {
				i++;
			}
			if (me221) {
				i++;
			}
			if (me222) {
				i++;
			}
			if (i > 1) {
				errors.add("Radio", new ActionError("error.radio.only1"));
				pageNumber = 2;
				me215 = false;
				me216 = false;
				me217 = false;
				me218 = false;
				me219 = false;
				me220 = false;
				me221 = false;
				me222 = false;
			}
			i = 0;
			if (me223) {
				i++;
			}
			if (me224) {
				i++;
			}
			if (me225) {
				i++;
			}
			if (me226) {
				i++;
			}
			if (me227) {
				i++;
			}
			if (me228) {
				i++;
			}
			if (me229) {
				i++;
			}
			if (me230) {
				i++;
			}
			if (me231) {
				i++;
			}
			if (i > 1) {
				errors.add("Movie", new ActionError("error.movie.only1"));
				pageNumber = 2;
				me223 = false;
				me224 = false;
				me225 = false;
				me226 = false;
				me227 = false;
				me228 = false;
				me229 = false;
				me230 = false;
				me231 = false;
			}

			/**
			 * Page 4 validation: to200 through to219: max 3
			 */
			break;
		case 3:
			i = 0;
			if (to200) {
				i++;
			}
			if (to201) {
				i++;
			}
			if (to202) {
				i++;
			}
			if (to203) {
				i++;
			}
			if (to204) {
				i++;
			}
			if (to205) {
				i++;
			}
			if (to206) {
				i++;
			}
			if (to207) {
				i++;
			}
			if (to208) {
				i++;
			}
			if (to209) {
				i++;
			}
			if (to210) {
				i++;
			}
			if (to211) {
				i++;
			}
			if (to212) {
				i++;
			}
			if (to213) {
				i++;
			}
			if (to214) {
				i++;
			}
			if (to215) {
				i++;
			}
			if (to216) {
				i++;
			}
			if (to217) {
				i++;
			}
			if (to218) {
				i++;
			}
			if (to219) {
				i++;
			}
			if (i > 3) {
				errors.add("Toys", new ActionError("error.toys.max3"));
				pageNumber = 3;
				to200 = false;
				to201 = false;
				to202 = false;
				to203 = false;
				to204 = false;
				to205 = false;
				to206 = false;
				to207 = false;
				to208 = false;
				to209 = false;
				to210 = false;
				to211 = false;
				to212 = false;
				to213 = false;
				to214 = false;
				to215 = false;
				to216 = false;
				to217 = false;
				to218 = false;
				to219 = false;
			}

		}

		return errors;

	}

	private void checkForEdit(ActionErrors errors, HttpServletRequest request) {
		DataSource ds = (DataSource) servlet.getServletContext()
				.getAttribute("cloverDB");
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
				CheckBoxes2 cb2 = (CheckBoxes2) student.getCheckBoxes();
				cb2.loadToEntryForm(this);
			}
		} catch (Exception e) {
		}
	}

}

