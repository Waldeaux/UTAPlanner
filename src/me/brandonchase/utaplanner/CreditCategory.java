package me.brandonchase.utaplanner;

public enum CreditCategory {
	Required, //This is for classes like CSE 1105 that must be taken and no alternatives for
	
	//The rest are electives where multiple classes can fulfill credit. Didn't think it useful to add "Elective" to end of all of rest of enums. DISCUSSION: better to add "Electives" to be very clear?
	LangPhilCult,
	ForeignLanguage,
	CreativeArts,
	Social,
	Math,
	Science,
	Technical
}
