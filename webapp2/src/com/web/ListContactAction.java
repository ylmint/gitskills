package com.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.Addresstable;
import com.dao.AddresstableDAO;

public class ListContactAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AddresstableDAO aDao = new AddresstableDAO();
		List list= aDao.findAll();
		request.getSession().setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		return mapping.findForward("success");
	}

}
