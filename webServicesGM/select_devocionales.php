<?php

include('conexion.php');

$consulta = "select * from devocional";

$resultado = $conexion ->query($consulta);

while($fila = $resultado->fetch_array()){
    $evento[] = array_map('utf8_encode', $fila);

}

echo json_encode($evento);
$resultado-> close();

?>