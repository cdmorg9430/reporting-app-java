public class ReportCard{
	private char section;
	private String name;
	private int subject;
	private int socialStudies;
	private int algebra;
	private int chemistry;
	private	int languageArts;
	private int computerScience;
	private int sumOfAverages;
	private int totalClasses = 5;

	
	public ReportCard(String studentName, int className, char sectionName, int socialSciences, int math, int science, int english, int iTElective){
		name = studentName;
		subject = className;
		section = sectionName;
		socialStudies = socialSciences;
		algebra = math;
		chemistry = science;
		languageArts = english;
		computerScience = iTElective;
	}

	public String getName(){
		return name;
	}

	public void setName (String name){
		this.name = name;
	}

	public int getSubject(){
		return subject;
	}

	public void setSubject(int subject){
		this.subject = subject;
	}

	public char getSection(){
		return section;
	}

	public void setSection(char section){
		this.section = section;
	}

	public int getSocialStudiesGrade(){
		return socialStudies;
	}

	public void setSocialStudiesGrade(int socialStudies){
		this.socialStudies = socialStudies;
	}

	public int getAlgebraGrade(){
		return algebra;
	}

	public void setAlgebraGrade(int algebra){
		this.algebra = algebra;
	}

	public int getChemistryGrade(){
		return chemistry;
	}

	public void setChemistryGrade(int chemistry){
		this.chemistry = chemistry;
	}

	public int getLanguageArtsGrade(){
		return languageArts;
	}

	public void setLanguageArtsGrade(int languageArts){
		this.languageArts = languageArts;
	}

	public int getComputerScienceGrade(){
		return computerScience;
	}

	public void setComputerScienceGrade(int computerScience){
		this.computerScience = computerScience;
	}

	public int getTotalGrades(){
		sumOfAverages = socialStudies + algebra + chemistry + languageArts + computerScience;
		return sumOfAverages;
	}

	public double getTotalAverage(){
		return (sumOfAverages/ totalClasses);
	}

	@Override
	public String toString(){
		return "Grades:  " + name +
				"Social Studies = " + socialStudies +
				"Algebra = " + algebra + 
				"Chemistry = " + chemistry + 
				"Language Arts = " + languageArts + 
				"Computer Science = " + computerScience;
	}




}