
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

/**
 *
 * @author Guilherme
 */
@WebServlet(name = "ServletManipulaProduto", urlPatterns = {"/ServletManipulaProduto"})
public class ServletManipulaProduto extends HttpServlet {
   
          
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            PrintWriter saida = response.getWriter();
            Set<Produto> produtos =(HashSet<Produto>) request.getSession().getAttribute("produtos");
            Integer codigo = Integer.parseInt(request.getParameter("codigo"));
            String nome = (String) request.getParameter("nome");
            String url = (String) request.getParameter("url");
            String descricao = (String) request.getParameter("descricao");
            Double preco =  Double.parseDouble(request.getParameter("preco"));
            Double quant =  Double.parseDouble(request.getParameter("preco"));
            Integer novo =(Integer) request.getSession().getAttribute("quant");
            if (novo ==0){
                novo=1;
            };
            if (codigo == 0){
                Produto produto = new Produto(novo,nome,url,descricao,preco,quant);
                produtos.add(produto);
                request.getSession().setAttribute("novo",novo++);                               
            }else{
                for(Produto pro: produtos){
                    if (pro.getCodigo()== codigo){
                       pro.setNome(nome);
                       pro.setDescricao(descricao);
                       pro.setUrl(url);
                       pro.setPreco(preco);
                       pro.setQuant(quant);
                    }
                
                }
            }
                
            
            Produto produto = new Produto();
        }catch (Exception e){
            
        }
        
     
    }

}
