package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	@Autowired
	private NoticeService service;

	@RequestMapping("list")
	public String list(@RequestParam(name="p", required=true)Integer page) throws ClassNotFoundException, SQLException {
	
//		String p = request.getParameter("p");
		System.out.println("page:"+page);
//		List<Notice> list = service.getList(1, "title", "");
		
		
		return "notice list";
	}
}
