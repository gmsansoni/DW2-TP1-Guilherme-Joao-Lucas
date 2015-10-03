/*
    Trabalho Prático de Desenvolvimento Web 2 (IFSP - ADS, 2015/2)

    Desenvolvido por:

        Guilherme Mourão Sansoni (120128-X)

        Nome Completo (Prontuário)

        Nome Completo (Prontuário)

*/
package br.ifsp.saocarlos.dw2.dw2.tp1.guilherme.joao.lucas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

@WebServlet(name = "ServletEntrada", urlPatterns = {"/index.jsp"})
public class ServletEntrada extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("entrei");
        
        try{
            //PrintWriter saida = response.getWriter();
            request.getSession().setAttribute("existe", true); 
            Set<Produto> produtos =(HashSet<Produto>) request.getSession().getAttribute("produtos");
            if (produtos == null) {
               produtos = new HashSet<>();
            }
            String nome = (String) request.getParameter("nome");
            if (nome != null){
               String url = (String) request.getParameter("url");
                System.out.println(url);
               String descricao = (String) request.getParameter("descricao");
               Double preco =  Double.parseDouble(request.getParameter("preco"));
               Double quant =  Double.parseDouble(request.getParameter("quant"));
               Produto produto = new Produto(nome,url,descricao,preco,quant);
               if (produtos.add(produto)){
                  request.getSession().setAttribute("existe", true);
               }else{
                   request.getSession().setAttribute("existe", false);
              }
            }
            request.getSession().setAttribute("produtos", produtos); 
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
             
               
           
        }catch (Exception e){
            System.out.println("erro "+e.getMessage());
            
        }
    }
     

}
