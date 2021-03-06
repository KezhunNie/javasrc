package threads;

import java.util.Iterator;
import java.util.List;

import com.darwinsys.util.ArrayIterator;

/**
 * BallotBox - keep track of voting. Only used in ReadersWritersDemo.
 * @version $Id$
 */
class BallotBox {
	BallotPosition[] data;
	
	@SuppressWarnings("unchecked")
	public Iterator<BallotPosition> iterator() {
		return new ArrayIterator(data);
	}
	
	/** Construct a BallotBox given a List<String> 
	 * containing e.g., the names of the candidates
	 * or positions being voted upon.
	 */
	BallotBox(List<String> list) {
		data = new BallotPosition[list.size()];
		for (int i = 0; i < list.size(); i++) {
			data[i] = new BallotPosition(list.get(i));
		}
	}
	
	public void voteFor(int i) {
		++data[i].votes;
	}
	
	int getCandidateCount() {
		return data.length;
	}
}
