<?php

include('conexion.php');
$id = $_POST['id'];

$consulta = "delete from devocional where id = '".$id."'";

mysqli_query($connection, $consulta) or die (mysqli_error());
mysqli_close();


?>