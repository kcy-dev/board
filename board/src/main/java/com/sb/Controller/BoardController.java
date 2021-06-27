package com.sb.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.DTO.Board;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class BoardController {

	@GetMapping("/initMessage")
	public String InitMessage() {
		log.info("Welcome test");
		return "Init";
	}
	
	@GetMapping("/board/{boardName}")
	public ResponseEntity<List<Board>> boardList(){
		List<Board> lb = new ArrayList<>();
		
		ResponseEntity<List<Board>> entity = new ResponseEntity<>(lb, HttpStatus.OK);
		return entity;
	}
	

	@GetMapping("/board/{boardName}/{boardNo}")
	public ResponseEntity<Board> boardDetail(@PathVariable("boardNo") int boardNo){
		Board board = new Board();
		return ResponseEntity.ok(board);
	}
	
	@PostMapping("/board/ins")
	public ResponseEntity<String> boardIns(Board board){
		log.info("Ins");
		
		ResponseEntity<String> entity = new ResponseEntity<>("Success", HttpStatus.OK);
		return entity;
	}
	
	@PostMapping("/board/upd")
	public Callable<ResponseEntity<String>> boardUpd(Board board){
		log.info("Upd");
		return () -> ResponseEntity.ok("Success");
	}
	
	@PostMapping("/board/del")
	public Callable<ResponseEntity<String>> boardDel(){		
		log.info("Del");
		return () -> ResponseEntity.ok("Success");
	}
}
