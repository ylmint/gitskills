package com.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.pojo.Book;

public class BookTagHandler extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = this.getJspContext().getOut();
		List<Book> list = (List<Book>)this.getJspContext().findAttribute("list");
		for(Book o: list){
			out.println(o.getIsbn() + "," + o.getTitle() + "," + o.getPrice() + "<br>");
		}
	}

}
