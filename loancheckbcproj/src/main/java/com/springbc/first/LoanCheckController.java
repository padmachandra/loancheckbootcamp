package com.springbc.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class LoanCheckController {
	
	@GetMapping("/loancheckbc/{cs}/{loanamt}/{salary}")
	public ResponseEntity<LoanResponse> checkLoanLimit(@PathVariable("cs")int cs,@PathVariable("loanamt")int loanamt,@PathVariable("salary")int salary){
		
		int approvedLoanAmt = 0;
		int status = 0;
		
		if(salary > 50000 && cs > 700) {
			status = 1;
			if(loanamt > 1000000)
				approvedLoanAmt = 1000000;
			else
				approvedLoanAmt = loanamt;
		}
		
		
		LoanResponse lr = new LoanResponse(approvedLoanAmt,status);
		return ResponseEntity.ok(lr);
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<PostResponse> getPostTest(@PathVariable("id")String id){
		String uri = "https://jsonplaceholder.typicode.com/posts/"; // --> we can call Machine Learning model here
		
		PostResponse pr=RestClient.create()
				.get()
				.uri(uri+id)
				.retrieve()
				.body(PostResponse.class);
		
		return ResponseEntity.ok(pr);
	}
}
