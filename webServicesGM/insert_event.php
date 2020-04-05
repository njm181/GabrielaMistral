<?php
include('conexion.php');

$autor = $_POST['autor'];
$titulo = $_POST['titulo'];
$detalle = $_POST['detalle'];
$calle = $_POST['calle'];
$localidad_barrio = $_POST['localidad_barrio'];
$altura = $_POST['altura'];
$seccion = $_POST['seccion'];
$fecha_hora = $_POST['fecha_hora'];

$consulta = "insert into evento values
('".$autor."','".$titulo."', '".$detalle."',
'".$calle."','".$localidad_barrio."',
'".$altura."','".$seccion."', '".$fecha_hora."')";

mysqli_query($connection, $consulta) or die (mysqli_error());
mysqli_close();


?>