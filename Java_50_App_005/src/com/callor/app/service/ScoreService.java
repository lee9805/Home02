package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.app.model.ScoreVO;

public class ScoreService {
	public ScoreVO makeScore() {
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		ScoreVO scoreVO = new ScoreVO();

		for (int i = 0; i < 20; i++) {

			scoreVO.setNum(i);
			scoreVO.setKor(rnd.nextInt(50) + 51);
			scoreVO.setEng(rnd.nextInt(50) + 51);
			scoreVO.setMath(rnd.nextInt(50) + 51);
			scoreVO.setSum(i);
			scoreVO.setAvg(i);
			scoreVO.setSumKor(i);
			scoreVO.setSumeng(i);
			scoreVO.setSummath(i);
			scoreVO.setSumsum(i);

			scoreList.add(scoreVO);
		}
		return scoreVO;
	}

	public void scorePrint() {

		System.out.println("======================================");
		System.out.println("성적리스트");
		System.out.println("--------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < 20; i++) {
			ScoreVO scoreVO = makeScore();
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getSum() + "\t");
			System.out.println(scoreVO.getAvg());
		}
		ScoreVO scoreVO =makeScore(); 
		System.out.println("======================================");
		System.out.print("총점 : ");
		System.out.print(scoreVO.getSumKor() + "\t");
		System.out.print(scoreVO.getSumeng() + "\t");
		System.out.print(scoreVO.getSummath() + "\t");
		System.out.print(scoreVO.getSumsum() + "\t");

	}
}
