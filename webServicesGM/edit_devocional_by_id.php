<?php

include('conexion.php');
$autor = $_POST['autor'];
$titulo = $_POST['titulo'];
$subtitulo = $_POST['subtitulo'];
$descripcion = $_POST['descripcion'];
$links = $_POST['links'];


$consulta = "update devocional set devocional = 
'".$autor."','".$titulo."', '".$subtitulo."',
'".$descripcion."','".$links."'
where id = '".$id."'";

mysqli_query($connection, $consulta) or die (mysqli_error());
mysqli_close();


?>