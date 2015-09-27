package org.jmanderson.ahs.dataobjects;

import java.io.Serializable;

import org.jmanderson.ahs.common.CheckBoxes;
import org.jmanderson.ahs.forms.EntryForm2;
import org.jmanderson.ahs.util.Translator;
import org.jmanderson.ahs.dataobjects.CategoryCounts2;

/**
 * @author John Anderson
 *
 * This class holds the checkboxes from the entry form (short version)
 * in Arrays of booleans.
 */
public class CheckBoxes2 extends CheckBoxes implements Serializable, CategoryCounts2 {
	static final long serialVersionUID = -7429420730311956900L;

	private boolean[] an2; // Animals
	private boolean[] at2; // Athletic
	private boolean[] ch2; // Childcare
	private boolean[] cl2; // Clothing
	private boolean[] co2; // Constructing
	private boolean[] cm2; // Competitiveness
	private boolean[] cr2; // Crafts
	private boolean[] fa2; // Fine Arts
	private boolean[] fo2; // Food
	private boolean[] ga2; // Games
	private boolean[] hi2; // History
	private boolean[] hu2; // Humor
	private boolean[] fl2; // Foreign Language
	private boolean[] la2; // Law
	private boolean[] ss2; // School Subjects
	private boolean[] me2; // Media
	private boolean[] md2; // Medicine
	private boolean[] mu2; // Music
	private boolean[] na2; // Nature
	private boolean[] pa2; // Performing Arts
	private boolean[] po2; // Politics
	private boolean[] ps2; // Problem Solving
	private boolean[] re2; // Reading
	private boolean[] rl2; // Relationships
	private boolean[] sc2; // Science
	private boolean[] sa2; // Social Awareness
	private boolean[] to2; // Toys
	private boolean[] te2; // Technology
	private boolean[] tr2; // Travel / Culture
	private boolean[] ve2; // Vehicles
	private boolean[] we2; // Weather
	private boolean[] wr2; // Writing

