package com.example.algamoney.api.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent{
	
	private Long codigo;
	private HttpServletResponse response;
	
	public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
		super(source);
		this.codigo = codigo;
		this.response = response;
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;

	public Long getCodigo() {
		return codigo;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	
	
}
