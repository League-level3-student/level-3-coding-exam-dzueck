import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class Level3CodingExam {

	/**
	 * PART A
	 * 
	 * There are 2 candidates for "Person of the Year 2014". The votes are contained in an ArrayList. Not every voter has capitalized the name of
	 * their choice in the same way. This question is part of Stanford University's CS106 mid-term exam.
	 * **/
	@Test
	public void testWinner() {
		
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("pope francis");
		votes.add("Pope Francis");
		votes.add("edward Snowden");
		votes.add("EDWARD SNOWDEN");
		votes.add("Edward snowden");
		votes.add("Pope Francis");
		votes.add("Edward Snowden");
		votes.add("pope Francis");
		votes.add("Pope francis");
		votes.add("Pope Francis");
		votes.add("Edward Snowden");

		assertEquals("pope francis", new VoteProcessor().calculateElectionWinner(votes));
	}

	/** If neither candidate has more votes than the other, report a tie by returning the String "TIE". **/
	@Test
	public void testATie() {
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("pope francis");
		votes.add("edward Snowden");

		assertEquals("TIE", new VoteProcessor().calculateElectionWinner(votes));
	}

	/** 
	 * PART B
	 * 
	 * To complete this exercise, you need to count the number of matching entries in 2 HashMaps. 
	 * More information about the problem is here: http://bit.ly/stanford-exam-part7
	 * This question is part of Stanford University's CS106 final exam. **/
	@Test
	public void testAddMatching() throws Exception {
		HashMap<String, String> hashmap1 = new HashMap<String, String>();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", "Fine");
		hashmap1.put("Felix", "Sick");
		hashmap1.put("Tam", "Healthy");

		HashMap<String, String> hashmap2 = new HashMap<String, String>();
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Ricardo", "Superb");
		hashmap2.put("Tam", "Fine");
		hashmap2.put("Bob", "Happy");
		hashmap2.put("Jim", "Sick");

		assertEquals(2, new HashMapCalculator().commonKeyValuePairs(hashmap1, hashmap2));
	}
	
	
}



