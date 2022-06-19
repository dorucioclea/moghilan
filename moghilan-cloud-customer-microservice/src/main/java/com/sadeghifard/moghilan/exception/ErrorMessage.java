package com.sadeghifard.moghilan.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
	
	  private int statusCode;
	  @JsonFormat(shape = Shape.STRING, pattern = "DD-MM-YYY HH:MM:SS")
	  private LocalDateTime timestamp;
	  private String message;
	  private String description;

}
