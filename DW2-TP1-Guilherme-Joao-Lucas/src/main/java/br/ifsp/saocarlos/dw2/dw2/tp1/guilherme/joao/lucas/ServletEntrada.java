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


@WebServlet(name = "ServletEntrada", urlPatterns = {"/ServletEntrada"})
public class ServletEntrada extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
 

}
