<%-- 
    Document   : logar.jsp
    Created on : 01/10/2015, 00:38:24
    Author     : lucas
--%>
<%
String login = "BODE"; // Login
String senha = "123"; // Senha
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String login_form = request.getParameter("login"); // Pega o Login vindo do formulário
            String senha_form = request.getParameter("senha"); //Pega a senha vinda do formulário
                if(login_form.equals(login) && senha_form.equals(senha)){ //Caso login e senha estejam corretos...
                    out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
                    session.putValue("loginUsuario", login); //Grava a session com o Login
                    session.putValue("senhaUsuario", senha); //Grava a session com a Senha
                    out.println("<script>document.location.href='logado.jsp';</script>"); //Exibe um código javascript para redireionar ao painel
                } else { //Se estiverem incorretos...
                    out.println("Login ou senha inválidos. <a href='java script:back()'>Voltar</a>"); //Exibe na tela e pede para voltar
            }
        %>
    </body>
</html>
