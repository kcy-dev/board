package com.sb.DTO;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="boardNo")
@ToString
public class Board{
	private int boardNo;
	@NonNull
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;
}
