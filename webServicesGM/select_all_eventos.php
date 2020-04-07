<?php

$hostname_localhost = 'localhost';
$database_localhost = 'gabriela_mistral';
$username_localhost = 'root';
$password_localhost = 'root';


$json=array();
				
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		$consulta="select * from evento";
		$resultado=mysqli_query($conexion,$consulta);
			
		if($registro=mysqli_fetch_array($resultado)){
			$json['evento'][]=$registro;
		//	echo $registro['id'].' - '.$registro['nombre'].' - '.$registro['profesion'].'<br/>';
		}else{
			$resultar["sinEventos"]='no registra';
			$json['evento'][]=$resultar;
		}
		
		mysqli_close($conexion);
		echo json_encode($json);
	





?>