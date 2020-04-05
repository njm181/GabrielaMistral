<?php

include('conexion.php');

$autor = $_POST['autor'];
$titulo = $_POST['titulo'];
$subtitulo = $_POST['subtitulo'];
$descripcion = $_POST['descripcion'];
$links = $_POST['links'];


$consulta = "insert into devocional values
('".$autor."','".$titulo."', '".$subtitulo."',
'".$descripcion."','".$links."')";

mysqli_query($connection, $consulta) or die (mysqli_error());
mysqli_close();


?>