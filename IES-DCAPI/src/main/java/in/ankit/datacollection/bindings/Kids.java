package in.ankit.datacollection.bindings;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Kids {
	
	private Integer caseNum;
	private Integer userId;
	private List<KidForm> kidsList;
	
}
