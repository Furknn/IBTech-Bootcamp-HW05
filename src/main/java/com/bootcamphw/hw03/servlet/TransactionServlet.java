package com.bootcamphw.hw03.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcamphw.hw03.model.Transaction;
import com.bootcamphw.hw03.utils.TransactionConverter;

/**
 * Servlet implementation class TransactionServlet
 */
@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var line =TransactionConverter.format(new Transaction(501,"Elektrik Ödemesi",5460.0));
		response.getWriter().append(line);
	}

}
