package org.jmanderson.ahs.dataobjects;

import java.io.Serializable;

import org.jmanderson.ahs.common.CheckBoxes;
import org.jmanderson.ahs.forms.EntryForm1;
import org.jmanderson.ahs.util.Translator;
import org.jmanderson.ahs.dataobjects.CategoryCounts1;

/**
 * @author John Anderson
 *
 * This class holds the checkboxes from the entry form (long version)
 * in Arrays of booleans.
 */
public class CheckBoxes1 extends CheckBoxes implements Serializable, CategoryCounts1 {
	static final long serialVersionUID = -7648545014504126256L;

	private boolean[] an1; // Animals
	private boolean[] at1; // Athletic
	private boolean[] bu1; // Business
	private boolean[] ch1; // Childcare
	private boolean[] cl1; // Clothing
	private boolean[] co1; // Constructing
	private boolean[] cm1; // Competitiveness
	private boolean[] cr1; // Crafts
	private boolean[] fa1; // Fine Arts
	private boolean[] fo1; // Food
	private boolean[] ga1; // Games
	private boolean[] hi1; // History
	private boolean[] hu1; // Humor
	private boolean[] fl1; // Foreign Language
	private boolean[] la1; // Law
	private boolean[] ss1; // School Subjects
	private boolean[] me1; // Media
	private boolean[] md1; // Medicine
	private boolean[] mu1; // Music
	private boolean[] na1; // Nature
	private boolean[] pa1; // Performing Arts
	private boolean[] po1; // Politics
	private boolean[] ps1; // Problem Solving
	private boolean[] re1; // Reading
	private boolean[] rl1; // Relationships
	private boolean[] sc1; // Science
	private boolean[] sa1; // Social Awareness
	private boolean[] to1; // Toys
	private boolean[] te1; // Technology
	private boolean[] tr1; // Travel / Culture
	private boolean[] ve1; // Vehicles
	private boolean[] we1; // Weather
	private boolean[] wr1; // Writing

	public CheckBoxes1() {
		int i;
		an1 = new boolean[ANIMALS];
		for (i = 0; i < ANIMALS; i++)
			an1[i] = false;
		at1 = new boolean[ATHLETICS];
		for (i = 0; i < ATHLETICS; i++)
			at1[i] = false;
		bu1 = new boolean[BUSINESS];
		for (i = 0; i < BUSINESS; i++)
			bu1[i] = false;
		ch1 = new boolean[CHILDCARE];
		for (i = 0; i < CHILDCARE; i++)
			ch1[i] = false;
		cl1 = new boolean[CLOTHING];
		for (i = 0; i < CLOTHING; i++)
			cl1[i] = false;
		co1 = new boolean[BUILDING];
		for (i = 0; i < BUILDING; i++)
			co1[i] = false;
		cm1 = new boolean[COMPETITIVENESS];
		for (i = 0; i < COMPETITIVENESS; i++)
			cm1[i] = false;
		cr1 = new boolean[CRAFTS];
		for (i = 0; i < CRAFTS; i++)
			cr1[i] = false;
		fa1 = new boolean[ART];
		for (i = 0; i < ART; i++)
			fa1[i] = false;
		fo1 = new boolean[FOOD];
		for (i = 0; i < FOOD; i++)
			fo1[i] = false;
		ga1 = new boolean[GAMES];
		for (i = 0; i < GAMES; i++)
			ga1[i] = false;
		hi1 = new boolean[HISTORY];
		for (i = 0; i < HISTORY; i++)
			hi1[i] = false;
		hu1 = new boolean[HUMOR];
		for (i = 0; i < HUMOR; i++)
			hu1[i] = false;
		fl1 = new boolean[FOREIGNLANGUAGE];
		for (i = 0; i < FOREIGNLANGUAGE; i++)
			fl1[i] = false;
		la1 = new boolean[LAW];
		for (i = 0; i < LAW; i++)
			la1[i] = false;
		ss1 = new boolean[SCHOOLSUBJECTS];
		for (i = 0; i < SCHOOLSUBJECTS; i++)
			ss1[i] = false;
		me1 = new boolean[MEDIA];
		for (i = 0; i < MEDIA; i++)
			me1[i] = false;
		md1 = new boolean[MEDICINE];
		for (i = 0; i < MEDICINE; i++)
			md1[i] = false;
		mu1 = new boolean[MUSIC];
		for (i = 0; i < MUSIC; i++)
			mu1[i] = false;
		na1 = new boolean[NATURE];
		for (i = 0; i < NATURE; i++)
			na1[i] = false;
		pa1 = new boolean[PERFORMINGARTS];
		for (i = 0; i < PERFORMINGARTS; i++)
			pa1[i] = false;
		po1 = new boolean[POLITICS];
		for (i = 0; i < POLITICS; i++)
			po1[i] = false;
		ps1 = new boolean[PROBLEMSOLVING];
		for (i = 0; i < PROBLEMSOLVING; i++)
			ps1[i] = false;
		re1 = new boolean[READING];
		for (i = 0; i < READING; i++)
			re1[i] = false;
		rl1 = new boolean[RELATIONSHIPS];
		for (i = 0; i < RELATIONSHIPS; i++)
			rl1[i] = false;
		sc1 = new boolean[SCIENCE];
		for (i = 0; i < SCIENCE; i++)
			sc1[i] = false;
		sa1 = new boolean[SOCIALAWARENESS];
		for (i = 0; i < SOCIALAWARENESS; i++)
			sa1[i] = false;
		to1 = new boolean[TOYS];
		for (i = 0; i < TOYS; i++)
			to1[i] = false;
		te1 = new boolean[TECHNOLOGY];
		for (i = 0; i < TECHNOLOGY; i++)
			te1[i] = false;
		tr1 = new boolean[TRAVEL];
		for (i = 0; i < TRAVEL; i++)
			tr1[i] = false;
		ve1 = new boolean[VEHICLES];
		for (i = 0; i < VEHICLES; i++)
			ve1[i] = false;
		we1 = new boolean[WEATHER];
		for (i = 0; i < WEATHER; i++)
			we1[i] = false;
		wr1 = new boolean[WRITING];
		for (i = 0; i < WRITING; i++)
			wr1[i] = false;
	}

