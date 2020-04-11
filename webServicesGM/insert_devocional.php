<?php

$hostname_localhost = 'localhost';
$database_localhost = 'gabriela_mistral';
$username_localhost = 'root';
$password_localhost = 'root';


$json=array();

if(isset($_GET["autor"])&&isset($_GET["titulo"])&&isset($_GET["subtitulo"])&&isset($_GET["descripcion"])&&isset($_GET["links"])){
    $autor=$_GET["autor"];
    $titulo=$_GET["titulo"];
    $subtitulo=$_GET["subtitulo"];
    $descripcion=$_GET["descripcion"];
    $links=$_GET["links"];
		
		$conexion=mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);
		
		$insert="insert into devocional (autor, titulo,subtitulo,descripcion,links)
        values('{$autor}','{$titulo}', '{$subtitulo}','{$descripcion}','{$links}')";

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
