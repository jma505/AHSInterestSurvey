package org.jmanderson.ahs;

import org.jmanderson.ahs.common.CheckBoxes;
import org.jmanderson.ahs.dataobjects.CategoryCounts1;
import org.jmanderson.ahs.dataobjects.CategoryCounts2;
import org.jmanderson.ahs.dataobjects.CheckBoxes1;
import org.jmanderson.ahs.dataobjects.CheckBoxes2;

/**
 * @author John Anderson
 *
 * This class is a helper for searching.  It is used by StudentsDA to
 * locate students matching a particular search criteria.
 * 
 */
public class SearchHelper {

	static boolean checkSearch(CheckBoxes cb, String searchfor) {

		if (cb instanceof CheckBoxes1) {
			CheckBoxes1 cb1 = (CheckBoxes1) cb;
			if (searchfor.equals("Cat")) {
				return ((cb1.getAn1())[4]);
			}
			if (searchfor.equals("Dog")) {
				return ((cb1.getAn1())[5]);
			}
			if (searchfor.equals("Stars_or_Planets")) {
				return ((cb1.getSc1())[8]);
			}
			if (searchfor.equals("Volcanoes")) {
				return ((cb1.getSc1())[20]);
			}
			if (searchfor.equals("Math")) {
				return ((cb1.getSs1())[0]);
			}
			if (searchfor.equals("Reading")) {
				return ((cb1.getSs1())[2]);
			}
			if (searchfor.equals("Science")) {
				return ((cb1.getSs1())[4]);
			}
			if (searchfor.equals("Social_Studies")) {
				return ((cb1.getSs1())[6]);
			}
			if (searchfor.equals("Gym")) {
				return ((cb1.getSs1())[8]);
			}
			if (searchfor.equals("Art")) {
				return ((cb1.getSs1())[9]);
			}
			if (searchfor.equals("Music")) {
				return ((cb1.getSs1())[10]);
			}
			if (searchfor.equals("Nature")) {
				for (int i = 0; i < CategoryCounts1.NATURE; i++)
					if ((cb1.getNa1())[i])
						return true;
				return false;
			}
		} else if (cb instanceof CheckBoxes2) {
			CheckBoxes2 cb2 = (CheckBoxes2) cb;
			if (searchfor.equals("Stars_or_Planets")) {
				return ((cb2.getSc2())[0]);
			}
			if (searchfor.equals("Volcanoes")) {
				return ((cb2.getSc2())[3]);
			}
			if (searchfor.equals("Math")) {
				return ((cb2.getSs2())[0]);
			}
			if (searchfor.equals("Reading")) {
				return ((cb2.getSs2())[1]);
			}
			if (searchfor.equals("Writing")) {
				return ((cb2.getSs2())[2]);
			}
			if (searchfor.equals("Science")) {
				return ((cb2.getSs2())[3]);
			}
			if (searchfor.equals("Social_Studies")) {
				return ((cb2.getSs2())[4]);
			}
			if (searchfor.equals("Gym")) {
				return ((cb2.getSs2())[5]);
			}
			if (searchfor.equals("Art")) {
				return ((cb2.getSs2())[6]);
			}
			if (searchfor.equals("Music")) {
				return ((cb2.getSs2())[7]);
			}
			if (searchfor.equals("Nature")) {
				for (int i = 0; i < CategoryCounts2.NATURE; i++)
					if ((cb2.getNa2())[i])
						return true;
				return false;
			}
		}
		return false;
	}

}
