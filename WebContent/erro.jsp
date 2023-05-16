<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="Mensagem" type="java.lang.String" scope="request" /> 
<html lang="pt-BR" style="margin: 3rem;">

             
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato&family=Quicksand:wght@500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">


<style type="text/css">
body {
  	--text-white: #ffffff;
  	--text-dark: #142136;
  	--text-traveller-orange: #E38438;
	--text-traveller-blue: #1a3b83;

  	--bg-white: #fffeff;
  	--bg-dark: #171711;
  	--bg-traveller-blue: #1A3C83;
    --bg-light-gray: #e9e9e9;
  
    background-color: var(--bg-white);
    font-family: 'Quicksand', sans-serif;
    }
    
.dark {
  	--text-white: #142136;
  	--text-dark: #ffffff;
  	--text-traveller-orange: #FAA764;
  	--text-traveller-blue: #FADF64;

  	--bg-white: #171711;
  	--bg-dark: #fffeff;
  	--bg-traveller-blue: #1A3C83;
  	--bg-light-gray: #171717;
}
    
header {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 15px 50px;
	background: var(--bg-traveller-blue);
}

.logo {
	position: relative;
	font-family: 'Lato', sans-serif;
	font-size: 2rem;
	color: #fff;
	text-decoration: none;
}

.logo:hover {
	color: #FADF64;
	text-decoration: none;
}  

.btn {
	display: inline-block; 
	background: var(--bg-white);
	border: 0.2rem solid var(--bg-white);
	border-radius: 5rem;
	cursor: pointer;
	font-size: 1rem;
	color:var(--text-dark);
	width: 8rem;
 }
 
 .btn:hover {
 	background: var(--bg-dark);
 	color: var(--text-white);
 	border: 0.2rem solid var(--bg-dark);
 }

.textos .linha {
	color: var(--text-gray);
}

.textos .display-3 {
	color: var(--text-traveller-orange);
	margin-top:9rem;
	padding-top:4rem;
	font-weight: 700;
}

.textos .display-5 {
	font-weight:400;
	color: var(--text-dark);
}

footer {
	color: var(--text-dark);
	position: absolute;
	bottom: 0;
	left:0;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 15px 50px;
	background-color:var(--bg-light-gray);
}

footer .footer-text {
	color:var(--text-traveller-blue);
	text-decoration: none;
}

footer .footer-text:hover {
	color:var(--text-traveller-orange);
}

</style>

<title>.: Erro :.</title>
</head>
<body>


  	<header>
  		<a href="#" class="logo"><b>Traveller</b></a>
  		
        <button id="toggle" class="btn">Mudar fundo</button>
  	</header>
  	
  	<div class="textos">
		<h1 class="display-3">Erro!</h1>
		<hr>
		<h2 class="display-5"><c:out value="${Mensagem}" /> <c:out value="${Recomendacao}" /></h2>
		<br>
	</div>
	
	<footer class="text-center text-lg-start">
  		<!-- Copyright -->
  		<div class="text-center p-3">
    		© 2023 Copyright:
    		<a class="footer-text" href="https://cerulean-salmiakki-6a926c.netlify.app/" target="_blank">Traveller</a>
  		</div>
 	 <!-- Copyright -->
	</footer>	

<script type="text/javascript">
const toggle = document.getElementById("toggle");
const theme = window.localStorage.getItem("theme");

/* verifica se o tema armazenado no localStorage é escuro
se sim aplica o tema escuro ao body */
if (theme === "dark") document.body.classList.add("dark");

// event listener para quando o botão de alterar o tema for clicado
toggle.addEventListener("click", () => {
  document.body.classList.toggle("dark");
  if (theme === "dark") {
    window.localStorage.setItem("theme", "light");
  } else window.localStorage.setItem("theme", "dark");
});

</script>

</body>
</html>