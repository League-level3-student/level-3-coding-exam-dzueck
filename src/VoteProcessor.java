import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		HashMap<String, Integer> votesFor = new HashMap<>();
		for(String v: votes) {
			if(votesFor.containsKey(v.toLowerCase())) {
				votesFor.put(v.toLowerCase(), votesFor.get(v.toLowerCase()) + 1);
			}
			else {
				votesFor.put(v.toLowerCase(), 1);
			}
		}
		if(votesFor.keySet().size() < 2) {
			if(votesFor.keySet().size() == 0) {
				return "TIE";
			}
			
			return (String) votesFor.keySet().toArray()[0];
			
		}
		String winner = null;
		String secondWinner = null;
		for(String n: votesFor.keySet()) {
			if(winner == null) {
				winner = n;
			}
			else if(secondWinner == null) {
				secondWinner = n;
				if(votesFor.get(secondWinner) > votesFor.get(winner)) {
					String temp = winner;
					winner = secondWinner;
					secondWinner = temp;
				}
			}
			else if(votesFor.get(winner) >= votesFor.get(n)) {
				secondWinner = winner;
				winner = n;
			}
		}
		if(votesFor.get(winner) == votesFor.get(secondWinner)) {
			return "TIE";
		}
		return winner;
	}
}