	public CheckBoxes2() {
		int i;
		an2 = new boolean[ANIMALS];
		for (i = 0; i < ANIMALS; i++)
			an2[i] = false;
		at2 = new boolean[ATHLETICS];
		for (i = 0; i < ATHLETICS; i++)
			at2[i] = false;
		ch2 = new boolean[CHILDCARE];
		for (i = 0; i < CHILDCARE; i++)
			ch2[i] = false;
		cl2 = new boolean[CLOTHING];
		for (i = 0; i < CLOTHING; i++)
			cl2[i] = false;
		co2 = new boolean[CONSTRUCTING];
		for (i = 0; i < CONSTRUCTING; i++)
			co2[i] = false;
		cm2 = new boolean[COMPETITIVENESS];
		for (i = 0; i < COMPETITIVENESS; i++)
			cm2[i] = false;
		cr2 = new boolean[CRAFTS];
		for (i = 0; i < CRAFTS; i++)
			cr2[i] = false;
		fa2 = new boolean[FINEARTS];
		for (i = 0; i < FINEARTS; i++)
			fa2[i] = false;
		fo2 = new boolean[FOOD];
		for (i = 0; i < FOOD; i++)
			fo2[i] = false;
		ga2 = new boolean[GAMES];
		for (i = 0; i < GAMES; i++)
			ga2[i] = false;
		hi2 = new boolean[HISTORY];
		for (i = 0; i < HISTORY; i++)
			hi2[i] = false;
		hu2 = new boolean[HUMOR];
		for (i = 0; i < HUMOR; i++)
			hu2[i] = false;
		fl2 = new boolean[FOREIGNLANGUAGE];
		for (i = 0; i < FOREIGNLANGUAGE; i++)
			fl2[i] = false;
		la2 = new boolean[LAW];
		for (i = 0; i < LAW; i++)
			la2[i] = false;
		ss2 = new boolean[SCHOOLSUBJECTS];
		for (i = 0; i < SCHOOLSUBJECTS; i++)
			ss2[i] = false;
		me2 = new boolean[MEDIA];
		for (i = 0; i < MEDIA; i++)
			me2[i] = false;
		md2 = new boolean[MEDICINE];
		for (i = 0; i < MEDICINE; i++)
			md2[i] = false;
		mu2 = new boolean[MUSIC];
		for (i = 0; i < MUSIC; i++)
			mu2[i] = false;
		na2 = new boolean[NATURE];
		for (i = 0; i < NATURE; i++)
			na2[i] = false;
		pa2 = new boolean[PERFORMINGARTS];
		for (i = 0; i < PERFORMINGARTS; i++)
			pa2[i] = false;
		po2 = new boolean[POLITICS];
		for (i = 0; i < POLITICS; i++)
			po2[i] = false;
		ps2 = new boolean[PROBLEMSOLVING];
		for (i = 0; i < PROBLEMSOLVING; i++)
			ps2[i] = false;
		re2 = new boolean[READING];
		for (i = 0; i < READING; i++)
			re2[i] = false;
		rl2 = new boolean[RELATIONSHIPS];
		for (i = 0; i < RELATIONSHIPS; i++)
			rl2[i] = false;
		sc2 = new boolean[SCIENCE];
		for (i = 0; i < SCIENCE; i++)
			sc2[i] = false;
		sa2 = new boolean[SOCIALAWARENESS];
		for (i = 0; i < SOCIALAWARENESS; i++)
			sa2[i] = false;
		to2 = new boolean[TOYS];
		for (i = 0; i < TOYS; i++)
			to2[i] = false;
		te2 = new boolean[TECHNOLOGY];
		for (i = 0; i < TECHNOLOGY; i++)
			te2[i] = false;
		tr2 = new boolean[TRAVEL];
		for (i = 0; i < TRAVEL; i++)
			tr2[i] = false;
		ve2 = new boolean[VEHICLES];
		for (i = 0; i < VEHICLES; i++)
			ve2[i] = false;
		we2 = new boolean[WEATHER];
		for (i = 0; i < WEATHER; i++)
			we2[i] = false;
		wr2 = new boolean[WRITING];
		for (i = 0; i < WRITING; i++)
			wr2[i] = false;
	}

	public boolean[] getAn2() {
		return an2;
	}
	public boolean[] getSc2() {
		return sc2;
	}
	public boolean[] getSs2() {
		return ss2;
	}
	public boolean[] getNa2() {
		return na2;
	}

