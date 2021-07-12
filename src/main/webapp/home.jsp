<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<form action="addTask">
<input type="text" name="aid"><br>
<input type="text" name="aname"><br>
<input type="submit"><br>
</form>

<div class="centered-content">
    <div class="task-manager-container">
        <div class="sidebar has-background-white">
            <h1 class="title has-text-primary">
                Lists
            </h1>

            <div class="list-menu">
                <a class="" class="list-menu-item">
                    <p>List</p>
                </a>
                <a class="" class="list-menu-item">
                    <p>List</p>
                </a>
                <a class="" class="list-menu-item">
                    <p>List</p>
                </a>
            </div>

            <button class="button is-primary has-text-white">+ New list </button>
        </div>

        <div class="tasks-list-container has-background-light">
            <h1 class="title has-text-primary">
                Tasks
            </h1>

            <div class="task">
                <p>something</p>
            </div>


        </div>
    </div>
</div>
</body>
</html>