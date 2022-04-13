<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Books</title>
</head>
<body>
    <div class="container">
        <h2>Books</h2>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Price</th>
                <th scope="col">Publisher Id</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="book" items="${books}">
                    <tr>
                <td ${book.id}></td>
                <td ${book.name}></td>
                <td ${book.price}></td>
                <td ${book.publisherId}></td>
                <td><a th:href="@{book-update/{id}(id=${book.id})}"><button type="submit" class="btn btn-primary">Edit</button>
                </a></td>
                <td><a th:href="@{book-delete/{id}(id=${book.id})}"><button type="submit" class="btn btn-danger">Delete</button>
                </a></td>
            </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="container">
        <table class="table">
            <p><a href="/book-create"><button type="submit" class="btn btn-success">Create book</button></a></p>
        </table>
    </div>
</body>
</html>
