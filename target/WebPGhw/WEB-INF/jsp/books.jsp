<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>>

<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">

    <main class="mdl-layout__content">
        <div class="page-content">
            <div class="mdl-grid center-items">
                <div class="mdl-cell mdl-cell--4-col">
                    <div>
                        <table
                                class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Title</th>
                                    <th>Price</th>
                                    <th>Publisher Id</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach var="book" items="${books}">
                                <c:set var="count" value="${count + 1}" scope="page" />
                                <tr>
                                    <td class="mdl-data-table__cell--non-numeric"><c:out
                                            value="${count}" /></td>
                                    <td>${book.id}</td>
                                    <td>${book.name}</td>
                                    <td>${book.price}</td>
                                    <td>${book.publisherId}</td>
                                    <td><a href="/WebPGhw/edit?id=<c:out value='${book.id}' />">Edit</a>
                                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                                href="/WebPGhw/delete?id=<c:out value='${book.id}' />">Delete</a>
                                    </td>
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

                </div>
            </div>

        </div>
    </main>
</div>
</body>
</html>
<html>
