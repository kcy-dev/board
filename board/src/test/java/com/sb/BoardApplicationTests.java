package com.sb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sb.DTO.Board;
import com.sb.DTO.Member;

@SpringBootTest
class BoardApplicationTests {

	@Test
	void testNoArguBoard() {
		Board board = new Board();		
		System.out.println(board);
	}
	
	@Test
	void testArguBoard() {
		Board board = new Board("테스트제목");		
		System.out.println(board);
	}
	
	@Test
	void testToStringExclude() {
		Member member = new Member("테스트계정");		
		System.out.println(member);
	}
}