	public void loadFromEntryForm(EntryForm2 f) {
		if (f.getAn200())
			an2[0] = true;
		if (f.getAn201())
			an2[1] = true;
		if (f.getAn202())
			an2[2] = true;
		if (f.getAn203())
			an2[3] = true;

		if (f.getAt200())
			at2[0] = true;
		if (f.getAt201())
			at2[1] = true;
		if (f.getAt202())
			at2[2] = true;
		if (f.getAt203())
			at2[3] = true;
		if (f.getAt204())
			at2[4] = true;
		if (f.getAt205())
			at2[5] = true;
		if (f.getAt206())
			at2[6] = true;

		if (f.getCh200())
			ch2[0] = true;

		if (f.getCl200())
			cl2[0] = true;

		if (f.getCo200())
			co2[0] = true;

		if (f.getCm200())
			cm2[0] = true;

		if (f.getCr200())
			cr2[0] = true;

		if (f.getFa200())
			fa2[0] = true;
		if (f.getFa201())
			fa2[1] = true;

		if (f.getFo200())
			fo2[0] = true;

		if (f.getGa200())
			ga2[0] = true;

		if (f.getHi200())
			hi2[0] = true;
		if (f.getHi201())
			hi2[1] = true;
		if (f.getHi202())
			hi2[2] = true;
		if (f.getHi203())
			hi2[3] = true;

		if (f.getHu200())
			hu2[0] = true;

		if (f.getFl200())
			fl2[0] = true;
		if (f.getFl201())
			fl2[1] = true;

		if (f.getLa200())
			la2[0] = true;
		if (f.getLa201())
			la2[1] = true;

		if (f.getSs200())
			ss2[0] = true;
		if (f.getSs201())
			ss2[1] = true;
		if (f.getSs202())
			ss2[2] = true;
		if (f.getSs203())
			ss2[3] = true;
		if (f.getSs204())
			ss2[4] = true;
		if (f.getSs205())
			ss2[5] = true;
		if (f.getSs206())
			ss2[6] = true;
		if (f.getSs207())
			ss2[7] = true;

		if (f.getMe200())
			me2[0] = true;
		if (f.getMe201())
			me2[1] = true;
		if (f.getMe202())
			me2[2] = true;
		if (f.getMe203())
			me2[3] = true;
		if (f.getMe204())
			me2[4] = true;
		if (f.getMe205())
			me2[5] = true;
		if (f.getMe206())
			me2[6] = true;
		if (f.getMe207())
			me2[7] = true;
		if (f.getMe208())
			me2[8] = true;
		if (f.getMe209())
			me2[9] = true;
		if (f.getMe210())
			me2[10] = true;
		if (f.getMe211())
			me2[11] = true;
		if (f.getMe212())
			me2[12] = true;
		if (f.getMe213())
			me2[13] = true;
		if (f.getMe214())
			me2[14] = true;
		if (f.getMe215())
			me2[15] = true;
		if (f.getMe216())
			me2[16] = true;
		if (f.getMe217())
			me2[17] = true;
		if (f.getMe218())
			me2[18] = true;
		if (f.getMe219())
			me2[19] = true;
		if (f.getMe220())
			me2[20] = true;
		if (f.getMe221())
			me2[21] = true;
		if (f.getMe222())
			me2[22] = true;
		if (f.getMe223())
			me2[23] = true;
		if (f.getMe224())
			me2[24] = true;
		if (f.getMe225())
			me2[25] = true;
		if (f.getMe226())
			me2[26] = true;
		if (f.getMe227())
			me2[27] = true;
		if (f.getMe228())
			me2[28] = true;
		if (f.getMe229())
			me2[29] = true;
		if (f.getMe230())
			me2[30] = true;
		if (f.getMe231())
			me2[31] = true;

		if (f.getMd200())
			md2[0] = true;

		if (f.getMu200())
			mu2[0] = true;
		if (f.getMu201())
			mu2[1] = true;
		if (f.getMu202())
			mu2[2] = true;
		if (f.getMu203())
			mu2[3] = true;
		if (f.getMu204())
			mu2[4] = true;
		if (f.getMu205())
			mu2[5] = true;
		if (f.getMu206())
			mu2[6] = true;
		if (f.getMu207())
			mu2[7] = true;
		if (f.getMu208())
			mu2[8] = true;
		if (f.getMu209())
			mu2[9] = true;

		if (f.getNa200())
			na2[0] = true;
		if (f.getNa201())
			na2[1] = true;

		if (f.getPa200())
			pa2[0] = true;
		if (f.getPa201())
			pa2[1] = true;
		if (f.getPa202())
			pa2[2] = true;
		if (f.getPa203())
			pa2[3] = true;

		if (f.getPo200())
			po2[0] = true;
		if (f.getPo201())
			po2[1] = true;

		if (f.getPs200())
			ps2[0] = true;
		if (f.getPs201())
			ps2[1] = true;
		if (f.getPs202())
			ps2[2] = true;
		if (f.getPs203())
			ps2[3] = true;
		if (f.getPs204())
			ps2[4] = true;
		if (f.getPs205())
			ps2[5] = true;

		if (f.getRe200())
			re2[0] = true;

		if (f.getRl200())
			rl2[0] = true;
		if (f.getRl201())
			rl2[1] = true;
		if (f.getRl202())
			rl2[2] = true;
		if (f.getRl203())
			rl2[3] = true;

		if (f.getSc200())
			sc2[0] = true;
		if (f.getSc201())
			sc2[1] = true;
		if (f.getSc202())
			sc2[2] = true;
		if (f.getSc203())
			sc2[3] = true;
		if (f.getSc204())
			sc2[4] = true;
		if (f.getSc205())
			sc2[5] = true;

		if (f.getSa200())
			sa2[0] = true;
		if (f.getSa201())
			sa2[1] = true;
		if (f.getSa202())
			sa2[2] = true;

		if (f.getTo200())
			to2[0] = true;
		if (f.getTo201())
			to2[1] = true;
		if (f.getTo202())
			to2[2] = true;
		if (f.getTo203())
			to2[3] = true;
		if (f.getTo204())
			to2[4] = true;
		if (f.getTo205())
			to2[5] = true;
		if (f.getTo206())
			to2[6] = true;
		if (f.getTo207())
			to2[7] = true;
		if (f.getTo208())
			to2[8] = true;
		if (f.getTo209())
			to2[9] = true;
		if (f.getTo210())
			to2[10] = true;
		if (f.getTo211())
			to2[11] = true;
		if (f.getTo212())
			to2[12] = true;
		if (f.getTo213())
			to2[13] = true;
		if (f.getTo214())
			to2[14] = true;
		if (f.getTo215())
			to2[15] = true;
		if (f.getTo216())
			to2[16] = true;
		if (f.getTo217())
			to2[17] = true;
		if (f.getTo218())
			to2[18] = true;
		if (f.getTo219())
			to2[19] = true;

		if (f.getTe200())
			te2[0] = true;

		if (f.getTr200())
			tr2[0] = true;

		if (f.getVe200())
			ve2[0] = true;
		if (f.getVe201())
			ve2[1] = true;
		if (f.getVe202())
			ve2[2] = true;
		if (f.getVe203())
			ve2[3] = true;
		if (f.getVe204())
			ve2[4] = true;
		if (f.getVe205())
			ve2[5] = true;
		if (f.getVe206())
			ve2[6] = true;
		if (f.getVe207())
			ve2[7] = true;

		if (f.getWe200())
			we2[0] = true;
		if (f.getWe201())
			we2[1] = true;
		if (f.getWe202())
			we2[2] = true;

		if (f.getWr200())
			wr2[0] = true;
		if (f.getWr201())
			wr2[1] = true;

	}

