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
		Board board = new Board("�׽�Ʈ����");		
		System.out.println(board);
	}
	
	@Test
	void testToStringExclude() {
		Member member = new Member("�׽�Ʈ����");		
		System.out.println(member);
	}
}