	public boolean[] getAt1() {
		return at1;
	}
	public boolean[] getAn1() {
		return an1;
	}
	public boolean[] getSc1() {
		return sc1;
	}
	public boolean[] getSs1() {
		return ss1;
	}
	public boolean[] getNa1() {
		return na1;
	}

	public void loadToEntryForm(EntryForm1 f) {
		f.setAn100(an1[0]);
		f.setAn101(an1[1]);
		f.setAn102(an1[2]);
		f.setAn103(an1[3]);
		f.setAn104(an1[4]);
		f.setAn105(an1[5]);
		f.setAn106(an1[6]);
		f.setAn107(an1[7]);
		f.setAn108(an1[8]);
		f.setAn109(an1[9]);
		f.setAn110(an1[10]);
		f.setAn111(an1[11]);
		f.setAn112(an1[12]);
		
		f.setAt100(at1[0]);
		f.setAt101(at1[1]);
		f.setAt102(at1[2]);
		f.setAt103(at1[3]);
		f.setAt104(at1[4]);
		f.setAt105(at1[5]);
		f.setAt106(at1[6]);
		f.setAt107(at1[7]);
		f.setAt108(at1[8]);
		f.setAt109(at1[9]);
		f.setAt110(at1[10]);
		f.setAt111(at1[11]);
		f.setAt112(at1[12]);
		f.setAt113(at1[13]);

		f.setBu100(bu1[0]);
		f.setBu101(bu1[1]);
		f.setBu102(bu1[2]);
		f.setBu103(bu1[3]);
		f.setBu104(bu1[4]);

		f.setCh100(ch1[0]);
		f.setCh101(ch1[1]);
		f.setCh102(ch1[2]);
		f.setCh103(ch1[3]);
		f.setCh104(ch1[4]);

		f.setCl100(cl1[0]);
		f.setCl101(cl1[1]);
		f.setCl102(cl1[2]);
		f.setCl103(cl1[3]);
		f.setCl104(cl1[4]);

		f.setCo100(co1[0]);
		f.setCo101(co1[1]);
		f.setCo102(co1[2]);
		f.setCo103(co1[3]);
		f.setCo104(co1[4]);

		f.setCm100(cm1[0]);
		f.setCm101(cm1[1]);
		f.setCm102(cm1[2]);
		f.setCm103(cm1[3]);
		f.setCm104(cm1[4]);

		f.setCr100(cr1[0]);
		f.setCr101(cr1[1]);
		f.setCr102(cr1[2]);
		f.setCr103(cr1[3]);
		f.setCr104(cr1[4]);

		f.setFa100(fa1[0]);
		f.setFa101(fa1[1]);
		f.setFa102(fa1[2]);
		f.setFa103(fa1[3]);
		f.setFa104(fa1[4]);

		f.setFo100(fo1[0]);
		f.setFo101(fo1[1]);
		f.setFo102(fo1[2]);
		f.setFo103(fo1[3]);

		f.setGa100(ga1[0]);
		f.setGa101(ga1[1]);
		f.setGa102(ga1[2]);
		f.setGa103(ga1[3]);
		f.setGa104(ga1[4]);
		f.setGa105(ga1[5]);

		f.setHi100(hi1[0]);
		f.setHi101(hi1[1]);
		f.setHi102(hi1[2]);
		f.setHi103(hi1[3]);
		f.setHi104(hi1[4]);
		f.setHi105(hi1[5]);
		f.setHi106(hi1[6]);
		f.setHi107(hi1[7]);
		f.setHi108(hi1[8]);
		f.setHi109(hi1[9]);
		f.setHi110(hi1[10]);
		f.setHi111(hi1[11]);
		f.setHi112(hi1[12]);
		f.setHi113(hi1[13]);
		f.setHi114(hi1[14]);
		f.setHi115(hi1[15]);
		f.setHi116(hi1[16]);
		f.setHi117(hi1[17]);
		f.setHi118(hi1[18]);
		f.setHi119(hi1[19]);
		f.setHi120(hi1[20]);
		f.setHi121(hi1[21]);
		f.setHi122(hi1[22]);
		f.setHi123(hi1[23]);
		f.setHi124(hi1[24]);
		f.setHi125(hi1[25]);
		f.setHi126(hi1[26]);
		f.setHi127(hi1[27]);
		f.setHi128(hi1[28]);

		f.setHu100(hu1[0]);
		f.setHu101(hu1[1]);
		f.setHu102(hu1[2]);
		f.setHu103(hu1[3]);
		f.setHu104(hu1[4]);

		f.setFl100(fl1[0]);
		f.setFl101(fl1[1]);
		f.setFl102(fl1[2]);
		f.setFl103(fl1[3]);
		f.setFl104(fl1[4]);
		f.setFl105(fl1[5]);
		f.setFl106(fl1[6]);
		f.setFl107(fl1[7]);
		f.setFl108(fl1[8]);
		f.setFl109(fl1[9]);
		f.setFl110(fl1[10]);
		f.setFl111(fl1[11]);
		f.setFl112(fl1[12]);
		f.setFl113(fl1[13]);
		f.setFl114(fl1[14]);
		f.setFl115(fl1[15]);

		f.setLa100(la1[0]);
		f.setLa101(la1[1]);
		f.setLa102(la1[2]);
		f.setLa103(la1[3]);
		f.setLa104(la1[4]);

		f.setSs100(ss1[0]);
		f.setSs101(ss1[1]);
		f.setSs102(ss1[2]);
		f.setSs103(ss1[3]);
		f.setSs104(ss1[4]);
		f.setSs105(ss1[5]);
		f.setSs106(ss1[6]);
		f.setSs107(ss1[7]);
		f.setSs108(ss1[8]);
		f.setSs109(ss1[9]);
		f.setSs110(ss1[10]);

		f.setMe100(me1[0]);
		f.setMe101(me1[1]);
		f.setMe102(me1[2]);
		f.setMe103(me1[3]);
		f.setMe104(me1[4]);
		f.setMe105(me1[5]);
		f.setMe106(me1[6]);
		f.setMe107(me1[7]);
		f.setMe108(me1[8]);
		f.setMe109(me1[9]);
		f.setMe110(me1[10]);
		f.setMe111(me1[11]);
		f.setMe112(me1[12]);
		f.setMe113(me1[13]);
		f.setMe114(me1[14]);
		f.setMe115(me1[15]);
		f.setMe116(me1[16]);
		f.setMe117(me1[17]);
		f.setMe118(me1[18]);
		f.setMe119(me1[19]);
		f.setMe120(me1[20]);
		f.setMe121(me1[21]);
		f.setMe122(me1[22]);
		f.setMe123(me1[23]);
		f.setMe124(me1[24]);
		f.setMe125(me1[25]);
		f.setMe126(me1[26]);
		f.setMe127(me1[27]);
		f.setMe128(me1[28]);
		f.setMe129(me1[29]);
		f.setMe130(me1[30]);
		f.setMe131(me1[31]);
		f.setMe132(me1[32]);
		f.setMe133(me1[33]);
		f.setMe134(me1[34]);
		f.setMe135(me1[35]);
		f.setMe136(me1[36]);
		f.setMe137(me1[37]);
		f.setMe138(me1[38]);
		f.setMe139(me1[39]);
		f.setMe140(me1[40]);

		f.setMd100(md1[0]);
		f.setMd101(md1[1]);
		f.setMd102(md1[2]);
		f.setMd103(md1[3]);
		f.setMd104(md1[4]);

		f.setMu100(mu1[0]);
		f.setMu101(mu1[1]);
		f.setMu102(mu1[2]);
		f.setMu103(mu1[3]);
		f.setMu104(mu1[4]);
		f.setMu105(mu1[5]);
		f.setMu106(mu1[6]);
		f.setMu107(mu1[7]);
		f.setMu108(mu1[8]);
		f.setMu109(mu1[9]);
		f.setMu110(mu1[10]);
		f.setMu111(mu1[11]);
		f.setMu112(mu1[12]);

		f.setNa100(na1[0]);
		f.setNa101(na1[1]);
		f.setNa102(na1[2]);
		f.setNa103(na1[3]);
		f.setNa104(na1[4]);
		f.setNa105(na1[5]);
		f.setNa106(na1[6]);

		f.setPa100(pa1[0]);
		f.setPa101(pa1[1]);
		f.setPa102(pa1[2]);
		f.setPa103(pa1[3]);
		f.setPa104(pa1[4]);
		f.setPa105(pa1[5]);

		f.setPo100(po1[0]);
		f.setPo101(po1[1]);
		f.setPo102(po1[2]);
		f.setPo103(po1[3]);
		f.setPo104(po1[4]);

		f.setPs100(ps1[0]);
		f.setPs101(ps1[1]);
		f.setPs102(ps1[2]);
		f.setPs103(ps1[3]);
		f.setPs104(ps1[4]);
		f.setPs105(ps1[5]);

		f.setRe100(re1[0]);
		f.setRe101(re1[1]);
		f.setRe102(re1[2]);
		f.setRe103(re1[3]);
		f.setRe104(re1[4]);
		f.setRe105(re1[5]);
		f.setRe106(re1[6]);
		f.setRe107(re1[7]);
		f.setRe108(re1[8]);

		f.setRl100(rl1[0]);
		f.setRl101(rl1[1]);
		f.setRl102(rl1[2]);
		f.setRl103(rl1[3]);
		f.setRl104(rl1[4]);
		f.setRl105(rl1[5]);

		f.setSc100(sc1[0]);
		f.setSc101(sc1[1]);
		f.setSc102(sc1[2]);
		f.setSc103(sc1[3]);
		f.setSc104(sc1[4]);
		f.setSc105(sc1[5]);
		f.setSc106(sc1[6]);
		f.setSc107(sc1[7]);
		f.setSc108(sc1[8]);
		f.setSc109(sc1[9]);
		f.setSc110(sc1[10]);
		f.setSc111(sc1[11]);
		f.setSc112(sc1[12]);
		f.setSc113(sc1[13]);
		f.setSc114(sc1[14]);
		f.setSc115(sc1[15]);
		f.setSc116(sc1[16]);
		f.setSc117(sc1[17]);
		f.setSc118(sc1[18]);
		f.setSc119(sc1[19]);
		f.setSc120(sc1[20]);
		f.setSc121(sc1[21]);
		f.setSc122(sc1[22]);
		f.setSc123(sc1[23]);
		f.setSc124(sc1[24]);
		f.setSc125(sc1[25]);

		f.setSa100(sa1[0]);
		f.setSa101(sa1[1]);
		f.setSa102(sa1[2]);
		f.setSa103(sa1[3]);
		f.setSa104(sa1[4]);
		f.setSa105(sa1[5]);
		f.setSa106(sa1[6]);
		f.setSa107(sa1[7]);
		f.setSa108(sa1[8]);

		f.setTo100(to1[0]);
		f.setTo101(to1[1]);
		f.setTo102(to1[2]);
		f.setTo103(to1[3]);
		f.setTo104(to1[4]);
		f.setTo105(to1[5]);
		f.setTo106(to1[6]);
		f.setTo107(to1[7]);
		f.setTo108(to1[8]);
		f.setTo109(to1[9]);
		f.setTo110(to1[10]);
		f.setTo111(to1[11]);
		f.setTo112(to1[12]);
		f.setTo113(to1[13]);
		f.setTo114(to1[14]);
		f.setTo115(to1[15]);
		f.setTo116(to1[16]);
		f.setTo117(to1[17]);

		f.setTe100(te1[0]);
		f.setTe101(te1[1]);
		f.setTe102(te1[2]);
		f.setTe103(te1[3]);
		f.setTe104(te1[4]);

		f.setTr100(tr1[0]);
		f.setTr101(tr1[1]);
		f.setTr102(tr1[2]);
		f.setTr103(tr1[3]);
		f.setTr104(tr1[4]);
		f.setTr105(tr1[5]);
		f.setTr106(tr1[6]);

		f.setVe100(ve1[0]);
		f.setVe101(ve1[1]);
		f.setVe102(ve1[2]);
		f.setVe103(ve1[3]);
		f.setVe104(ve1[4]);
		f.setVe105(ve1[5]);
		f.setVe106(ve1[6]);
		f.setVe107(ve1[7]);
		f.setVe108(ve1[8]);
		f.setVe109(ve1[9]);
		f.setVe110(ve1[10]);
		f.setVe111(ve1[11]);
		f.setVe112(ve1[12]);
		f.setVe113(ve1[13]);
		f.setVe114(ve1[14]);
		f.setVe115(ve1[15]);
		f.setVe116(ve1[16]);
		f.setVe117(ve1[17]);

		f.setWe100(we1[0]);
		f.setWe101(we1[1]);
		f.setWe102(we1[2]);
		f.setWe103(we1[3]);
		f.setWe104(we1[4]);
		f.setWe105(we1[5]);
		f.setWe106(we1[6]);
		f.setWe107(we1[7]);

		f.setWr100(wr1[0]);
		f.setWr101(wr1[1]);
		f.setWr102(wr1[2]);
		f.setWr103(wr1[3]);
		f.setWr104(wr1[4]);
		f.setWr105(wr1[5]);
	}
	
