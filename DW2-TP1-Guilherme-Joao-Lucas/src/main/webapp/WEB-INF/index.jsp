<%-- 
    Document   : index
    Created on : 02/10/2015, 23:10:06
    Author     : Guilherme
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadasttro de Produtos</title>
        <!-- CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        <!-- JavaScript -->
        <script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link ref="stylesheet" href="http://cdn.datatables.net/1.10.5/css/jquery.dataTables.min.css">
        <script src="http://cdn.datatables.net/1.10.5/js/jquery.dataTables.min.js"></script>
    </head>
    <body>
        <div class=
        <div class="col-md-1">
            <ul class="nav nav-pills nav-stacked success">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Opções
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>   Principal</a></li>
                        <li><a href="apagar?invalido=true"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  Apagar tudo</a></li>
                        <li><a href="saida?sair=true"><span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span>  Sair</a></li>
                    </ul>
                </li>
            </ul>    
        </div>
        <div class="col-md-12">
            <div class="col-md-8 col-md-offset-2">
                <div class="row text-center">
                    <h1>Cadastro de Produtos</h1>
                </div>
                <div class="row text-center">
                    <h3>Formulário de Cadastro</h3>
                </div>
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <form method="post" action="index.jsp">
                            <div class="form-group">
                                <label for="nome">Nome do Produto</label>
                                <input type="text" name="nome" id="nome" required="true" class="form-control" placeholder="Nome do Produto">
                            </div>
                            <div class="form-group">
                                <label for="imagem">URL da Imagem</label>
                                <input type="text" name="url" id="url" class="form-control" required="true" placeholder="URL da Imagem">
                            </div>
                            <div class="form-group">
                                <label for="descricao">Descricao</label>
                                <input type="textarea" name="descricao" id="descricao" required="true" class="form-control" placeholder="Descricao do Produto">
                            </div>
                            <div class="form-group">
                                <label for="preco">Valor</label>
                                <input type="number" step="0.01" name="preco" id="preco" required="true" class="form-control" placeholder="Valor do Produto">
                            </div>
                            <div class="form-group">
                                <label for="preco">Quantidade</label>
                                <input type="number"  name="quant" id="quant" required="true" class="form-control" placeholder="Quantidade do Produto">
                            </div>
                            <div class="text-center">
                                <button class="btn btn-primary" style="width: 120px">Cadastrar</button>
                            </div>
                        </form>
                    </div>
                </div>
                <br/>
                
                    <c:choose>
                        <c:when test="${existe eq true}">
                          <div class="col-md-6 col-md-offset-3 bg-warning text-center">Produto já existe!!!</div>
                        </c:when> 
                    </c:choose>     
                <br/>
                <br/>

                <div class="row text-center">
                    <h3> Listagem de Produtos</h3>
                </div>
                <div class="col-md-10">
                    <c:choose>
                        <c:when test="${produtos eq null or produtos.size() eq 0}">
                            <div class="row text-center"><h4>Nenhum Produto foi cadastrado ainda!</h4></div>
                        </c:when>
                        <c:otherwise>

                            <c:forEach items="${produtos}" var="produto">
                                <div class="col-md-5 col-md-offset-3">
                                    <table class="table table-responsive table-bordered" id="tabela">
                                        <tbody>
                                            <tr>
                                                <td class="text-center">Nome: ${produto.nome}</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center"><img src="${produto.url}"</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center"> Descricao:  ${produto.descricao}</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center">Preço: ${produto.preco}</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center">Quantidade: ${produto.quant}</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center">
                                                    <a class="btn btn-warning" href="alteraProduto?nome=${produto.nome}&url=${produto.url}&descricao=${produto.descricao}&preco=${produto.preco}&quant=${produto.quant}"" style="width: 70px">Editar</a>
                                                    <a class="btn btn-danger" href="ServletExcluir?nome=${produto.nome}" style="width: 70px">Excluir</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </c:forEach>
                           <br/>
                        </c:otherwise>
                    </c:choose>
                </div>
    </body>
</html>
