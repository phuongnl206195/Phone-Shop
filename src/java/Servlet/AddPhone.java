/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.dao;
import Entity.Phone;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phuong Nguyen
 */
@WebServlet(name = "AddPhone", urlPatterns = {"/AddPhone"})
public class AddPhone extends HttpServlet {

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
        //request.setCharacterEncoding("UTF-8");
        String phone_ID = request.getParameter("phone_ID");
        String name = request.getParameter("name");
        String memory = request.getParameter("memory");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Float price = Float.parseFloat(request.getParameter("price"));
        String image = request.getParameter("image");
        String description = request.getParameter("description");
        String date = request.getParameter("date");
        String category = request.getParameter("category");
        
        dao d = new dao();
        Phone pid = d.CheckPhone(phone_ID);
        if(phone_ID == null){
        d.addPhone(phone_ID, name, memory, quantity, price, image, description, date, category);
        response.sendRedirect("PhoneManage");
        } else {
            request.setAttribute("mess", "phone id already exist");
            request.getRequestDispatcher("LoadDB").forward(request, response);
        }
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