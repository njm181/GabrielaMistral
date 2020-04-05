<?php

include('conexion.php');
$autor = $_GET['autor'];

$consulta = "select * from devocional where autor = '$autor'";

$resultado = $conexion ->query($consulta);

while($fila = $resultado->fetch_array()){
    $evento[] = array_map('utf8_encode', $fila);

}

echo json_encode($evento);
$resultado-> close();

?>