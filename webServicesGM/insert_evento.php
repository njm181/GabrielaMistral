<?php

$hostname_localhost = 'localhost';
$database_localhost = 'gabriela_mistral';
$username_localhost = 'root';
$password_localhost = 'root';


$json=array();

if(isset($_GET["autor"])&&isset($_GET["titulo"])&&isset($_GET["seccion"])&&isset($_GET["detalle"])&&isset($_GET["localidad_barrio"])&&isset($_GET["calle"])&&isset($_GET["altura"])&&isset($_GET["fecha_hora"])){
    $autor=$_GET["autor"];
    $titulo=$_GET["titulo"];
    $seccion=$_GET["seccion"];
    $detalle=$_GET["detalle"];
    $fechaHora=$_GET["fecha_hora"];
    $localidadBarrio=$_GET["localidad_barrio"];
    $calle=$_GET["calle"];
    $altura=$_GET["altura"];
		
		$conexion=mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);
		
		$insert="insert into evento (autor, titulo,seccion,detalle,localidad_barrio, calle, altura,fecha_hora)
        values('{$autor}','{$titulo}', '{$seccion}','{$detalle}','{$localidadBarrio}', '{$calle}','{$altura}', '{$fechaHora}')";

		$resultado_insert=mysqli_query($conexion,$insert);
		
		if($resultado_insert){
            $resul = true;
            mysqli_close($conexion);
			echo $resul;
		}
		else{
            echo false;
            mysqli_close($conexion);

		}
		
	}
	else{
			echo "Error del web service o no llego data";
		}

?>

