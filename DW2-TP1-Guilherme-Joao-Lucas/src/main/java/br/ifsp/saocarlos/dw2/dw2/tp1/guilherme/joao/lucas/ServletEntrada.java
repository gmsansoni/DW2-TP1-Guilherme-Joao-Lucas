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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

@WebServlet(name = "ServletEntrada", urlPatterns = {"/ServletEntrada"})
public class ServletEntrada extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter saida = response.getWriter();
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        try{
            if (loginValido(login)&& senhaValida(senha))
            saida.println("Login válido!!");
        }catch(Exception e){
            saida.println("Login inválido!!");
            
        }
        
      
        
    }
      private boolean loginValido(String login){          
          if (login == null){
             return false;
          }
          if (login.length() < 5 || login.length() < 14){
            System.out.println("login do tamanho incorreto");
            return false;
        }
          if(!StringUtils.isAlpha(login.substring(0, 1))){
              System.out.println("login não começa com letra");
              return false;
          }
          for (int i=1; i< login.length();i++){
             if(StringUtils.isNumeric(login.substring(i, i+1))){
                 return true;
             }
                          
          }
          
         return false; 
    }
     private boolean senhaValida(String senha){
        if (senha == null){
            System.out.println("Senha nula");
            return false;
        }
        if (senha.length() < 6){
            System.out.println("Senha do tamanho incorreto");
            return false;
        }
        return false; 
    }

}
