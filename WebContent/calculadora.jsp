<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Calculadora</title>
</head>
<body>
	<h1>Calculadora</h1>
	<form action="calcular">
		<fieldset>
			<legend>Digite os n�meros e escolha a opera��o</legend>
			N�mero 1: 
			<input type="text" name="numero1"><br> 
			N�mero 2: 
			<input type="text" name="numero2"><br> 
			Opera��o: 
			<select name="operacao">
				<option>Somar</option>
				<option>Subtrair</option>
				<option>Multiplicar</option>
				<option>Dividir</option>
			</select><br><br> 
			<input type="submit" value="Calcular">
		</fieldset>
	</form>
</body>
</html>