	public void loadFromEntryForm(EntryForm1 f) {
		if (f.getAn100())
			an1[0] = true;
		if (f.getAn101())
			an1[1] = true;
		if (f.getAn102())
			an1[2] = true;
		if (f.getAn103())
			an1[3] = true;
		if (f.getAn104())
			an1[4] = true;
		if (f.getAn105())
			an1[5] = true;
		if (f.getAn106())
			an1[6] = true;
		if (f.getAn107())
			an1[7] = true;
		if (f.getAn108())
			an1[8] = true;
		if (f.getAn109())
			an1[9] = true;
		if (f.getAn110())
			an1[10] = true;
		if (f.getAn111())
			an1[11] = true;
		if (f.getAn112())
			an1[12] = true;

		if (f.getAt100())
			at1[0] = true;
		if (f.getAt101())
			at1[1] = true;
		if (f.getAt102())
			at1[2] = true;
		if (f.getAt103())
			at1[3] = true;
		if (f.getAt104())
			at1[4] = true;
		if (f.getAt105())
			at1[5] = true;
		if (f.getAt106())
			at1[6] = true;
		if (f.getAt107())
			at1[7] = true;
		if (f.getAt108())
			at1[8] = true;
		if (f.getAt109())
			at1[9] = true;
		if (f.getAt110())
			at1[10] = true;
		if (f.getAt111())
			at1[11] = true;
		if (f.getAt112())
			at1[12] = true;
		if (f.getAt113())
			at1[13] = true;

		if (f.getBu100())
			bu1[0] = true;
		if (f.getBu101())
			bu1[1] = true;
		if (f.getBu102())
			bu1[2] = true;
		if (f.getBu103())
			bu1[3] = true;
		if (f.getBu104())
			bu1[4] = true;

		if (f.getCh100())
			ch1[0] = true;
		if (f.getCh101())
			ch1[1] = true;
		if (f.getCh102())
			ch1[2] = true;
		if (f.getCh103())
			ch1[3] = true;
		if (f.getCh104())
			ch1[4] = true;

		if (f.getCl100())
			cl1[0] = true;
		if (f.getCl101())
			cl1[1] = true;
		if (f.getCl102())
			cl1[2] = true;
		if (f.getCl103())
			cl1[3] = true;
		if (f.getCl104())
			cl1[4] = true;

		if (f.getCo100())
			co1[0] = true;
		if (f.getCo101())
			co1[1] = true;
		if (f.getCo102())
			co1[2] = true;
		if (f.getCo103())
			co1[3] = true;
		if (f.getCo104())
			co1[4] = true;

		if (f.getCm100())
			cm1[0] = true;
		if (f.getCm101())
			cm1[1] = true;
		if (f.getCm102())
			cm1[2] = true;
		if (f.getCm103())
			cm1[3] = true;
		if (f.getCm104())
			cm1[4] = true;

		if (f.getCr100())
			cr1[0] = true;
		if (f.getCr101())
			cr1[1] = true;
		if (f.getCr102())
			cr1[2] = true;
		if (f.getCr103())
			cr1[3] = true;
		if (f.getCr104())
			cr1[4] = true;

		if (f.getFa100())
			fa1[0] = true;
		if (f.getFa101())
			fa1[1] = true;
		if (f.getFa102())
			fa1[2] = true;
		if (f.getFa103())
			fa1[3] = true;
		if (f.getFa104())
			fa1[4] = true;

		if (f.getFo100())
			fo1[0] = true;
		if (f.getFo101())
			fo1[1] = true;
		if (f.getFo102())
			fo1[2] = true;
		if (f.getFo103())
			fo1[3] = true;
		
		if (f.getGa100())
			ga1[0] = true;
		if (f.getGa101())
			ga1[1] = true;
		if (f.getGa102())
			ga1[2] = true;
		if (f.getGa103())
			ga1[3] = true;
		if (f.getGa104())
			ga1[4] = true;
		if (f.getGa105())
			ga1[5] = true;

		if (f.getHi100())
			hi1[0] = true;
		if (f.getHi101())
			hi1[1] = true;
		if (f.getHi102())
			hi1[2] = true;
		if (f.getHi103())
			hi1[3] = true;
		if (f.getHi104())
			hi1[4] = true;
		if (f.getHi105())
			hi1[5] = true;
		if (f.getHi106())
			hi1[6] = true;
		if (f.getHi107())
			hi1[7] = true;
		if (f.getHi108())
			hi1[8] = true;
		if (f.getHi109())
			hi1[9] = true;
		if (f.getHi110())
			hi1[10] = true;
		if (f.getHi111())
			hi1[11] = true;
		if (f.getHi112())
			hi1[12] = true;
		if (f.getHi113())
			hi1[13] = true;
		if (f.getHi114())
			hi1[14] = true;
		if (f.getHi115())
			hi1[15] = true;
		if (f.getHi116())
			hi1[16] = true;
		if (f.getHi117())
			hi1[17] = true;
		if (f.getHi118())
			hi1[18] = true;
		if (f.getHi119())
			hi1[19] = true;
		if (f.getHi120())
			hi1[20] = true;
		if (f.getHi121())
			hi1[21] = true;
		if (f.getHi122())
			hi1[22] = true;
		if (f.getHi123())
			hi1[23] = true;
		if (f.getHi124())
			hi1[24] = true;
		if (f.getHi125())
			hi1[25] = true;
		if (f.getHi126())
			hi1[26] = true;
		if (f.getHi127())
			hi1[27] = true;
		if (f.getHi128())
			hi1[28] = true;

		if (f.getHu100())
			hu1[0] = true;
		if (f.getHu101())
			hu1[1] = true;
		if (f.getHu102())
			hu1[2] = true;
		if (f.getHu103())
			hu1[3] = true;
		if (f.getHu104())
			hu1[4] = true;

		if (f.getFl100())
			fl1[0] = true;
		if (f.getFl101())
			fl1[1] = true;
		if (f.getFl102())
			fl1[2] = true;
		if (f.getFl103())
			fl1[3] = true;
		if (f.getFl104())
			fl1[4] = true;
		if (f.getFl105())
			fl1[5] = true;
		if (f.getFl106())
			fl1[6] = true;
		if (f.getFl107())
			fl1[7] = true;
		if (f.getFl108())
			fl1[8] = true;
		if (f.getFl109())
			fl1[9] = true;
		if (f.getFl110())
			fl1[10] = true;
		if (f.getFl111())
			fl1[11] = true;
		if (f.getFl112())
			fl1[12] = true;
		if (f.getFl113())
			fl1[13] = true;
		if (f.getFl114())
			fl1[14] = true;
		if (f.getFl115())
			fl1[15] = true;

		if (f.getLa100())
			la1[0] = true;
		if (f.getLa101())
			la1[1] = true;
		if (f.getLa102())
			la1[2] = true;
		if (f.getLa103())
			la1[3] = true;
		if (f.getLa104())
			la1[4] = true;

		if (f.getSs100())
			ss1[0] = true;
		if (f.getSs101())
			ss1[1] = true;
		if (f.getSs102())
			ss1[2] = true;
		if (f.getSs103())
			ss1[3] = true;
		if (f.getSs104())
			ss1[4] = true;
		if (f.getSs105())
			ss1[5] = true;
		if (f.getSs106())
			ss1[6] = true;
		if (f.getSs107())
			ss1[7] = true;
		if (f.getSs108())
			ss1[8] = true;
		if (f.getSs109())
			ss1[9] = true;
		if (f.getSs110())
			ss1[10] = true;

		if (f.getMe100())
			me1[0] = true;
		if (f.getMe101())
			me1[1] = true;
		if (f.getMe102())
			me1[2] = true;
		if (f.getMe103())
			me1[3] = true;
		if (f.getMe104())
			me1[4] = true;
		if (f.getMe105())
			me1[5] = true;
		if (f.getMe106())
			me1[6] = true;
		if (f.getMe107())
			me1[7] = true;
		if (f.getMe108())
			me1[8] = true;
		if (f.getMe109())
			me1[9] = true;
		if (f.getMe110())
			me1[10] = true;
		if (f.getMe111())
			me1[11] = true;
		if (f.getMe112())
			me1[12] = true;
		if (f.getMe113())
			me1[13] = true;
		if (f.getMe114())
			me1[14] = true;
		if (f.getMe115())
			me1[15] = true;
		if (f.getMe116())
			me1[16] = true;
		if (f.getMe117())
			me1[17] = true;
		if (f.getMe118())
			me1[18] = true;
		if (f.getMe119())
			me1[19] = true;
		if (f.getMe120())
			me1[20] = true;
		if (f.getMe121())
			me1[21] = true;
		if (f.getMe122())
			me1[22] = true;
		if (f.getMe123())
			me1[23] = true;
		if (f.getMe124())
			me1[24] = true;
		if (f.getMe125())
			me1[25] = true;
		if (f.getMe126())
			me1[26] = true;
		if (f.getMe127())
			me1[27] = true;
		if (f.getMe128())
			me1[28] = true;
		if (f.getMe129())
			me1[29] = true;
		if (f.getMe130())
			me1[30] = true;
		if (f.getMe131())
			me1[31] = true;
		if (f.getMe132())
			me1[32] = true;
		if (f.getMe133())
			me1[33] = true;
		if (f.getMe134())
			me1[34] = true;
		if (f.getMe135())
			me1[35] = true;
		if (f.getMe136())
			me1[36] = true;
		if (f.getMe137())
			me1[37] = true;
		if (f.getMe138())
			me1[38] = true;
		if (f.getMe139())
			me1[39] = true;
		if (f.getMe140())
			me1[40] = true;

		if (f.getMd100())
			md1[0] = true;
		if (f.getMd101())
			md1[1] = true;
		if (f.getMd102())
			md1[2] = true;
		if (f.getMd103())
			md1[3] = true;
		if (f.getMd104())
			md1[4] = true;

		if (f.getMu100())
			mu1[0] = true;
		if (f.getMu101())
			mu1[1] = true;
		if (f.getMu102())
			mu1[2] = true;
		if (f.getMu103())
			mu1[3] = true;
		if (f.getMu104())
			mu1[4] = true;
		if (f.getMu105())
			mu1[5] = true;
		if (f.getMu106())
			mu1[6] = true;
		if (f.getMu107())
			mu1[7] = true;
		if (f.getMu108())
			mu1[8] = true;
		if (f.getMu109())
			mu1[9] = true;
		if (f.getMu110())
			mu1[10] = true;
		if (f.getMu111()) 
			mu1[11] = true;
		if (f.getMu112())
			mu1[12] = true;

		if (f.getNa100())
			na1[0] = true;
		if (f.getNa101())
			na1[1] = true;
		if (f.getNa102())
			na1[2] = true;
		if (f.getNa103())
			na1[3] = true;
		if (f.getNa104())
			na1[4] = true;
		if (f.getNa105())
			na1[5] = true;
		if (f.getNa106())
			na1[6] = true;

		if (f.getPa100())
			pa1[0] = true;
		if (f.getPa101())
			pa1[1] = true;
		if (f.getPa102())
			pa1[2] = true;
		if (f.getPa103())
			pa1[3] = true;
		if (f.getPa104())
			pa1[4] = true;
		if (f.getPa105())
			pa1[5] = true;

		if (f.getPo100())
			po1[0] = true;
		if (f.getPo101())
			po1[1] = true;
		if (f.getPo102())
			po1[2] = true;
		if (f.getPo103())
			po1[3] = true;
		if (f.getPo104())
			po1[4] = true;

		if (f.getPs100())
			ps1[0] = true;
		if (f.getPs101())
			ps1[1] = true;
		if (f.getPs102())
			ps1[2] = true;
		if (f.getPs103())
			ps1[3] = true;
		if (f.getPs104())
			ps1[4] = true;
		if (f.getPs105())
			ps1[5] = true;

		if (f.getRe100())
			re1[0] = true;
		if (f.getRe101())
			re1[1] = true;
		if (f.getRe102())
			re1[2] = true;
		if (f.getRe103())
			re1[3] = true;
		if (f.getRe104())
			re1[4] = true;
		if (f.getRe105())
			re1[5] = true;
		if (f.getRe106())
			re1[6] = true;
		if (f.getRe107())
			re1[7] = true;
		if (f.getRe108())
			re1[8] = true;

		if (f.getRl100())
			rl1[0] = true;
		if (f.getRl101())
			rl1[1] = true;
		if (f.getRl102())
			rl1[2] = true;
		if (f.getRl103())
			rl1[3] = true;
		if (f.getRl104())
			rl1[4] = true;
		if (f.getRl105())
			rl1[5] = true;

		if (f.getSc100())
			sc1[0] = true;
		if (f.getSc101())
			sc1[1] = true;
		if (f.getSc102())
			sc1[2] = true;
		if (f.getSc103())
			sc1[3] = true;
		if (f.getSc104())
			sc1[4] = true;
		if (f.getSc105())
			sc1[5] = true;
		if (f.getSc106())
			sc1[6] = true;
		if (f.getSc107())
			sc1[7] = true;
		if (f.getSc108())
			sc1[8] = true;
		if (f.getSc109())
			sc1[9] = true;
		if (f.getSc110())
			sc1[10] = true;
		if (f.getSc111())
			sc1[11] = true;
		if (f.getSc112())
			sc1[12] = true;
		if (f.getSc113())
			sc1[13] = true;
		if (f.getSc114())
			sc1[14] = true;
		if (f.getSc115())
			sc1[15] = true;
		if (f.getSc116())
			sc1[16] = true;
		if (f.getSc117())
			sc1[17] = true;
		if (f.getSc118())
			sc1[18] = true;
		if (f.getSc119())
			sc1[19] = true;
		if (f.getSc120())
			sc1[20] = true;
		if (f.getSc121())
			sc1[21] = true;
		if (f.getSc122())
			sc1[22] = true;
		if (f.getSc123())
			sc1[23] = true;
		if (f.getSc124())
			sc1[24] = true;
		if (f.getSc125())
			sc1[25] = true;

		if (f.getSa100())
			sa1[0] = true;
		if (f.getSa101())
			sa1[1] = true;
		if (f.getSa102())
			sa1[2] = true;
		if (f.getSa103())
			sa1[3] = true;
		if (f.getSa104())
			sa1[4] = true;
		if (f.getSa105())
			sa1[5] = true;
		if (f.getSa106())
			sa1[6] = true;
		if (f.getSa107())
			sa1[7] = true;
		if (f.getSa108())
			sa1[8] = true;

		if (f.getTo100())
			to1[0] = true;
		if (f.getTo101())
			to1[1] = true;
		if (f.getTo102())
			to1[2] = true;
		if (f.getTo103())
			to1[3] = true;
		if (f.getTo104())
			to1[4] = true;
		if (f.getTo105())
			to1[5] = true;
		if (f.getTo106())
			to1[6] = true;
		if (f.getTo107())
			to1[7] = true;
		if (f.getTo108())
			to1[8] = true;
		if (f.getTo109())
			to1[9] = true;
		if (f.getTo110())
			to1[10] = true;
		if (f.getTo111())
			to1[11] = true;
		if (f.getTo112())
			to1[12] = true;
		if (f.getTo113())
			to1[13] = true;
		if (f.getTo114())
			to1[14] = true;
		if (f.getTo115())
			to1[15] = true;
		if (f.getTo116())
			to1[16] = true;
		if (f.getTo117())
			to1[17] = true;
		
		if (f.getTe100())
			te1[0] = true;
		if (f.getTe101())
			te1[1] = true;
		if (f.getTe102())
			te1[2] = true;
		if (f.getTe103())
			te1[3] = true;
		if (f.getTe104())
			te1[4] = true;

		if (f.getTr100())
			tr1[0] = true;
		if (f.getTr101())
			tr1[1] = true;
		if (f.getTr102())
			tr1[2] = true;
		if (f.getTr103())
			tr1[3] = true;
		if (f.getTr104())
			tr1[4] = true;
		if (f.getTr105())
			tr1[5] = true;
		if (f.getTr106())
			tr1[6] = true;

		if (f.getVe100())
			ve1[0] = true;
		if (f.getVe101())
			ve1[1] = true;
		if (f.getVe102())
			ve1[2] = true;
		if (f.getVe103())
			ve1[3] = true;
		if (f.getVe104())
			ve1[4] = true;
		if (f.getVe105())
			ve1[5] = true;
		if (f.getVe106())
			ve1[6] = true;
		if (f.getVe107())
			ve1[7] = true;
		if (f.getVe108())
			ve1[8] = true;
		if (f.getVe109())
			ve1[9] = true;
		if (f.getVe110())
			ve1[10] = true;
		if (f.getVe111())
			ve1[11] = true;
		if (f.getVe112())
			ve1[12] = true;
		if (f.getVe113())
			ve1[13] = true;
		if (f.getVe114())
			ve1[14] = true;
		if (f.getVe115())
			ve1[15] = true;
		if (f.getVe116())
			ve1[16] = true;
		if (f.getVe117())
			ve1[17] = true;
		
		if (f.getWe100())
			we1[0] = true;
		if (f.getWe101())
			we1[1] = true;
		if (f.getWe102())
			we1[2] = true;
		if (f.getWe103())
			we1[3] = true;
		if (f.getWe104())
			we1[4] = true;
		if (f.getWe105())
			we1[5] = true;
		if (f.getWe106())
			we1[6] = true;
		if (f.getWe107())
			we1[7] = true;

		if (f.getWr100())
			wr1[0] = true;
		if (f.getWr101())
			wr1[1] = true;
		if (f.getWr102())
			wr1[2] = true;
		if (f.getWr103())
			wr1[3] = true;
		if (f.getWr104())
			wr1[4] = true;
		if (f.getWr105())
			wr1[5] = true;

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

		if (isChecked(an1, ANIMALS)) {
			sb.append("<category name=\"Animals\">");
			for (int i = 0; i < ANIMALS; i++)
				if (an1[i]) {
					sb.append("<item><text>").append(Translator.xlate("an1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fa1, ART)) {
			sb.append("<category name=\"Art\">");
			for (int i = 0; i < ART; i++)
				if (fa1[i]) {
					sb.append("<item><text>").append(Translator.xlate("fa1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(at1, ATHLETICS)) {
			sb.append("<category name=\"Athletics / Sports\">");
			for (int i = 0; i < ATHLETICS; i++)
				if (at1[i]) {
					sb.append("<item><text>").append(Translator.xlate("at1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(co1, BUILDING)) {
			sb.append("<category name=\"Building\">");
			for (int i = 0; i < BUILDING; i++)
				if (co1[i]) {
					sb.append("<item><text>").append(Translator.xlate("co1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(bu1, BUSINESS)) {
			sb.append("<category name=\"Business\">");
			for (int i = 0; i < BUSINESS; i++)
				if (bu1[i]) {
					sb.append("<item><text>").append(Translator.xlate("bu1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ch1, CHILDCARE)) {
			sb.append("<category name=\"Childcare\">");
			for (int i = 0; i < CHILDCARE; i++)
				if (ch1[i]) {
					sb.append("<item><text>").append(Translator.xlate("ch1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cl1, CLOTHING)) {
			sb.append("<category name=\"Clothing\">");
			for (int i = 0; i < CLOTHING; i++)
				if (cl1[i]) {
					sb.append("<item><text>").append(Translator.xlate("cl1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cm1, COMPETITIVENESS)) {
			sb.append("<category name=\"Competing\">");
			for (int i = 0; i < COMPETITIVENESS; i++)
				if (cm1[i]) {
					sb.append("<item><text>").append(Translator.xlate("cm1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(cr1, CRAFTS)) {
			sb.append("<category name=\"Crafts\">");
			for (int i = 0; i < CRAFTS; i++)
				if (cr1[i]) {
					sb.append("<item><text>").append(Translator.xlate("cr1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fo1, FOOD)) {
			sb.append("<category name=\"Food\">");
			for (int i = 0; i < FOOD; i++)
				if (fo1[i]) {
					sb.append("<item><text>").append(Translator.xlate("fo1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(fl1, FOREIGNLANGUAGE)) {
			sb.append("<category name=\"Foreign Language\">");
			for (int i = 0; i < FOREIGNLANGUAGE; i++)
				if (fl1[i]) {
					sb.append("<item><text>").append(Translator.xlate("fl1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ga1, GAMES)) {
			sb.append("<category name=\"Games\">");
			for (int i = 0; i < GAMES; i++)
				if (ga1[i]) {
					sb.append("<item><text>").append(Translator.xlate("ga1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(hi1, HISTORY)) {
			sb.append("<category name=\"History\">");
			for (int i = 0; i < HISTORY; i++)
				if (hi1[i]) {
					sb.append("<item><text>").append(Translator.xlate("hi1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(hu1, HUMOR)) {
			sb.append("<category name=\"Humor\">");
			for (int i = 0; i < HUMOR; i++)
				if (hu1[i]) {
					sb.append("<item><text>").append(Translator.xlate("hu1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(la1, LAW)) {
			sb.append("<category name=\"Law\">");
			for (int i = 0; i < LAW; i++)
				if (la1[i]) {
					sb.append("<item><text>").append(Translator.xlate("la1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(me1, MEDIA)) {
			sb.append("<category name=\"Media\">");
			for (int i = 0; i < MEDIA; i++)
				if (me1[i]) {
					sb.append("<item><text>").append(Translator.xlate("me1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(md1, MEDICINE)) {
			sb.append("<category name=\"Medicine\">");
			for (int i = 0; i < MEDICINE; i++)
				if (md1[i]) {
					sb.append("<item><text>").append(Translator.xlate("md1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(mu1, MUSIC)) {
			sb.append("<category name=\"Music\">");
			for (int i = 0; i < MUSIC; i++)
				if (mu1[i]) {
					sb.append("<item><text>").append(Translator.xlate("mu1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(na1, NATURE)) {
			sb.append("<category name=\"Nature\">");
			for (int i = 0; i < NATURE; i++)
				if (na1[i]) {
					sb.append("<item><text>").append(Translator.xlate("na1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(pa1, PERFORMINGARTS)) {
			sb.append("<category name=\"Performing Arts\">");
			for (int i = 0; i < PERFORMINGARTS; i++)
				if (pa1[i]) {
					sb.append("<item><text>").append(Translator.xlate("pa1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(po1, POLITICS)) {
			sb.append("<category name=\"Politics\">");
			for (int i = 0; i < POLITICS; i++)
				if (po1[i]) {
					sb.append("<item><text>").append(Translator.xlate("po1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ps1, PROBLEMSOLVING)) {
			sb.append("<category name=\"Problem Solving\">");
			for (int i = 0; i < PROBLEMSOLVING; i++)
				if (ps1[i]) {
					sb.append("<item><text>").append(Translator.xlate("ps1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(re1, READING)) {
			sb.append("<category name=\"Reading\">");
			for (int i = 0; i < READING; i++)
				if (re1[i]) {
					sb.append("<item><text>").append(Translator.xlate("re1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(rl1, RELATIONSHIPS)) {
			sb.append("<category name=\"Relationships (Things most important to me)\">");
			for (int i = 0; i < RELATIONSHIPS; i++)
				if (rl1[i]) {
					sb.append("<item><text>").append(Translator.xlate("rl1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ss1, SCHOOLSUBJECTS)) {
			sb.append("<category name=\"School Subjects\">");
			for (int i = 0; i < SCHOOLSUBJECTS; i++)
				if (ss1[i]) {
					sb.append("<item><text>").append(Translator.xlate("ss1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(sc1, SCIENCE)) {
			sb.append("<category name=\"Science\">");
			for (int i = 0; i < SCIENCE; i++)
				if (sc1[i]) {
					sb.append("<item><text>").append(Translator.xlate("sc1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(sa1, SOCIALAWARENESS)) {
			sb.append("<category name=\"Social Awareness\">");
			for (int i = 0; i < SOCIALAWARENESS; i++)
				if (sa1[i]) {
					sb.append("<item><text>").append(Translator.xlate("sa1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(te1, TECHNOLOGY)) {
			sb.append("<category name=\"Technology\">");
			for (int i = 0; i < TECHNOLOGY; i++)
				if (te1[i]) {
					sb.append("<item><text>").append(Translator.xlate("te1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(to1, TOYS)) {
			sb.append("<category name=\"Toys (Favorites)\">");
			for (int i = 0; i < TOYS; i++)
				if (to1[i]) {
					sb.append("<item><text>").append(Translator.xlate("to1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(tr1, TRAVEL)) {
			sb.append("<category name=\"Travel / Culture\">");
			for (int i = 0; i < TRAVEL; i++)
				if (tr1[i]) {
					sb.append("<item><text>").append(Translator.xlate("tr1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(ve1, VEHICLES)) {
			sb.append("<category name=\"Vehicles\">");
			for (int i = 0; i < VEHICLES; i++)
				if (ve1[i]) {
					sb.append("<item><text>").append(Translator.xlate("ve1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(we1, WEATHER)) {
			sb.append("<category name=\"Weather\">");
			for (int i = 0; i < WEATHER; i++)
				if (we1[i]) {
					sb.append("<item><text>").append(Translator.xlate("we1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		if (isChecked(wr1, WRITING)) {
			sb.append("<category name=\"Writing\">");
			for (int i = 0; i < WRITING; i++)
				if (wr1[i]) {
					sb.append("<item><text>").append(Translator.xlate("wr1", i));
					sb.append("</text></item>");
				}
			sb.append("</category>");
		}

		sb.append("</checkboxes>");

		return sb.toString();
	}

}
