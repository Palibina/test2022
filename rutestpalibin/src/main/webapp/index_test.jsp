<%@ page import="Model.Note" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Servlets.MainServlet" %><%--
  Created by IntelliJ IDEA.
  User: PalibinFamily
  Date: 11.08.2018
  Time: 4:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<div class="container">
    <h1 align="center">Резюме на должность Java-стажер</h1>
    <div>
        <!--Site menuHandler-->

        <div class="row" id="siteHeader">

            <div class="col-sm-4" >
                <!--<hr align="right" color="Green"/>-->
                <button>Create Note</button>
            </div>
            <div class="col-sm-4" >
                <select id="sortSelection">
                    <option>By Date</option>
                    <option>By Title</option>
                </select>
                <label for="sortSelection">Sort</label>
            </div>
            <div class="col-sm-4">
                <select id="filterSelection">
                    <option>Done</option>
                    <option>Undone</option>
                    <option>All</option>
                </select>
                <label for="filterSelection">Filter</label>

            </div>

        </div>
    </div>
    <div class="row" padding="5" >
        <div class="card-deck">

        </div>
    </div>
    <!--
      <div class="row" padding="5" >
        <div class="card-deck">
          <div class="card">
            <div class="card-header">Title1</div>
            <div class="card-body"><p>Распрекрансый текст наш</p></div>
            <div class="card-footer">
              <input type="checkbox" class="Done">
              <label>Done</label>
              <button>Edit Note</button>
            </div>
          </div>
          -->

</div>




<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
<style>
    #siteHeader {
        border-top: 3px solid #00ff00;
        border-bottom: 3px solid #00ff00;
    }
    .row{
        padding-bottom: 10px;
        padding-top: 10px;
    }

</style>

</html>

