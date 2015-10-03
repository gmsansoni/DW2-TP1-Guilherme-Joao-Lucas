<%-- 
    Document   : alterar
    Created on : Oct 2, 2015, 1:17:23 AM
    Author     : JOAOG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        <title>Editar Produto</title>
    </head>
    <body>
        <div class="col-md-1">
            <ul class="nav nav-pills nav-stacked">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Opções
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>  Home</a></li>
                        <li><a href="limpa?invalidate=true"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  Apagar todos os produtos</a></li>
                        <li><a href="exit?getout=true"><span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span>  Sair</a></li>
                    </ul>
                </li>
            </ul>    
        </div>

        <div class="col-md-8 col-md-offset-2">
            <div class="row text-center">
                <h3>Editar Produto cadastrado</h3>
            </div>
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <form method="post" action="alteraProduto">

                        <div class="form-group">
                            <label for="nome">Nome</label>
                            <input type="text" name="nome" id="nome" required="true" class="form-control" placeholder="Nome do Produto" value="${param.nome}">
                        </div>
                        <div class="form-group">
                            <label for="imagem">URL da Imagem do Produto</label>
                            <input type="imagem" name="url" id="url" required="true" class="form-control" placeholder="URL do Produto" value="${param.imagem}">
                        </div>
                        <div class="form-group">
                            <label for="descricao">Descricao</label>
                            <input type="descricao" name="descricao" id="descricao" class="form-control" required="true" placeholder="Descricao do Produto" value="${param.descricao}">
                        </div>
                        <div class="form-group">
                            <label for="preco">Preço</label>
                            <input type="number" step="0.01" name="preco" id="preco" class="form-control" required="true" placeholder="Preço do Produto" value="${param.preco}">
                        </div>
                        <div class="form-group">
                            <label for="preco">Quantidade</label>
                            <input type="number" step="0.01" name="quant" id="quant" class="form-control" required="true" placeholder="Quantidade do Produto" value="${param.quant}">
                        </div>


                        <div class="text-center">
                            <button class="btn btn-primary" style="width: 120px">Editar</button>
                        </div>
                </div>
                </form>
            </div>
        </body>
    </html>

