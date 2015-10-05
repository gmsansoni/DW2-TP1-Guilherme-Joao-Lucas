/*
    Trabalho Prático de Desenvolvimento Web 2 (IFSP - ADS, 2015/2)

    Desenvolvido por:
        Guilherme Mourão Sansoni 120128-X
        João Antônio Arantes Gonçalves 120062-5
        Lucas Pepino - 120153-1
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
@WebServlet(name = "ServletManipulaProduto", urlPatterns = {"/alteraProduto"})
public class ServletManipulaProduto extends HttpServlet {
   
          
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     request.getRequestDispatcher("/WEB-INF/alteraProduto.jsp").forward(request, response);

        String nome = request.getParameter("nome");
        String imagem = request.getParameter("url");
        String descricao = request.getParameter("descricao");
        String preco = request.getParameter("preco");
        String quant = request.getParameter("quant");

        response.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            PrintWriter saida = response.getWriter();
            Set<Produto> produtos =(HashSet<Produto>) request.getSession().getAttribute("produtos");
            String nome = (String) request.getParameter("nome");
            String url = (String) request.getParameter("url");
            String descricao = (String) request.getParameter("descricao");
            Double preco =  Double.parseDouble(request.getParameter("preco"));
            Double quant =  Double.parseDouble(request.getParameter("preco"));
            for(Produto pro: produtos){
                if (nome.equals(pro.getNome())){
                    pro.setNome(nome);
                    pro.setDescricao(descricao);
                    pro.setUrl(url);
                    pro.setPreco(preco);
                    pro.setQuant(quant);
                }
            }
                
            
          
        }catch (Exception e){
            
        }
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
     
    }

}
