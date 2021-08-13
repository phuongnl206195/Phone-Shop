/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.dao;
import Entity.Account;
import Entity.Category;
import Entity.Phone;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Phuong Nguyen
 */
@WebServlet(name = "ListPhone", urlPatterns = {"/ListPhone"})
public class ListPhone extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          dao d = new dao();
          
        String indexpage = request.getParameter("index");
        if(indexpage == null){
            indexpage = "1";
        }
        int index = Integer.parseInt(indexpage);
        
        int count = d.getNumberOfPhone();
        int endPage = count/8;
        if(count % 8 != 0){
            endPage++;
        }
        List<Phone> listindex = d.pagingPhone(index);
        request.setAttribute("listP", listindex);
        
        List<Category> listC = d.getCategory();
        request.setAttribute("listCC", listC);
//        List<Phone> list = d.getAll();
//        request.setAttribute("listP", list);
        
        String phone_ID = request.getParameter("phone_ID");
        Phone p = d.getPhoneByID(phone_ID);
        request.setAttribute("phone", p);
        
        
         HttpSession ses = request.getSession();
         Account a = (Account) ses.getAttribute("acc");
         
        
        request.setAttribute("end", endPage);
        request.setAttribute("index", index);
        
        request.getRequestDispatcher("phone.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