	public void loadToEntryForm(EntryForm2 f) {
		f.setAn200(an2[0]);
		f.setAn201(an2[1]);
		f.setAn202(an2[2]);
		f.setAn203(an2[3]);
		
		f.setAt200(at2[0]);
		f.setAt201(at2[1]);
		f.setAt202(at2[2]);
		f.setAt203(at2[3]);
		f.setAt204(at2[4]);
		f.setAt205(at2[5]);
		f.setAt206(at2[6]);
		
		f.setCh200(ch2[0]);
		
		f.setCl200(cl2[0]);
		
		f.setCo200(co2[0]);
		
		f.setCm200(cm2[0]);
		
		f.setCr200(cr2[0]);
		
		f.setFa200(fa2[0]);
		f.setFa201(fa2[1]);
		
		f.setFo200(fo2[0]);
		
		f.setGa200(ga2[0]);
		
		f.setHi200(hi2[0]);
		f.setHi201(hi2[1]);
		f.setHi202(hi2[2]);
		f.setHi203(hi2[3]);
		
		f.setHu200(hu2[0]);
		
		f.setFl200(fl2[0]);
		f.setFl201(fl2[1]);
		
		f.setLa200(la2[0]);
		f.setLa201(la2[1]);
		
		f.setSs200(ss2[0]);
		f.setSs201(ss2[1]);
		f.setSs202(ss2[2]);
		f.setSs203(ss2[3]);
		f.setSs204(ss2[4]);
		f.setSs205(ss2[5]);
		f.setSs206(ss2[6]);
		f.setSs207(ss2[7]);
		
		f.setMe200(me2[0]);
		f.setMe201(me2[1]);
		f.setMe202(me2[2]);
		f.setMe203(me2[3]);
		f.setMe204(me2[4]);
		f.setMe205(me2[5]);
		f.setMe206(me2[6]);
		f.setMe207(me2[7]);
		f.setMe208(me2[8]);
		f.setMe209(me2[9]);
		f.setMe210(me2[10]);
		f.setMe211(me2[11]);
		f.setMe212(me2[12]);
		f.setMe213(me2[13]);
		f.setMe214(me2[14]);
		f.setMe215(me2[15]);
		f.setMe216(me2[16]);
		f.setMe217(me2[17]);
		f.setMe218(me2[18]);
		f.setMe219(me2[19]);
		f.setMe220(me2[20]);
		f.setMe221(me2[21]);
		f.setMe222(me2[22]);
		f.setMe223(me2[23]);
		f.setMe224(me2[24]);
		f.setMe225(me2[25]);
		f.setMe226(me2[26]);
		f.setMe227(me2[27]);
		f.setMe228(me2[28]);
		f.setMe229(me2[29]);
		f.setMe230(me2[30]);
		f.setMe231(me2[31]);
		
		f.setMd200(md2[0]);
		
		f.setMu200(mu2[0]);
		f.setMu201(mu2[1]);
		f.setMu202(mu2[2]);
		f.setMu203(mu2[3]);
		f.setMu204(mu2[4]);
		f.setMu205(mu2[5]);
		f.setMu206(mu2[6]);
		f.setMu207(mu2[7]);
		f.setMu208(mu2[8]);
		f.setMu209(mu2[9]);
		
		f.setNa200(na2[0]);
		f.setNa201(na2[1]);
		
		f.setPa200(pa2[0]);
		f.setPa201(pa2[1]);
		f.setPa202(pa2[2]);
		f.setPa203(pa2[3]);
		
		f.setPo200(po2[0]);
		f.setPo201(po2[1]);
		
		f.setPs200(ps2[0]);
		f.setPs201(ps2[1]);
		f.setPs202(ps2[2]);
		f.setPs203(ps2[3]);
		f.setPs204(ps2[4]);
		f.setPs205(ps2[5]);
		
		f.setRe200(re2[0]);
		
		f.setRl200(rl2[0]);
		f.setRl201(rl2[1]);
		f.setRl202(rl2[2]);
		f.setRl203(rl2[3]);
		
		f.setSc200(sc2[0]);
		f.setSc201(sc2[1]);
		f.setSc202(sc2[2]);
		f.setSc203(sc2[3]);
		f.setSc204(sc2[4]);
		f.setSc205(sc2[5]);
		
		f.setSa200(sa2[0]);
		f.setSa201(sa2[1]);
		f.setSa202(sa2[2]);
		
		f.setTo200(to2[0]);
		f.setTo201(to2[1]);
		f.setTo202(to2[2]);
		f.setTo203(to2[3]);
		f.setTo204(to2[4]);
		f.setTo205(to2[5]);
		f.setTo206(to2[6]);
		f.setTo207(to2[7]);
		f.setTo208(to2[8]);
		f.setTo209(to2[9]);
		f.setTo210(to2[10]);
		f.setTo211(to2[11]);
		f.setTo212(to2[12]);
		f.setTo213(to2[13]);
		f.setTo214(to2[14]);
		f.setTo215(to2[15]);
		f.setTo216(to2[16]);
		f.setTo217(to2[17]);
		f.setTo218(to2[18]);
		f.setTo219(to2[19]);
		
		f.setTe200(te2[0]);
		
		f.setTr200(tr2[0]);
		
		f.setVe200(ve2[0]);
		f.setVe201(ve2[1]);
		f.setVe202(ve2[2]);
		f.setVe203(ve2[3]);
		f.setVe204(ve2[4]);
		f.setVe205(ve2[5]);
		f.setVe206(ve2[6]);
		f.setVe207(ve2[7]);
		
		f.setWe200(we2[0]);
		f.setWe201(we2[1]);
		f.setWe202(we2[2]);
		
		f.setWr200(wr2[0]);
		f.setWr201(wr2[1]);
		
	}
	
