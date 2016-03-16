package structure;

import java.util.HashMap;
import java.util.Map;

public class Clazz {
	public static enum ClassAttribute
	{	
		CourseReferenceNumber("CRN", true),
		CourseShortName("Course", false),
		Campus("*Campus", false),
		Days("Days", false),
		Time("Time", false),
		Location("Location", false),
		Hours("Hrs", true),
		Title("Title", false),
		Instructor("Instructor", false),
		SeatsAvailable("Seats", true),
		SeatsLimit("Limit", true),
		EnrolledStudents("Enroll", true),
		Subject("subject", false);
		
		public String shortName = "";
		public Boolean interpretAsInteger = false;
		
		ClassAttribute(String shortName, Boolean interpretAsInteger)
		{
			this.shortName = shortName;
			this.interpretAsInteger = interpretAsInteger;
		}
	}
	
	protected Map<ClassAttribute, Object> attributes = new HashMap<>();
	
	public Clazz()
	{
	}
	
	/**
	 * Adds the given attribute to this clazz.
	 * 
	 * @param attributeType The type of the attribute to add.
	 * @param value The value of the given attribute.
	 */
	public void addAttribute(ClassAttribute attributeType, String value)
	{
		if (attributeType.interpretAsInteger)
		{
			attributes.put(attributeType, new Integer(value));
		}
		else
		{
			attributes.put(attributeType, value);
		}
	}
}
