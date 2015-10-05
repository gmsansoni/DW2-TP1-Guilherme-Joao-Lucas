/*
    Trabalho Prático de Desenvolvimento Web 2 (IFSP - ADS, 2015/2)

    Desenvolvido por:
        Guilherme Mourão Sansoni 120128-X
        João Antônio Arantes Gonçalves 120062-5
        Lucas Pepino - 120153-1
*/
package br.ifsp.saocarlos.dw2.dw2.tp1.guilherme.joao.lucas;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletSair", urlPatterns = {"/saida"})
public class ServletSair extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       try{
            Set<Produto> produtos =(HashSet<Produto>) request.getSession().getAttribute("produtos");
            String sair = request.getParameter("sair");
            if (produtos == null) {
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            } else {
               if (sair.equals("true")) {
                  produtos.clear();
               }
              request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            }
        }catch (Exception e){
        }
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
