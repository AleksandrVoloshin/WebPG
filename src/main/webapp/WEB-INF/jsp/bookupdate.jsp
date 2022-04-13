<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Update book</title>
</head>
<body>
<div th:switch="${books}">
    <div class="container">
        <form action="#" th:action="@{/book-update}" th:object="${book}" method="post">
            <h2>Update book
                <label for="id">Id</label>
                <input readonly type="text" th:field="*{id}" id="id" placeholder="Id">
            </h2>
            <tbody>
            <tr>
                <form action="#" th:action="@{/book-update}" th:object="${book}" method="post">
                    <label for="name">Name</label>
                    <input type="text" th:field="*{name}" id="name" placeholder="Name">
                    <table class="table">
                    </table>
                    <label for="price">Price</label>
                    <input type="text" th:field="*{price}" id="price" placeholder="Price">
                    <table class="table">
                    </table>
                    <label for="publisherId">Publisher Id</label>
                    <input type="text" th:field="*{publisherId}" id="publisherId" placeholder="Publisher Id">
                    <table class="table">
                    </table>
                    <input type="submit" class="btn btn-primary" value="Update book">
                    </br>
                </form>
            </tr>
            </tbody>
            </table>
        </form>
    </div>
</div>
</body>
</html>
