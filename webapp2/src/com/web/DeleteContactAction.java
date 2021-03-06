package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.Addresstable;
import com.dao.AddresstableDAO;

public class DeleteContactAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ContactForm contactForm = (ContactForm)form;
		Addresstable addresstable = new Addresstable(contactForm.getFirstname(), contactForm.getPhone(), contactForm.getEmail());
		addresstable.setId(contactForm.getId());
		AddresstableDAO aDao = new AddresstableDAO();
		aDao.delete(addresstable);
		
		return mapping.findForward("success");
	}
	
	
}
