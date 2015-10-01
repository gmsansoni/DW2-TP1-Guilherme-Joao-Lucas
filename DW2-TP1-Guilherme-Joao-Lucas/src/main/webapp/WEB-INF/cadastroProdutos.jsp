<%-- 
    Document   : cadastroProdutos
    Created on : 01/10/2015, 00:42:52
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produtos</title>
    </head>
    <body>
        <h1>CADASTRO DE PRODUTOS</h1>
        <h1>Bem vindo!</h1>
        <center>Para cadastrar um produto preencha os dados:</center><br /><br />
            <form name="form1" method="post" action="logar.jsp">
                <table width="180" border="0" align="center" cellpadding="0" cellspacing="1">
                    <tr>
                        <td width="55">Login:</td>
                        <td width="122"><input name="login" type="text" id="login"></td>
                    </tr>
                    <tr>
                        <td height="18">Senha:</td>
                        <td><input name="senha" type="password" id="senha"></td>
                    </tr>
                    <tr>
                        <td colspan="2"><div align="center">
                        <input type="submit" name="Submit" value="Logar">
                    </div></td>
                    </tr>
                </table>
            </form>
    </body>
</html>
