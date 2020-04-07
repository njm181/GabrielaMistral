<?php

$hostname_localhost = 'localhost';
$database_localhost = 'gabriela_mistral';
$username_localhost = 'root';
$password_localhost = 'root';


$json=array();
				
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		$consulta="select * from devocional";
		$resultado=mysqli_query($conexion,$consulta);
			
		if($registro=mysqli_fetch_array($resultado)){
			$json['devocional'][]=$registro;
		//	echo $registro['id'].' - '.$registro['nombre'].' - '.$registro['profesion'].'<br/>';
		}else{
			$resultar["sinDevocional"]='no registra';
			$json['devocional'][]=$resultar;
		}
		
		mysqli_close($conexion);
		echo json_encode($json);
	





?>