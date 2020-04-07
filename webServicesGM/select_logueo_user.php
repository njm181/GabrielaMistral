<?php

$hostname_localhost = 'localhost';
$database_localhost = 'gabriela_mistral';
$username_localhost = 'root';
$password_localhost = '';


$json=array();
	if(isset($_POST["username"])&&isset($_POST["password"])){
		$username=$_POST["username"];
		$password=$_POST["password"];
				
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		$consulta="select username, email from usuario where username= '{$username}' and password= '{$password}'";
		$resultado=mysqli_query($conexion,$consulta);
			
		if($registro=mysqli_fetch_array($resultado)){
			$json['usuario'][]=$registro;
		//	echo $registro['id'].' - '.$registro['nombre'].' - '.$registro['profesion'].'<br/>';
		}else{
			$resultar["username"]='no registra';
			$resultar["password"]='no registra';
			$resultar["email"]='no registra';
			$json['usuario'][]=$resultar;
		}
		
		mysqli_close($conexion);
		echo json_encode($json);
	}
	else{
		$resultar["success"]=0;
		$resultar["message"]='Ws no Retorna';
		$json['usuario'][]=$resultar;
		echo json_encode($json);
	}





?>