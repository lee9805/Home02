package com.callor.app.controller;

import com.callor.app.service.ScoreService;

public class ScoreController {
	
	public static void main(String[] args) {
		
	
	ScoreService score = new ScoreService();
	score.makeScore();
	score.scorePrint();

}
}
