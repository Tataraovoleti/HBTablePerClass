/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TATARAO
 */
public class InsertServlet extends HttpServlet {
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        try
        {
        Session session=new Configuration().configure().buildSessionFactory().openSession();
        
        // Setting Employee inforamation
       Transaction tx=session.beginTransaction();
        
       Employee emp=new Employee();
        emp.setId(101);
        emp.setName("raja");
        emp.setCompany("Wipro");
        emp.setSalary(25000);
        emp.setDepartment(111);
        
        Employee e2=new Employee();
        e2.setId(102);
        e2.setName("ravi");
        e2.setCompany("Polarish");
        e2.setSalary(15000);
        e2.setDepartment(222);
        
        Employee e3=new Employee();
        e3.setId(103);
        e3.setName("raja");
        e3.setCompany("Infosys");
        e3.setSalary(20000);
        e3.setDepartment(333);
        
        session.save(emp);
        session.save(e2);
        session.save(e3);
        
        // Customers Information
        Customer c1=new Customer();
        c1.setId(104);
        c1.setName("sachin");
        c1.setCompany("Google");
        c1.setAddress("Hyderabad");
        
        Customer c2=new Customer();
        c2.setId(105);
        c2.setName("Ramesh");
        c2.setCompany("IFlex");
        c2.setAddress("Bangalore");
        
        session.save(c1);
        session.save(c2);
        
        // Person Information
        
        InPersons p1=new InPersons();
        p1.setId(106);
        p1.setName("Sreenivas");
        p1.setCompany("DELL");
        
        session.save(p1);
        tx.commit();
         session.close();
        
        out.println("Data inserted successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            out.println(e);
        }
       
        
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
        
    }
}
