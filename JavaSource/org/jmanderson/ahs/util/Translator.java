package org.jmanderson.ahs.util;

/**
 * @author John Anderson
 * 
 * Translates array name and item number to English text for display
 * 
 */
public final class Translator
{
	public static String xlate(String array, int item)
	{
		if (array.equals("an1"))
		{
			switch (item) {
				case 0:	return "Likes most animals";
				case 1:	return "Has, or would like to have, a pet";
				case 2:	return "Takes care of a pet";
				case 3:	return "Only likes a few animals";
				case 4:	return "Favorite animal is Cat";
				case 5: return "Favorite animal is Dog";
				case 6: return "Favorite animal is Rabbit";
				case 7: return "Favorite animal is Bird";
				case 8: return "Favorite animal is Fish";
				case 9: return "Favorite animal is Insect";
				case 10: return "Favorite animal is Reptile/Amphibian";
				case 11: return "Favorite animal is Horse";
				case 12: return "Favorite animal is Other";
			}
		}
		if (array.equals("at1"))
		{
			switch (item) {
				case 0: return "Likes to watch sports";
				case 1: return "Plays, or would like to play, a sport";
				case 2: return "Football";
				case 3: return "Baseball";
				case 4: return "Basketball";
				case 5: return "Soccer";
				case 6: return "Hockey";
				case 7: return "Other";
				case 8: return "Likes running, jumping, etc.";
				case 9: return "Likes rollerblading, ice skating, etc.";
				case 10: return "Golf";
				case 11: return "Bowling";
				case 12: return "Volleyball";
				case 13: return "Tennis";
			}
		}
		if (array.equals("bu1"))
		{
			switch (item) {
				case 0: return "Has had own business like lemonade stand or tag sale";
				case 1: return "Would like to have own business someday";
				case 2: return "Has a favorite kind of business";
				case 3: return "Is very careful with own money";
				case 4: return "Has some of own money";
			}
		}
		if (array.equals("ch1"))
		{
			switch (item) {
				case 0: return "Likes to take care of younger children";
				case 1: return "Likes babies";
				case 2: return "Likes to play with little children";
				case 3: return "Takes care of younger brother or sister";
				case 4: return "Has, or would like to have, a younger brother or sister";
			}
		}
		if (array.equals("cl1"))
		{
			switch (item) {
				case 0: return "Likes shopping for new clothes";
				case 1: return "Is very careful about what he/she wears";
				case 2: return "Notices the clothes other people wear";
				case 3: return "Would like to have a lot more clothes";
				case 4: return "Knows what clothes are popular for his/her age";
			}
		}
		if (array.equals("co1"))
		{
			switch (item) {
				case 0: return "Likes to build with Legos or blocks";
				case 1: return "Likes to make things out of cardboard or other things";
				case 2: return "Likes to build houses or building out of things";
				case 3: return "Likes to put things together or take things apart";
				case 4: return "Likes to play or work with electronic things";
			}
		}
		if (array.equals("cm1"))
		{
			switch (item) {
				case 0:	return "When in a game, has to win";
				case 1: return "Likes doing things that have a winner";
				case 2: return "Has a favorite kind of competition";
				case 3: return "Likes to things that have teams";
				case 4: return "Likes to do things for good grades or rewards";
			}
		}
		if (array.equals("cr1"))
		{
			switch (item) {
				case 0: return "Likes to make things with his/her hands";
				case 1: return "Likes to make things from a kit";
				case 2: return "Likes to make things with cloth or yarn";
				case 3: return "Likes to make things from clay";
				case 4: return "Likes to make jewelry or things like jewelry";
			}
		}
		if (array.equals("fa1"))
		{
			switch (item) {
				case 0: return "Likes to draw";
				case 1: return "Likes to paint";
				case 2: return "Likes to make sculptures";
				case 3: return "Likes to take photographs and see how they come out";
				case 4: return "Likes making prints";
			}
		}
		if (array.equals("fo1"))
		{
			switch (item) {
				case 0: return "Likes to make things to eat";
				case 1: return "Likes to eat lots of different kinds of food";
				case 2: return "Has cooked all or part of a meal";
				case 3: return "Has baked something";
			}
		}
		if (array.equals("ga1"))
		{
			switch (item) {
				case 0: return "Likes to play games";
				case 1: return "Likes to play board games like Candyland, Monopoly, or Clue";
				case 2: return "Likes to play pretend";
				case 3: return "Likes to play outside";
				case 4: return "Likes to play computer games";
				case 5: return "Likes to play card games";
			}
		}
		if (array.equals("hi1"))
		{
			switch (item) {
				case 0: return "Likes things from the old days";
				case 1: return "Would like to meet George Washington";
				case 2: return "Would like to meet Abraham Lincoln";
				case 3: return "Would like to meet Martin Luther King, Jr";
				case 4: return "Would like to meet Gandhi";
				case 5: return "Would like to meet Robert E. Lee";
				case 6: return "Would like to meet Albert Einstein";
				case 7: return "Would like to meet Marie Curie";
				case 8: return "Would like to meet Eleanor Roosevelt";
				case 9: return "Would like to meet Harriet Tubman";
				case 10: return "Would like to meet Joan of Arc";
				case 11: return "Would like to meet Helen Keller";
				case 12: return "Would like to meet Florence Nightingale";
				case 13: return "Would like to meet Pocahontas";
				case 14: return "Would like to meet Someone else not named on the survey";
				case 15: return "Would like to go back in time to Old castles";
				case 16: return "Would like to go back in time to Dinosaurs";
				case 17: return "Would like to go back in time to The American Colonies";
				case 18: return "Would like to go back in time to Ancient Greece, Rome, or other place in Europe";
				case 19: return "Would like to go back in time to The American Civil War";
				case 20: return "Would like to meet the inventor of The light bulb";
				case 21: return "Would like to meet the inventor of The wheel";
				case 22: return "Would like to meet the inventor of The telescope";
				case 23: return "Would like to meet the inventor of A musical instrument";
				case 24: return "Would like to meet the inventor of The car";
				case 25: return "Would like to meet the inventor of The airplane";
			}
		}
		if (array.equals("hu1"))
		{
			switch (item) {
				case 0: return "Likes reading jokes or funny stories";
				case 1: return "Likes to hear jokes or funny stories";
				case 2: return "Likes to make up jokes or funny stories";
				case 3: return "Has told jokes or funny stories to an audience";
				case 4: return "Has told jokes or funny stories to my friends or family";
			}
		}
		if (array.equals("fl1"))
		{
			switch (item) {
				case 0: return "Speaks Chinese";
				case 1: return "Speaks Japanese";
				case 2: return "Speaks French";
				case 3: return "Speaks Spanish";
				case 4: return "Speaks German";
				case 5: return "Speaks Russian";
				case 6: return "Speaks Vietnamese";
				case 7: return "Speaks Korean";
				case 8: return "Speaks a language not listed on survey";
				case 9: return "Would like to learn another language";
				case 10: return "Speaks Italian";
				case 11: return "Speaks Hebrew";
			}
		}
		if (array.equals("la1"))
		{
			switch (item) {
				case 0: return "Would like to be a police person";
				case 1: return "Would like to be a lawyer";
				case 2: return "Would like to be a judge";
				case 3: return "Tries to always obey the rules";
				case 4: return "Tries to get others to obey the rules";
			}
		}
		if (array.equals("ss1"))
		{
			switch (item) {
				case 0: return "Likes Math";
				case 1: return "Likes doing things with numbers";
				case 2: return "Likes Reading";
				case 3: return "Likes Writing";
				case 4: return "Likes Science";
				case 5: return "Likes experimenting with things to see what happens";
				case 6: return "Likes Social Studies (learning about the past, other countries, and other people)";
				case 7: return "Likes finding places on maps or globes";
				case 8: return "Likes Gym";
				case 9: return "Likes Art Class";
				case 10: return "Likes Music Class";
			}
		}
		if (array.equals("me1"))
		{
			switch (item) {
				case 0: return "Likes watching TV";
				case 1: return "Likes TV: Music";
				case 2: return "Likes TV: Sports";
				case 3: return "Likes TV: News";
				case 4: return "Likes TV: Cartoons";
				case 5: return "Likes TV: Drama";
				case 6: return "Likes TV: Comedy";
				case 7: return "Likes TV: Mystery";
				case 8: return "Likes TV: History";
				case 9: return "Likes TV: Soap Operas";
				case 10: return "Likes TV: How-To";
				case 11: return "Likes TV: Action";
				case 12: return "Likes TV: Sci-Fi";
				case 13: return "Likes TV: Western";
				case 14: return "Likes TV: Factual";
				case 15: return "Likes TV: Game Shows";
				case 16: return "Likes listening to the radio";
				case 17: return "Likes Radio: Pop";
				case 18: return "Likes Radio: Rock";
				case 19: return "Likes Radio: News";
				case 20: return "Likes Radio: Classical";
				case 21: return "Likes Radio: Jazz";
				case 22: return "Likes Radio: Rap";
				case 23: return "Likes Radio: Hip Hop";
				case 24: return "Likes Radio: Talk Show";
				case 25: return "Likes watching movies";
				case 26: return "Likes Movies: Comedy";
				case 27: return "Likes Movies: Drama";
				case 28: return "Likes Movies: Action";
				case 29: return "Likes Movies: Family";
				case 30: return "Likes Movies: Horror";
				case 31: return "Likes Movies: Sci-Fi";
				case 32: return "Likes Movies: Classic";
				case 33: return "Likes Movies: Childrens";
				case 34: return "Likes Movies: Musicals";
				case 35: return "Likes listening to stories on tape";
				case 36: return "Likes listening to stories on CD";
				case 37: return "Likes Radio: Country";
				case 38: return "Likes Radio: Gospel";
				case 39: return "Likes listening to music on tape";
				case 40: return "Likes listening to music on CD";
			}
		}
		if (array.equals("md1"))
		{
			switch (item) {
				case 0: return "Might like to be a doctor";
				case 1: return "Might like to be a nurse";
				case 2: return "Medical things interest him/her";
				case 3: return "Might like to be an animal doctor";
				case 4: return "Might like to help sick or hurt people get better";
			}
		}
		if (array.equals("mu1"))
		{
			switch (item) {
				case 0: return "Likes Jazz";
				case 1: return "Likes Classical";
				case 2: return "Likes Pop";
				case 3: return "Likes Hop Hop";
				case 4: return "Likes Rap";
				case 5: return "Likes Rock";
				case 6: return "Likes New Age";
				case 7: return "Likes another kind of music not listed";
				case 8: return "Likes to sing";
				case 9: return "Plays an instrument";
				case 10: return "Would like to play an instrument";
				case 11: return "Likes Country";
				case 12: return "Likes Gospel";
			}
		}
		if (array.equals("na1"))
		{
			switch (item) {
				case 0: return "Likes nature";
				case 1: return "Likes to camping with a tent";
				case 2: return "Likes to take walks in the woods";
				case 3: return "Likes to take care of the environment";
				case 4: return "Has helped take care of the environment";
			}
		}
		if (array.equals("pa1"))
		{
			switch (item) {
				case 0: return "Likes to, or would like to learn how to, dance";
				case 1: return "Takes dance lessons";
				case 2: return "Has performed dances in front of an audience";
				case 3: return "Would like to in a play on a stage";
				case 4: return "Has been in a play on a stage";
				case 5: return "Likes to watch shows that are on a stage";
			}
		}
		if (array.equals("po1"))
		{
			switch (item) {
				case 0: return "Thinks it is important to vote in elections";
				case 1: return "Might like to be a mayor, governor, or president";
				case 2: return "This a mayor, governor, or president has an interesting job";
				case 3: return "Would like to be in charge of a town, state, or country";
				case 4: return "Interested in elections";
			}
		}
		if (array.equals("ps1"))
		{
			switch (item) {
				case 0: return "Likes to solve problems";
				case 1: return "Likes to find out why things happen";
				case 2: return "Likes to find out how things work";
				case 3: return "Likes to think about things until he/she figures them out";
				case 4: return "Likes to work with others to figure things out";
				case 5: return "Likes to figure out puzzles";
			}
		}
		if (array.equals("re1"))
		{
			switch (item) {
				case 0: return "Likes to read biographies";
				case 1: return "Likes to read non-fiction";
				case 2: return "Likes to read fiction";
				case 3: return "Likes to read to find out information";
				case 4: return "Likes to read magazines";
				case 5: return "Likes to read short stories";
				case 6: return "Likes to read books";
			}
		}
		if (array.equals("rl1"))
		{
			switch (item) {
				case 0: return "Friends";
				case 1: return "Family";
				case 2: return "Teachers";
				case 3: return "Other people not listed";
				case 4: return "My toys";
				case 5: return "Other things";
			}
		}
		if (array.equals("sc1"))
		{
			switch (item) {
				case 0: return "Interested in Insects";
				case 1: return "Interested in Furry animals";
				case 2: return "Interested in Reptiles";
				case 3: return "Interested in Sea creatures";
				case 4: return "Interested in Birds";
				case 5: return "Interested in Humans";
				case 6: return "Interested in The earth";
				case 7: return "Interested in The sky";
				case 8: return "Interested in The stars or planets";
				case 9: return "Interested in Gravity";
				case 10: return "Interested in Flight";
				case 11: return "Interested in Chemicals";
				case 12: return "Interested in Mixtures of things that make other things";
				case 13: return "Interested in What things are made out of";
				case 14: return "Interested in Light";
				case 15: return "Interested in Motion";
				case 16: return "Interested in Mechanics";
				case 17: return "Interested in Goopy Things (like Gak or Silly Putty)";
				case 18: return "Interested in Rockets";
				case 19: return "Interested in Rocks";
				case 20: return "Interested in Volcanoes";
				case 21: return "Interested in Earthquakes";
				case 22: return "Interested in Sounds";
				case 23: return "Interested in Oceans";
				case 24: return "Interested in Water";
				case 25: return "Interested in Electrical things";
			}
		}
		if (array.equals("sa1"))
		{
			switch (item) {
				case 0: return "Thinks it is important to take care of other people";
				case 1: return "Would like to help others";
				case 2: return "Has helped with projects that help other people";
				case 3: return "Concerned about the homeless";
				case 4: return "Concerned about old people";
				case 5: return "Concerned about poor people";
				case 6: return "Concerned about people that get hurt by other people";
				case 7: return "Concerned about crime";
				case 8: return "Concerned about war";
			}
		}
		if (array.equals("to1"))
		{
			switch (item) {
				case 0: return "Stuffed or soft animals";
				case 1: return "Action figures";
				case 2: return "Dolls";
				case 3: return "Electronic games";
				case 4: return "Video games";
				case 5: return "Computer games";
				case 6: return "Board games";
				case 7: return "Hoola Hoop";
				case 8: return "Skip It";
				case 9: return "Jump Rope";
				case 10: return "Sports equipment";
				case 11: return "Dress-up clothes";
				case 12: return "Puppets";
				case 13: return "Bike";
				case 14: return "Scooter";
				case 15: return "Rollerblades";
				case 16: return "Sidewalk chalk";
				case 17: return "Silly Putty, Gooze";
			}
		}
		if (array.equals("te1"))
		{
			switch (item) {
				case 0: return "Has used a computer";
				case 1: return "Likes using computers";
				case 2: return "Has used the Internet";
				case 3: return "Has used computer games in school";
				case 4: return "Has used computer games at home or someone else's house";
			}
		}
		if (array.equals("tr1"))
		{
			switch (item) {
				case 0: return "Likes to travel to new places";
				case 1: return "Likes to find places on a map or globe";
				case 2: return "Likes to find out about the foods in other countries";
				case 3: return "Likes to find out about the clothing in other countries";
				case 4: return "Likes to find out about the music or art of other countries";
				case 5: return "Has been to more than two states";
				case 6: return "Has been to more than one country";
			}
		}
		if (array.equals("ve1"))
		{
			switch (item) {
				case 0: return "Likes cars";
				case 1: return "Can name many kinds of cars";
				case 2: return "Likes trucks";
				case 3: return "Can name many kinds of trucks";
				case 4: return "Has ridden in a truck";
				case 5: return "Likes trains";
				case 6: return "Can name many kinds of trains";
				case 7: return "Has ridden in a train";
				case 8: return "Likes airplanes";
				case 9: return "Can name many kinds of planes";
				case 10: return "Has flown on a plane";
				case 11: return "Likes motorcycles";
				case 12: return "Can name many kinds of motorcycles";
				case 13: return "Has ridden on a motorcycle";
				case 14: return "Likes snowmobiles";
				case 15: return "Has ridden on a snowmobile";
				case 16: return "Likes bicycles";
				case 17: return "Rides a bicycle";
			}
		}
		if (array.equals("we1"))
		{
			switch (item) {
				case 0: return "Likes it when it rains";
				case 1: return "Likes it when it snows";
				case 2: return "Only likes it when it is warm and sunny outside";
				case 3: return "Likes to watch the clouds";
				case 4: return "Wonders what makes it rain";
				case 5: return "Wonders what makes it snow";
				case 6: return "Wonders what makes it windy";
				case 7: return "Wonders what makes it sunny";
			}
		}
		if (array.equals("wr1"))
		{
			switch (item) {
				case 0: return "Likes to write stories about imaginary people, places, or things";
				case 1: return "Likes to write long stories";
				case 2: return "Likes to write short stories";
				case 3: return "Likes to write poems";
				case 4: return "Likes to write about something that really happened";
				case 5: return "Likes to write to get people to agree with me or understand my ideas";
			}
		}
		if (array.equals("an2"))
		{
			switch (item) {
				case 0: return "Likes animals";
				case 1: return "Likes insects";
				case 2: return "Likes snakes";
				case 3: return "Likes birds";
			}
		}
		if (array.equals("sc2"))
		{
			switch (item) {
				case 0: return "Likes the stars and planets";
				case 1: return "Likes things that fly like planes or helicopters";
				case 2: return "Likes rockets";
				case 3: return "Likes volcanoes";
				case 4: return "Likes electric things";
				case 5: return "Likes inventing things";
			}
		}
		if (array.equals("at2"))
		{
			switch (item) {
				case 0: return "Likes sports";
				case 1: return "Favorite sport is Football";
				case 2: return "Favorite sport is Baseball";
				case 3: return "Favorite sport is Basketball";
				case 4: return "Favorite sport is Soccer";
				case 5: return "Favorite sport is Hockey";
				case 6: return "Favorite sport is Other (not listed)";
			}
		}
		if (array.equals("ch2"))
		{
			switch (item) {
				case 0: return "Likes taking care of younger children";
			}
		}
		if (array.equals("cl2"))
		{
			switch (item) {
				case 0: return "Is careful about the kind of clothes he/she wears";
			}
		}
		if (array.equals("co2"))
		{
			switch (item) {
				case 0: return "Likes building things";
			}
		}
		if (array.equals("cm2"))
		{
			switch (item) {
				case 0: return "Likes winning a lot";
			}
		}
		if (array.equals("cr2"))
		{
			switch (item) {
				case 0: return "Likes making things";
			}
		}
		if (array.equals("fa2"))
		{
			switch (item) {
				case 0: return "Likes drawing";
				case 1: return "Likes painting";
			}
		}
		if (array.equals("fo2"))
		{
			switch (item) {
				case 0: return "Likes lots of different kinds of foods";
			}
		}
		if (array.equals("ga2"))
		{
			switch (item) {
				case 0: return "Likes to play games";
			}
		}
		if (array.equals("hi2"))
		{
			switch (item) {
				case 0: return "Likes things from the past";
				case 1: return "Is interested in people from the past";
				case 2: return "Likes the time of castles and kings and queens";
				case 3: return "Likes dinosaurs";
			}
		}
		if (array.equals("hu2"))
		{
			switch (item) {
				case 0: return "Likes jokes or funny stories a lot";
			}
		}
		if (array.equals("fl2"))
		{
			switch (item) {
				case 0: return "Can speak a language other than English";
				case 1: return "Would like to learn another language";
			}
		}
		if (array.equals("la2"))
		{
			switch (item) {
				case 0: return "Thinks rules are important";
				case 1: return "Tries to get other people to obey the rules";
			}
		}
		if (array.equals("ss2"))
		{
			switch (item) {
				case 0: return "Favorite thing in school is Math";
				case 1: return "Favorite thing in school is Reading";
				case 2: return "Favorite thing in school is Writing";
				case 3: return "Favorite thing in school is Science";
				case 4: return "Favorite thing in school is Social Studies";
				case 5: return "Favorite thing in school is Gym";
				case 6: return "Favorite thing in school is Art";
				case 7: return "Favorite thing in school is Music";
			}
		}
		if (array.equals("me2"))
		{
			switch (item) {
				case 0: return "Likes TV: Music";
				case 1: return "Likes TV: Sports";
				case 2: return "Likes TV: News";
				case 3: return "Likes TV: Cartoons";
				case 4: return "Likes TV: Drama";
				case 5: return "Likes TV: Comedy";
				case 6: return "Likes TV: Mystery";
				case 7: return "Likes TV: History";
				case 8: return "Likes TV: Soap Operas";
				case 9: return "Likes TV: How-To";
				case 10: return "Likes TV: Action";
				case 11: return "Likes TV: Science Fiction";
				case 12: return "Likes TV: Westerns";
				case 13: return "Likes TV: Factual (like Discovery Channel)";
				case 14: return "Likes TV: Game Shows";
				case 15: return "Likes Radio: Pop";
				case 16: return "Likes Radio: Rock";
				case 17: return "Likes Radio: News";
				case 18: return "Likes Radio: Classical";
				case 19: return "Likes Radio: Jazz";
				case 20: return "Likes Radio: Rap";
				case 21: return "Likes Radio: Hip Hop";
				case 22: return "Likes Radio: Talk Show";
				case 23: return "Likes Movies: Comedy";
				case 24: return "Likes Movies: Drama";
				case 25: return "Likes Movies: Action";
				case 26: return "Likes Movies: Family";
				case 27: return "Likes Movies: Horror";
				case 28: return "Likes Movies: Sci-Fi";
				case 29: return "Likes Movies: Classic";
				case 30: return "Likes Movies: Childrens";
				case 31: return "Likes Movies: Musicals";
			}
		}
		if (array.equals("mu2"))
		{
			switch (item) {
				case 0: return "Favorite kind of music is Jazz";
				case 1: return "Favorite kind of music is Classical";
				case 2: return "Favorite kind of music is Pop";
				case 3: return "Favorite kind of music is Hip Hop";
				case 4: return "Favorite kind of music is Rap";
				case 5: return "Favorite kind of music is Rock and Roll";
				case 6: return "Favorite kind of music is Other (not listed)";
				case 7: return "Likes to sing";
				case 8: return "Plays an instrument";
				case 9: return "Would like to learn how to play an instrument";
			}
		}
		if (array.equals("na2"))
		{
			switch (item) {
				case 0: return "Likes things in nature like plants and animals";
				case 1: return "Likes things in the ocean like plants and sea animals";
			}
		}
		if (array.equals("pa2"))
		{
			switch (item) {
				case 0: return "Likes to dance";
				case 1: return "Takes dance lessons";
				case 2: return "Likes to act on stage";
				case 3: return "Has been in plays on stage";
			}
		}
		if (array.equals("po2"))
		{
			switch (item) {
				case 0: return "Would like to be in charge of a town or city or state or country";
				case 1: return "Thinks voting is important";
			}
		}
		if (array.equals("md2"))
		{
			switch (item) {
				case 0: return "Is interested in doctors, nurses or other medical things";
			}
		}
		if (array.equals("ps2"))
		{
			switch (item) {
				case 0: return "Likes to do puzzles";
				case 1: return "Likes to take things apart";
				case 2: return "Likes to put things together";
				case 3: return "Likes to find out what things are made of";
				case 4: return "Likes to find out how things work";
				case 5: return "Likes to think about things until he/she figures them out";
			}
		}
		if (array.equals("re2"))
		{
			switch (item) {
				case 0: return "Likes to read";
			}
		}
		if (array.equals("to2"))
		{
			switch (item) {
				case 0: return "Stuffed animals";
				case 1: return "Action figures";
				case 2: return "Dolls";
				case 3: return "Electronic games";
				case 4: return "Video games";
				case 5: return "Computer games";
				case 6: return "Board games";
				case 7: return "Hoola hoops";
				case 8: return "Skip It";
				case 9: return "Jump rope";
				case 10: return "Balls";
				case 11: return "Sports stuff";
				case 12: return "Dress-up clothes";
				case 13: return "Puppets";
				case 14: return "Bike";
				case 15: return "Scooter";
				case 16: return "Roller blades";
				case 17: return "Sidewalk chalk";
				case 18: return "Gooey things";
				case 19: return "Electronic friends like Furbie or Poochie";
			}
		}
		if (array.equals("te2"))
		{
			switch (item) {
				case 0: return "Likes using the computer";
			}
		}
		if (array.equals("tr2"))
		{
			switch (item) {
				case 0: return "Likes to travel to new places";
			}
		}
		if (array.equals("rl2"))
		{
			switch (item) {
				case 0: return "Friends";
				case 1: return "Family";
				case 2: return "Teachers";
				case 3: return "Other people";
			}
		}
		if (array.equals("sa2"))
		{
			switch (item) {
				case 0: return "Likes to take care of other people";
				case 1: return "Likes to help people";
				case 2: return "Likes things better than people";
			}
		}
		if (array.equals("ve2"))
		{
			switch (item) {
				case 0: return "Likes bikes a lot";
				case 1: return "Likes motorcycles a lot";
				case 2: return "Likes cars a lot";
				case 3: return "Likes trucks a lot";
				case 4: return "Likes trains a lot";
				case 5: return "Likes buses a lot";
				case 6: return "Likes airplanes a lot";
				case 7: return "Likes boats a lot";
			}
		}
		if (array.equals("we2"))
		{
			switch (item) {
				case 0: return "Likes it when it rains";
				case 1: return "Likes it when it snows";
				case 2: return "Likes to watch clouds";
			}
		}
		if (array.equals("wr2"))
		{
			switch (item) {
				case 0: return "Likes poems";
				case 1: return "Likes writing stories";
			}
		}
		
		return "Error - unknown category";
		
	}
}
