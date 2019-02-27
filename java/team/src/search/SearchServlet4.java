package search;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

/**
 * Servlet implementation class SearchServlet
 * 중요
 */
@WebServlet("/search4")
public class SearchServlet4 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   System.out.println("search4");
   String booktitle=request.getParameter("booktitle");
   System.out.println(booktitle);
   
   
		/*
		 * String file=""; if(request.getParameter("booktitle")!=null) {
		 * file="/resultbook.jsp"; }
		 */


   String result = "";
   try {
      RConnection conn = new RConnection();

      conn.eval("library(rvest)");
      conn.assign("search", booktitle);
      
      REXP x=conn.eval("imsi<-source('c:/RStudy/resultsongpa3.R',encoding='UTF-8'); imsi$value");
      RList list = x.asList();
      int v_size = list.size();
      int d_length = list.at(0).length();
      System.out.println("데이터(관측치)의 갯수 : " +d_length);
      System.out.println("변수의 갯수 : " +  v_size);
      
      int arrayRows =  v_size;
      int arrayCols =d_length;
      String[][] s = new String[arrayRows][];  // 데이터프레임의 변수 갯수로 행의 크기를 정한다.

      for (int i = 0; i < arrayRows; i++) {
         s[i] = list.at(i).asStrings();
      }
      
      /*for (int i = 0; i < arrayRows; i++) {
         for (int j = 0; j < arrayCols; j++) {
            System.out.print(s[i][j]+"\t");
         }
         System.out.println();
      }*/
      
      request.setAttribute("songpa", s);
      request.setAttribute("arrayRows", arrayRows);
      request.setAttribute("arrayCols", arrayCols);
      
      //request.setAttribute("list_book", s);
      
      RequestDispatcher rd=request.getRequestDispatcher("/resultbook.jsp");
      rd.forward(request,response);

      conn.close();
      

      
   } catch (RserveException e) {
      e.printStackTrace();
   } catch (REXPMismatchException e) {
      e.printStackTrace();
   }
   //System.out.println(result);
}

}