	private boolean isChecked(boolean[] bools, int end) {
		for (int i = 0; i < end; i++)
			if (bools[i])
				return true;
		return false;
	}

	private boolean isChecked(boolean[] bools, int begin, int end) {
		for (int i = begin; i < end; i++)
			if (bools[i])
				return true;
		return false;
	}

	public String getXML() {
		StringBuffer sb = new StringBuffer(4096);

		sb.append("<checkboxes>");

		if (isChecked(an2, ANIMALS)) {
			sb.append("<category name=\"Animals\">");
			for (int i = 0; i < ANIMALS; i++)
				if (an2[i]) {
					sb.append("<item><text>").append(Translator.xlate("an2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fa2, FINEARTS)) {
			sb.append("<category name=\"Art\">");
			for (int i = 0; i < FINEARTS; i++)
				if (fa2[i]) {
					sb.append("<item><text>").append(Translator.xlate("fa2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(at2, ATHLETICS)) {
			sb.append("<category name=\"Athletics / Sports\">");
			for (int i = 0; i < ATHLETICS; i++)
				if (at2[i]) {
					sb.append("<item><text>").append(Translator.xlate("at2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(co2, CONSTRUCTING)) {
			sb.append("<category name=\"Building\">");
			for (int i = 0; i < CONSTRUCTING; i++)
				if (co2[i]) {
					sb.append("<item><text>").append(Translator.xlate("co2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ch2, CHILDCARE)) {
			sb.append("<category name=\"Childcare\">");
			for (int i = 0; i < CHILDCARE; i++)
				if (ch2[i]) {
					sb.append("<item><text>").append(Translator.xlate("ch2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cl2, CLOTHING)) {
			sb.append("<category name=\"Clothing\">");
			for (int i = 0; i < CLOTHING; i++)
				if (cl2[i]) {
					sb.append("<item><text>").append(Translator.xlate("cl2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cm2, COMPETITIVENESS)) {
			sb.append("<category name=\"Competing\">");
			for (int i = 0; i < COMPETITIVENESS; i++)
				if (cm2[i]) {
					sb.append("<item><text>").append(Translator.xlate("cm2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cr2, CRAFTS)) {
			sb.append("<category name=\"Crafts\">");
			for (int i = 0; i < CRAFTS; i++)
				if (cr2[i]) {
					sb.append("<item><text>").append(Translator.xlate("cr2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fo2, FOOD)) {
			sb.append("<category name=\"Food\">");
			for (int i = 0; i < FOOD; i++)
				if (fo2[i]) {
					sb.append("<item><text>").append(Translator.xlate("fo2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fl2, FOREIGNLANGUAGE)) {
			sb.append("<category name=\"Foreign Language\">");
			for (int i = 0; i < FOREIGNLANGUAGE; i++)
				if (fl2[i]) {
					sb.append("<item><text>").append(Translator.xlate("fl2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ga2, GAMES)) {
			sb.append("<category name=\"Games\">");
			for (int i = 0; i < GAMES; i++)
				if (ga2[i]) {
					sb.append("<item><text>").append(Translator.xlate("ga2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(hi2, HISTORY)) {
			sb.append("<category name=\"History\">");
			for (int i = 0; i < HISTORY; i++)
				if (hi2[i]) {
					sb.append("<item><text>").append(Translator.xlate("hi2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(hu2, HUMOR)) {
			sb.append("<category name=\"Humor\">");
			for (int i = 0; i < HUMOR; i++)
				if (hu2[i]) {
					sb.append("<item><text>").append(Translator.xlate("hu2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(la2, LAW)) {
			sb.append("<category name=\"Law\">");
			for (int i = 0; i < LAW; i++)
				if (la2[i]) {
					sb.append("<item><text>").append(Translator.xlate("la2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(me2, MEDIA)) {
			sb.append("<category name=\"Media\">");
			for (int i = 0; i < MEDIA; i++)
				if (me2[i]) {
					sb.append("<item><text>").append(Translator.xlate("me2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(md2, MEDICINE)) {
			sb.append("<category name=\"Medicine\">");
			for (int i = 0; i < MEDICINE; i++)
				if (md2[i]) {
					sb.append("<item><text>").append(Translator.xlate("md2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(mu2, MUSIC)) {
			sb.append("<category name=\"Music\">");
			for (int i = 0; i < MUSIC; i++)
				if (mu2[i]) {
					sb.append("<item><text>").append(Translator.xlate("mu2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(na2, NATURE)) {
			sb.append("<category name=\"Nature\">");
			for (int i = 0; i < NATURE; i++)
				if (na2[i]) {
					sb.append("<item><text>").append(Translator.xlate("na2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(pa2, PERFORMINGARTS)) {
			sb.append("<category name=\"Performing Arts\">");
			for (int i = 0; i < PERFORMINGARTS; i++)
				if (pa2[i]) {
					sb.append("<item><text>").append(Translator.xlate("pa2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(po2, POLITICS)) {
			sb.append("<category name=\"Politics\">");
			for (int i = 0; i < POLITICS; i++)
				if (po2[i]) {
					sb.append("<item><text>").append(Translator.xlate("po2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ps2, PROBLEMSOLVING)) {
			sb.append("<category name=\"Problem Solving\">");
			for (int i = 0; i < PROBLEMSOLVING; i++)
				if (ps2[i]) {
					sb.append("<item><text>").append(Translator.xlate("ps2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(re2, READING)) {
			sb.append("<category name=\"Reading\">");
			for (int i = 0; i < READING; i++)
				if (re2[i]) {
					sb.append("<item><text>").append(Translator.xlate("re2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(rl2, RELATIONSHIPS)) {
			sb.append("<category name=\"Relationships (Things most important to me)\">");
			for (int i = 0; i < RELATIONSHIPS; i++)
				if (rl2[i]) {
					sb.append("<item><text>").append(Translator.xlate("rl2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ss2, SCHOOLSUBJECTS)) {
			sb.append("<category name=\"School Subjects\">");
			for (int i = 0; i < SCHOOLSUBJECTS; i++)
				if (ss2[i]) {
					sb.append("<item><text>").append(Translator.xlate("ss2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(sc2, SCIENCE)) {
			sb.append("<category name=\"Science\">");
			for (int i = 0; i < SCIENCE; i++)
				if (sc2[i]) {
					sb.append("<item><text>").append(Translator.xlate("sc2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(sa2, SOCIALAWARENESS)) {
			sb.append("<category name=\"Social Awareness\">");
			for (int i = 0; i < SOCIALAWARENESS; i++)
				if (sa2[i]) {
					sb.append("<item><text>").append(Translator.xlate("sa2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(te2, TECHNOLOGY)) {
			sb.append("<category name=\"Technology\">");
			for (int i = 0; i < TECHNOLOGY; i++)
				if (te2[i]) {
					sb.append("<item><text>").append(Translator.xlate("te2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(to2, TOYS)) {
			sb.append("<category name=\"Toys (Favorites)\">");
			for (int i = 0; i < TOYS; i++)
				if (to2[i]) {
					sb.append("<item><text>").append(Translator.xlate("to2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(tr2, TRAVEL)) {
			sb.append("<category name=\"Travel / Culture\">");
			for (int i = 0; i < TRAVEL; i++)
				if (tr2[i]) {
					sb.append("<item><text>").append(Translator.xlate("tr2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ve2, VEHICLES)) {
			sb.append("<category name=\"Vehicles\">");
			for (int i = 0; i < VEHICLES; i++)
				if (ve2[i]) {
					sb.append("<item><text>").append(Translator.xlate("ve2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(we2, WEATHER)) {
			sb.append("<category name=\"Weather\">");
			for (int i = 0; i < WEATHER; i++)
				if (we2[i]) {
					sb.append("<item><text>").append(Translator.xlate("we2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(wr2, WRITING)) {
			sb.append("<category name=\"Writing\">");
			for (int i = 0; i < WRITING; i++)
				if (wr2[i]) {
					sb.append("<item><text>").append(Translator.xlate("wr2", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		sb.append("</checkboxes>");

		return sb.toString();
	}

}
