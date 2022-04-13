<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Create book</title>
</head>
<body>
<div class="container">
    <h2>Create book</h2>
    <form action="#" th:action="@{/books-create}" th:object="${book}" method="post">
        <label for="name">Name</label>
        <input type="text" th:field="*{name}" id="name" placeholder="Name">
        <label for="price">Price</label>
        <input type="text" th:field="*{price}" id="price" placeholder="Price">
        <table class="table">
        </table>
        <input type="submit" class="btn btn-primary" value="Create Book">
    </form>
</div>
</body>
</html>
