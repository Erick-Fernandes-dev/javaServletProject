
<% 

String nomeEmpresa = (String) request.getAttribute("Empresa");
System.out.println(nomeEmpresa);


%>


<html>

<body>

Empresa <%= nomeEmpresa %> cadastrada com sucesso!

</body>


</html>