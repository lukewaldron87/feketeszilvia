<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Custom styles for this template -->
<!--<link href="${pageContext.request.contextPath}/resources/static/css/navbar.css" rel="stylesheet">-->
<link href="css/navbar.css" rel="stylesheet" ></link>
<nav class="navbar navbar-expand-md navbar-light fixed-top" style="background-color: #FFFFFF;">
    <a class="navbar-brand" href="${root}">Fekete Szilvia</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${root}/bio">Bio<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="#">Gallery<span class="sr-only">(current)</span></a>
            </li>
        </ul>
    </div>
</nav>