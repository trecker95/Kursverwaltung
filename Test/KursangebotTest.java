import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KursangebotTest
{
	Kursangebot kursangebot;
	
	@Before
	public void initialize()
	{
		Dozent dozent = new Dozent("Plaﬂ");
		Kursinformation kursinformation = new Kursinformation("SE", 4, 4, 50);
		kursangebot = new Kursangebot(dozent, kursinformation);
	}
	
	@Test
	public void testLeeresKursangebot()
	{
		assertFalse(kursangebot.isVoll());
	}

	@Test
	public void testEinStudent()
	{
		Student student = new Student("Alice", 12345);
		kursangebot.addStudent(student);
		assertEquals(false, kursangebot.isVoll());
	}
	
	@Test
	public void testVollesKursangebot()
	{
		for(int i = 0; i < 50; i++)
		{
			Student student = new Student("Alice", 12345);
			kursangebot.addStudent(student);
		}
		assertEquals(true, kursangebot.isVoll());
	}
}
